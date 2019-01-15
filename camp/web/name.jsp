<%-- 
    Document   : name
    Created on : 2018/07/20, 11:12:02
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String a="groove";
            String b="-";
            String c="gear";
            %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>文字連結</title>
    </head>
    <body>
        <h1>Stringの中の文字列を連結</h1>
        <%
            out.print(a+b+c);
            %>
    </body>
</html>
