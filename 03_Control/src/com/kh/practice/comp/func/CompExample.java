package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i=1; i<=num; i++) {
				if(i % 2 == 1) {
					System.out.print('박');
				}else if(i % 2 == 0) {
					System.out.print('수');
				}else
					System.out.println();
			}
			
		}else
			System.out.println("양수가 아닙니다.");
		
		sc.close();
		/*
		for(int i=1; i<=num; i++) {
			if(num % 2 == 1) {
				System.out.println('박');
				if(num % 2 == 0) {
					System.out.println('수');
				}
			}
			
		}
		*/		
		/*
		if(num % 2 == 1 && num > 0) {
			for(int i=1; i<=num; i += 2) {
				System.out.print("박");
			}
		}else if(num % 2 == 0 && num > 0) {
			for(int i=1; i<=num; i++) {
				System.out.print("수");
			}
		}else
			System.out.println("양수가 아닙니다.");
		*/
		
		/*
		for(int i=1; i<=num; i++) {
			if(num % 2 == 1 && num > 0) {
				System.out.print("박");
			}
			for(int j=1; j<=num; j++) {
				if(num % 2 == 0 && num > 0) {
					System.out.print("수");
				}
			}
			if(num < 0) {
				System.out.println("양수가 아닙니다.");
			}
		}
		*/
	}
	
	public void practice2() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num > 0) {

				for (int i = 1; i <= num; i++) {
					if (i % 2 == 1) {
						System.out.print('박');
					} else if (i % 2 == 0) {
						System.out.print('수');
					}
				}
				break;

			} else {
				System.out.println("양수가 아닙니다.");
			}
			
			sc.close();
			
		}

	}
		
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(arr[i] == ch) {
				count++;
			}	
		}
		System.out.println(str + "안에 포함된 " + ch + "개수 : " + count);
		
		/*
		String result = str + "안에 포함된 " + ch + " 개수 : ";
		System.out.print(result);
		
		for(int i = 0; i<str.length(); i++) {
			
		}
		*/
		sc.close();
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			char[] arr = new char[str.length()];
			
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			int count = 0;
			for(int i=0; i<str.length(); i++) {
				if(arr[i] == ch) {
					count++;
				}	
			}
			System.out.println(str + "안에 포함된 " + ch + "개수 : " + count);
			while(true) {
				System.out.print("더 하시겠습니까? (y/n) : ");
				String q = sc.nextLine();
	
				if(q.equals("y") && q.equals("Y")) { 
					
				}else if(q.equals("n") && q.equals("N")) {
					break;
				}else
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			} break;
				
				
		}	
		
		sc.close();
		// (System.out.println("더 하시겠습니까? ")
	}
	
	public void practice5() {
		
		// UpAndDown.java = new UpAndDown();
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
	
		int count = 0;
		
		while(true) {
			
		System.out.print("가위바위보 : ");
		String game = sc.nextLine();
		
		if(game.equals("exit")) {
			break;
		}else if (game.equals("가위") || game.equals("바위") || game.equals("보")) {
			System.out.println(game);
		}else
			System.out.println("잘못 입력하셨습니다.");
			System.out.println();
		
		int num = (int)(Math.random() * 3 + 1);
		
		if(num == 1) {
			System.out.println("가위");
		}else if(num == 2) {
			System.out.println("바위");
		}else if(num == 3) {
			System.out.println("보");
		}
		
			if(game.equals("가위")) {
				if(num == 1) {
					System.out.println("비겼습니다.");
					System.out.println();
				}else if(num == 2) {
					System.out.println("이겼습니다.");
					System.out.println();
				}else if(num == 3) {
					System.out.println("졌습니다.");
					System.out.println();
				}
			}
			if(game.equals("바위")) {
				if(num == 1) {
					System.out.println("이겼습니다");
					System.out.println();
				}else if(num == 2) {
					System.out.println("비겼습니다");
					System.out.println();
				}else if(num == 3) {
					System.out.println("졌습니다.");
					System.out.println();
				}
			}
			if(game.equals("보")) {
				if(num == 1) {
					System.out.println("졌습니다.");
					System.out.println();
				}else if(num == 2) {
					System.out.println("이겼습니다.");
					System.out.println();
				}else if(num == 3) {
					System.out.println("비겼습니다.");
					System.out.println();
				}
				
			}
			count++;
		}
		System.out.println(count + "전");	
		sc.close();
	}
	
}
