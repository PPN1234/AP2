/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author c0116043
 */
public class QuestionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
        doProcess(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException{
        doProcess(request,response);
    }
   private void doProcess(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name=request.getParameter("name");
            
            
            String grade=request.getParameter("grade");
            
             String sex = request.getParameter("sex");
            int check = Integer.parseInt(sex);
             String g = "";
            if (check == 1) {
                g = "男性";
            } else if (check == 2) {
                g = "女性";
            }
            
           
            
            
          
            out.println("<html><head>");
            out.println("<title>QuestionServlet</title></head><body>");
            out.println("名前は"+name+"です。"+"<br>");
            out.println("性別は"+g+"です。"+"<br>");
              for(int i=1; i<4; i++){
                String getStr = request.getParameter("visual"+i);             
                if(getStr !=null){
                   out.println("求める容姿"+i+"つ目は"+getStr +"<br>");
            }
            }
              out.println("学年は"+grade+"です。");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

   