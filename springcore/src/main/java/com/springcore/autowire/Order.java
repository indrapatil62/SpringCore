package com.springcore.autowire;

public class Order {
	
	private String item;
	private String price;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", price=" + price + "]";
	}
	
	

}
