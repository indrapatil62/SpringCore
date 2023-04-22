package com.springcore.ci;

public class Employee {
	
	int emp_id;
	String emp_name;
//	double salary;
	public Employee() {
		
	}
	public Employee(int emp_id) {
	
		this.emp_id = emp_id;
	}
	public Employee(String emp_name) {
	
		this.emp_name = emp_name;
	}

	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	
	
	

}
