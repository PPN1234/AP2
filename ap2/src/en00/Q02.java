/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en00;

/**
 *
 * @author C0116043
 */
public class Q02 {
    public static void main(String[] args) {
        Item item1=new Item("apple",200);
        System.out.println(item1.getName()+","+item1.getValue());

        Item item2=item1;
        
        item2.setValue(300);
        
        System.out.println("item1:"+item1.getName()+","+item1.getValue());
        System.out.println("item2:"+item2.getName()+","+item2.getValue());
        
    }
    
}
