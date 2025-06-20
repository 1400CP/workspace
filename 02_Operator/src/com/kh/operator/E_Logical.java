package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * *논리연산자(이항연산자)
	 * 두 개의 논리값을 연산해주는 연산자
	 * 
	 * 논리값 && 논리값 (and and) : 둘 다 true 여야 함.
	 * 논리값 || 논리값 (or or) : 둘 중 하나가 true면 된다.
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100);
		boolean result = (num >= 1) && (num <= 100); // num의 값이 1이상 "이고" "그리고" num 값이 100 이하인 경우
		// && 의미 : ~이고, 그리고, ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100 이하 입니까? : " + result);
		// && : 두개의 조건 모두가 true 여야 && 연산의 결과값이 최종적으로 true
		//		둘중 하나라도 false가 있다면 연산의 결과값은 false가 나온다.
		
		sc.close();
	}
	
	public void method2() {
		// 사용자가 입력한 문자 하나값이 영어 대문자인지 확인
		// 'A' ~ 'Z' : 65 ~ 90
		
		// 사용자가 입력한 값이 대문자입니까? true / false
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어를 입력해 주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 첫 번째 방법
		// boolean result = (ch >= 65) && (ch <= 90);
		
		// System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
		
		// 두 번째 방법
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
				
		sc.close();
	}
	
	public void method3() {
		
		// 사용자에게 성별을 입력 받은 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해 주세요 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		// || 의미 : ~이거나, 또는~
		
		System.out.println("사용자가 여자입니까? : " + result);
		// || : 두 개의 조건 중 하나라고 true 라면 연산의 결과값은 true
		// 		두 개의 조건 모두 false 라면 || 연산의 결과값은 false
		
		sc.close();
	}
	
	
	public void method4() {
		
		// 사용자에게 입력을 받아 게임을 종료하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하려면 y를 입력해 주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y입니까? : " + result);
		
		sc.close();
	}
	
	/*
	 * && : 두 가지의 조건이 모두 true 여야 결과값이 true (AND == ~이고, 그리고, ~이면서, 뿐만 아니라)
	 * 
	 * true && true => true
	 * true && false => false
	 * false && true => false
	 * false && false => false
	 * 
	 * ** && 연산자를 기준으로 앞의 결과가 false 일 경우, 뒤의 조건은 보지 않는다. 실행X **
	 * 
	 * || : 두 가지의 조건 중 하나라도 true 라면 결과값이 true (OR == 또는, ~이거나)
	 * 
	 * ture || true => true
	 * true || false => true
	 * false || true => true
	 * false || false => false
	 * 
	 * ** || 연산자를 기준으로 앞의 결과가 true 일 경우, 뒤 조건을 보지 않는다. 실행X **
	 */
	
	public void method5() {
		int num = 10;
		// boolean result1 = (num < 5) && (++num > 0);
		// boolean result1 = (num > 5) && (++num > 0);
		// boolean result1 = true || (++num > 0);			// 데드코드라고 떠서 잠시 체크해놓음
		
		// Dead code (절대 실행될 일 없는 코드)
		
		System.out.println("result1 : " + "result1");		// 데드코드라고 떠서 잠시 체크해놓음
		System.out.println("&& 연산 후의 num의 값 : " + num);
		
		int num2 = 10;
		// boolean result2 = (num2 < 20) || (++num2 > 0);
		// boolean result2 = (num2 > 20) || (++num2 > 0);	
		// boolean result2 = true || (++num > 0);			// 데드코드라고 떠서 잠시 체크해놓음
		
		System.out.println("result2 : " + "result2");		// 데드코드라고 떠서 잠시 체크해놓음
		System.out.println("&& 연산 후의 num의 값 : " + num2);
		
	}
	
}
