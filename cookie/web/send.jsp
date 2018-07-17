<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*"%>

<html><head><title>クッキー送信</title></head><body> 
<%  String cookieValue = URLEncoder.encode("Sample Cookie Data");
    Cookie cookie = new Cookie("sessionid" , cookieValue);
    cookie.setMaxAge(365 * 24 * 60 * 60);//クッキー有効期間(1年)
    response.addCookie(cookie); %>

<h1>クッキーを送信しました。</h1>
</body></html>