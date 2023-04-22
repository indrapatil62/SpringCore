package com.springcore.ref;

public class Address {
	String  Street;
	String city;
	int pin;
	public Address(String street, String city, int pin) {
		super();
		Street = street;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}
