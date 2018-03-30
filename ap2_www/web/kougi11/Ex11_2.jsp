<%-- 
    Document   : Ex11_2
    Created on : 2017/12/19, 10:55:48
    Author     : c0116043
--%>
<%@page import="kougi11.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ex11_2</h1>
        <table border="1">
            <%
                List<Student> slist=(ArrayList<Student>)request.getAttribute("slist");
                for(Student s: slist){
                   %>
                   <tr>
                       <td><%=s.getSID()%></td>
                       <td><%=s.getName()%></td>
                       <td><%=s.getGakubu()%></td>
                       <td><%=s.getGrade()%></td>
                       
                   </tr>
                   <%
                }
                    %>
                    
                
    </body>
</html>
