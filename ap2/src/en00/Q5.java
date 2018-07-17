/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author C0116043
 */
public class Q5 {
    public static void main(String[] args) {

        SimpleDateFormat dft = new SimpleDateFormat("yyyy年MM月dd日(E)H時m分s秒");

        Calendar cal = Calendar.getInstance();
        System.out.println(dft.format(cal.getTime()));
    }
}
