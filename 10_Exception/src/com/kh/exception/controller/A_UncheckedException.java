package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/* 
	 * 
	 * * RuntimeExcetion의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외.
	 * - NullPointerException : 참조변수 Null로 초기화된 상황에서 null에 접근했을 때 발생되는 예외.
	 * - ArithmeticException : 나누기 연산 0으로 나누려할 때 발생되는 예외.
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생되는 예외. => Parent p1 = new Child1, (Child2).p1 = new Child1(); 불가능
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외.
	 * 
	 * => RuntimeException 관련된 예외는 충분히 예측 가능하나 상황이 있음.
	 * 
	 * 애초에 예외자체가 발생이 안 되게 if문으로 조건 처리 가능.
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		

		
//		int result = num1 / num2; 사용자가 두번째 정수를 0으로 입력하는 순간 예외발생 => 비정상적으로 프로그램 종료.
		
		/* 애초에 예외 자체가 발생이 안 되게끔 if 문으로 틀어 막은 것!! => 예외처리가 아니다.
		 * 
		int result = 0; // 초기화
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		System.out.println("안녕하세요 반갑습니다. 계산결과를 알려드리도록 하겠습니다.");
		System.out.println("result : " + result);
		*/
		
		// 예외처리 : 예외가 "발생했을 때" 실행할 내용을 미리 작성해놓는 방법
		
		/*
		 * * try catch 방법
		 * 
		 * [표현법] 
		 * try {
		 * 		예외가 발생될 수 있는 구문;
		 * } catch(발생될 예외클래스 매개변수) {
		 * 		예외가 발생했을 경우 실행할 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {			// ArithmeticException, 예외를 낚아챔.
			System.out.println("0으로 나눌 수 없습니다.");	// 바로 이것을 실행.
			e.printStackTrace();						// 강제로 오류난 이력을 보고자 할 때 실행하는 메소드.
		}
		
		System.out.println("프로그램을 종료합니다.");			// 실행이 잘 됐으면 이게 나온다.
				
		
	
		
		
	}
	
	public void method2() {
		// NegativeArraySizeException
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스를 가지고 접근시 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		// int[] arr = new int[size];
		
		// System.out.println("100번 인덱스 값 : " + arr[100]);
		
		/* if문으로 예외자체가 발생이 안 되도록 먼저 막는 방법.
		if(size >= 101) {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}
		*/
		
		try {
			// 예외가 발생할 수 있는 코드를 입력
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) { 			// 캐치를 또 추가해도 된다. 다중캐치
			System.out.println("부적절한 인덱스로 접근했습니다.");	// 부모가 전부 RuntimeException이다!
		}
		System.out.println("프로그램을 종료합니다");
		
		
	}
	
	
	public void method3() {
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}catch(InputMismatchException e) {	// 부모가 다릅니다. NoSuchElementException
			System.out.println("정수로만 입력해야 합니다.");
		}
		System.out.println("프로그램을 종료합니다");
		*/
		
		// 다중 catch 블럭 작성
		// 각각의 예외 발생시 실행할 내용이 별개일 경우 세분화해서 작성 가능.
		// 다중 catch로 작성할 수도 있음.
		// 중복이 되지 않게 작성하시오. (무조건 자식이 부모보다 위에 작성하시오)
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력했습니다.");
		}catch(RuntimeException e) { // 다형성을 적용해서 부모타입 예외클래스 작성 가능
									// 모든 자식 예외 발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생되긴 했음... 배열의 크기가 잘못됐던가, 부적절한 인덱스가 제시됐던가");
//		}catch(NegativeArraySizeException e) {
			System.out.println("배열로는 음수 지정 안 돼~");
		}
		
		// 부모예외클래스와 자식예외클래스를 가지고 catch 블럭을 기술하고자 할때는
		// 자식예외클래스 catch블럭이 위에 있어야만 함! (아니면 도달 불가!)
		
		System.out.println("프로그램을 종료합니다.");
		
		/*
		 * RuntimeException 관련 애들은 UncheckedException (예외처리 구문은 필수가 아님)
		 * if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링을 하는 것임. (예외처리구문이 아니다.)
		 * try~catch문 : 예외가 "발생했을 경우" 처리해주는 구문을 작성해두는 것 (예외처리구문)
		 * 
		 * 예측이 가능한 상황은 if문으로 조건검사 해결하는 게 권장사항임.
		 * 부득이하게 조건문으로 핸들링이 안되는 구문은 예외처리 구문으로 작성해둘 것!
		 */
		
	}
	
}
