package com.kh.array;

import java.util.Arrays;

// import java.iang.*;

public class B_Array {

	
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " " );
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시켜서 copy 배열 생성
		int[] copy = origin;
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " " );
		}
		System.out.println();
		
		copy[2] = 99;
		
		System.out.println("----------------------------------");
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " " );
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시켜서 copy 배열 생성
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " " );
		}
		System.out.println();
		
		// copy 만을 가지고 수정을 해도 원본까지 변경되어있음
		// origin과 copy가 같은 곳을 참조하고 있기 때문에 그렇다 (즉, 같은 주소값)
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		//얕은 복사 : 주소값을 복사
		
	}

	public void method2() {
		//얕은 복사의 문제를 해결하기 위해서 깊은 복사
		// 1. for 문을 활용한 방법.
		// 새로운 배열을 아예 생성한 후 반복문 활용해서
		// 원본 배열의 값들을 새로이 만든 배열에 대입하는 방법
		
		int[] origin = {1, 2, 3, 4, 5};					// 0x123
		
		int[] copy = new int[5];						// 0x234
		
		/*
		copy[0] = origin[0];
		copy[1] = origin[1];
		copy[2] = origin[2];
		copy[3] = origin[3];
		*/
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		
		//copy 배열 수정해보기
		copy[2] = 99;
		
		
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " " );
		}
		System.out.println();
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " " );
		}
		System.out.println();
		
		
		System.out.println("----------------------------------");
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " " );
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시켜서 copy 배열 생성
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " " );
		}
		System.out.println();
		
	}
		
	public void method3() {
		// 2. 아예 새로운 배열 생성 후 System 이라는 클래스에서의 array
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // 넉넉하게 크게 생성 / 0~9 인덱스까지 0이 다 들어있음.
		
		// System.arraycopy(원본배열명, 복사를 시작할 인덱스, 복사할 배열명, 복사본 배열의 복사될 시작 인덱스, 복사할 개수)
		
		// System.arraycopy(origin, 0, copy, 0, 5);				커스텀이 가능하다는 장점
		// System.arraycopy(origin, 0, copy, 2, 5);
		System.arraycopy(origin,1,copy,3,3);
		
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin의 주소값 : " + origin.hashCode());	// 주소값 다름
		System.out.println("copy의 주소값 : " + copy.hashCode());		// 주소값 다름
		
		
	}
	
	public void method4() {
		// 3. Arrays 클래스에서 제공하는 copyOf() 메소드 제공
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할 길이);
		
		int[] copy = Arrays.copyOf(origin, 10);
		
		/*
		 * [참고]
		 * java.lang.Math
		 * String.lang.String
		 * java.lang.System
		 * => java.lang 패키지에 있는 클래스들을 쓸 때는 import 안 해도 된다.
		 * 
		 * java.util.Scanner
		 * java.util.Arrays
		 * => java.lang.* import를 안 해도 된다.
		 */
		
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	
	public void method5() {
		// 4. clone() 메소드 이용한 복사
		// 인덱스 지정불가, 크기 지정 별도로 못함
		int[] origin = {1,2,3,4,5};
		// 복사본배열 = 원본배열.clone();
		int[] copy = origin.clone();			//쌍둥이처럼만 복사된다.
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("origin의 주소값 : " + origin.hashCode());
		System.out.println("copy의 주소값 : " + copy.hashCode());
		
		
		
	}
	
	
}
