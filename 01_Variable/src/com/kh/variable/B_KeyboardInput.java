package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput { // 클래스 시작

	// 사용자가 키보드로 입력한 값을 받아들이는 걸 할 겁니다.
	// Scanner를 사용해서.
	
	public void inputTest1() {
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner를 사용한다!
		 * 자바에서 Scanner 클래스를 이용한다.
		 * Scanner 클래스 내부의 메소드를 활용해서 받기
		 */
		
		// 스캐너 클래스 생성
		// 클래스명 별칭 = new 클래스명()
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력받은 값을 한글자씩 받아들이겠다는 의미
		// System.out : 출력시 System.in : 입력시
		
		//println은 한칸 내리는 역할. print는 그냥 출력.
		
		System.out.print("아무거나 입력해보세요 : "); //가이드 문구
		String message = sc.nextLine();
		
		System.out.println("입력받은내용 : " + message);
		
		sc.close(); // 스캐너 종료
		
	}
	
	public void inputTest2() {
		
		//~~를 입력받아서~~ => 스캐너를 만들어라
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드(next(), nextLine())
		//		1		3	2
		// String name = sc.next();
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽음.
		//			거주지와 같이 공백이 있는 데이터는 값을 못 가져옴.
		
		String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 모두 다 읽음. (엔터치기 전까지)
		
		// System.out.println("이름 : " + name);
		
		System.out.print("당신의 나이는 몇살입니까? : ");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까? : (소수점 첫째 자리까지) ");
		double height = sc.nextDouble();
		
		
		// XXX님은 XX살이며, 키는 xxx.xcm 입니다.
		
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm입니다.");
		// String name = sc.next();
		// int age = sc.nextInt();
		// double height = sc.nextDouble();
		
		
		sc.close();
		
		
		
	}
	
	// 키보드로 값을 입력 받을 때 종종 발생되는 문제
	public void inputTest3() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // 엔터 전까지 자료를 입력을 받는 것. 버퍼 자료 클리어 용도. (스캐너 사용시 빈번하게 나오는 오류)
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxx이고, 키는 xxx.xcm입니다.
		System.out.print(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm입니다.");
		
		// printf로 출력ㅇ보기! (소수점 첫째자리까지만 표기해보기.)
		System.out.println();

		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm 입니다.\n", name, age, address, height);
		
		sc.close();
	}
	
	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때 => sc.nextLine() 을 많이 받았음. sc.next() 공백전까지만
		// 정수값을 입력 받을 때 => sc.nextInt()
		// 실수값을 입력 받을 때 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별 : "); // M, F, Y, N
		// char gender = sc.nextChar(); 이와같은 메소드 없음
		char gender = sc.nextLine().charAt(0);
		// 문자열.charAt(인덱스_index) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// ** 인덱스 : 순번 같은 존재, 단 0부터 시작
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 * XXX님의 개인정보
		 * 성별 : x
		 * 나이 : xx
		 * 키 :xxx.x
		 */
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		sc.close();
	}
	
	public void charAtTest() {
		
		String str = "Hello";
		
		// 변수에 기록해 추력하는 방식
		char ch = str.charAt(4);
		System.out.print(ch);
		
		// 바로 출력
		System.out.println(str.charAt(4));
		
		// 존재하지 않는 인덱스 : 오류 발생!!!
		// System.out.println(str.charAt(12)); // StringIndexOutOfBoundsException
		
	}
	
	/*
	 * **정리**
	 * 1. 콘솔창 (모니터) 출력하기 위해 : System.out.print[ln]
	 * 2. 콘솔창 (키보드) 입력하기 위해 : Scanner 이용해서 (next(), nextLine(), nextInt(), nextDouble(), ...)
	 * 
	 * 		> 주의사항
	 * 		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야할 경우,
	 * 			sc.nextLine() 메소드를 한번 더 써서 버퍼에 남아있는 \n을 빼주는 과정이 필수!
	 * 
	 * 		2) '문자' 값을 입력 받아야 할 경우
	 * 			sc.nextLine() 메소드를 통해 우선 문자열로 입력 받고 그 뒤에 .charAt(인덱스값) 메소드를 통해서 문자 하나 추출.
	 * 
	 * 
	 * 
	 */
	
} // 클래스 끝
