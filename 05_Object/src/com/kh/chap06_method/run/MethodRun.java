package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {
	
	public static void main (String[] args) {
		
		// -------------------NonStaticMethod-----------------------
		NonStaticMethod n = new NonStaticMethod();
		
		// n.method1();
		
		// 2. 매개변수 없고 반환값은 있는 메소드 호출
		// String str = n.method2();
		// System.out.println(str);
		
		// 3. 매개변수 있고 반환값은 없는 메소드 호출
		// n.method3(); => 매개변수 없으면 못 부른다.
		// n.method3(10); => 매개변수 개수 맞지 않으면 오류.
		
		// int sult = n.method3(10, 20); =>반환값이 없어서 오류.
		// n.method3(10, 5);
		
		
		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
		// n.method4(null, 0);
		// char ch = n.method4("lemon", 1);
		// System.out.println(ch);
		
		// 사용자에게 매개변수를 입력 받아서 해당 메소드 호출.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();
		
		// 여기서 유효성 검사
		// index가 0 이상이고 문자열 길이보다 작을 때만 method4 수행
		
		if(index >= 0 && index<str.length()) {
			System.out.println("결과 : " + n.method4(str, index));
		}else {
			System.out.println("인덱스 값이 부적절하다.");
		}
		
		sc.close();
		
		// -------------------StaticMethod-----------------------
		// Math.random();
		StaticMethod.method1();
		StaticMethod.method2();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("차은우");
		
		StaticMethod.method4(null, null);
		System.out.println();
		
		// -------------------OverloadingTest-----------------------
		
		OverloadingTest a = new OverloadingTest();
		
		a.test();
		a.test(10);							// 가능
		a.test(10,"ㅋㅋㅋㅋ");					// 가능
		a.test("ㅎㅎㅎ", 20);					// 가능
		a.test(10, 20);						// 가능
		// a.test("뭐야");						// 불가능
		
		//오버로딩의 대표적인 예시
		System.out.print(false);
		System.out.print(0);
		System.out.print(1);
		
	}

}
