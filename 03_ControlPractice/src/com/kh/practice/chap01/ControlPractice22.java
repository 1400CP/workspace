package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice22 {

		
		public void practice5() {
			
			//스캐너 생성 (주석을 달면 정말 편해집니다.)
			Scanner sc = new Scanner(System.in);
			
			//아이디, 비밀번호 정하기
			String id = "myId";				//무조건 소문자로 해야 함.
			String pwd = "myPassword12";	//String 은 무조건 소문자로 해야 함.
			
			
			System.out.print("아이디 : ");	//가이드 문구 띄워주기.
			// String inputId = sc.nextLine();
			String userId = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String userPwd = sc.nextLine();
			
			String result = "";				//초기화 한번 하고.
			
			if(id.equals(userId)) {
				if(pwd.equals(userPwd)) {	//비밀번호도 같을 경우
					result = "로그인 성공";
				}else {						//아이디는 맞았지만 비번이 틀릴 경우
					result = "비밀번호가 틀렸습니다.";
				}
			}else {
				result = "아이디가 틀렸습니다.";	//일단 한번 돌려봐.
			}								//분기처리 성공. (가운데 2중 if 쓰기 전.)
			
			System.out.println(result);
			sc.close();
		}
		
		
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
			
			// 1. 키
			System.out.print("키(m)를 입력해 주세요 : ");
			double height = sc.nextDouble();
			
			// 2. 몸무게
			System.out.print("몸무게(kg)를 입력해 주세요 : ");
			double weight = sc.nextDouble();
			
			
			// 3. BMI
			double bmi = weight / (height * height);
			System.out.println("BMI 지수 : " + bmi);
			
			String result = "";
			
			if(bmi < 18.5) {						//switch문 불가. (동등비교가 아니라서)
				result = "저체중";
			}else if(bmi < 23) {
				result = "정상체중";
			}else if(bmi < 25) {
				result = "과체중";
			}else if(bmi < 30) {
				result = "비만";
			}else {
				result = "고도비만";
			}
			
			System.out.println(result);
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
			char op = sc.nextLine().charAt(0);
			
			int result = 0;
			
			if(num1 > 0 && num2 > 0) {				// 둘 다 양수
				switch(op) {
				case '+' : result = num1 + num2; break;
				case '-' : result = num1 - num2; break;
				case '*' : result = num1 * num2; break;
				case '/' : result = num1 / num2; break;
				case '%' : result = num1 % num2; break;
				default : System.out.println("잘못 입력했다. 프로그램 종료함");
//				return;
				}
			}else {									// 양수가 아닌 게 있음
				System.out.println("잘못 입력했다. 프로그램 종료함");
			}
			
			System.out.printf("%d %c %d = %d", num1, op, num2, result);
			sc.close();
		}
		
		public void practice9() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("중간 고사 점수 : ");
			double midScore = sc.nextDouble();			// int => double로 체인지.
			
			System.out.print("기말 고사 점수 : ");
			double finScore = sc.nextDouble();
			
			System.out.print("과제 점수 : ");
			double hwScore = sc.nextDouble();
			
			System.out.print("출석 회수 : ");
			double atScore = sc.nextDouble();
			
			System.out.println("====================결과====================");
			
			if(atScore < 15) {					//출석에서 탈락
				System.out.println("Fail [출석 회수 부족 ( " + atScore + "/20)]");
			}
//			return;
			sc.close();
			/*
			 * 중간고사 20 : 16.0
			 * 기말고사 30 : 
			 * 과제 30 : 
			 * 출석 20 : 15.0
			 * 총점 : 73.0
			 */
			
			
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
			case 5 :
				practice5(); break;
			
			case 7 :
				practice7(); break;
			
			case 8 :
				practice8(); break;
			
			case 9 :
				practice9(); break;
			}

			sc.close();
		}
		
}
