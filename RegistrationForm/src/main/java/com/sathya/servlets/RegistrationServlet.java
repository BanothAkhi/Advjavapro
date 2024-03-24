package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step1:Read the data
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String[] qualification=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		String[] language=request.getParameterValues("language");
		String comments=request.getParameter("comments");

		//Step2:Process the data
			String q=String.join(",", qualification);
			String l=String.join(",", language);
		
		//Step3:Render the data
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<h1>REGISTERED DETAILS</h1>");
		writer.println("yourname :"+name+"<br>");
		writer.println("password :"+password+"<br>");
		writer.println("mobile no :"+mobile+"<br>");
		writer.println("Email :"+email+"<br>");
		writer.println("Gender:"+gender+"<br>");
		writer.println("DOB :"+dob+"<br>");
		writer.println("Qualification :"+q+"<br>");
		writer.println("Country :"+country+"<br>");
		writer.println("Languages :"+l+"<br>");
		writer.println("comments :"+comments+"<br>");
		
		
		writer.println("</html>");

	}

}
