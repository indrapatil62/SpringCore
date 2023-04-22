package com.springcore.practice;

public class Rommies {
	private int id;
	private String name;
	private String occupation;
	Address address;

	public Rommies(int id, String name, String occupation, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.occupation = occupation;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Rommies [id=" + id + ", name=" + name + ", occupation=" + occupation + ", address=" + address + "]";
	}

}
