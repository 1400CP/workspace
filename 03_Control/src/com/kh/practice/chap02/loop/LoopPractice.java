package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		sc.close();
	}
		/*
		for(int i = 1; i <= num+1; i++) {
			if(num >= 1) {
				System.out.print(i + " ");
			}
			return;
		
		}
		System.out.println("1 이상의 숫자를 입력해주세요.");
		
		*/
	
	
	

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
			
		sc.close();
		
	}
	
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=(num-1); i++) {
			System.out.print(i + " + ");
		}
		System.out.print(num + " = ");
		
		int sum = 0;
		
		for(int j=1; j<=num; j++) {
			sum += j;
		}
		System.out.print(sum);
		
		sc.close();
		
	}
	
		
		/*
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if((num1 - num2) > 0 && num1 > 0 && num2 > 0) {
			for(int i=(num1 - num2); i<=num1; i++) {
				System.out.print(i + " ");
			}
		}else if((num2 - num1) > 0 && num1 > 0 && num2 > 0) {
			for(int i=(num2 - num1); i<=num2; i++) {
				System.out.print((i + " "));
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		sc.close();
	}
	
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		sc.close();
	}
	
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
				
		if(dan > 0 && dan < 10) {
			for(int j=dan; j<10; j++) {
				System.out.println("===== " + j + "단 =====");
				for(int i=1; i<10; i++) {
					System.out.printf("%d * %d = %d\n", j, i, j*i);
				}
			}	
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
		
		sc.close();
	}
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		int 
		if(num2 == 3) {
			for(int i=1; i<=10; i += 3) {
				System.out.print(i + " ");
			}
		}
		
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		int result = start;
		for(int i=1; i<=10; i++) {
			System.out.print(result + " ");
			start += num2;
		}
		
		*/
		
		sc.close();
	}
	
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		/*
		while(true) {
			System.out.println("연산자(+, -, *, /, % : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {					// exit를 입력한 경우
				System.out.println("프로그램을 종료합니다.");
				break;
			}	
			
			System.out.print("정수1 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.println("정수2 입력 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			if(op.equals("/") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하라.");
			}else {
				switch(op) {
				case "+" : result = num1 + num2; break;
				case "-" : result = num1 - num2; break;
				case "*" : result = num1 * num2; break;
				case "/" : result = num1 / num2; break;
				case "%" : result = num1 % num2; break;
				default : 
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
					continue;
				}
				System.out.printf("%d %s %d = %d\n", num1, op, num2, result);
			}
		*/
			
			/*
			
			}else if(op.equals("+") || op.equals("-") || op.equals("*") ||op.equals("/") || op.equals("%") {							// 잘 입력한 경우
				
			}
			
		}
		*/
		
		sc.close();
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int j=1; j<=num; j++) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		sc.close();
		/*
		for(int i=1; i<=num; i++) {
			if(i <= num) {
				System.out.println("*");
			}else
				System.out.println("*");
		}
	}
		*/	
		
			
		/*
		for(int j = 1; j <= num; j++) {			// 열?? 가로??
			for(int i = 1; i < num; i++) {		// 행?? 세로??
				System.out.print("* ");
			}
			System.out.println(" *");
		}	
		*/

	
		/*
		for(int j = 1; j < 5; j++) {
			System.out.print("*");
		}
		*/
		
	
		/*
		for(int i = num; i < 5; i++) {
			if(i == num) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		*/
	
		
		/*
		for(int j = 1; j < 5; j++) {
			for(int i = 1; i < 5; i++) {
				if(i == 1 && j == 4) {
					System.out.print("*");
				}else
					System.out.print(" ");
		
			}
		
		}
		*/
		
	
		/*
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i < 5; i++) {
			System.out.print("*");
			for(int j = 1; j < 5; j++) {
				System.out.println("*");
			}
		}
		*/
		
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int j=1; j<=num; j--) {
			for(int i=0; i<j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		sc.close();
		
	}
	
}
	
