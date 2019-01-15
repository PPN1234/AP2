/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campjava;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Sample {

    public static void main(String[] args) {
        // SimpleDateFormat作成
        SimpleDateFormat sdf
                = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf2
                = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        SimpleDateFormat sdf3
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            // Date取得
            Date day = sdf.parse("2016/01/01 00:00:00");
            System.out.println(day.getTime()+"秒");
            Date now = new Date();
            System.out.println(sdf2.format(now));
            
            Date day2=sdf3.parse("2016-11-04 10:00:00");
            System.out.println(sdf3.format(day2));
            Date day3=sdf.parse("2015/01/01 00:00:00");
            Date day4=sdf.parse("2015/12/31 23:59:59");
            long day5=day3.getTime();
            long day6=day4.getTime();
            if(day5>day6){
                long day7=(day5-day6)/1000;
                System.out.println("差分は"+day7+"秒です.");
            }else if(day5<day6){
                long day7=(day6-day5)/1000;
                System.out.println("差分は"+day7+"秒です.");
            }          
            
        } catch (java.text.ParseException e) {
        }

    }
}
