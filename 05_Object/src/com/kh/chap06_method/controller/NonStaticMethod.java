package com.kh.chap06_method.controller;

public class NonStaticMethod {

	
	/*
	 * * 메소드
	 * 	한 기능을 처리하기 위한 용도
	 * 
	 * 	패키지명 : 소문자로 시작
	 * 	클래스명 : 대문자로 시작
	 * 	변수명 : 소문자로 시작
	 * 	메소드명 : 소문자로 시작
	 * 
	 * 	공통 : 낙타표기법 (camel case)
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 반환형(반환할 값의 자료형) 메소드형([매개변수1, 매개변수2, ...) {
	 * 		수행하고 싶은 내용;
	 * 		[return 결과값;]  => 반환형에 따라 다르다.
	 * }
	 * 
	 */
	
	// 1. 매개변수 없고, 변환값도 없는 메소드
	public void method1() {						// method1() => 매개변수 x, void => 반환값 x
		// return 0; => 반환할 값이 없어야 한다.
		System.out.println("매개변수와 변환값이 둘 다 없는 메소드입니다.");
	}
	
	// 2. 매개변수 없고, 변환값이 있는 메소드
	public String method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		return "아 집에가고 싶다...";				// void인 경우 오류가 나서, String으로 교체.
		
		
	}
	
	// 3. 매개변수 있고, 변환값이 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수 있고 반환값은 없는 메소드입니다.");
		
		if(num2 != 0) {
			System.out.println("num1 / num2 : " + (num1 / num2));
		}else {
			System.out.println("0으로는 나눌 수 없습니다!");
		}
	}
	/*
	public void method3(String name) {
		System.out.println("매개변수 있고 반환값은 없는 메소드입니다.");
	}
	*/
	
	public char method4(String str, int index) {
		System.out.println("매개변수와 반환값 둘 다 있는 메소드입니다.");
		
		/*
		if(index >= 0 && index < str.length()) {
			return str.charAt(index);
			
		}else {	
			return ' ';						// 빈공간 출력하기. (오류해결)
		}
		*/
		return str.charAt(index);
	}
	
	
	
	
}
