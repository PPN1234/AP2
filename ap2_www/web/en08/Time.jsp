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
        <%!
            String getDate() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日(E)k:m:s");

                return sdf.format(new Date());
            }
        %> 
        <%=getDate()%>
    </body>
</html>
