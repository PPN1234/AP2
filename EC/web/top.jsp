<%-- 
    Document   : top
    Created on : 2018/12/10, 15:45:30
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Topページ</title>
    </head>
    <body>
        <h1>検索フォーム</h1>
        <form action="./search" method="get">
            <table>
                <td><input type="text" name="search" size="16" required></td>
                <td colspan="2" align="right"><input type="submit" value="検索"></td>
            </table>
        </form>
            
        
    </body>
</html>
