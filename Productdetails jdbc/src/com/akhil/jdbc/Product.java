package com.akhil.jdbc;

public class Product {
		
	int proId;
	String proName;
	Double proPrice;
	
	
	
	
	
	
	
	public Product(int proId, String proName, double proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Double getProPrice() {
		return proPrice;
	}
	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}
	public int getproId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getproName() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getproPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
