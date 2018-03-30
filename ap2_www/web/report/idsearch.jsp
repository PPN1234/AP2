<%-- 
    Document   : idsearch
    Created on : 2017/12/21, 14:37:52
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
        <h3>ID検索</h3>
        <form action="idsearch" method="post">
            <div>ID検索:<input type="text" name="id"></div>
            <input type="submit" name="btn1" value="送信">           
        </form>
    </body>
</html>
