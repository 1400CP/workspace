package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * * continue;			: 반복문 안에 기술되는 구문
	 * 						continue; 구문 실행시 그 아래 구문을 실행하지 않고, 곧바로 현재 속해있는 반복문 위로 올라감.
	 */
	
	
	public void method1() {
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9
		
		/*
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}else {
			}
		}
		*/
			
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {			// i 값이 짝수일 경우
				continue;				// 아래에 있는 출력문 안뽑고, 다시 반복함. 따라서 if 문을 작성했으니 조건이 맞는 게 나올 때까지 반복하게 됨.
			}
			System.out.print(i + " ");
			
		}
		
	}
	
	
	public void method2() {
		// 1부터 100까지의 총 합계 (누접합)
		// 단, 6의 배수값은 빼고 덧셈 연산하겠다.
		
		// 1. 1부터 100까지의 총합계 먼저 for문 형성.
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			if(i % 6 == 0) {			// 6의 배수 => 건너뛰기 필요
				continue;				// 건너뛰기를 하고 싶을 때 쉽게 쓸 수 있음.
			}							// 아래를 수행 안 하기 때문에 6의 배수를 뺼 수 있었음.
			sum += i;
		}
		
		System.out.println("1부터 100까지의 총합계 : " + sum);
		
	}
	
	
	public void method3() {
		// 2~9단까지 출력
		// 단, 3의 배수단은 빼고 출력 => 3, 6, 9단 빼고
		
		
		
		for(int j = 2; j <= 9; j++) {
			
			if(j % 3 == 0) {
				continue;
			}
			System.out.println("=====" + j + "단 =====");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", j, i, j*i);
			}
			System.out.println();
			
		}
		
		
		/*
		int dan = 2;
		for (int i=1; i<10; i++) {
			 System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		*/

		
	}
	
	
	
	
	
	
}
