package com.springcore;

public class Student {

	int stud_id;
	String stud_name;
	int stud_age;

	public Student(int stud_id, String stud_name, int stud_age) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_age = stud_age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getStud_age() {
		return stud_age;
	}

	public void setStud_age(int stud_age) {
		this.stud_age = stud_age;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_age=" + stud_age + "]";
	}

}
