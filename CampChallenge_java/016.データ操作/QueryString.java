/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eriko
 */
@WebServlet(urlPatterns = {"/QueryString"})
public class QueryString extends HttpServlet {

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
        // 受け取るパラメータの文字コード
        request.setCharacterEncoding("UTF-8");
// テキストボックス(total)の情報
        String total1 = request.getParameter("total");
//テキストボックス(count)の情報
        String count1 = request.getParameter("count");
//コンボボックス(select)の情報
        String item = request.getParameter("cmblist");

        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //文字列から数値への変換
            int total2 = Integer.parseInt(total1);
            int count2 =Integer.parseInt(count1);
            int item2 = Integer.parseInt(item);
            
            

            //商品名の日本語表記
            switch (item2) {
                case 0:
                    out.println("雑貨");
                    break;
                case 1:
                    out.println("生鮮食品");
                    break;
                case 2:
                    out.println("その他");
                    break;
            }
            
            //単価を求める。
            int wari = total2/count2;
            out.println("商品の単価は"+wari+"円です。");
            
            //ポイントの計算
            if (total2>4999){
                out.println("ポイントは"+total2*0.05+"pです。");
            }  else if (2999<total2&&total2<5000){
                out.println("ポイントは"+total2*0.03+"pです。");
            } else {
            out.println("ポイントはありません。");
        }
        

            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet QueryString</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet QueryString at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
