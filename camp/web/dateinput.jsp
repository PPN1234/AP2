<%-- 
    Document   : dateinput
    Created on : 2018/11/07, 14:05:20
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>受け取ったデータページ</title>
    </head>
    <body>
    <li>名前は:<%=request.getParameter("uname")%></li>
    <li>性別は:<%=request.getParameter("sex")%></li>
     <%
          String sex = request.getParameter("sex2");
            int check = Integer.parseInt(sex);
             String g = "";
            if (check == 1) {
                g = "男性";
            } else if (check == 2) {
                g = "女性";
            }
     %>
    <li>性別2:<%=g%></li>
    <li>趣味は:<%=request.getParameter("syumi")%></li>
    
   
    </body>
</html>
