package com.kh.variable;

import java.util.Scanner;

public class C_printf {

	public void C_printTest() {
		
		Scanner sc = new Scanner(System.in);
		
		// System.out.print(출력하고자 하는 값);		// 출력만 함 (줄바꿈 X)
		// System.out.println(출력하고자 하는 값);	//
		
		// System.out.print("안녕");
		// System.out.print("잘가");
		
		// System.out.println("안녕");
		// System.out.println("잘가");
		
		// 출력문 메소드 : sysout + Ctrl + Space
		
		// System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값);
		// 출력하고자 하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈 발생 x)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열(문자도 가능)
		 * %f : 실수		 * 
		 */
		
		// System.out.println();
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println(); // 줄바꿈용
		System.out.printf("%d %d%%",iNum1, iNum2);
		System.out.println(); // 줄바꿈용
		System.out.printf("%d %d",iNum1,iNum2,30);
		System.out.println(); // 줄바꿈용

		System.out.printf("%5d\n",iNum1); // 양수 5 오른쪽 정렬
		System.out.printf("%-5d\n", iNum1); // 음수 5 왼쪽 정렬
		
		// 정렬하고자 할 때 사용.
		
		System.out.printf("%5d\n", 50);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2);
		System.out.printf("%f\t%f\n", dNum1, dNum2); //무조건 소수점 아래 6째 자리까지 보여줌.
		System.out.printf("%.2f %.2f", dNum1, dNum2); //소수점 2째 자리까지 보여줌.
		System.out.println(); // 줄바꿈용
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %s\n", ch, str, ch);
		
		sc.close();
		
	}
	
	
}
