package com.kh.chap01_oneVSmany.model.vo;

public class Book {
	
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;	
	
	// 기본 생성자
	public Book() {
		
	}
	
	//매개변수 생성자(전체)
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 각 필드에 대한 getter - setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// information 함수
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
		// 리턴은 한개만 된다. 그래서 + 로 여러개를 챙기려고 한다.
	}
	
}
