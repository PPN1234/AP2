<%-- 
    Document   : Kadai08_1
    Created on : 2017/11/23, 15:00:15
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Kadai08_1.jsp</h1>
        <table border="1">
            <ul>
                <tr>
                    <td>名前</td>
                    <td><%=request.getParameter("text1")%></td>
                </tr>
                <tr>
                    <td>住所</td>
                    <td><%=request.getParameter("radio1")%></td>
                </tr>
                <tr>
                    <td>興味</td>
                    <td><%
            for(int i=1; i<7; i++){
                String getStr = request.getParameter("check"+i);             
                if(getStr !=null){
                   out.println(getStr +"<br>");
            }
            }
            %></td>
                </tr>
            </ul>

    </body>
</html>
