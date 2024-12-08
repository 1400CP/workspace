package com.hw1.model.vo;

public class Product {

	// private 부터
	private String productid;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	public Product(String productid, String productName, String productArea, int price, double tax) {
		this.productid = productid;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	
	// setter 시작.
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// getter 시작.
	public String getproductid() {
		return productid;
	}
	public String getproductName() {
		return productName;
	}
	public String getproductArea() {
		return productArea;
	}
	public int getprice() {
		return price;
	}
	public double gettax() {
		return tax;
	}
	
	// 마지막 information
	public String information() {
		return productid + " " + productName + " " + productArea + " " + price + " " + price + " " + tax ;
	}
}
