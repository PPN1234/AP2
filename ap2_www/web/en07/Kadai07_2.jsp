<%-- 
    Document   : Kadai07_2
    Created on : 2017/11/16, 15:20:32
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
        <%!
            int r=3;
            int h=7;
            public double volume(int r,int h){   
            return r*r*Math.PI*h;
        }
            %>
        Kadai07_2.jsp<br>
        半径3,高さ7の円柱の体積は<%=volume(r,h)%>です。<br>
        半径3,高さ7の円柱の体積は<%=String.format("%.2f",volume(r,h))%>です。   
    </body>
</html>
