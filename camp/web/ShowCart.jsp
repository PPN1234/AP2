<%-- 
    Document   : ShowCart
    Created on : 2018/11/06, 14:38:20
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="message" class="java.lang.String" scope="request"/>
<jsp:useBean id="userName" class="java.lang.String" scope="session"/>
<jsp:useBean id="cart" class="org.camp.servlet.Cart" scope="session"/>


<html>
    <head>
       
        <title><%=userName%>のカート内の一覧</title>
    </head>
    <body>
        <div style="width: 500; margin: 0 auto;">
            <%if(message!=null){%>
            <font color="red"><%=message %></font>
            <br>
            <%}%>
            <div align=right>
                 ようこそ、<%=userName%>さん
                 <a href="?action=logout">(ログアウト)</a>
            </div>
           <h1><%=userName%>さんのカート</h1>
           <hr>
           <table border=1>
               <tr>
                   <td>商品ID</td>
                   <td>商品名</td>
                   <td>価格</td>
                   <td>消去</td>
               </tr>
               <% for(int i=0; i<cart.getSize(); i++){%>
               <tr>
                   <td><%=cart.getItem(i).getId()%></td>
                   <td><%=cart.getItem(i).getName()%></td>
                   <td><%=cart.getItem(i).getPrice()%></td>
                   <td><a href="?action=del&index=<%=i%>">カートから消去</a></td>
                   
               </tr>
               <%}%>
               <tr><td colspan=4 align=right>合計：<%= cart.getSumPrice()%>円
                   
                   </td></tr>
               
           </table>
               <a href="?action=showItems">商品一覧へ</a>
        </div>
    </body>
</html>
