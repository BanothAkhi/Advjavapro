package com.akhil.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginDetailsServlet")
public class LoginDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read the form data
		String firstname=request.getParameter("firstname");
		String middlename=request.getParameter("middlename");
		String lastname=request.getParameter("lastename");
		//process the data
		String status;
		if(firstname.equals("BANOTH")&&middlename.equals("AKHIL")&&lastname.equals("NAYAK")) {
			status="BANOTH AKHIL NAYAK";
		
			//Rendering the data into client
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			writer.println("<html>");
			writer.println("<h1>Full name</h1>"+status);
			writer.println("</html>");
			
		}
	}

}
