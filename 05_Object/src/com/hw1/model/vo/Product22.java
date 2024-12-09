package com.hw1.model.vo;

public class Product22 {

	/*
	- productId : String    // 상품아이디  
	- productName : String  // 상품명 
	- productArea : String  // 생산지
	- price : int			// 가격 
	- tax : double			// 부가세비율
	*/
	 
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	public void setProductId(String productId) {
		this.productId = productId;
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
	
	/*
	public String information() {
		System.out.println();
	} 인포메이션 정리만 해서 마무리하면 됨.
	*/
}
