/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author iwashita
 */
public class Ex41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //meiboデータベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/meibo";

            //コネクションの確立
            Connection con
                    = DriverManager.getConnection(driverUrl,"db" ,"db" );

            //ステートメントの作成
            Statement stmt =con.createStatement();

            //実行するSQL文を記述
            String sql ="select * from T_STUDENT";

            //SQLを実行してResultSetの形式で結果を取得
            ResultSet rs = stmt.executeQuery(sql);

            //取得したレコードを一つずつ処理
            while (rs.next()) {
                String result = "";
                result +=rs.getInt("student_id")+":";
                result +=rs.getString("fullname");
                System.out.println(result);
            }
            //メモリの開放
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}