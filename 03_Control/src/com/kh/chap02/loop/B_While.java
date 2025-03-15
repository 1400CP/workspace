package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * while문
	 * 
	 * [표현문]
	 * 
	 * [초기식]					=> 생략이 가능하다.
	 * while(조건식) {
	 * 		반복적으로 실행할 코드;
	 * }
	 * 조건식이 true일 경우 해당 코드 실행
	 * 
	 * 조건식 검사 ---> true일 경우 실행코드 실행
	 * 조건식 검사 ---> true일 경우 실행코드 실행
	 * 조건식 검사 ---> false일 경우 실행코드 실행 x => 반복문 빠져나감
	 */
	
	public void method1() {
		// 안녕하세요 5번 출력
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		// for문과 다른 점!
		System.out.println(i);
		
	}

	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		while(i <= 5) {
			System.out.print(i++ + " ");
		}
		
	}
	
	public void method3() {
		// 1에서부터 10사이의 홀수만을 출력
		// 1 3 5 7 9
		
		int i = 1;
		/*
		while(i < 10) {
			System.out.print(i + " ");
			i += 2;
		}
		*/
		
		while(i<10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
	}
	
	public void method4() {
		//1부터 랜덤값(1~100)까지의 합계
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
				
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
		
	}
	
	public void method5() {
		// A_For 클래스의 method10을 while문으로 다시짜기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while(i<str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
		sc.close();
		/*
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
		
		System.out.println("문자열의 길이 : " + str.length());
		
		int i = 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
	
	*/
		
		
	}	
	
	
	
}
