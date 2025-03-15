package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic {
	
	// 추상클래스(abstract class) : 일반필드 + 일반메소드 [+ 추상메소드]
	// 인터페이스(interface)		: only 상수필드 + 추상메소드
	
	// private int a;
	
	// public void test() {
	// 	
	// }
	
	
	// 인터페이스에서 필드는 무조건 상수필드만 된다!!
	public static final int NUM =10;
	/*public static final*/ int NUM1 = 10;					// 생략되었다고 생각함.
	
	// 인터페이스에서 메소드는 무조건 추상메소드만 된다!!
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
	

}
