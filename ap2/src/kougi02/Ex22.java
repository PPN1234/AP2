/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author C0116043
 */
public class Ex22 {

    public static void main(String[] args) {

        //あるつぶやきの情報を保持するインスタンス
        Tweet tweet = new Tweet();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("tweet2.csv")));

            String line = "";
            //１行ずつファイルから読み込む
            while ((line = br.readLine()) != null) {
                //カンマ区切り、配列wordへ順番に代入する
                String[] word = line.split(",");
                tweet.setNo(Integer.parseInt(word[0]));
                tweet.setTID(word[1]);
                tweet.setName(word[2]);
                tweet.setTime(word[3]);
                tweet.setText(word[4]);

                //つぶやきの情報を出力
                tweet.printTweet();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
