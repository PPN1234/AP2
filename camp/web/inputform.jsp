<%-- 
    Document   : inputform
    Created on : 2018/11/08, 14:15:52
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>初回のデータを次回に初期値として持つ</title>
    </head>
 
    <body>
        <form action="org.camp.servlet/outform.java" method=post>
                 <%
        String uname = (String)session.getAttribute("uname");      
        String sex = (String)session.getAttribute("sex");      
        String syumi = (String)session.getAttribute("syumi");
        
    %>
            <table>
                <tr>
                    <td>名前情報</td>
                    <td><input type=text name="uname" size="16" required value="<%= uname%>"></td><!--入力を必須にするタグ追加-->
                </tr>
                <tr>
                    <td>性別情報</td>
                    <td><input type="radio" name="sex" value="男">男</td>
                    <td><input type="radio" name="sex" value="女">女</td>
                </tr>
                <tr>
                    <td>趣味情報</td>
                    <td><textarea name="syumi" rows="10" cols="30" value></textarea>
                </tr>
                <td colspan="2" align="right"><input type="submit" value="データ送信"></td>
            </table>
        </form>
    </body>
</html>
