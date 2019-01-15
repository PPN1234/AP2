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
public class Subject {
    String name;
    int phys;
    int math;
    int chem;
    public Subject(){
        name="UnKnown";
        phys=0; math=0; chem=0;
       
    }
    public Subject(String n,int p,int m,int c){
        this.name=n;
        this.phys=p;
        this.math=m;
        this.chem=c;
        
    }
    public void show(){
        System.out.println(name);
        System.out.println(phys);
        System.out.println(math);
        System.out.println(chem);
    }
    public int getTotalScore(){
       int sum;
       sum=phys+math+chem;
        return sum;
    }
}
