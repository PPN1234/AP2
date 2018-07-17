/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author C0116043
 */
public class sample {
    public static void main(String[] args) {
        try{
       PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(new File("test.txt"))));
       pw.println("test");
       pw.close();
    
    }catch(IOException e){
            System.out.println("読み込みに失敗");
    }
    }
}
    

