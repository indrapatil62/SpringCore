package com.springcore.ref;

public class Person {
	String pname;
	int p_id;
	Address address;

	
	public Person(String pname, int p_id,Address  address) {
		super();
		this.pname = pname;
		this.p_id = p_id;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", p_id=" + p_id + ", address=" + address+"]";
	}
	

}
