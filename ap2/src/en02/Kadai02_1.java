/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kougi02.Tweet;
import kougi02.Tweet2;

/**
 *
 * @author C0116043
 */
public class Kadai02_1 {

    public static void main(String[] args) {

        List<Cat> tlist = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data2.csv")));

            String line = "";
            //１行ずつファイルから読み込む
            while ((line = br.readLine()) != null) {
                Cat cat = new Cat();
                //カンマ区切り、配列wordへ順番に代入する
                String[] word = line.split(",");

                cat.setNo(Integer.parseInt(word[0]));
                cat.setName(word[1]);
                cat.setKind(word[2]);
                cat.setKenami(word[3]);
                cat.setColor(word[4]);
                cat.setSex(word[5]);
                cat.setAge(Integer.parseInt(word[6]));
                cat.setWeight(Double.parseDouble(word[7]));
                //つぶやきの情報を出力
                tlist.add(cat);
            }
            br.close();
            for (Cat cat : tlist) {
                cat.printCat();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
