package com;

public class user {
	private int id;
	private String product;
	private String model;
	private int price;
	
	public user() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", product=" + product + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
}
