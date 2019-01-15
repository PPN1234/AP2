<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="sessiondate" method=post>
        <table>
         <tr>
                    <td>名前情報</td>
                    <td><input type=text name="uname" size="16" required></td><!--入力を必須にするタグ追加-->
                </tr>
                <tr>
                    <td>性別情報</td>
                    <td><input type="radio" name="sex" value="男">男 </td>
                    <td><input type="radio" name="sex" value="女">女</td>
                </tr>
                 <tr>
                     <td>性別2</td>
                     <td><select name="sex2">
                   <option value="1">１:男性</option>
                   <option value="2">２:女性</option>
                         </select></td>
               </tr>
                <tr>
                    <td>趣味情報</td>
                    <td><textarea name="syumi" rows="10" cols="30"></textarea>
                </tr>
                <td colspan="2" align="right"><input type="submit" value="データ送信"></td>
        </table>
        </form>
    </body>
</html>
