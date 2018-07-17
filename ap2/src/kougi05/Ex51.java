/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author c0116043
 */
public class Ex51 {

    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/meibo";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl, "db", "db");

            //ステートメントの作成
            Statement stmt = con.createStatement();

            //SQL文の作成
            String sql = "insert into T_STUDENT_A (fullname,gakubu_id,grade) values ('芦田愛菜',2,3)";

            //SQL文実行
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件のデータベースを追加");


            //メモリの開放
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}