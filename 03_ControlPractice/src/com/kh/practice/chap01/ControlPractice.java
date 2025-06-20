package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			System.out.println("입력 메뉴입니다."); break;
		case 2 :
			System.out.println("수정 메뉴입니다."); break;
		case 3 :
			System.out.println("조회 메뉴입니다."); break;
		case 4 :
			System.out.println("삭제 메뉴입니다."); break;
		case 7 :
			System.out.println("종료 메뉴입니다."); break;
		default :
			System.out.println("프로그램이 종료됩니다.");
		}
		
		sc.close();
	}

	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		}else if(num % 2 != 0) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
		sc.close();
	}
		
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = (kor + eng + math);
		double avg = (sum / 3);
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
			
		sc.close();
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 3 : 
		case 4 : 
		case 5 :
			System.out.println(month + "월은 봄입니다."); break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month + "월은 여름입니다."); break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "월은 가을입니다."); break;
		case 12 : 
		case 1 : 
		case 2 : 
			System.out.println(month + "월은 겨울입니다."); break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		
		}
		
		sc.close();
	}
	
	public void practice5() {
		/*
		String id = "myId";
		String pw = "myPassword12";
		String login = "myIdmyPassword12";
		*/
		String id = "myId";
		String pw = "myPassword12";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id1 = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw1 = sc.nextLine();
		
		
				
		if(id1.equals(id) && pw1.equals(pw)) {
			System.out.println("로그인 성공");
		}else if(id1.equals(id)) {
			System.out.println("비밀번호가 틀렸습니다");
		}else if(pw1.equals(pw)) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("다시 시도해 주세요.");
		}
		
		sc.close();
		
		/*
		switch(id1) {
		 
		case 1 :
			System.out.println("아이디 : " + id1);
		
		
		System.out.print("비밀번호 : ");
		String login = sc.nextLine();
		
		}
		
		*/
		
		/*
		System.out.println("아이디 : ");
		
		System.out.println("비밀번호 : ");
		
		switch(id pw) {
		case 1 :
		}
		
		"로그인 성공"
		"아이디가 틀렸습니다."
		"비밀번호가 틀렸습니다."
		*/
	
	}
	
	public void practice6() {
		/*
		관리자 회원관리, 게시글관리, 게시글작성, 댓글작성, 게시글조회
		회원 					게시글작성, 댓글작성   게시글조회
		비회원								게시글조회
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		String mem = sc.nextLine();
		
		switch(mem) {
		case "관리자" :
			System.out.print("회원관리, 게시글관리 ");
		case "회원" :
			System.out.print("게시글작성, 댓글작성 ");
		case "비회원" :
			System.out.print("게시글조회");

		}
		
		sc.close();
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (height * height);
		System.out.println("BMI 지수 : " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}else if(BMI < 23) {
			System.out.println("정상체중");
		}else if(BMI < 25) {
			System.out.println("과체중");
		}else if(BMI < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		
		sc.close();
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char cal = sc.nextLine().charAt(0);
		
		if(cal == '+') {
			System.out.println(num1 + num2);
		}else if(cal == '-') {
			System.out.println(num1 - num2);
		}else if(cal == '*') {
			System.out.println(num1 * num2);
		}else if(cal == '/') {
			System.out.println((double)num1 / (double)num2);
		}else if(cal == '%') {
			System.out.println((double)num1 % (double)num2);
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
		sc.close();
		
	}
	
	public void practice9() {
		
		// 중간고사, 기말고사, 과제점수, 출석회수
		// 중간고사20%, 기말고사30%, 과제30%, 출석20
		
		// Pass 또는 Fail 출력
		// 70점이상 Pass
		// 6회 이상 Fail
		
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int test1 = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int test2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int work = sc.nextInt();
		
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
		
		double sum = (test1 * 0.2) + (test2 * 0.3) + (work * 0.3) + (att);
		
		System.out.println("====================결과====================");
		if(sum >= 70 && att > 14) {
			System.out.println("중간 고사 점수(20) : " + (test1 * 0.2));
			System.out.println("기말 고사 점수(30) : " + (test2 * 0.3));
			System.out.println("과제 점수(30) : " + (work * 0.3));
			System.out.println("출석 회수(20) : " + (att));
			System.out.println("총점 : " + (sum));
			System.out.println("PASS");
		}else if(sum < 70 && att > 14) {
			System.out.println("중간 고사 점수(20) : " + (test1 * 0.2));
			System.out.println("기말 고사 점수(30) : " + (test2 * 0.3));
			System.out.println("과제 점수(30) : " + (work * 0.3));
			System.out.println("출석 회수(20) : " + (att));
			System.out.println("총점 : " + (sum));
			System.out.println("Fail [점수 미달]");
		}else {
			System.out.println("Fail [출석회수 부족 " + "(" + att + " / 20)]");
		}
		
		sc.close();
		
	}
	
	public void practice10() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num1 = sc.nextInt();
		System.out.println("(실습문제" + num1 + " 실행)");
		
		
		switch(num1) {
		case 1 :
			practice1(); break;
		
		case 2 :
			practice2(); break;
		
		case 3 :
			practice3(); break;
		
		case 4 :
			practice4(); break;
		
		case 5 :
			practice5(); break;
		
		case 6 :
			practice6(); break;
		
		case 7 :
			practice7(); break;
		
		case 8 :
			practice8(); break;
		
		case 9 :
			practice9(); break;
		}

		sc.close();
		
		/*
		switch(num1) {
		case 1 :
			System.out.println("1. 메뉴 출력"); break;
		case 2 : 
			System.out.println("2. 짝수/홀수"); break;
		case 3 :
			System.out.println("3. 합격/불합격"); break;
		case 4 :
			System.out.println("4. 계절"); break;
		case 5 :
			System.out.println("5. 로그인"); break;
		case 6 : 
			System.out.println("6. 권한 확인"); break;
		case 7 :
			System.out.println("7. BMI"); break;
		case 8 :
			System.out.println("8. 계산기"); break;
		case 9 :
			System.out.println("9. P/F"); break;
		default :
			System.out.println("선택 : " + num1 + " 실습문제" + num1 + " 실행");
		}
		*/
		
	}
	
}
