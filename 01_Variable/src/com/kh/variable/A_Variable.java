package com.kh.variable;

public class A_Variable {

	// 한 줄 주석
	// 기능 : 메소드(함수)
	// 시급과 근무시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드

	public void printVariable() {

		System.out.println("===== 변수 사용 전 =====");
	
		System.out.println("시급 : 9450원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
		
		// 월급 = 시급 x 근무시간 x 근무일수.
		// 차은우 : 000원 형식으로 출력하고 싶다.
		
		System.out.println("차은우 : " + (9450 * 6 * 8) + "원");
		System.out.println("장원영 : " + (9450 * 6 * 8) + "원");
		System.out.println("카리나 : " + (9450 * 6 * 8) + "원");
		
		// 자바에서의 곱셈은 * 로 표기.
	
		// 변수 사용 후
		System.out.println("===== 변수 사용 후 ======");
		
		int pay = 9550; // Java = 은 대입이라는 의미입니다.
		int time = 8;
		int day = 10;
		
		System.out.println("차은우 : " + (pay * time * day) + "원");
		System.out.println("장원영 : " + (pay * time * day) + "원");
		System.out.println("카리나 : " + (pay * time * day) + "원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아짐.)
		 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다. (재사용성이 높아짐.)
		 * 3. 유지보수를 쉽게 할 수 있다.
		 */
		
		System.out.println("시급 : " + (pay * time * day) + "원");
	}
	
	public void decleareVariable() {
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다.
		 * 즉, 값을 보관하기 위한 상자를 만들겠다!
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수명 : 변수의 이름을 붙여주는 부분 (의미부여!)
		 */
		
		// --------------자료형에 대한 개념 ------------------
		// 1. 논리형 (논리값 = true / false)
		
		boolean isTrue;
		boolean isFalse = false;
		System.out.println(isFalse);
		
		isTrue = 1 + 3 > 1; //true가 나오네.
		System.out.println("isTrue의 값 : " + isTrue);
		
		// 2. 숫자형
		// 2_1. 정수형(소수점X)
		
//		byte bNum; // 1byte (-128-127)
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte, 대표적으로 많이 쓰임.
		
		long lNum = 100000L; // 8byte
		
		// 2_2. 실수형(소수점O)
		float fNum = 0.0f; //4byte => 소수점 7자리까지 표현 가능.
		
		double dNum = 0.5; // double은 float과 구별하기 위해 붙이는 것이 없음.
							// 8byte => 소수점 15자리까지 표현. 대표적으로 많이 쓰임.
		
		// 3. 문자형
		// 3_1. 문자(한글자) ' '
		char ch = 'a'; // 2byte 홀따옴표
		char Lee;
		Lee = '용'; // 한글 한글자가 2byte라서 불가능
		// M, F, Y, N 보통 한글자만 사용.
		
		// 3_2. 문자열(여러 글자) " "
		String str; //참조형
		str = "abc";
		
		// 값이 잘 담겼는지 확인해 보자!
		System.out.println(isTrue);
		System.out.println(dNum);
		
		// 변수이름 : 값의 형태로 출력하고 싶다.
		
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("Lee : " + Lee);
		System.out.println("str : " + str);
		
		
		// 상수의 선언!
		// [표현법] final 자료형 변수명
		
		final int AGE;
		AGE = 10; // 초기화
		
		System.out.println("AGE : " + AGE);
		
		// AGE = 13; 상수는 값의 변경이 불가.
		
		// 대표적인 상수의 예 : 3.14 (파이, 원주율)
		System.out.println(Math.PI);
		
		// 번 외
		
		int etc = 999_999_999;
		
		System.out.println(etc);
		
		// * 변수 명명규칙
		
//		int number;
		
		// 1. 같은 영역 내 중복된 이름 안 됨!!
//		int numBer; // 대소문자 구분은 되는데, 이렇게 쓰진 않음.
		
		// 2. 예약어(자바에서 사용되고 있는 키워드) 안 된다.
		// int true;
		// int class;
		// int static;
		// int public;
		
		// 3. 숫자 사용 가능하나 단, 숫자로 시작하는 건 안 된다.
//		int number1;
//		int num1ber;
//		int 1number;
		
		// 4. 특수문자 _랑 $ 이외에 사용 불가.
//		int number_1;
//		int _number;
//		int number$1;
		
		// int number!1;
		// int number#;
		
		// 권장사항!! (오류는 없으나, 지켜줘!) 개발자간의 매너.
		// 1. 낙타표기법
//		String username; // 관례상 하지 말자
//		String userName; // 음...
//		String userNameTest; //으으으음...
		
		// 2. 한글 사용 가능하나 영어로 합시다.
//		String 이름;
//		int 나이;
//		int userAge;
		
		/*
		 * **정리**
		 * - 변수 : 값을 저장하기 위한 공간 (메모리에 값을 기록하기 위한 공간)
		 * - 값(리터럴) : 프로그램 상에 필요한 명시적인 값
		 * 				또는 사용자가 마우스 또는 키보드로 입력한 값
		 */
		
	}
	
}