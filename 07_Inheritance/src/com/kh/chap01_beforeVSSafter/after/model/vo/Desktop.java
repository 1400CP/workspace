package com.kh.chap01_beforeVSSafter.after.model.vo;

//				자식 -----------> 부모
//				후손 -----------> 조상
//				하위 -----------> 상위

//				this. ---------> super.
public class Desktop extends Product {
	
// extends : 상속했다.
	
	private boolean allInOne;
	// 이게 기본 끝났다!!!
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// this.brand = brand; ==> 명시적으로는 없어서 안 된다.
		// brand ~ price 네 개의 값들은 부모클래스(Product)의 필드에 대입.
		// super.으로 부모에 접근 가능.
		// private는 접근이 불가능하기 때문에 풀어야 한다.
		
		// ctrl + H ==> 여러 찾기 기능,
		// ctrl + shift + R ==> 오픈 리소스! (실행)
		
		// 해결 방법1. 부모 클래스에 있는 필드를 protected 접근제한자로 수정. (권장 x)
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		
		// 해결 방법2. 부모클래스에 있는 setter 메소드 활용하기(public 이기 때문에 접근 가능)
		
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 해결 방법3. 부모생성자 호출하기.
		// super 생성자 : this 와 같이 위치가 항상 위에 있어야 합니다. => 편리하긴 함.
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;

	}	
		
	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 부모님의 뽀려오기
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의하는 것.
	public String information() {
		return super.information() + ", allInOne : " + allInOne;
	}
	
}
