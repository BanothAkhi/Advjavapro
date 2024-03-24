package com.akhil.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        //place the data
			/*	String qualification=request.getParameter("qualification");
				String designation=request.getParameter("designation");
				
				//locate the session
				HttpSession session=request.getSession(false);
				
				//place the data into session
				session.setAttribute("qualification", qualification);
				session.setAttribute("designation", designation);
				
				//forward to next form
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("form3.html");
				requestDispatcher.forward(request, response);
				
				*/
				
				//cookies object
				String qualification=request.getParameter("qualification");
				String designation=request.getParameter("designation");
				
				//create the cookies object
				Cookie cookie3=new Cookie("qualification", qualification);
				Cookie cookie4=new Cookie("designation", designation);
				
				response.addCookie(cookie3);
				response.addCookie(cookie4);
				//forward to next form
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("form3.html");
				requestDispatcher.forward(request, response);
	}

}
