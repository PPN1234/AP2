<%@ page contentType="text/html;charset=UTF-8" %>

    <%String strteihen=request.getParameter("teihen");
       String strtakasa=request.getParameter("takasa");
       double a=Double.parseDouble(strteihen);
       double b=Double.parseDouble(strtakasa);
       double S=(a*b)/2; %>
            

<html><head><title>結果出力</title></head><body>
三角形の面積 = <%= S %> cm<sup>2</sup> 
</body></html>
