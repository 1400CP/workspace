package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable {
	
	// 객체 자체를 
	
	private String name;
	private int price;
	
	public Phone() {}
	
	
	
	// alt + shift + s => 기본단축키!
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	// alt + shift + s + o => 매개변수 생성자



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	// alt + shift + s + r, alt + a, alt + r => getter/setter


	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
	
	// alt + shift + s + s, enter => toString

}
