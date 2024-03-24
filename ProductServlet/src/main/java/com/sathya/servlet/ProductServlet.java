package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step1:Read the requested data
		int productId=Integer.parseInt(request.getParameter("productId"));
		
		String productName=request.getParameter("productName");
		
		double productPrice=Double.parseDouble(request.getParameter("productPrice"));
		
		int productQuantity=Integer.parseInt(request.getParameter("productQuantity"));
		
		//Step2:process the data
		Double Totalbill=productPrice*productQuantity;
		Double Discount;
		if(Totalbill<1000) {
			Discount=Totalbill;
		}
		else if(Totalbill>1000 && Totalbill<5000){
			Discount=Totalbill*5/100;
		}
		else if(Totalbill>5000 && Totalbill<10000){
			Discount=Totalbill*10/100;
		}
		else{
			Discount=Totalbill*15/100;
		}
		//Total Bill<1000               :No  Discount
		//Total Bill>1000   <5000       :5%  Discount
		//Total Bill>5000   <10000      :10% Discount
		//Total Bill>10000              :15% Discount
		//Step3:Render the response
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<h1>PRODUCT INVOICE</h1>");
		writer.println("<br>productId..."+productId);
		writer.println("<br>productName..."+productName);
		writer.println("<br>productPrice..."+productPrice);
		writer.println("<br>productQuantity..."+productQuantity);
		writer.println("<br>product totalbill..."+Totalbill);
		writer.println("<br>product discount..."+Discount);
		writer.println("</html>");

	}

}
