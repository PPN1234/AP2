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
public class Item {
    private int item_id;
    private String itemname;
    private int price;
    private int stock;
    public Item(){
        
    }
    public Item(int id,String name,int price,int stock){
        this.item_id=id;
        this.itemname=name;
        this.price=price;
        this.stock=stock;
    }
    public void setItemid(int id){
        item_id=id;
    }
    public int getItemid(){
        return item_id;
    }
    public void setItemname(String name){
        itemname=name;
    }
    public String getItemname(){
        return itemname;
    }
    public void setPrice(int pr){
        price=pr;
    }
    public int getPrice(){
        return price;
    }
    public void setStock(int st){
        stock=st;
    }
    public int getStock(){
        return stock;
    }
}