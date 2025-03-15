package com.kh.chap03_override.model.vo;

public class Book /* extends Object */ {
	
	private String title;
	private String author;
	private int price;
	
	public Book() {}
		
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}

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
	
	/*
	 * * 오버라이딩
	 * - 자식클래스가 상속받고 있는 부모클래스의 메소드를 재정의(재작성) 하는 것
	 * - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미 
	 * - 자식 객체가 우선권을 가짐.
	 * 
	 * * 오버라이딩 성립 조건
	 * - 부모 메소드명 통일
	 * - 매개변수 (개수, 자료형, 순서) 동일 ==> 타입이 중요한 것이와요.
	 * - 매개변수 명은 상관없음.
	 * - 부모 메소드의 반환형 동일
	 * - 부모 메소드의 접근제한자가 범위가 같거나 커야한다.
	 * 		ex) 부모메소드의 접근제한자가 protected일 경우, 오버라이딩 하는 메소드의 접근제한자는 protected, public이어야 한다.
	 * ==> 규약의 개념이 들어가 있다. (재정의 할 거면 이정도의 규칙은 지켜줘)
	 * 
	 * @Override		어노테이션 (이러한 것을 전부 어노테이션이라고 부른다.)
	 * - 생략 가능하다, 크게 상관없음 (명시하지 않아도 오버라이딩 된 상태)
	 * >> 부모 메소드명이나 매개변수가 수정됐을 경우 => 알아보기 쉽다.
	 * 		자식 메소드 기술시 오타가 있을 경우 => 알아보기 쉽다.
	 * >> 단지 이 메소드 오버라이딩 한 메소드인 것을 알려주기 위함!
	 */
	
	@Override
	public String toString() {
		return "title = " + title + ", author = " + author + ", price = " + price;		
	}
	
}
