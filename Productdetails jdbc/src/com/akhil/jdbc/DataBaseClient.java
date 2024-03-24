package com.akhil.jdbc;

import java.util.List;

public class DataBaseClient {

	public static void main(String[] args) {
		ProductDao productDao=new ProductDao();
		
		//create table
	//	int count1=productDao.createTable();
	//	System.out.println(count1);
		
		
		  int res1=productDao.save(new Product(1001,"mobile",100));
			System.out.println("Data inserted successfully.."+res1);
			int res2=productDao.save(new Product(1002,"laptop",1000));
			System.out.println("Data inserted successfully.."+res2);
			int res3=productDao.save(new Product(1003,"book",200));
			System.out.println("Data inserted successfully.."+res3);
			int res4=productDao.save(new Product(1004,"watch",2000));
			System.out.println("Data inserted successfully.."+res4);
			int res5=productDao.save(new Product(1005,"bag",300));
			System.out.println("Data inserted successfully.."+res5);
			
			//getproductById
			/*	Product product=productDao.findById(1003);
				System.out.println(product);
				*/
		
		
				//getAllProducts
				//  List<Product> pro=productDao.getAllProducts();
				//for(Product pro1:pro) {
					//System.out.println(emp1);
			//	}
				//or
				//pro.forEach(System.out::println);
				
				
				//updateByPrice
				//int count=productDao.updateByPrice(100, 100);
			//	System.out.println(count+"rows affected");
				
				
				//deleteById
			/*	int pro=productDao.deleteById(1007);
				if(pro==1) {
					System.out.println("Data deleted successfully..");
				}
				else {
					System.out.println("Deletion failed..");
				} 
			*/	
				
				//deleteByPrice
			/*	int pro=productDao.deleteByPrice(1300);
				if(pro>0) {
					System.out.println("Price Deleted successfully..");
				}
				else {
					System.out.println("Deletion Failed..");
				}
			*/
			
		//Table drop
	//	int pro=productDao.dropTable();
		//System.out.println("Table droped successfully...");
		
	}

}
