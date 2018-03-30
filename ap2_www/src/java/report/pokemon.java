/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author c0116043
 */
@WebServlet(name = "pokemon", urlPatterns = {"/report/pokemon"})
public class pokemon extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //コネクションとステートメントの宣言
        Connection con = null;
        Statement stmt = null;
        PreparedStatement ps=null;

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pokemon</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Servlet Pokemon at " + request.getContextPath() + "</h3>");

            //Class.forNameの記述
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //データベースへの接続
            String driverUrl = "jdbc:derby://localhost:1527/kadai";
            con = DriverManager.getConnection(driverUrl, "db", "db");
            stmt = con.createStatement();
            
            request.setCharacterEncoding("UTF-8");
            
            String name=request.getParameter("name");
            String seikaku=request.getParameter("seikaku");
            String item=request.getParameter("item");
            String ikusei=request.getParameter("ikusei");
            String tokusei=request.getParameter("tokusei");
            //レコードの追加
            String sql2 = "insert into POKEMON " + "(POKE_NAME,POKE_SEIKAKU,POKE_ITEM,POKE_IKUSEI,POKE_TOKUSEI) " + "values(?,?,?,?,?)";
            ps=con.prepareStatement(sql2);
            ps.setString(1, name);
            ps.setString(2, seikaku);
            ps.setString(3, item);
            ps.setString(4, ikusei);
            ps.setString(5, tokusei);
            
            int count=ps.executeUpdate();

            //SQL文の発行
            String sql = "select * from POKEMON ";
            ResultSet rs = stmt.executeQuery(sql);
           
            //データベースから値を取得して出力
             while (rs.next()) {
                out.println("ID=" + rs.getInt("POKE_ID") + "<br>");
                out.println("ポケモン名：" + rs.getString("POKE_NAME") + "<br>");
                out.println("性格は：" + rs.getString("POKE_SEIKAKU") + "<br>");
                out.println("持ち物：" + rs.getString("POKE_ITEM") + "<br>");
                out.println("育成論：" + rs.getString("POKE_IKUSEI") + "<br>");
                out.println("特性：" + rs.getString("POKE_TOKUSEI") + "<br>");
                out.println("<hr>");
            }
            //ResultSetのclose
            rs.close();

            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            //サーブレット内での例外をアプリケーションのエラーとして表示
            throw new ServletException(e);
        } finally {
            //例外が発生する・しないにかかわらず確実にデータベースから切断
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new ServletException(e);
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
