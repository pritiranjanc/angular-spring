package com.example.angular.model;

public class Employee {
	
	private int empId;
	private String designation;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int empId,String name,String designation,double salary) {
		this.empId = empId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
