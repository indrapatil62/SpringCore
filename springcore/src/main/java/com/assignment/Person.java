package com.assignment;

public class Person {

	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	String p_id;
	String p_name;
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", dept=" + dept + "]";
	}
	Department dept;
	
}
