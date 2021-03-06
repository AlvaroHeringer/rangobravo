/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rangobravo.web;

import com.rangobravo.web.controller.ClienteController;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.rangobravo.web.model.Cliente;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "ConsultarServlet", urlPatterns = {"/consultar-cliente"})
public class ConsultarCliente extends HttpServlet{
    
    
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
         
        List<Cliente> lista = ClienteController.consultar();
        request.setAttribute("consulta", lista);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/ConsultaCliente.jsp");
        dispatcher.forward(request, response);
    }

}
