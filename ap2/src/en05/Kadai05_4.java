/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author c0116043
 */
public class Kadai05_4 {

    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/twitter";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");

            //SQL文の作成
            String sql = "insert into T_TWEET" + "(twitterid,tweettext,iine,tweetdate) values (?,?,?,?)";

            //PreparedStatementの作成
            PreparedStatement ps = con.prepareStatement(sql);

            //ファイル読み込み
            BufferedReader br = new BufferedReader(new FileReader(new File("tweet54.csv")));

            //値の設定とSQL
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {

                String[] word = line.split(",");

                ps.setString(1, word[0]);
                ps.setString(2, word[1]);
                ps.setInt(3, Integer.parseInt(word[2]));
                Timestamp timestamp = Timestamp.valueOf(word[3]);
                ps.setTimestamp(4, timestamp);

                count += ps.executeUpdate();

            }
            br.close();

            System.out.println(count + "件のレコードを追加しました");

            //メモリの開放
            ps.close();
            con.close();

        } catch (IOException | SQLException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
