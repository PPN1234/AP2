/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author c0116043
 */
public class Kadai05_2 {
    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/twitter";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");
            //SQL文の作成
            String sql = "insert into T_TWEET" + "(twitterid,tweettext,iine) values (?,?,?)";
            //ステートメントの作成
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "abc");
            ps.setString(2, "おいしい！");
            ps.setInt(3, 5);

            //SQL文実行
            int count = ps.executeUpdate();
            System.out.println(count + "件のデータベースを追加");

            //メモリの開放
            ps.close();
            con.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


