<%-- 
    Document   : Map
    Created on : 2018/07/23, 19:54:31
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>連想配列の課題</h1>
        <% 
            HashMap<String,String> prof =new HashMap<String,String>();
            prof.put("1","AAA");
            prof.put("hello", "world");
            prof.put("soeda","33");
            prof.put("20","20");          
          
		
            out.print(prof.get("1")+"<br>");
            out.print(prof.get("hello")+"<br>");
            out.print(prof.get("soeda")+"<br>");
            out.print(prof.get("20")+"<br>");
        %>
    </body>
</html>
