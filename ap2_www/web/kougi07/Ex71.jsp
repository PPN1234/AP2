<%-- 
    Document   : Ex71
    Created on : 2017/11/14, 11:07:12
    Author     : c0116043
--%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for (int i = 0; i < 5; i++) {
        %>
        くりかえし<%=i%> 回<br>
        <%
            }
        %>
        <%!
            String getDate() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

                return sdf.format(new Date());
            }
        %>
        本日は<%=getDate()%>です.
        
        ここに埋め込みます↓<br>
        <%@include  file="Ex72.jsp" %>
        ここまで
    </body>
</html>
