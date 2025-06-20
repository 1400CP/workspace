package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * 반복문
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행 코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문 (do-while)
	 * 
	 * *for문
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식) {					//반복 횟수를 지정
	 * 		반복적으로 실행시키고자 하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행.
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴.
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성함.)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감 연산자(++, --)를 사용함.)
	 * 
	 * *for문을 만나는 순간
	 * 초기식 --> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * //일반적으로 int i = 0; 이런식으로 쓴다. i < 5, int i = 1;
	 * 		--> 조건식 검사 --> true일 경우 실행구문 실행 --> 증감식
	 * =====================이 내용이 계속 반복 =======================
	 * 		--> 조건식 검사 --> false일 경우 실행구문 실행하지 않고 --> 반복문을 빠져 나옴.
	 * 
	 */
	
	
	public void method1() {
		// "안녕하세요"를 5번 출력
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		// 증감 : for문안에 실행코드를 돌리고(처리) 증감
		for(int i = 1; i <= 5; i++) {	// i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행
			System.out.println("안녕하세요");
		}
		
		for(int i = 0; i <= 4; i++) {	// i값이 0, 1, 2, 3, 4 매번 1씩 증가하는 동안 반복 수행
			System.out.println("반갑습니다.");
		}
		
		for(int i = 11; i <= 15; i++) {	// i값이 11에서부터 15까지 매번 1씩 증가하는 동안 반복 수행(11, 12, 13, 14, 15 => 총 5회)
			System.out.println("저리가세요");
		}
		
		for(int i = 1; i <= 9; i += 2) {	// i값이 1에서 9까지 매번 2씩 증가하는 동안 반복 수행(1, 3, 5, 7, 9 => 총 5회)
			System.out.println("Hello");
		}
	}
	
	public void method2() {
		//1부터 5까지 출력
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		*/
		
		// 1 2 3 4 5 (사이 사이 공백을 넣어서 for문을 성공해보기)
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		
	}

	public void method3() {
		// 5 4 3 2 1
		
		for(int i = 5; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		
	}
	
	public void method4() {
		//1부터 10까지의 홀수만을 출력
		//1 3 5 7 9
		/*
		for(int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		
		for(int i = 1; i <= 10; i += 2) {	//반복 횟수 결정!
			System.out.print(i + " ");
		}
		*/
		for(int i = 1; i < 11; i++) {
			
			if (i % 2 == 1) {			// 홀수
				System.out.print(i + " ");
			}
		
		}
		
	}
	
	public void method5() {
		// 1 2 3 4 ... 8 9 10 for문 고정
		for(int i = 0; i <= 9; i++) {
			System.out.print((i + 1) + " ");
		}
		
		
	}
	
	
	public void method6() {
		// 1에서부터 10까지의 총 합계
		
		// 방법1. int sum = 1 + 2 + 3 + ... + 8 + 9 + 10;
		
		// 방법2.
		/*
		 * int sum = 0
		 * sum += 1; => sum + 1; 0 + 1
		 * sum += 2; => sum + 2; 0 + 1 + 2
		 * sum += 3; => sum + 3; 0 + 1 + 2 + 3
		 * ...
		 * sum += 9; => sum + 9; 0 + 1 + 2 + 3 + ... + 9
		 * sum += 10;
		 * 
		 * 규칙을 찾아보자!
		 * sum 변수에 누적해서 합산하는 과정이 반복적으로 진행됨.
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는 것을 파악할 수 있음.
		 * 
		 */
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합계 : " + sum);
		
	}
	
	public void method7() {
		// 사용자에게 값을 입력받아 1부터 입력받은 수까지의 합계 출력
		/*
		 * int sum = 0;
		 * 
		 * sum += 1; // 0 + 1
		 * sum += 2; // 0 + 1 + 2
		 * ...
		 * sum += 사용자가 입력한 숫자
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 정수 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			// 누적합 계산
			int sum = 0;
			for(int i = 1; i <= num; i++) {
				sum += i; //누적합 공식
			}
			
			System.out.println("1부터 " + num + "까지의 합계 " + sum);
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}
	
	public void method8() {
		// 1에서부터 어떤 랜덤값(1~10 사이의 랜덤값)까지의 총 합계
		
		// 자바에서 제공하는 클래스(Math)
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서
		 * 매번 다른 랜덤값을 얻어낼 수 있음!!
		 * Math.random(); 이런식으로 호출 => 0.0 ~ 0.999999 사이의 랜덤값 발생.
		 * 
		 */
		
		// int random = Math.random();	//double 형이라서 안 됨.
		//				0.0 ~ 0.999999
		// int random = Math.random() * 10;
		//				0.0 ~ 9.99999
		// int random = Math.random() * 10 + 1;
		//				1.0 ~ 10.99999
		int random = (int)(Math.random() * 10 + 1);
		//				1 <= ? <11  =>  1 ~ 10
		System.out.println("1 ~ 10 사이의 랜덤값 : " + random);
		
		int sum = 0;
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
			
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
		
	}
	
	public void method9() {
		String str = "Hello";
				
		// 각 인덱스별로 문자를 뽑아서 출력
		
		/*
		 * H	=> str.charAt(0); 출력
		 * e	=> str.charAt(1); 출력
		 * ㅣ	=> str.charAt(2); 출력
		 * ㅣ	=> str.charAt(3); 출력
		 * o	=> str.charAt(4); 출력
		 * 
		 * 0번 인덱스부터 4번 인덱스까지 (마지막인덱스) 까지 매번 1씩 증가하면서 반복 수행
		 */
		
		for(int i = 0; i <= 4; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	
	public void method10() {
		//사용자에게 문자열 입력받아서 인덱스별로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		//각 인덱스별로 문자를 뽑아서 출력
		
		//apple의 길이 : 5글자
		//01234
		
		//strawberry : 10글자
		//0123456789
		
		//kiwi : 4글자
		//0123
		
		//마지막 인덱스는 항상 문자열 길이의 -1 이구나.
		
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		sc.close();
	}
	
	public void method11() {
		// 구구단 출력
		// 2단 출력하기
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 */
		/*
		for(int i = 1; i < 10; i++) {
			System.out.println("2 x " + i +  " = " + 2 * i);
		}
		*/
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", 2 , i, 2*i);
		}
		
	}
	
	public void method12() {
		//사용자에게 단을 입력을 받아 구구단을 출력
		// int dan;
		// 2~9 사이의 정수를 입력 => 가이드 문구
		// 다른 숫자를 입력했을 경우 : 2~9 사이의 숫자를 입력해야 됩니다. 잘못 입력하셨습니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2~9 사이의 정수를 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			
			for(int i=1; i<10; i++) {
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}
		
		/*
		for(int i = 2; i < 10; i++) {
			if(dan > 10) {
				System.out.println("2~9 사이의 숫자를 입력해야 됩니다. 잘못 입력하셨습니다.");
			}else if(dan >= 2) {
				System.out.println();
			}
			System.out.println(dan);
		 */
			
		}
		
		sc.close();
		
	}
	
	public void method13() {
		// 2부터 9 사이의 랜덤값 발생시켜서 랜덤단 출력하기
		int dan = (int)(Math.random() * 8 + 2);
							// 0.0 <=	< 1.0
							// 0.0 <=	< 8.0
							// 2.0 <=	< 10.0
							// 2   <=	< 10
		
		System.out.println("=====" + dan + "단 =====");
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		
	}
	// 중첩 for문
	public void method14() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int j = 1; j < 4; j++) {	// j=1, j=2, j=3
			for(int i = 1; i < 6; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		
		}
		
		
	}
	
	public void method15() {
		
		// ****
		// ****
		// ****
		// ****
		
		for(int j = 1; j < 5; j++) {		//바깥쪽 for문은 행!! => 행은 1~4행
			for(int i = 1; i < 5; i++) {	//안쪽 for문은 열!!
				System.out.print("*");
			}
			System.out.println();			//사이클을 돌려서 결과값이 위와 같이 나오는 것.
		}
		
		
	}
	
	public void method16() {
		//1***
		//*2**
		//**3*
		//***4
		
		for(int j = 1; j < 5; j++) {
			for(int i = 1; i < 5; i++) {
				if(i == j) {
					System.out.print(i);
				}else
					System.out.print("*");
			}
			System.out.println();
		}
		
			
	}
	
	public void method17() {
		//2단부터 9단까지 출력
		
		// 1. 2단 출력
		// 이것이 잘 된다 => 8번 하면 됨.
		
		// ==== 2단 ====
		
		for(int i=2; i<10; i++) {						// i : 단수
			System.out.println("===== "+ i +" 단 =====");
			for(int j=1; j<10;j++) {					// j : 실제 곱하는 수
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		
		
		
		/*
		for(int i = 1; i < 10; i++) {
			if (i = 2)
		}
		System.out.printf("%d x %d = %d\n", i+1, i, (i+1)*i);
		*/
		
	}
	
	public void method18() {
		for(;;) {						// 조건식 자리 생략시 기본적으로 true => 무한반복문
			System.out.println("안녕");
		}
		
		
	}
	
	
	
}
