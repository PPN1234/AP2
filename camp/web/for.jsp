<%-- 
    Document   : for
    Created on : 2018/07/23, 15:00:35
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
        <%
            long a=8;
            String b="";
            int c=0;
            double d=1000;
            for(int i=0; i<19; i++){
                  a=a*8; 
            }
            out.println(a+"<br>");
            for(int j=0; j<30; j++){
                b+="A";
            }
            out.println(b+"<br>");
            for(int k=0; k<=100; k++){
                c=c+k;
            }
            out.println(c+"<br>");
            while(d>100){
                d=d/2;             
            }          
            out.println(d);
            %>

    </body>
</html>
