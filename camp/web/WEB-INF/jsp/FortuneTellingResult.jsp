<%-- 
    Document   : ForTuneTellingResult
    Created on : 2018/07/18, 3:28:59
    Author     : c0116043
--%>
<%@page import="org.camp.servlet.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <%
            ResultData data=(ResultData)request.getAttribute("DATA");
            %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP占い表示ページ</title>
        
    </head>
    <body>
        <%
            if(data != null){
                out.print("<h1>あなたの"+data.getD()+"の運勢は"+data.getLuck()+"です。</h1>");
            }
            %>
    </body>
</html>
