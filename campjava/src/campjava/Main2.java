/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campjava;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author c0116043
 */
public class Main2 {
    public static void main(String[] args) {
        Class2 main2=new Class2();
        main2.setProfile("名前２","住所２",14);
        main2.printProfile();
        main2.clearProfile();
        main2.printProfile();
        
    }
}
