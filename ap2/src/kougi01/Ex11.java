/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.File;

/**
 *
 * @author C0116043
 */
public class Ex11 {

    public static void main(String[] args) {
        File f1 = new File("test.txt");
        System.out.println("ファイル名：" + f1.getName());
        System.out.println("絶対パス：" + f1.getAbsolutePath());
        System.out.println("サイズ：" + f1.length() + "バイト");
        System.out.println(f1);
    }
}
