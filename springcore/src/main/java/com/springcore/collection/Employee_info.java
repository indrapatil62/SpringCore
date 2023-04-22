package com.springcore.collection;

import java.util.List;
import java.util.Set;

public class Employee_info {

	private int emp_id;
	private List<String> names;
	private Set<String> Phones;

	public Employee_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<String> getPhones() {
		return Phones;
	}

	public void setPhones(Set<String> phones) {
		Phones = phones;
	}

}
