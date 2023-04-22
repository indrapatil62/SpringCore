package com.assignment;

public class Department {

	String dept_no;
	String dept_name;
	String location;
	Department dept;
	public String getDept_no() {
		return dept_no;
	}
	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [dept_no=" + dept_no + ", dept_name=" + dept_name + ", location=" + location + "]";
	}
	
	
}
