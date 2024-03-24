package com.akhil.jdbc;

public class Employee {
	
	
	int EmpId;
	String EmpName;
	Double EmpSalary;
	
	
	
	
	public Employee(int empId, String empName, double empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSalary = empSalary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public Double getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(Double empSalary) {
		EmpSalary = empSalary;
	}
	
	
	
	

}
