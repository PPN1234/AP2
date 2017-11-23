<%-- 
    Document   : Kadai07_1
    Created on : 2017/11/16, 15:00:18
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
        Kadai07_1.jsp <br>
        <%
            for (int i = 0; i < 100; i++) {
                if (i > 50 && i < 100 && i % 7 == 0 && i%4!=0) { 
                    out.println(i);
                    %>
                    <br>
                    <%
                }
            }
        %>
        
    </body>
</html>
