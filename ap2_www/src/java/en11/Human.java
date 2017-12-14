/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en11;

/**
 *
 * @author c0116043
 */
public class Human {
    private String name;
    private int age;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public String getKind(){
        if(age<6){
            return "乳幼児";
        }else if(6<age && age<12){
            return "こども";
        }else{
            return "おとな";
        }
    }
}
