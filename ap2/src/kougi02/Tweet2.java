/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author C0116043
 */
public class Tweet2 {
    //フィールド

    private int tweetNo;	//ツイートの番号
    private String twitterID;	//twitterID
    private String name;	//氏名
    private Date tweetTime;	//投稿日時
    private String text;	//投稿内容

    //コンストラクタ
    public Tweet2() {
        //とりあえず何もしない
    }

    //ツイート番号をセットするメソッド
    public void setNo(int tn) {
        this.tweetNo = tn;
    }

    //twitterIDをセットするメソッド
    public void setTID(String tid) {
        this.twitterID = tid;
    }

    //氏名をセットするメソッド
    public void setName(String n) {
        this.name = n;
    }

    //投稿日時をセットするメソッド
    public void setTime(String tm) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
            Date date = sdf.parse(tm);
            this.tweetTime = date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //投稿内容をセットするメソッド
    public void setText(String t) {
        this.text = t;
    }

    //投稿日時を取得するメソッド
    public Date getTime() {
        return tweetTime;
    }

    //ツイート情報を出力するメソッド
    public void printTweet() {
        System.out.println(tweetNo + ":"
                + twitterID + "(" + name + ")\n"
                + tweetTime + "\n" + text);
    }
}
