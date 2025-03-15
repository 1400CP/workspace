package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	
	/*
	 * *switch문도 if문과 동일하게 조건문입니다.
	 * 
	 * 다만 if문과의 차이점이라면?
	 * > if문은 조건식을 자유롭게 기술할 수 있다.
	 * > switch문은 동등 비교 밖에 수행할 수 없다.
	 * 
	 * > 실행할 구문만 하고 빠져나ㅁ오지 못함. 그래서 break; 를 반드시 작성해서 빠져나오도록 해야 함.
	 * 
	 * [표현법]
	 * switch(동등 비교할 대상){
	 * case 값1 : 실행코드1;
	 * case 값2 : 실행코드2;
	 * ...
	 * default : 위의 값들과 모두 일치하지 않을 경우 실행할 코드; => if문의 else와 같음
	 * => 안 써도 됨.
	 * }
	 * 
	 */
	
	
	public void method1() {
		
		/*
		 * 정수를 입력받아 "정수" => 동등 비교할 대상!
		 * 1일 경우 "빨간색입니다." => case 1 : 빨간색입니다.
		 * 2일 경우 "파란색입니다." => case 2 : 파란색입니다.
		 * 3일 경우 "초록색입니다." => case 3 : 초록색입니다.
		 * 
		 * 잘못 입력했을 경우 "잘못 입력하였습니다" => default
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		
		/*
		if(num == 1) {
		 
			System.out.println("빨간색입니다.");
		}else if(num == 2) {
			System.out.println("파란색입니다");
		}else if(num == 3) {
			System.out.println("초록색입니다");
		}else {
			System.out.println("잘못 입력하였습니다");
		}
		*/
		
		switch(num) { // 동등 비교만 되니까 잊지 말도록
		case 1 :
			System.out.println("빨간색입니다.");
			break;
		case 2 :
			System.out.println("파란색입니다.");
			break;
		case 3 :
			System.out.println("초록색입니다.");
			break;
		default :
			System.out.println("잘못 입력하였습니다.");
		}
		
		sc.close();
		
	}	
	public void method2() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("구매하고자 하는 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		int price = 0;
			
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "복숭아" :
			price = 3000;
			break;
		default :
			System.out.println("해당 과일은 품절입니다.");
			// return;
			// 쓸데없는 것을 출력하지 않도록 “초기화”
		}
		// xx의 가격은 xxx원 입니다.
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		sc.close();
		
	}
		
	
	public void method3() {
		// 등급별 권한
		// 등급(정수) : 
		
		// 1. 관리 권한, 글쓰기 권한, 읽기 권한
		// 2. 글쓰기 권한, 읽기 권한
		// 3. 읽기 권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 1 :
			System.out.println("관리 권한");
		case 2 :
			System.out.println("글쓰기 권한");
		case 3 :
			System.out.println("읽기 권한");
		}
		
		sc.close();
		
		/*
		int grade = sc.nextInt();
				
		switch(grade) {
		case 1 :
			System.out.println("1. 관리 권한, 글쓰기 권한, 읽기 권한");
			break;
		case 2 :
			System.out.println("2. 글쓰기 권한, 읽기 권한");
			break;
		case 3 :
			System.out.println("3. 읽기 권한");
			break;
		}
		*/
		
	}
	
	public void method4() {
		//월을 입력 받아 해당 월의 마지막 날짜 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월까지 중 하나를 입력(정수로) : ");
		int month = sc.nextInt();
		
		// 1, 3, 5, 6, 7, 8, 10, 12	=> 31일까지 있는 달
		// 4, 6, 9, 11				=> 30일까지 있는 달
		// 2						=> 28, 29일까지 있는 달
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("입력하신 월은 31일까지 입니다."); break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("입력하신 월은 30일까지 입니다."); break;
		case 2 : System.out.println("입력하신 월은 28일 또는 29일까지 입니다."); break;
		default : System.out.println("반드시 1~12월까지 입력해야 합니다.");
		}
		
		sc.close();
		
	}

}
