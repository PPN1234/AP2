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
public class Class1 {
    public String name=""; 
    public String address="";
    public int age=0;
    public void setProfile(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void printProfile(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
