<%-- 
    Document   : Kadai11_2
    Created on : 2017/12/14, 15:19:13
    Author     : c0116043
--%>
<%@page import="en11.Human"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <h1>Kadai11_2.jsp</h1>
        <%
            Human ex=(Human)request.getAttribute("ex");
            %>
            <%=ex.getName()%>(<%=ex.getAge()%>)<%=ex.getKind()%><br>
                
    </body>
</html>
