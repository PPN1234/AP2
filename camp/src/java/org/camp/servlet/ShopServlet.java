package org.camp.servlet;
        
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.camp.servlet.*;

/**
 * ショッピングサイトへのユーザ認証や商品選択に関する処理を担当するサーブレット
 */
public class ShopServlet extends HttpServlet {

    private static String DB_NAME = "shop_db";               // DB名
    private static String DB_USER = "root";                  // DBのユーザ名
    private static String DB_PASS = "root";                  // DBのパスワード

    // ログインのビューを担当
    private static String LOGIN_JSP = "/Login.jsp";
    // 商品一覧のビューを担当
    private static String SHOW_ITEM_JSP = "/ShowItems.jsp";
    // カート内一覧のビューを担当
    private static String SHOW_CART_JSP = "/ShowCart.jsp";

    /**
     * サーブレットがPOSTメソッドでアクセスされた際に呼ばれる．
     */
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // doProcessを呼ぶことでGET/POSTのどちらでアクセスされても同じ処理を実行
        doProcess(req, res);
    }

    /**
     * サーブレットがGETメソッドでアクセスされた際に呼ばれる．
     */
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // doProcessを呼ぶことでGET/POSTのどちらでアクセスされても同じ処理を実行
        doProcess(req, res);
    }

    /**
     * クライアントから要求された処理をactionから判別し実行する
     */
    protected void doProcess(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String nextView = ""; // 処理結果の表示を委託するJSPのパス
        DatabaseConnector dc = null; // データベースへの接続を行うオブジェクト
        UserManager um = null; // ユーザ認証や登録に関する処理を担当
        ItemManager im = null; // ショッピングサイトの商品に関する処理を担当

        try {
            dc = new DatabaseConnector(DB_NAME, DB_USER, DB_PASS);
            dc.openConnection(); // DBへ接続

            um = new UserManager(dc);
            im = new ItemManager(dc);

            // 前のページから渡される値を「UTF-8」に設定
            req.setCharacterEncoding("UTF-8");
            // これから表示するページのMIMEを設定
            res.setContentType("text/html;charset=UTF-8");

            // アクセスしたユーザのカートオブジェクトを取得
            Cart cart = (Cart) req.getSession().getAttribute("cart");

            /*
	     * ユーザからの要求はURLの後方に付加された「？」
	     * 以降にGETメソッドのactionパラメータとして付加される
             */
            String action = req.getParameter("action");
            if (action == null) {
                action = "";
            }

            /**
             * 以下のif文でユーザからの要求を判別し，適切処理を行う
             */
            if (action.equals("") || action.equals("loginPage")) {
                nextView = LOGIN_JSP; // ログイン用のページを表示
            } else if (action.equals("login")) {

                // 認証の処理を実行
                if (login(um, req)) {
                    nextView = showItems(im, req); // ログイン成功
                } else {
                    nextView = LOGIN_JSP; // ログイン失敗
                }

            } else if (action.equals("logout")) {

                // ログアウトの処理を実行
                nextView = logout(req);

            } else if (action.equals("registration")) {

                // 新規ユーザの登録処理を実行
                nextView = registration(um, req);

            } else {
                // 以下は先にログインしている必要がある処理
                if (cart == null) {
                    /*
		     * カートオブジェクトが無い場合はログインしていないと判断し，
		     * 強制的にログインページへ遷移
                     */
                    req.setAttribute("message", "先にログインしてください");
                    nextView = LOGIN_JSP;

                } else if (action.equals("showItems") || action.equals("")) {

                    // 商品一覧を表示
                    nextView = showItems(im, req);

                } else if (action.equals("add")) {

                    // 選択された商品をユーザのカートへ追加
                    addItemToCart(cart, im, req);
                    nextView = showItems(im, req);

                } else if (action.equals("showCart")) {

                    // ユーザのカードの中身を表示
                    nextView = SHOW_CART_JSP;

                } else if (action.equals("del")) { // (C) XXXを適切なものに置き換える

                    // 選択された商品をユーザのカートから削除
                    delItemFromCart(cart, req);
                    nextView = SHOW_CART_JSP;

                } else {

                    // 要求に該当する処理が無い場合
                    nextView = "";

                }
            }

            if (nextView.equals("")) {
                // actionパラメータの指定が無い，または不明な処理が要求された場合
                req.setAttribute("message", "不正なアクションが要求されました("
                        + req.getParameter("action") + ")");

                nextView = LOGIN_JSP;
            }

            dc.closeConnection(); // データベースへの接続を切断

        } catch (Exception e) {
            // 例外の詳細を/usr/tomcat/logs/catalina.outへ出力
            // 問題が発生した際に参考にすると良い
            e.printStackTrace();
            req.setAttribute("message", "例外が発生しました:" + e.toString());
            nextView = LOGIN_JSP;
        } finally {
            /*
	     * 正常に処理された場合も，エラーの場合もビューとして指定されたJSP
	     * へフォワードし，クライアントに結果を返す
             */
            req.getRequestDispatcher(nextView).forward(req, res);
        }
    }

    /**
     * ユーザが入力したユーザ名とパスワードを検証し，ログインの処理を行う
     */
    private boolean login(UserManager um, HttpServletRequest req)
            throws Exception {
        String userName = req.getParameter("uname"); // ユーザ名
        String password = req.getParameter("pass"); // パスワード

        if (!isValid(userName) || !isValid(password)) {
            req.setAttribute("message", "記入漏れがあります");
            return false;
        } else if (um.authenticate(userName, password) == false) {
            req.setAttribute("message", "ユーザ名またはパスワードが違います");
            return false;
        } else {
            // ログインに成功した場合
            HttpSession session = req.getSession(true);

            // セッションにユーザ名と新しいカートオブジェクトをセットする
            Cart cart = new Cart();
            session.setAttribute("userName", userName);
            session.setAttribute("cart", cart);

            req.setAttribute("message", "認証に成功しました");
        }

        return true;
    }

    /**
     * 新規ユーザの登録処理を行う
     */
    private String registration(UserManager um, HttpServletRequest req)
            throws Exception {
        String userName = req.getParameter("uname"); // ユーザ名
        String password = req.getParameter("pass"); // パスワード
        String password2 = req.getParameter("pass2"); // パスワード（確認）

        if (!isValid(userName) || !isValid(password) || !isValid(password2)) {
            req.setAttribute("message", "記入漏れがあります");
        } else if (!password.equals(password2)) {
            req.setAttribute("message", "パスワードが確認用と一致しません");
        } else if (um.registration(userName, password)) {
            req.setAttribute("message", "登録に成功しました");
        } else {
            req.setAttribute("message", "すでに登録されています");
        }

        return LOGIN_JSP;
    }

    /**
     * セッションを無効化し，ログアウトの処理を行う
     */
    private String logout(HttpServletRequest req) {

        HttpSession session = req.getSession(false); // セッションを取得
        if (session != null) {
            // セッションの無効化
            // (D) セッションを無効化するための記述を追加し，下記のreq.setAttributeを適切なものに置き換える
            req.setAttribute("message", "この機能は未実装です");
        }

        // ログイン画面へ移動させる
        return LOGIN_JSP;
    }

    /**
     * 商品の一覧を表示するために，DBに登録されている全商品を取得する．
     */
    private String showItems(ItemManager im, HttpServletRequest req)
            throws Exception {

        //ItemManagerクラスへ全商品情報の取得を依頼
        ArrayList<Item> list = im.getAllItems();

        //取得した全商品（ArrayList）をitemList属性にセットする
        req.setAttribute("itemList", list);

        return SHOW_ITEM_JSP;
    }

    /**
     * クライアントから指定されたIDの商品をユーザのカートへ加える
     */
    private void addItemToCart(Cart cart, ItemManager im, HttpServletRequest req)
            throws Exception {

        String id = req.getParameter("id"); // クライアントから指定された商品のID
        Item item = im.getItemById(id); // ItemManagerクラスへ商品情報の取得を依頼

        if (item != null) {
            cart.add(item);
            req.setAttribute("message", "「" + item.getName() + "」を追加しました");
        } else {
            req.setAttribute("message", "指定されたIDの商品はありません(" + id + ")");
        }
    }

    private void delItemFromCart(Cart cart, HttpServletRequest req) {
        // クライアントから指定された商品の添え字番号
        int index = Integer.parseInt(req.getParameter("index"));
        String message = "「" + cart.getItem(index).getName()
                + "」をカートから削除しました";
        // (E) Cartクラスのdeleteメソッドを実行する記述を追加し，下記のreq.setAttributeを適切なものに置き換える
        req.setAttribute("message", "この機能は未実装です");
    }

    /**
     * 引数で与えられた文字列が空でないかを判定する．引数で与えられたstr
     * (文字列)がnullではなく，かつ空でない場合はtrueを，それ以外はfalseを返す．
     */
    protected boolean isValid(String str) {

        if (str != null && !str.equals("")) {
            return true;
        } else {
            return false;
        }
    }
}
