
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddressServlet extends HttpServlet {

    private String htmlencode(String original) {
        StringBuffer encoded = new StringBuffer();
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            switch (c) {
                case '<':
                    encoded.append("&lt;");
                    break;
                case '>':
                    encoded.append("&gt;");
                    break;
                case '&':
                    encoded.append("&amp;");
                    break;
                case '\"':
                    encoded.append("&quot;");
                    break;
                default:
                    encoded.append(c);
            }
        }
        return encoded.toString();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //ここに日本語処理
        request.setCharacterEncoding("UTF-8");
        String strCity = request.getParameter("city");

        //ここに日本語処理
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>結果出力</title></head><body>");
        out.println(htmlencode(strCity));//ここにHTMLエンコード処理
        out.println("</body></html>");
    }
}
