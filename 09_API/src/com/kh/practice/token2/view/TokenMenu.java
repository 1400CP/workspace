package com.kh.practice.token2.view;

import java.util.Scanner;


public class TokenMenu {
	
	
	// 필드  
	private Scanner sc = new Scanner(System.in);
//	private TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		/*
		 * 	1. 지정 문자열  ➔ tokenMenu() 
		2. 입력 문자열   ➔ inputMenu() 
		3. 프로그램 끝내기 ➔ “프로그램을 종료합니다” 출력 후 종료 
		잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복 
		 */
		
		
		
		}	
		public void tokenMenu() {
			String str = "J a v a P r o g r a m ";
			
//			토큰 처리 전 글자, 토큰 처리 전 개수를 출력 
//			
			
			System.out.println("토큰 처리 전 글자 : " + str);
			
			String[] arr = str.split("");
			System.out.println("토큰 처리 전 개수 : " + arr.length);
			
			
			// TokenController(tc)의 afterToken()의 반환 값을 가지고 
			// 토큰 처리 후 글자,
			String[] arr1 = str.split(" ");
			System.out.print("토큰 처리 후 글자 : ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i].trim());
			}
			
			System.out.println();
			// 토큰 처리 후 개수, 
			System.out.println("토큰 후 처리 후 개수 : " + arr1.length);
			

			// 모두 대문자로 변환한 것을 출력
//			왜 안 돼?
			
			String[] arr2 = str.toUpperCase().split(" ");
			// 일단, 대문자로 만듦.
			for(int j=0; j<arr2.length; j++) {
				System.out.print(arr[j].trim());
			}


			
			
			
			
		}
		
		public void inputMenu() {
//			문자열을 입력하세요 : 
			String str = sc.nextLine();

			// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력 
//			찾을 문자를 하나 입력하세요 :  
			
			// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨 
			// 반환 값 출력 
			
			System.out.println("토큰 처리 전 글자 : " + str);
			
			String[] arr = str.split("");
			System.out.println("토큰 처리 전 개수 : " + arr.length);
			

			String[] arr1 = str.split(" ");
			System.out.print("토큰 처리 후 글자 : ");
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i].trim());
			}
			
			System.out.println();
 
			System.out.println("토큰 후 처리 후 개수 : " + arr1.length);
			
			
			String[] arr2 = str.toUpperCase().split(" ");

			for(int j=0; j<arr2.length; j++) {
				System.out.print(arr[j].trim());
			}
			
			
		}


}
