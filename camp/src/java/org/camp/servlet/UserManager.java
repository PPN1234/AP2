/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserManager{
    private Statement st=null;
    private ResultSet rs=null;
    
    public UserManager(DatabaseConnector dc){
        st=dc.getStatement();
    }
    public boolean authenticate(String username,String password)throws Exception{
        boolean ret=false;
        String sql="select * from where username="+username;
        rs=st.executeQuery(sql);
        if(!rs.next()){
            return false;
            
        }
        int failCount=rs.getInt("fail");
        String dbpass=rs.getString("password");
        String md5pass=md5(password);
        if(dbpass.equals(md5pass)&&failCount<=3){
            failCount=0;
            ret=true;
        }else{
            failCount++;
            ret=false;
        }
        sql="";
                
    }
}