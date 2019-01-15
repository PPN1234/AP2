<%-- 
    Document   : query_string_input.jsp
    Created on : 2018/07/24, 18:44:15
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form method="get" action="query_string_output.jsp">
           <table>
               <li>商品の総額<br>
                   <input type="text" name="total">円
               </li>
               <li>商品の合計個数<br>
                   合計で<input type="text" name="count">個
               </li>
               <li>商品種別<br>
                   <select name="type">
                       <option value="1">１:雑貨</option>
                       <option value="2">２:生鮮食品</option>
                       <option value="3">３:その他</option>
                   </select>
               </li>
           </table>
        <input type="submit" value="送信">
    </form>
    </body>
</html>
