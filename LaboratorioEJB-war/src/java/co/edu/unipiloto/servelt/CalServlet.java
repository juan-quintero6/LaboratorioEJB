/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servelt;

import co.edu.unipiloto.session.CalbeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juanes
 */
@WebServlet(name = "CalServlet", urlPatterns = {"/CalServlet"})
public class CalServlet extends HttpServlet {

    @EJB
    private CalbeanLocal calbean;
    
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
            response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int v1 = Integer.parseInt(request.getParameter("val1"));
            int v2 = Integer.parseInt(request.getParameter("val2"));
        
            String btnSumar = request.getParameter("btnSumar");
            String btnRestar = request.getParameter("btnRestar");        
            String btnMultiplicar = request.getParameter("btnMultiplicar");        
            String btnDividir = request.getParameter("btnDividir");       
            String btnModulo = request.getParameter("btnModulo");        
            String btnPotencia = request.getParameter("btnPotencia");       
                      
            if(btnSumar!=null){
                out.println("<h1>Operación: Suma</h1>");
                out.println("<p>N1: " +v1 +"</p>");
                out.println("<p>N2: " +v2 +"</p>");             
                out.println("<p>Resultado: " +calbean.sum(v1, v2)+"</p>");
            }
            if(btnRestar!=null){
                out.println("<h1>Operación: Resta</h1>");
                out.println("<p>N1: " +v1 +"</p>");
                out.println("<p>N2: " +v2 +"</p>");             
                out.println("<p>Resultado: " +calbean.res(v1, v2)+"</p>");
            }            
            if(btnMultiplicar!=null){
                out.println("<h1>Operación: Multiplicación</h1>");
                out.println("<p>N1: " +v1 +"</p>");
                out.println("<p>N2: " +v2 +"</p>");             
                out.println("<p>Resultado: " +calbean.mul(v1, v2)+"</p>");
            }
            if(btnDividir!=null){
                out.println("<h1>Operación: División</h1>");
                out.println("<p>N1: " +v1 +"</p>");
                out.println("<p>N2: " +v2 +"</p>");             
                out.println("<p>Resultado: " +calbean.div(v1, v2)+"</p>");
            }
            if(btnModulo!=null){
                out.println("<h1>Operación: Modulo</h1>");
                out.println("<p>N1: " +v1 +"</p>");
                out.println("<p>N2: " +v2 +"</p>");             
                out.println("<p>Resultado: " +calbean.mod(v1, v2)+"</p>");
            }
            if(btnPotencia!=null){
                out.println("<h1>Operation: Potencia</h1>");
                out.println("<p>N1: " +v1 +"</p>");
                out.println("<p>N2: " +v2 +"</p>");             
                out.println("<p>Resultado: " +calbean.pot(v1, v2)+"</p>");
            }         
            out.println("<p><a  href='CalJsp.jsp'> Nueva Operacion </a></p>");
            out.println("</body>");
            out.println("</html>");
        }  
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
