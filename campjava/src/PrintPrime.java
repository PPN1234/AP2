
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package campjava;
/**
 *
 * @author c0116043
 */
public class PrintPrime {
    public static void main(String[] args) throws IOException {
        try {            
            //InputStreamReader isr = new InputStreamReader(System.in);
            //BufferedReader br = new BufferedReader(isr);
            //String buf = br.readLine();
            int x = Integer.parseInt(args[0]);
            for (int i = 0; i < x; i++) {
                if (i == 2 || i == 3) {
                    System.out.println(i);
                } else if (i % 2 == 0 || i % 3 == 0) {
                } else {
                    System.out.println(i);
                }
                
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("数値を入力してください。");
        }
    }
}
