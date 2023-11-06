package com.productdetails;

public class Product {
	private String Pname;
	private String Company;
	private int Quantity;
	private int Price;

	public String getPname() {
		return Pname;
	}

	public void setPname(String Pname) {
		this.Pname = Pname;
	}
	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}
}
