package com.kh.practice_sensei.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
	
	public void practice12() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		// 정렬 => 버블정렬
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
		System.out.println("최소값 : " + arr[0]);
		System.out.println("최대값 : " + arr[9]);
		
	}
	
	public void practice13() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
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
			for(int j=1; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
		// 오름차순 정렬
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
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true; // 안겹쳤다.
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 겹쳤다.
				}
			}
			
			if(flag) { // 안겹칠때만 출력!!
				count++;
				if (i== 0) { // 첫글자 일 때
					System.out.print(arr[i]);
				}else {
					System.out.print(", " + arr[i]);
				}
			}
			
		}
		
		System.out.println("\n문자 개수 : " + count);
		
		sc.close();
		
		
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력해주세요 : ");
		int size = sc.nextInt();
		
		sc.nextLine();
		
		String[] arr1 = new String[size];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+1 +  "번째 문자열 : ");
			arr1[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더입력할래? ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y') {
				System.out.print("더 입력하고 싶은 개수 :");
				int num = sc.nextInt();
				
				sc.nextLine();
				
				// 깊은복사
				String[] arr2 = Arrays.copyOf(arr1, arr1.length + num);
				
				for(int i=arr1.length; i<arr2.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					arr2[i] = sc.nextLine();
				}
				
				// 얕은복사
				arr1 = arr2;
				
			}else {
				System.out.print("[");
				for(int i=0; i<arr1.length; i++) {
					
					if(i == arr1.length - 1) { // 마지막
						System.out.print(arr1[i] + "]");
					}else {
						System.out.print(arr1[i] + " ,");
					}
					
				}
				break; // while문을 빠져나가는 break;
			}
		}
		
		sc.close();
	}

}











