<%@ page contentType="text/html; charset=UTF-8"%>

<html><body> 

<% 	String userName = "鈴木　太郎";//ログイン名
	session.setAttribute("LoginName", userName); 

	Integer userAge = new Integer(20);//年齢
	session.setAttribute("Age", userAge); 
%>
セッションオブジェクトに文字列と整数値を格納しました。

</body></html>
