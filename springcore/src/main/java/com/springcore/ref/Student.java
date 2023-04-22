package com.springcore.ref;

public class Student {

	int stud_id;
	String stud_name;
	
	Address address;

	public Student(int stud_id, String stud_name,Address  address) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name  + ", address=" + address+"]";
	}

}
