<%-- 
    Document   : List1
    Created on : 2018/07/23, 19:39:15
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>配列の課題</h1>
        <%
            ArrayList<String> datas=new ArrayList<String>();
            datas.add("10");
            datas.add("100");
            datas.add("soeda");
            datas.add("hayasi");
            datas.add("-20");
            datas.add("118");
            datas.add("END");
            for(int i=0; i<datas.size(); i++){
                out.print(i+"番目の要素は"+datas.get(i)+"です。<br>");
            }
            out.print("要素の２番目にある"+datas.get(2)+"の値を書き換える処理を行いました。<br>");
            datas.set(2,"33");
            for(int i=0; i<datas.size(); i++){
                out.print(i+"番目の要素は"+datas.get(i)+"です。<br>");
            }
            %>
    </body>
</html>
