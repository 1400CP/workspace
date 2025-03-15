package com.kh.variable;

import java.util.Scanner;

public class D_Cast {

	/*
	 * *형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * *컴퓨터에서의 값 처리 규칙
	 * 1. 대입연산자를 기준으로 왼쪽과 오른쪽 같은 자료형이어야 한다!
	 * 같은 자료형에 해당하는 값만 대입이 가능하다.
	 * => 다른 자료형의 값을 대입하고자 한다면 형변환이 필수이다!!
	 * 
	 * 자료형 변수명 = (자료형)값;
	 * 
	 * 2. 같은 자료형끼리만 연산이 가능.
	 * 
	 * 값 + 값 => 계산 결과도 같은 자료형으로 나옴!!
	 * 
	 * *형변환 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 이루어져서 우리가 형변환을 시킬 필요 없음.
	 * 2. 강제 형변환 => 우리가 직접 형변환을 해야 함.
	 * 
	 * [표현법] (바꿀 자료형) 값
	 * 
	 * *주의사항
	 * boolean은 형변환 불가
	 * 
	 */

	Scanner sc = new Scanner(System.in);
	
	public void autoCasting() {
		
		/*
		 * 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형간의 연산 시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 연산함. 
		 */
		
		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1;
		
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		double result = /*(double)*/i2 + d2; //12.0 + 3.3 => 15.3
		System.out.println("result : " + result);
		
		// 2. int(4byte) => long(8byte)
		int i3 =1000;
		long l3 = /*(long)*/i3;
		System.out.println("l3 : " + l3);
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = f4;
		System.out.println("d4 : " + d4);
		
		// ====특이케이스====
		// 4. long(8byte) => float(4byte)
		// float이 실수형이기 때문에 long보다 표현 가능한 수의 범위가 더 커서 자동형변환 가능하다.
		
		long l5 = 100_000L;
		float f5 = l5;
		System.out.println("f5 : " + f5);
		
		// 5. 쌍방향
		// char(2byte) <=> int(4byte)
		int num = /*(int)*/'A';
		System.out.println("num : " + num);
		
		char ch = 98;
		System.out.println("ch : " + ch);
		
		// 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환이 가능하다.
		// char는 음수값 저장 불가 => 값의 범위가 0~65535
		
		// 6. byte 또는 short 간의 연산
//		byte b1 = 1;
//		byte b2 = 10;
		
		// byte b3 = b1 + b2;
		// byte나 short는 연산 할 때 무조건 int형으로 처리함.
		// 연산결과가 범위가 더 큰 int 형이다 => byte에 대입 불가.
		
	}
	
	public void forceCasting() {
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것.
		
		// double(8byte) => float(4byte)
//		double d1 = 4.0;
//		float f1 = (float)d1;
		// 강제형변환을 안 하면 오류발생. 명시적으로 형변환을 해야 함.
		
		// double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		// int sum = iNum + dNum; // 덧셈 연산할 때 자동형변환이 일어남. 15.89(double형)
									// 연산 결과인 double형을 int형에 넣으려니까 안 된다.
		// 에러해결 방법.
		// 방법 1. 연산결과를 int형으로 강제형변환.
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : " + iSum1); //데이터 손실 발생.
		
		// 방법 2. double형 값만을 int형으로 강제형변환.
		int iSum2 = iNum + (int)dNum; // 10 + 5 => 15, 데이터 손실 발생.
		System.out.println("iSum2 : " + iSum2);
		
		// 실수 값을 정수형으로 강제형변환시 소수점 아래 부분은 버려짐.
		double iSum3 = iNum + dNum;
		System.out.println("iSum3 : " + iSum3);
		
		// ** 데이터 손실 테스트 **
		
		int iNum2 = 290;
		byte bNum2 = (byte)iNum2;
		//byte -128 ~ 127
		
		System.out.println("bNum2 : " + bNum2);
		
		
		
		
	}
	
	
}
