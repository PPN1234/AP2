<%-- 
    Document   : query_string_output.jsp
    Created on : 2018/07/24, 18:44:29
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
        <% String a = request.getParameter("total");
            int b = Integer.parseInt(a);
            String c = request.getParameter("count");
            int d = Integer.parseInt(c);
            String e = request.getParameter("type");
            int f = Integer.parseInt(e);
            String g = "";
            if (f == 1) {
                g = "雑貨";
            } else if (f == 2) {
                g = "生鮮食品";
            } else if (f == 3) {
                g = "その他";
            }
        %>
    <li>商品の総額:<%=request.getParameter("total")%>円</li>
    <li>商品の総額:<%=request.getParameter("count")%>個</li>
    <li>商品種別:<%=g%></li>
    <li>商品の単価は:<%=(b / d)%>円です。</li>
        <%
            if (b < 3000) {
                out.print("ポイントは0です");
            } else if (3000 <= b && b < 5000) {
                out.print("ポイントは" + (b * 0.04) + "です");
            } else {
                out.print("ポイントは" + (b * 0.05) + "です");
            }
        %>
</body>
</html>
