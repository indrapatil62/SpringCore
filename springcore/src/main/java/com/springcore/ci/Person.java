package com.springcore.ci;

public class Person {
	String pname;
	int p_id;
	
	public Person(String pname, int p_id) {
		super();
		this.pname = pname;
		this.p_id = p_id;
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", p_id=" + p_id + "]";
	}
	

}
