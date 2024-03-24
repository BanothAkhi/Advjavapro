package com.akhil.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step1:Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully...");
		//Step2: Create the Connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager");
		System.out.println("connection loaded successfully...");
	}
	

}
