/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author C0116043
 */
public class Q04 {
    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        alist.add("Apple");
        alist.add("Orange");
        alist.remove("Orange");
        alist.add("Banana");
        for(String a:alist){
            System.out.println(a);
        }
        
    }
    
}
