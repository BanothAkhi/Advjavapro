package com.akhil.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProductDao {
	
	public int createTable() {
		//creation of table 
		Connection connection=null;
		Statement statement=null;
		int count=0;
		try {
			//Get the connection
			connection=DbConnection.createconnection();
			//create the Statement object
		statement=connection.createStatement();
		statement.executeUpdate("create table pro(ProId number(10),ProName varchar2(10),ProPrice number(10,2))");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	//save the details
		public int save(Product pro) {
		//Declare the resources
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int count=0;
			try {
				//Get the connection
				connection=DbConnection.createconnection();
				//create the preparedStatement object
				preparedStatement=connection.prepareStatement("insert into pro values (?,?,?)");
				//read the data from employee object and set to parameters
				preparedStatement.setInt(1,pro.getProId());
				preparedStatement.setString(2, pro.getProName());
				preparedStatement.setDouble(3, pro.getProPrice());
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
		
		//getProductById
		
		
		public Product getProductById(int ProId) {
			Product product=null;
			//try with resources once the try block completed the resource automatically closed
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("select * from pro where ProId=?")){
				//set the parameter data
				preparedStatement.setInt(1, ProId);
				//execute the query
				ResultSet resultSet=preparedStatement.executeQuery();
				//if the record is present execute below code
				if(resultSet.next()) {
					product=new Product();
					product.setProId(resultSet.getInt(1));
					product.setProName(resultSet.getString(2));
					product.setProPrice(resultSet.getDouble(3));

				}
			}
				catch(SQLException e) {
					e.printStackTrace();
				}
			return product;
			}
		
		
		//findAll
		
		 
		
		
		//updateByPrice
		public int updateByPrice(double priceRange,double IncrementValue) {
			int updatecount=0;
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("update pro set ProPrice=ProPrice+? where ProPrice>?")){
				preparedStatement.setDouble(1, IncrementValue);
				preparedStatement.setDouble(2, priceRange);
				updatecount=preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return updatecount;
		}
		
		
		//deleteById
		public int deleteById(int ProId) {
			int count=0;
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from pro where ProId=?")){
				preparedStatement.setInt(1, ProId);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return count;
		}
		
		//deleteByPrice
		public int deleteByPrice(int ProPrice) {
			int count=0;
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from pro where ProPrice=?")){
				preparedStatement.setInt(1, ProPrice);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return count;
		}
		
		public int dropTable() {
			int count;
			try(Connection connection=DbConnection.createconnection();
					PreparedStatement preparedStatement=connection.prepareStatement("drop table pro")){
				
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return 0;
			
		}
		
}
