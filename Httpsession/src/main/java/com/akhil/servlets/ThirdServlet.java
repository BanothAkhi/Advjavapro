package com.akhil.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		Cookie[] cookie=request.getCookies();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<pre style='color:red'>");
		writer.println("username..."+cookie[0].getValue());
		writer.println("age..."+cookie[1].getValue());
		writer.println("qualification..."+cookie[2].getValue());
		writer.println("designation..."+cookie[3].getValue());
		writer.println("email..."+request.getParameter("email"));
		writer.println("mobile..."+request.getParameter("mobile"));
		writer.println("</pre");
		writer.println("</body>");
		writer.println("</html>");

		
	}

}
