<%-- 
    Document   : Ex82
    Created on : 2017/11/21, 11:46:23
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
        <h1>Ex82.jsp</h1>
        <ul>
    <li>一行テキスト：<%=request.getParameter("text1")%></li>
    <li>パスワード：<%=request.getParameter("pass1")%></li>
    <li>テキストエリア：<%=request.getParameter("textarea1")%></li>
    <li>ラジオボタン：<%=request.getParameter("radio1")%></li>
    <li>チェックボックス１：<%=request.getParameter("check1")%></li>
    <li>チェックボックス２：<%=request.getParameter("check2")%></li>
    <li>チェックボックス３：<%=request.getParameter("check3")%></li>
    <li>選択ボックス：<%=request.getParameter("select1")%></li>
    
        </ul>
    <%
        String str = request.getParameter("text1");
        if(str.equals("こんにちは")){
            out.println("こんにちは！");
        }else{
            out.println("わかりません!");
        
        }
        %>
        <%
            for(int i=1; i<3; i++){
                String getStr = request.getParameter("check"+i);             
                if(getStr !=null){
                   out.println(getStr +"<br>");
            }
            }
            %>
            <br>
    </body>
</html>
