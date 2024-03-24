package com.akhil.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Step1:Read the request data
		int employeeId=Integer.parseInt(request.getParameter("employeeId"));

		String employeeName=request.getParameter("employeeName");

		double employeeBasicsalary=Double.parseDouble(request.getParameter("employeeBasicsalary"));

		
		
		//Step2:process the data
		double BS0,HRA,DA,PF,GS;
		if(employeeBasicsalary>=50000) {
			HRA=0.3*employeeBasicsalary;
			DA=0.1*employeeBasicsalary;
			PF=0.06*employeeBasicsalary;
			GS=employeeBasicsalary+HRA+DA-PF;
		}
		else if(employeeBasicsalary<50000 && employeeBasicsalary>25000) {
			HRA=0.2*employeeBasicsalary;
			DA=0.5*employeeBasicsalary;
			PF=0.03*employeeBasicsalary;
			GS=employeeBasicsalary+HRA+DA-PF;
		}
		else {
			HRA=0.1*employeeBasicsalary;
			DA=0.03*employeeBasicsalary;
			PF=0.02*employeeBasicsalary;
			GS=employeeBasicsalary+HRA+DA-PF;
		}
		//Step3:Render the data
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<h1>SalaryInfo</h1>");
		writer.println("Employee Id:"+employeeId);
		writer.println("<br><br>");
		writer.println("Employee name:"+employeeName);
		writer.println("<br><br>");
		writer.println("Employee BasicSalary:"+employeeBasicsalary);
		writer.println("<br><br>");
		writer.println("HRA Amount:"+HRA);
		writer.println("<br><br>");
		writer.println("DA Amount:"+DA);
		writer.println("<br><br>");
		writer.println("PF Amount:"+PF);
		writer.println("<br><br>");
		writer.println("Gross Amount:"+GS);
		writer.println("<br><br>");
		writer.println("</html>");


	}

}
