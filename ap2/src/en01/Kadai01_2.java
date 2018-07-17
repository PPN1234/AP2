/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author C0116043
 */
public class Kadai01_2 {
    public static void main(String[] args) {
       
            File inputFile = new File("out11.txt");
            File outputFile = new File("out12.txt");
            
            String namelist="";
            int sum=0;
            try{
                BufferedReader br = new BufferedReader(new FileReader(inputFile));

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
            
            
            String line;
            int linenum=0;
            while ((line = br.readLine()) != null) {
                linenum++;
                if(linenum%2==0){
                sum+=Integer.parseInt(line);
                }else{
                namelist+=line+"/";
                }
            }
            pw.println("名前リスト:"+namelist);
            pw.println("平均点:"+(double)sum/(linenum/2));
            br.close();
            pw.close();
        } catch (IOException e) {
            System.out.println("失敗しました。");
        }
            
    }
}
