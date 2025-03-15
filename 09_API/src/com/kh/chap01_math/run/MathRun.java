package com.kh.chap01_math.run;

public class MathRun {
	
	public static void main (String[] args) {
		
		// java.lang.Math; (String, Object) => 굳이 import를 사용하지 않아도 사용할 수 있다.
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 때 : abs(앱솔루트)
		int num1 = -10;
		System.out.println("절대값 : " +Math.abs(num1));		// 오버로딩
		
		// 올림 : ceil : 크거나 같은 정수값
		double num2 = 4.049;			// 얘보다 큰 정수값, 5
		double num3 = -10.594;			// 얘보다 크거나 같은 정수값, -10
		System.out.println("올림한 결과 : " + Math.ceil(num2));
		System.out.println("올림한 결과 : " + Math.ceil(num3));
		
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2));		// 소수점 첫번째 자리를 보고
		
		// 버림 : floor
		System.out.println("버림 : " + Math.floor(num2));			// 얘보다 작거나 같은 정수값
		
		// 가장 가까운 정수값을 알아낸 후 실수형으로 변환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));	// 
		
		// 제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		/*
		 * * Math 특징
		 * - 모든 필드 상수필드, 모든 메소드 static 메소드!! (전부 static!!)
		 * - 생성자가 원래 private로 되어있음! => 생성 불가능하다.
		 * 
		 * ** 한번만 메모리 영역에 올려넣고 재사용하는 개념. (static 부분) => 싱글톤 패턴
		 * ** openjdk11 document를 참조하면서 작성하면 된다.
		 */
		
		
	}

}
