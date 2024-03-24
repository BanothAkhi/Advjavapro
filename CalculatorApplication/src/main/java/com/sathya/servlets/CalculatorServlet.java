package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step1: read the data
		int num1=Integer.parseInt(request.getParameter("first"));
		int num2=Integer.parseInt(request.getParameter("second"));
		String operation=request.getParameter("operation");
		//Step2:process the data
		int result=0;
		switch(operation) {
			case"+":result=num1+num2;
					break;
			case"-":result=num1-num2;
					break;
			case"*":result=num1*num2;
					break;
			case"/":result=num1/num2;
					break;
			case"%":result=num1%num2;
					break;
		}
			//Step3:Render the response
				response.setContentType("text/html");	
				PrintWriter writer=response.getWriter();
				writer.println("<html>");
				writer.println("<h1>CALCULATED DATA</h1>");
				writer.println("first number:"+num1);
				writer.println("<br><br>");
				writer.println("second number:"+num2);
				writer.println("<br><br>");
				writer.println("entered operation:"+operation);
				writer.println("<br><br>");
				writer.println("your result:"+result);
				writer.println("</html>");
		
	}

}
