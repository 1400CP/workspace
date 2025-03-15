package com.kh.practice_sensei.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		int value = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
	}
	
	public void practice4() {
		String[] fruits = {"사과","귤","복숭아","수박","참외"};
		System.out.println(fruits[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 배열생성
		char[] chArr = new char[str.length()];
		
		// 값 대입
		for(int i =0; i<chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		
		// 문자 입력
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 인덱스 찾기 + count 증가
		int count = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		
		sc.close();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] day = {"월","화","수","목","금","토","일"};
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(day[num] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		
		System.out.println("총 합 : " + sum);
		sc.close();
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				
				/*
				 * 5입력시 : 1 2 3 2 1			=> 2번 인덱스까지는 증가 그 이후 감소
				 * 7입력시 : 1 2 3 4 3 2 1		=> 3번 인덱스까지는 증가 그 이후 감소
				 * 9입력시 : 1 2 3 4 5 4 3 2 1	=> 4번 인덱스까지는 증가 그 이후 감소
				 */
				
				for(int i=0; i<arr.length; i++) {
					if(i <= num / 2) {
						arr[i] = i + 1;
					}else {
						arr[i] = arr[i-1] - 1;
					}
				}
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		
		sc.close();
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] chickens = {"허니콤보","뿌링클","양념"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		int find = 0;
		for(int i=0; i<chickens.length; i++) {
			if(chickens[i].equals(menu)) {
				find++;
			}
		}
		
		if(find > 0) {
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴 입니다.");
		}
		
		sc.close();
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String rrn = sc.nextLine();
		
		char[] arr = new char[rrn.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rrn.charAt(i);
		}
		
		char[] copy = arr.clone();
		
		
		for(int i=0; i<copy.length; i++) {
			if(i > 7) {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
		
		sc.close();
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
	}
	
	public void practice13() {
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *10 +1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		int temp = 0;
		for(int i=0; i<lotto.length; i++) {
			for(int j=1; j<lotto.length; j++) {
				if(lotto[j-1] > lotto[j]) {
					temp = lotto[j-1];
					lotto[j-1] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		int count = 0;

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true;
		
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
					flag = false;
			}
			
			if (flag) {
				if (i == 0)
					System.out.print(arr[i]);
				else
					System.out.print(", " + arr[i]);
	                
				count++;
			}
		}

		System.out.println("\n문자 개수 : " + count);
		
		sc.close();
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr1 = new String[size];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			arr1[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();
				
				sc.nextLine();
				
				String[] arr2 = Arrays.copyOf(arr1, arr1.length + num);
				
				for(int i=arr1.length; i<arr2.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					arr2[i] = sc.nextLine();
				}
				
				arr1 = arr2;
				
			}else {
				System.out.print("[");
				for(int i=0; i<arr1.length; i++) {
					
					if(i == arr1.length - 1) {
						System.out.print(arr1[i] +  "]");
					}else {
						System.out.print(arr1[i] +  ",");
					}
					
				}
				break;
			}
		}
		sc.close();
		
		
	}
	
	

}
