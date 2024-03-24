package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @WebServlet("/akhil")

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		response.setContentType("text/plain");
		
		writer.println("<html>");
		writer.println("<h1>Hello my name is akhil</h1>");
		writer.println("<h2>Welcome to java</h2>");
		writer.println("<h3>Ratan sir classes</h3>");
		writer.println("</html>");
	}

}
