<%-- 
    Document   : switch1
    Created on : 2018/07/23, 19:31:30
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
        <h1>条件分岐のswitch分の１つ目です。</h1>
        <%
            int a=2;
            switch(a){
                case 1:
                    out.print("one");
                    break;
                case 2:
                    out.print("two");
                    break;
                default:
                    out.println("想定外");
                    break;
            }
            %>
    </body>
</html>
