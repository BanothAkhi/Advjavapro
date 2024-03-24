package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1:read the from data
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");
		//step-2:process the data
		String status;
		if(username.equals("akhil")&&password.equals("Akhil123@")) {
		/*	status="Login successfull...";
		}
		else {
			status="Login failed....";
		}
		//step-3:Render the Response to client
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html");
		writer.println("<h1>LOGIN STATUS</h1><br>" +status);
		writer.println("</html");
		*/
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
		dispatcher.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("login fail check the credential once");
			RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
			
			
		}
	}

}
