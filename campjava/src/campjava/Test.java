/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campjava;

/**
 *
 * @author c0116043
 */
public class Test {
    public static void main(String[] args) {
        int total;
        Subject A=new Subject("工科太郎",40,60,30);
        Subject B=new Subject("東京花子",80,90,100);
        A.show();
        B.show();
        total=A.getTotalScore()+B.getTotalScore();
        System.out.println("2人の合計点数"+total);
    }
}

