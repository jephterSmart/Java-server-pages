package com.jephtersmart.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import com.jephtersmart.beans.PersonBean;

public class ServletClass extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String query = request.getQueryString();
        request.setAttribute("servletQuery", query);
        // PersonBean person = new PersonBean();
        // request.setAttribute("person", person);
        RequestDispatcher view = request.getRequestDispatcher("/jsp/index.jsp?jab='see'");
        view.forward(request, response);
    }
}