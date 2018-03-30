<%-- 
    Document   : namesearch
    Created on : 2017/12/21, 13:56:29
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./pokemon.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>名前検索</h2>
        <form action="namesearch" method="post">
            <div>ポケモンの名前で検索：</div><div><input type="text" name="name"></div>
            <input type="submit" name="btn1" value="送信">           
        </form>
    </body>
</html>
