package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	// 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	// 배열 : 하나의 공간에 여러 개의 값을 담을 수 있는 개념.
	//		"같은 자료형의 값"으로만 담을 수 있음.
	//		정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작!!)
	
	public void method1() {
		
		// * 배열을 왜 쓰는가?
		
		// 변수만 이용하면
		// int num1 = 0,1,2,3,4;
		
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		
		 * 출력할 때도 일일히 해야 한다. (반복문도 활용 불가)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		for(int i=1; i<=5; i++) {
			// System.out.println(numi);
		}
		*/
		
		// 총합계 구할 때도 => 일일히 더해야 함. (반복문 활용 불가)
		// int sum = num1 + num2 + ... + num5;
		
		/*
		 * 1. 배열 선언 (여러 개의 값을 보관할 배열을 만들겠다.)
		 * [표현법]
		 * 자료형 배열명
		 * int a; (인수)
		 * int b[]; (배열)
		 * int[] c; (배열) => 선생님의 선택. 보기 편하게.
		 * 
		 */
		
		// int[] arr; // 오로지 int 값만 담을 수 있다.
		
		/*
		 * 2. 배열 할당(이 배열에 몇개의 값들을 보관할 건지 크기를 지정하는 과정, 그 개수만큼 방이 만들어진다.
		 * 		배열명 = new 자료형[배열크기];
		 */
		
		// arr = new int[5];
		
		// ** 배열 선언과 동시에 할당 (배열 만들기와 동시에 크기까지 지정)
		int[] arr = new int[5];
		
		/*
		 * 3. 갑 대입
		 * 		배열명[인덱스] = 값;
		 */
		
		/*
		 * 반복문 가능?
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 장점 : 반복문 활용 가능
		for(int i=0; i<=4; i++) {			// 0 1 2 3 4
			arr[i] = i;
		}
		
		/* 반복문 가능?
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);		// 0 1 2 3 4
		}
		
		System.out.println(arr);			// 실제 arr이라는 박스에 "주소값" 이라는 게 담겨있음.
	
	}
	
	public void method2() {
		
		// 메모리 = stack, heap, static
		// int a = 10; => stack
		// 왼쪽은 무조건 stack에 생긴다.
		
		// int[] => stack
		// heap = 인덱스 개수만큼 생김. (int만 들어감) => arr[0], arr[1]... arr[4]
		// => 주소를 받게 됨 => int[]에게 주소가 생김. int[] 가 heap를 바라 봄.
		// 따라서 int[] 는 참조형이다.
		
		// 기본자료형은 == 비교가 된다.
		// 참조자료는 주소값을 가지고 있어서 == 비교가 안 된다. (메모리 위치부터가 다른 걸?)
		
		//배열 선언과 동시에 할당
		int[] iArr = new int[5];
				
		System.out.println(iArr[0]);
		
		double[] dArr = new double[3];
		System.out.println(dArr[1]);
		
		/*
		 * * 실제 값(리터럴)을 곧바로 담을 수 있는 변수를 일반 변수라고 얘기하고
		 * 	주소값을 담고 있는 변수는 참조변수 (레퍼런스 변수) 라고 변수
		 * 
		 *	기본자료형 (boolean, char, byte, short, long, float, double) 으로 선언된 변수
		 *	=> 실제 리터럴값을 바로 담는 변수 => 그냥 일반 변수
		 *	참조자료형 (int[], double[], char[], short[], 요런 배열자료형, String)
		 *	=> 주소값을 담는 변수 => 참조변수 (레퍼런스 변수)
		 */
		
	}
	
	
	public void method3() {
		int[] iArr = new int[3];			// 0번 인덱스 ~ 2번 인덱스
		double[] dArr = new double[4];		// 0번 인덱스 ~ 3번 인덱스
		// 배열 선언하고 크기지정(할당)까지만 한 상태
		// 그럼 각각의 인덱스에 초기화가 되어있을까?
		
		// 각각의 인덱스에 값을 안 담고 출력해보자
		// iArr 배열 출력
		for(int i=0; i<3; i++)
			System.out.println(iArr[i]);
		
		System.out.println("=====================");
		
		//dArr 배열 출력
		for(int j=0; j<4; j++)
			System.out.println(dArr[j]);
		
		// 내가 각 인덱스에 초기화를 하지 않아도 값이 담겨있음.
		// Heap이라는 공간에 절대 빈공간이 존재할 수 없음.
		// => 따라서 공간이 만들어질 때 JVM이 기본적으로 초기화(대입을)를 진행
		
	}
	
	public void method4() {
		int[] arr = new int[5];
		
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		for(int i=0; i<arr.length; i++) {		//동적변환 (숫자)
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr);						//주소값이 나옴
		// [I@626b2d4a => I 는 int(배열의 자료형), + @ + 주소값의 16진수 형태
		System.out.println(arr.hashCode());				//10진수로 바꿈
		System.out.println("배열의 길이 : " + arr.length);
		
		// 배열 크기 변경 요청 ==> 10으로?
		// 불가능하다. => 수정이 불가능. 변경이 불가능하다. 못함.
		
	}
	
	
	public void method5() {
		// 배열 쓰면서 볼 수 있는 오류들!
		/* int[] arr;					//크기 지정 까먹음
		System.out.println(arr);	//초기화가 안 되어있어서 오류가 남.
		*/
//		int[] arr = null;			//아무것도 참조하고 있지 않음.
		//주소값을 담는 변수의 기본값은 null이다.
//		System.out.println(arr);
//		System.out.println(arr[0]);
		
//		System.out.println(arr.hashCode());
//		System.out.println(arr.length);
		// null을 가지고 어떤 메소드를 호출한다거나 .을 찍어서 접근하려고 한다면
		// 항상 오류 발생 => NullPointerException
	}
	
	
	public void method6() {
		/* for문으로 대입, for문으로 출력!
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 * 
		 */
		
		int[] arr = new int[5];
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = (2*i) + 2;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/	
		int value = 2;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드 값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		/*
		 * ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시시 발생 (범위에서 벗어난 인덱스 제시)
		 * arr[6] => 5까지 밖에 없을 경우 나타나는 오류
		 */
	}
	
	
	public void method7() {
		// 배열 선언, 할당, 초기화 다 동시에 하기
		
		// 표현법1
		int[] arr1 = new int[] {1, 2, 3, 4};		
		
		// 표현법2
		int[] arr2 = {1, 2, 3, 4};
		
		System.out.println(arr1 == arr2); // false
		// 각각의 변수에 담겨있는 주소값을 비교하기 때문.
		
	}
	
	public void method8() {
		// 1. 크기 10짜리 정수 배열 생성
		int[] arr = new int[10];
		
		// 2. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스까지 순차적으로 접근하면서 값을 대입.
		// 매번 1~100 사이에 발생되는 랜덤값
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨 있는 값
		// arr[x] : xx형식으로 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
	}
	
	public void method9() {
		// 1. 사용자에게 배열의 길이를 입력 받은 후
		// 해당 그 크기만큼의 문자열 배열 생성
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		sc.nextLine();								//초기화를 위하여 적는 것!
						
		String[] arr = new String[size];
		
		// 2. 반복문 활용해서 매번 사용자에게 과일명 입력 받아
		// 그 값을 매 인덱스 자리에 대입 (0번 ~ 마지막 인덱스)
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일명 입력 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복문을 활용해서 0~마지막 인덱스까지 담긴 값 출력
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		sc.close();
	}
	
	public void method10() {
		// 1. 사용자에게 문자열 하나 입력 받은 후
		// 각각의 인덱스에 있는 문자들을 char 배열에 옮겨닮기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 2. char 배열 생성해두기
		char[] arr = new char[str.length()];
		
		// 3. 반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char 배열의 각 인덱스에 대입.
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * arr[2] = str.charAt(2);
		 * arr[3] = str.charAt(3);
		 * ... = ...;
		 * arr[마지막] = str.charAt(마지막);
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		*/
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
	
	
	// 4. 반복문 활용해서 해당 배열의 0~ 마지막 인덱스까지 담긴 값 출력
	
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		sc.close();
	/*
	int count = 0; 								//일치하는 문자가 존재할 경우 매번 1씩 증가
		for(int i=0; i<arr.length; i++) {
			
			if(ch == arr[i]) {					// 일치!
				count++;
			
			}
			
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("찾아진 문자 개수 : " + count);
	}
	*/
	}
	
	
	public void method11() {
		// 사용자에게 배열의 길이 입력 받아서 그 크기만큼의 정수 배열 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 입력: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 반복문 활용해서 0~마지막 인덱스까지 매번 1~100사이의 랜덤값 발생시켜 대입
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		// 반복문 활용해서 0~마지막 인덱스까지 출력과 동시에
		// 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합도 같이 구하기!!
		
		int sum = 0;										// 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		
			if(arr[i] % 2 ==0 ) {
				sum += arr[i];								// 변수를 어떤 것을 넣어야 하는지 고민을 많이 해봐야 한다.
			}
		}
		
		System.out.println("해당 배열의 짝수들의 총합 : " + sum);
		sc.close();
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size]; 
		
		int count = 0;
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
	
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		*/
			
		
		
		
	}
	
}	
