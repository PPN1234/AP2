<%-- 
    Document   : switch2
    Created on : 2018/07/23, 19:34:52
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>条件分岐のswitch文の2つ目です。</h1>
        <%
            char a='A';
           switch(a){
               case 'A':
                   out.print("英語");
                   break;
               case 'あ':
                   out.print("日本語");
                   break;
               default:
                   break;
           }
            %>
    </body>
</html>
