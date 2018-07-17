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
import java.util.List;

/**
 *
 * @author C0116043
 */
public class Kadai02_2 {

    public static void main(String[] args) {

        List<Cat> tlist = new ArrayList<>();
        int num = 0;
        double weight = 0;
        double age = 0;

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
                weight += Double.parseDouble(word[7]);
                age += Double.parseDouble(word[6]);
                num += 1;
            }
            br.close();
            for (Cat cat : tlist) {
                cat.printCat();
            }
            weight = weight / num;
            age = age / num;
            System.out.printf("登録されているネコの平均体重は %.2fkg です。\n", weight);
            System.out.printf("登録されているネコの平均体重は%.2f才です。\n", age);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
