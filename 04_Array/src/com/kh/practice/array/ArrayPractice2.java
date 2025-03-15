package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {

	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
			
		// 정렬 => 버블 정렬 => 이걸 찾아보라고 했었는데, 이게 뭐였지??
		int temp = 0;								// 버블정렬 하는 방법
													// 아, 그때 영상으로 봤던, 춤추면서 계속 비교하고 정리하던 거였다.
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if (arr[j-1] > arr[j]) {			// temp를 통해서 정리하는 것입니다.
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public void practice13() {
		
	
	int[] arr = new int[10];
	
	for(int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random() * 10 + 1); // 10개를 넣으면 되긴함. 다만, 다른 점이 있다.
		
		// 중복된 값이 없게 해야 함.
		for(int j=0; j<1; j++) {
			// 첫번째는 비교를 할 수 없으니까 Skip되고 2번째부터 보게 된다.
			// 반복문으로 형성하게 됨.
			if(arr[i] == arr[j]) {
				i--;
				// 같은 경우에는 i를 증가시키지 않는 방법으로 하자?? 어째서? 아. 반복되니까, 어차피 삭제하고 다시 만들어야 하니까!!
			}
		}
	}
	/*
	// 정렬 => 버블 정렬 => 이걸 찾아보라고 했었는데, 이게 뭐였지??
	int temp = 0;								// 버블정렬 하는 방법
												// 아, 그때 영상으로 봤던, 춤추면서 계속 비교하고 정리하던 거였다.
	for(int i=0; i<arr.length; i++) {
		for(int j=1; j<arr.length; j++) {
			if (arr[j-1] > arr[j]) {			// temp를 통해서 정리하는 것입니다.
				temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	*/
	
	}
	
	public void practice14() {
		
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=1; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;						// 중복 없애기. 공식처럼 사용되는 방식이 생김.
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
			
			boolean flag = true;			// (flag)란 것을 만든 것임.
											// 아주 자주 사용함. 유용하니까 활용하기.
											// if(flag) 만 적어도, if(flag == true) 로 인식해서 돌아감.
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					flag = false;			// flag가 false면 겹친다는 뜻.
					
				}
			}
			// 디테일을 올리기 위한 것.
			
			/*
			if(flag == true) {
				System.out.print(arr[i]);
			}
			*/
			
			if(flag == true) {
				count++;					// if문 때 반복하니까 세기 시작.
				if(i==0) {
					System.out.print(arr[i]);
				}else
					System.out.print(", " + arr[i]);
			}
			sc.close();	
		}
		System.out.println("\n문자 개수 : " + count);
		
		
	}
	
	
	public void practice16() {
		
		// 배열의 최대 단점 : 수정이 불가능하다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		sc.nextLine();						// int와 String의 초기화, 오류 방지화
		
		String[] arr1 = new String[size];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr1[i] = sc.nextLine();
		}
		
		while(true) {						// 더 값을 입력하시겠습니까? 이 부분을 위한 무한 반복.
			System.out.print("더 할래? ");
			char yn = sc.nextLine().charAt(0);
						
			if(yn == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int num = sc.nextInt();
				
				sc.nextLine();
				
											// 깊은 복사을 하게 함.
				String[] arr2= Arrays.copyOf(arr1, arr1.length + num);
				
				for(int i=0; i<arr2.length; i++) {
					System.out.print((i+1) + "번째 문자열 : ");
					arr2[i] = sc.nextLine();
					
				}
											// 주소를 바라보게 하는 것은 가능.
											// while 문이 돌아보게 가능.
											// 얇은 복사를 하게 함.
				arr1 = arr2;
				
			}else {
				System.out.print("[");
				for(int i=0; i<arr1.length; i++) {
					
					if(i == arr1.length - 1) {		// 마지막
						System.out.print(arr1[i] + "]");
					}else {
						System.out.print(arr1[i] + " ,");
					}
					
				}
				
			}break;									// while문 빠져나오기.
		
		}								
		sc.close();	
	}
	
}
