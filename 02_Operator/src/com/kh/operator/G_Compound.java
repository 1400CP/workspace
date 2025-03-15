package com.kh.operator;

public class G_Compound {
	
	/*
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자가 결합돼있는 형태 (산술연산을 먼저쓰고 대입연산을 나중에 쓴다)
	 * 연산을 처리하는 속도가 빨라져서 사용하는 것을 권장!
	 * 
	 * += -= *= /= %=
	 * 
	 * a = a + 3;		=> a += 3;
	 * 
	 * a += 3; 은 a = a+3; 으로 읽는다.
	 * a -= 3; 은 a = a-3;
	 * a *= 3; 은 a = a*3;
	 * a /= 3; 은 a = a/3;
	 * a %= 3; 은 a = a%3;
	 * 
	 * 
	 */

	public void method1() {
		
		int num = 12;
		
		System.out.println("최초 num : " + num); //12
		
		num = num + 3;
		System.out.println("3 증가 시킨 num : " + num); //15
		
		num += 3;
		System.out.println("3 증가 시킨 num: " + num); //18
		
		// 생김새가 이상해서 헷갈린다.
		
		num -= 5;
		System.out.println("5를 감소 시킨 num: "+ num); //13
		
		num *= 6;
		System.out.println("6배 증가시킨 num : " + num); //78
		
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num); //39
		
		num %= 4;
		System.out.println("최종 num : " + num); //3
		
		String str = "Hello";
		// str = str + " World";
		str += " World";
		System.out.println(str);
		
		// 누적합 때 굉장히 많이 쓰입니다. (숫자만이 아니니까 기억해 두자. 문자도 더하기가 가능하니까!)
		
		
		
	}
	
}
