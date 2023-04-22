package com.springAssignment;

public class Employee {
	
	int emp_id;
	String emp_name;
	String designation;
	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String emp_name, String designation, double salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 

}
