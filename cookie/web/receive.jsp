<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.net.*"%>

<html><head><title>クッキー受信</title></head><body> 

<%  Cookie[] cookies = request.getCookies();
    if (cookies != null) {
    	for (int i=0; i<cookies.length; i++) {
		String cookieName = cookies[i].getName();
		String cookieValue = cookies[i].getValue();
        	if (cookieName.equals("sessionid")) {
			out.println(URLDecoder.decode(cookieValue));
		}
        }
     } %>

<h1>クッキーを受信しました。</h1>
</body></html>
