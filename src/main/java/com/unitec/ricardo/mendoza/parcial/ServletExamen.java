package com.unitec.ricardo.mendoza.parcial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gatuzo07
 */
public class ServletExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");        
        Evaluacion evaluacion = new Evaluacion();
        DAOEvaluacion evaluacion = new DAOEvaluacion();     
        try {
            evaluacion.guardar(evaluacion);
            RequestDispatcher despachador = request.getRequestDispatcher("/respuesta.jsp");
            despachador.forward(request,response);
            
        } catch (Exception ex) {
    }
}
}
