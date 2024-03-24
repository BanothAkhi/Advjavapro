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


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//place the data
	/*	String username=request.getParameter("username");
		String age=Integer.parseInt(request.getParameter("age"));
		
		//create the session
		HttpSession session=request.getSession();
		
		//place the data into session
		session.setAttribute("username", username);
		session.setAttribute("age", age);
		
		//forward to next form
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("form2.html");
		requestDispatcher.forward(request, response);
		
		*/
		
		//cookies object
		//place the data
				String username1=request.getParameter("username");
				String age1=request.getParameter("age");
				
				// create the cookies object
				Cookie cookie1=new Cookie("username", username1);
				Cookie cookie2=new Cookie("age", age1);
				
				response.addCookie(cookie1);
				response.addCookie(cookie2);

				
				//forward to next form
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("form2.html");
				requestDispatcher.forward(request, response);
	}

}
