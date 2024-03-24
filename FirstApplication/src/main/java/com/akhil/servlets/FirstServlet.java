package com.akhil.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class FirstServlet implements Servlet {

    public FirstServlet() {
    }

	public void init(ServletConfig config) throws ServletException {
	}

	
	public void destroy() {
	}

	
	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null; 
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("This is the first application");
	}

}
