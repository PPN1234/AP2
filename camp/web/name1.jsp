<%-- 
    Document   : name1
    Created on : 2018/07/24, 18:32:29
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <li>名前は:<%=request.getParameter("name")%></li>
    <li>性別は:<%=request.getParameter("sex")%></li>
    <li>趣味は:<%=request.getParameter("syumi")%></li>
    </body>
</html>
