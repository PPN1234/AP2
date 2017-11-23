<%-- 
    Document   : Ex81
    Created on : 2017/11/21, 11:17:01
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
        <h1>Ex81.jsp</h1>
        <table border="1">
    <tr>
        <td>year</td>
        <td><%=request.getParameter("year")%></td>
    </tr>
    <tr>
        <td>month</td>
        <td><%=request.getParameter("month")%></td>
    </tr>
    <tr>
        <td>day</td>
        <td><%=request.getParameter("day")%></td>
    </tr>
    </tr>
    </body>
</html>
