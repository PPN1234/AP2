<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ナベアツ課題</title>
    </head>
    <body>
        <h1>ナベアツ課題</h1>
        <%
            //　----------ここから下へソースコードを書く------------
            for (int i = 1; i <= 40; i++) {
                out.println(i);
                if (i % 3 == 0 || String.valueOf(i).indexOf("3") != -1) {
                    out.println("アホになる");

                }
                if (i % 5 == 0) {
                    out.println("犬っぽくなる");

                }
                out.println("<br>");
            }

            //　-------------------------ここまで------------------------------
%>
    </body>
</html>

