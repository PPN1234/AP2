<%-- 
    Document   : Ex11_1
    Created on : 2017/12/12, 11:43:09
    Author     : c0116043
--%>
<%@page import="kougi11.Exam"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ex11_1.jsp</h1>
        <%
            Exam ex=(Exam)request.getAttribute("ex");
            %>
            <%=ex.getName()%>,点数＝<%=ex.getPoint()%>,評価＝<%=ex.getResult()%><br>
                
    </body>
</html>
