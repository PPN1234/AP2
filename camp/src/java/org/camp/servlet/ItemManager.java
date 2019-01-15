/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;


/**
 *
 * @author c0116043
 */
@WebServlet(name = "ItemManager", urlPatterns = {"/ItemManager"})
public class ItemManager {

    private Statement st = null;
    private ResultSet rs = null;

    public ItemManager(DatabaseConnector dc) {
        st = dc.getStatement();

    }

    public ArrayList<Item> getAllItems() throws Exception {
        ArrayList<Item> list = new ArrayList<Item>();
        ResultSet rs = null;
        String sql = "select * from item_tbl";
        rs = st.executeQuery(sql);
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String name = rs.getString("name");
            int price = Integer.parseInt(rs.getString("price"));
            Item item = new Item(id, name, price);
            list.add(item);
        }
        return list;
    }

    public Item getItemById(String id) throws Exception {
        return getItemById(Integer.parseInt(id));
    }
    public Item getItemById(int id) throws Exception{
        Item item=null;
        ResultSet rs=null;
        String sql="select * from Item_tbl where id="+id;
        rs=st.executeQuery(sql);
        if(!rs.next()){
            return null;
        }
            item=new Item(id,rs.getString("name"),Integer.parseInt(rs.getString("price")));
            return item;
        
    }
}
