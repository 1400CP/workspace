package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice44 {
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해 주세요 : ");
		String message = sc.nextLine(); // "orange"
		
		System.out.println(message.charAt(0));
		System.out.println(message.charAt(1));
		System.out.println(message.charAt(2));
		
		sc.close();
	}

}
