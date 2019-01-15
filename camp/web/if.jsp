<%-- 
    Document   : if
    Created on : 2018/07/23, 19:28:20
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
        <h1>条件分岐のif課題</h1>
        <%
            int a=1;
            if(a==1){
                out.print("1です！");
            }else if(a==2){
                out.print("プログラミングキャンプ!");
            }else{
                out.println("1と２以外のその他です！");
            }
            %>
    </body>
</html>
