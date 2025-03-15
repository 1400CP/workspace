package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "양수다" : "양수가 아니다");
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));
		
		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();
			
		System.out.print("성별(M/F) : ");
		char ch = sc.next().charAt(0);
		
		String gender = (ch == 77) || (ch == 109) ? "여학생" : "남학생";
		
		
		// String result = ("F") || ("f") ? "여학생" : "남학생";
		// gender = (gender == 'F') || (gender == 'f') ? "여학생" : "남학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double num4 = sc.nextDouble();
		// System.out.printf("%.2f", num4);
		
		System.out.println(num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + " " + gender + "의 성적은 " + num4 + "이다.");
		
		sc.close();
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int num = sc.nextInt();
		String result = (num <= 13 ) ? "어린이" : (num > 13) && (num <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		
		System.out.println(sum);
		
		System.out.println(sum / 3);
		
		String result = (num1 >= 40) && (num2 >= 40) && (num3 >= 40) && (sum / 3 >= 60) ? "합격" : "불합격";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char ch = sc.next().charAt(7);
		int num = ch;
		String result = (num == 50) ? "여자" : (num == 52) ? "여자" : "남자";
		
		System.out.println(result);
	
		sc.close();
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = (num3 <= num1) || (num3 > num2) ? "true" : "false";
		
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2) && (num1 == num3) && (num2 == num3) ? "true" : "false";
		System.out.println(result);
		
		sc.close();
	}
	
	public void practice11() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉/연봉+a : ");
		int num1 = sc.nextInt();
		System.out.print("B사원의 연봉/연봉+a : ");
		int num2 = sc.nextInt();
		System.out.print("C사원의 연봉/연봉+a : ");
		int num3 = sc.nextInt();
		
		
		System.out.println("A사원의 연봉/연봉+a : " + num1 + "/" + (double)num1 * 1.4);
		
		String result1 = ((num1 * 1.4) >= 3000) ? "3000 이상" : "3000 미만";
		System.out.println(result1);
		
		
		
		System.out.println("B사원의 연봉/연봉+a : " + num2 + "/" + (double)num2 * 1);
		
		String result2 = ((num1 * 1) >= 3000) ? "3000 이상" : "3000 미만";
		System.out.println(result2);
		
		
		
		System.out.println("C사원의 연봉/연봉+a : " + num3 + "/" + (double)num3 * 1.15);
		
		String result3 = ((num1 * 1.15) >= 3000) ? "3000 이상" : "3000 미만";
		System.out.println(result3);
		
		sc.close();
		
	}
	
}
