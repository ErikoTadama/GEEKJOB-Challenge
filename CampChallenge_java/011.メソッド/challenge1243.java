/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author eriko
 */
public class challenge1243 extends HttpServlet {

    String[][] profile() {

        String[] data1 = {"123", "紀子", null, "3月9日"};

        String[] data2 = {"124", "芳子", "目黒区", "7月17日"};

        String[] data3 = {"125", "苑子", "港区", "6月6日"};

//配列を入れる配列の宣言
        String[][] datas = new String[3][4];
        datas[0] = data1;
        datas[1] = data2;
        datas[2] = data3;

        return datas;

    }

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
        try (PrintWriter out = response.getWriter()) {

            String[][] information = profile();

            for (int limit = 2; limit > 0; limit--) {
                for (int ii = 0; ii < 4; ii++) {
                    if (information[limit][ii] == null) {
                        continue;
                    }
                    out.println(information[limit][ii]);
                }
            }
//一般的な書き方
            Integer limit = 2;
            for (int i = 0; i < limit; i++) {
                for (int ii = 0; ii < 4; ii++) {
                    if (information[i][ii] == null) {
                        continue;
                    }
                    out.println(information[i][ii]);
                }
            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge1243</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge1243 at " + request.getContextPath() + "</h1>");
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
