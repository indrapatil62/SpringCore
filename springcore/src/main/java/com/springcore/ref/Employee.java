package com.springcore.ref;

public class Employee {
	
	int emp_id;
	String emp_name;
	Address address;
	
	public Employee(int emp_id, String emp_name,Address  address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", address=" + address+  "]";
	}
	
	
	

}
