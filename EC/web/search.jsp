<%-- 
    Document   : search
    Created on : 2018/12/11, 15:14:38
    Author     : c0116043
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            request.setCharacterEncoding("UTF-8");
            String word = (String) request.getAttribute("data");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索結果表示</title>
    </head>
    <body>
        <script src="https://s.yimg.jp/images/yjdn/js/bakusoku-jsonp-v1-min.js"
                data-url="http://shopping.yahooapis.jp/ShoppingWebService/V1/json/itemSearch"
                data-p-appid="dj00aiZpPXhoeGZnSXFkbUh1ciZzPWNvbnN1bWVyc2VjcmV0Jng9NTY-"
                data-p-query="<%=word%>"
                >
                    {{#ResultSet.0.Result}}
                <%for (int i = 0; i <= 10; i++) {%>
                    {{#<%=i%>}}
        <a href="{{Url}}"><img src="{{Image.Medium}}" alt="{{Name}}"></a>
            <br>
            {{/<%=i%>}}
                <%}%>
                    {{/ResultSet.0.Result}}

        </script>
    </body>
</html>
