package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloWorldServlet")

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public HelloWorldServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Jaii Balayya</html>");
		writer.println("<h2>jai Janasena</h2>");
		writer.println("</html>");
		
	}
}