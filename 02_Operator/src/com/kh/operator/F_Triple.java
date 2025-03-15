package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
	
	/*
	 * *삼항 연산자 (항을 3개를 가지고 연산해주는 연산자)
	 * [표현법]
	 * 조건식 ? 조건식이 참일 경우 돌려줄 값 : 조건식이 거짓일 경우 돌려줄 결과 값.
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오도록 작성해야 함!
	 */

	
	public void method1() {
		//입력받은 정수 값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 : ");
		int num = sc.nextInt(); // 7, -7
		
		// xxx은(는) xxx. (양수입니다. 양수가 아닙니다.)
		// String result = [조건] [?] [참일 때 : 거짓일 때]
		// String result = (num > 0) ? "양수입니다." : "양수가 아닙니다." 
		String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		
		System.out.println(num + "은(는)" + result);	
		
		sc.close();
	}
	
	public void method2() {
		//입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num + "은(는)" + result);
		
		sc.close();
	}
	
	public void method3() {
		// 양수이다 음수이다 0이다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ) ? "양수이다." : (num == 0) ? "0이다." : "음수이다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void method4() {
		
		//사용자에게 종료여부를 입력받아 판별해서 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y') || (ch == 'Y')? "프로그램을 종료합니다." : "계속 진행하겠습니다.";
		System.out.println(result);
		
		sc.close();
	}
	
	public void method5() {
		
		// 입력받은 문자값이 영어 소문자인지 아닌지 판별 출력
		// 영문자 입력 : 
		// 입력한 문자는 소문자입니다. || 입력한 문자는 소문자가 아닙니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a' && ch <= 'z') ? "소문자입니다." : "소문자가 아닙니다.";
		System.out.println(ch + "는 " + result);
		
		sc.close();
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
				
		String result = (ch >= 'a') && (ch <= 'z') ? "소문자입니다." : "대문자입니다.";
		System.out.println(result);
		*/
		
	}
	
	
	public void method6() {
		
		// 사용자에게 두 개의 정수 값 입력받고
		// 첫번째 정수 : 
		// 두번째 정수 : 
		
		// 연산자 입력 (+ 또는 -) :
		
		// 그에 맞는 연산 결과 출력
		// 단, + 또는 - 이외의 다른 문자를 입력했을 경우 " 잘못 입력했습니다" 출력.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine(); //버퍼에 남아있는 엔터제거를 위한 코드
		
		System.out.print("연산자 입력 (+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘못 입력했습니다.";
		System.out.println("결과 : " + result);
		
		/* System.out.print("연산자 입력 (+ 또는 -) : ");
		char ch = sc.next().charAt(0);
		
		String result = (ch == '+') ? num1 + num2 : (ch == '-') ? num1 - num2 : "잘못 입력했습니다.";
		System.out.println(result);
		
		*/
		sc.close();
	}
	
	
	
	
}
