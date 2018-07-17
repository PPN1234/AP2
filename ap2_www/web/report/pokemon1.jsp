<%-- 
    Document   : pokemon1
    Created on : 2017/12/21, 13:23:39
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./pokemon.css">
        <title>登録</title>
    </head>
    <body>
        <h1>登録画面</h1>
        <form action="pokemon" method="post">
            <div>ポケモンの名前:</div><div><input type="text" required name="name">※必須</div>
            <div>性格:</div><div><input type="text" required name="seikaku">※必須</div>
            <div>アイテム:</div><div><input type="text" required name="item">※必須</div>
            <div>育成:</div><div><textarea required name="ikusei" rows="4" cols="40">ここに育成論を書いて下さい。</textarea>※必須</div>
            <div>特性:</div><div><input type="text" required name="tokusei">※必須</div>
            
            <input type="submit" name="btn1" value="送信"> 

        </form>
    </body>
</html>
