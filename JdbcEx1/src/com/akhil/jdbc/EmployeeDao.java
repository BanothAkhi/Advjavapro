package com.akhil.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

		public int save(Employee emp) {
		//Declare the resources
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int count=0;
			try {
				//Get the connection
				connection=DbConnection.createconnection();
				//create the preparedStatement object
				preparedStatement=connection.prepareStatement("insert into emp values (?,?,?)");
				//read the data from employee object and set to parameters
				preparedStatement.setInt(1,emp.getEmpId());
				preparedStatement.setString(2, emp.getEmpName());
				preparedStatement.setDouble(3, emp.getEmpSalary());
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {
				//Before release the connection check the connection is present or not
				try {
					if(connection!=null)
						connection.close();
					if(preparedStatement!=null)
						preparedStatement.close();
				}
				catch ( SQLException e ) {
					e.printStackTrace();
				}
			}
			return count;
		}
		
		//findById
	public Employee findById(int EmpId) {
		Employee employee=null;
		//try with resources once the try block completed the resource automatically closed
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select * from emp where empId=?")){
			//set the parameter data
			preparedStatement.setInt(1, EmpId);
			//execute the query
			ResultSet resultSet=preparedStatement.executeQuery();
			//if the record is present execute below code
			if(resultSet.next()) {
				employee=new Employee();
			employee.setEmpId(resultSet.getInt(1));
			employee.setEmpName(resultSet.getString(2));
			employee.setEmpSalary(resultSet.getDouble(3));

			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
		return employee;
		}
	
	//deleteById
	public int deleteById(int EmpId) {
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empId=?")){
			preparedStatement.setInt(1, EmpId);
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
	//deleteBySalary
	public int deleteBySalary(int EmpSalary) {
		int count=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empSalary=?")){
			preparedStatement.setInt(1, EmpSalary);
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	//findAll
	
	public List<Employee> findAll(){
		
		List<Employee> emps=new ArrayList<Employee>();
		try(Connection connection=DbConnection.createconnection();
				Statement statement=connection.createStatement()){
			ResultSet resultSet=statement.executeQuery("select * from emp");
			while(resultSet.next()) {
				Employee employee=new Employee();
			employee.setEmpId(resultSet.getInt(1));
			employee.setEmpName(resultSet.getString(2));
			employee.setEmpSalary(resultSet.getDouble(3));
			emps.add(employee);
		}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return emps;
	}
	
	
	//updateSalary
	public int updateSalary(double currentSalary,double incSalary) {
		int updatecount=0;
		try(Connection connection=DbConnection.createconnection();
				PreparedStatement preparedStatement=connection.prepareStatement("update emp set EmpSalary=EmpSalary+? where EmpSalary>?")){
			preparedStatement.setDouble(1, incSalary);
			preparedStatement.setDouble(2, currentSalary);
			updatecount=preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return updatecount;
	}
	
}
