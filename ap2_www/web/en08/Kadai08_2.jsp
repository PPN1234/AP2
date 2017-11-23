<%-- 
    Document   : Kadai08_2
    Created on : 2017/11/23, 15:26:13
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
        <h1>Kadai08_2.jsp</h1>
            <ul>
                <font size="5">アンケート結果</font>
                <hr>
                <li>名前：<%=request.getParameter("text1")%></li>
                <li>製品名：<%=request.getParameter("select1")%></li>
                <li>評価：<%=request.getParameter("radio1")%></li>
                <li>自由意見：<br><%=request.getParameter("textarea1")%></li>
            </ul>
    </body>
</html>
