package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * *증감 연산자 (단항연산자)
	 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 * 		++변수, 변수++
	 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 * 		--변수, 변수--
	 * 
	 * (증감연산자)변수 : 전위연산 => "선증감" 후처리
	 * 변수(증감연산자) : 후위연산 => 선처리 "후증강" (어려움)
	 */
	
	public void method1() {
		
		// 전위연산테스트
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1); // 10
		System.out.println("1회 수행 후 결과 : " + ++num1); // 11
		System.out.println("2회 수행 후 결과 : " + ++num1); // 12
		System.out.println("3회 수행 후 결과 : " + ++num1); // 13
		System.out.println("최종 num1의 값 : " + num1);
		
		System.out.println("====================================");
		
		// 후위연산테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2의 값 : " + num2); //10
		System.out.println("1회 수행 후 결과 : " + num2++); // 11 (num2 = 10)
		System.out.println("2회 수행 후 결과 : " + num2++); // 12 (num2 = 11)
		System.out.println("3회 수행 후 결과 : " + num2++); // 13 (num2 = 12)
		System.out.println("최종 num2의 값 : " + num2); // 13 (num2 = 13)
		
	}
	
	public void method2() {
		
		int a = 10;
		int b = ++a; // 전위연산자
		
		System.out.printf("a : %d, b : %d\n", a, b);
		
		int c = 10; // c = 11, d = 10
		int d = c++; // 후위연산자
		
		System.out.printf("c : %d, d : %d\n", c, d);
		
		int num = 20;
		System.out.println("현재 num : " + num); // num = 20
		System.out.println("++num은? : " + ++num); // num = 21
		System.out.println("num++은? : " + num++); // num = 21 (22 출력)
		
		System.out.println("--num은? : " + --num); // num = 21
		System.out.println("num--은? : " + num--); // num = 21 (20 출력)
		
		System.out.println("최종 num : "+ num);
	}

	public void method3() {
		
		int num1 = 20;
		int result1 = ++num1 * 3; // 21 * 3 => 일단 처음은 63이 나오겠지?
		
		System.out.printf("num1 : %d, result1 : %d\n", num1, result1);
		
		int num2 = 20;
		int result2 = num2++ * 3; // 20 * 3 => 일단 처음은 60이 나오겠지?
		
		System.out.printf("num2 : %d, result2 : %d\n", num2, result2);
	}
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // 10 (11)
		System.out.println((++a) + (b++)); // 12 + 20 (21) => 32
		System.out.println((a++) + (--b) + (--c)); // 12 (13) + 20 + 29 => 61 
		
		System.out.printf("a : %d, b : %d, c : %d", a, b, c); // a = 13, b = 20, c = 29
	}
	
	
}
