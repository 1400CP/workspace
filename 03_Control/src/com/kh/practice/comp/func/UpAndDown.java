package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public static Object java;

	public void upDown() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 100 + 1);
		
		int count = 0;
		while(true) {
			
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			
			if(num > 100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			}else if(num < 1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
			}else if(num < num1) {
				System.out.println("UP !");
			}else if(num > num1) {
				System.out.println("Down !");
			}else if(num == num1) {
				System.out.println("정답입니다 !!");
				break;
			}
			count++;
		}
		
		System.out.println(count + "회 만에 맞추셨습니다.");
		
		sc.close();
	}
}	
		
		/*
		int num1 = (int)(Math.random() * 100 + 1);
		int count = 0;		
		
		while(true) {
			
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
						
			if(num > 100) {
				System.out.println("1~100 사이의 숫자를 입력해 주세요.");
				count--;
			}else if (num < 1) {
				System.out.println("1~100 사이의 숫자를 입력해 주세요.");
				count--;
			}else if(num > num1) {
				System.out.println("DOWN !");
			}else if (num < num1) {
				System.out.println("UP !");
			}else if (num == num1) {
				System.out.println("정답입니다!");
			}
			break;
			
		}
		count++;
		System.out.println(count + "회만에 맞추셨습니다.");

	}	
		
}				
		*/
		
		
		/*
		
		*/
		
		/*
		while(true) {					// 무한반복
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("random 값 : " + random);
		
			if(random % 3 == 0) { // 3의 배수일 경우
			
			break;					// 나랑 가장 "가까운" 반복문을 빠져나옴.
		}
		*/
