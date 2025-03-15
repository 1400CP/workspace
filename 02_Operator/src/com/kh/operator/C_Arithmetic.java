package com.kh.operator;

public class C_Arithmetic {

	/*
	 * * 산술 연산자 (이항 연산자 == 두개의 값을 가지고 연산)
	 * + - * / %
	 * 
	 * * / % >(먼저)> + -
	 */
	
	public void method1() {
		
		
		int num1 = 10;
		int num2 = 3;
		
		// System.out.println("num1 + num2 = " + num1 + num2); // 103이 출력됨.
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 13
		// System.out.println("num1 - num2 = " + num1 - num2); // 에러 발생. 문자열에 숫자를 빼려고 한 격이다.
		System.out.println("num1 - num2 = " + (num1 - num2)); // 7
		System.out.println("num1 * num2 = " + (num1 * num2)); // 에러는 없지만 가독성을 위해 묶자.
		System.out.println("num1 / num2 = " + (num1 / num2)); // 에러는 없지만 가독성을 위해 묶자.
																// 나누기 했을 때 몫
		System.out.println("num1 % num2 = " + (num1 % num2)); //나누기 했을 때, 나머지 값. <짝, 홀>
		
		// 값 % 2 == 0 (짝수)
		// 값 % 2 == 1 (홀수)
		// 값 % 5 == 0 (5의 배수)
		// 값 % 3 == 0 (3의 배수)
		
		
	}
	
	public void quiz1(){
	      int a = 5;
	      int b = 10;
	      
	      int c = (++a) + b;	// a=6, b=10, c=16
	      int d = c / a; 		// a=6, b=10, c=16, d=2
	      int e = c % a;  		// a=6, b=10, c=16, d=2, e=4
	      
	      int f = e++;   		// a=6, b=10, c=16, d=2, e=4(5), f=4
	      int g = (--b) + (d--);	// a=6, b=9, c=16, d=2(1), e=5, f=4, g=11
	      int h = 2; 			// a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
	      int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	      // a=6(7), b=9, c=15, d=1, e=6, f=4, g=11(10), h=2, i=
	      // 6 + 9 / ( 15 / 4 ) * ( 11 - 1 ) % ( 6 + 2 )
	      // 6 + 9 / ( 3 ) * ( 10 ) % ( 8 )
	      // 6 + 30 % 8
	      // i = 12
	   
	      System.out.println("a : " + a); 	// a = 7
	      System.out.println("b : " + b); 	// b = 9
	      System.out.println("c : " + c); 	// c = 15
	      System.out.println("d : " + d); 	// d = 1
	      System.out.println("e : " + e); 	// e = 6
	      System.out.println("f : " + f); 	// f = 4
	      System.out.println("g : " + g); 	// g = 10
	      System.out.println("h : " + h); 	// h = 2
	      System.out.println("i : " + i); 	// i = 12
	
	}
	
	
}
