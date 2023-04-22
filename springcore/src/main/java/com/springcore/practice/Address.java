package com.springcore.practice;

public class Address {
	
	private String city;
	private String taluka;
	private String district;
	public Address(String city, String taluka, String district) {
		super();
		this.city = city;
		this.taluka = taluka;
		this.district = district;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", taluka=" + taluka + ", district=" + district + "]";
	}
	

}
