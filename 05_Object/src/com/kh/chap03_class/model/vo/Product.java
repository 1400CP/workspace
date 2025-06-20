package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언 구문에 작성가능한 접근제한자 (public, default)
	// default라고 쓰는 것이 아니고 접근제한자
	// default로 하면 같은 패키지 내에서만 사용 가능하다.
	
	
	
	/*
	 * * 필드(filed)
	 * 
	 * 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * [표현법]
	 * 접근제한자  자료형  변수명;
	 */
	
	private String pName;					// 상품명
	private int price;						// 가격
	private String brand;					// 브랜드
	
	/*
	 * * 생성자
	 * - 객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명([매개변수, 매개변수, ...]) {
	 * 
	 * }
	 */
	
	// 기본 생성자
	public Product() {
		
	}
	
	//매개변수 생성자
	public Product(String pName, int price, String brand) {			// 순서 잘 지키자.
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	
	
	/*
	 * * 메소드
	 * - 기능을 처리하는 담당 
	 * 
	 * [표현법]
	 * 접근제한자 반환형 메소드명([매개변수]) {
	 * 		// 기능 구현
	 * }
	 */
	
	// setter 3개 (이런 경우 setpName 이 맞습니다. 대문자가 이미 있으니까 낙타를 안 해도 됨.)
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// getter 3개
	public String getpName() {
		return pName;
	}
	public int getprice() {
		return price;
	}
	public String getbrand() {
		return brand;
	}

	// 내가 생각할 때 유용할 것 같은 메소드도 자유롭게 생성 가능!
	
	// 모든 필드값을 다 합친 하나의 문자열을 반환해주는 메소드
	
	public String information() {
		//return pName, price, brand; return
		return "pName : " + pName + ", price : " + price + ", brand : " + brand ;
	}
	
	
	

}


