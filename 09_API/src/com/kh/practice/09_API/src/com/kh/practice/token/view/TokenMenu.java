package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	
	//매개변수
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		
		//1. 지정 문자열 ➔ tokenMenu()
		//2. 입력 문자열 ➔ inputMenu()
		//3. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 출력 후 종료
		// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : System.out.println("프로그램을 종료합니다"); return;
			case 4 : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
			}
			
//			if(num == 1) {
//				tokenMenu();
//			}else if(num == 2) {
//				inputMenu();
//			}else if(num == 3) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//			}
			
		}
		
	}
	
	public void tokenMenu(){
		String str = "J a v a P r o g r a m ";
		System.out.print("토큰 처리 전 글자 : " + str);
//		System.out.println(str);
		
		// 토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		
		System.out.print("토큰 처리 전 갯수 : " + str.length());
//		System.out.println(str.length());
		
		String str1 = tc.afterToken(str);
		
		System.out.print("토큰 처리 후 글자 : " + str1);
//		System.out.println(str1);
		
		System.out.print("토큰 처리 후 갯수 : " + str1.length());
//		System.out.println(str1.length());
		
		System.out.print("모두 대문자로 변환 : " + str1.toUpperCase());
//		System.out.println(str1.toUpperCase());
		
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
	}
	
	public void inputMenu(){
		
		//문자열을 입력하세요 :
		System.out.print("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		//찾을 문자를 하나 입력하세요 :
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력
		System.out.print("첫 글자 대문자 : ");
		System.out.println(tc.firstCap(input));
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char one = sc.nextLine().charAt(0);
		
		System.out.print(one + " 문자가 들어간 갯수 : ");
		System.out.println(tc.findChar(input, one));
		
	}
	
	
	
	

}
