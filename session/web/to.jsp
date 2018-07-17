<%@ page contentType="text/html; charset=UTF-8"%>

<html><body> 

いらっしゃいませ <%= (String)session.getAttribute("LoginName") %> さん
あなたは <%= (Integer)session.getAttribute("Age") %> 才ですね

</body></html>