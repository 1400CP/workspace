package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;

public class BasicRun {
	
	public static void main (String[] args) {
		
		// Person p = new Person();
		// 추상클래스는 객체생성 불가!! 레퍼런스로는 가능!!
		
//		Person mom = new Mother("김엄마", 50, 70, "출산");		//다형성
//		Person baby = new Baby("김아기", 3.5, 7);
		
		// 동적바인딩 : Person의 mom 이 아니라 Mother의 mom이 실행중
//		mom.eat(); // 몸무게 + 10, 건강도 - 10
//		baby.eat(); // 몸무게 + 3, 건강도 + 1
		
//		mom.sleep(); // 건강도 + 20
//		baby.sleep(); // 건강도 + 3
		
		
//		System.out.println(mom);
//		System.out.println(baby);
		
		// Basic b = new Basic(); 객체 생성 불가!! => 래퍼런스로는 사용 가능.
		
		Basic mom = new Mother("김엄마", 50, 70, "출산");
		Basic baby = new Baby("김아기", 3.5, 7);
				
		mom.eat();
		baby.eat();
		
		mom.sleep();
		baby.sleep();
		
		System.out.println(mom);
		System.out.println(baby);
		
		/*
		 * 클래스에서 클래스를 상속 받을 때 : 클래스 extends 클래스 (단일상속만 가능)					: 화살표 실선
		 * 클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스1, 인터페이스2 (다중구현 가능) 	: 화살표 점선
		 * 클래스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스1, 인터페이스2 (다중상속 가능)		: 화살표 실선
		 *
		 *				|		추상클래스			|				인터페이스
		 *=============================================================================
		 * 상속개수		|		단일상속			|				다중상속
		 *-----------------------------------------------------------------------------
		 * 키워드			|		extends			|				implements
		 *-----------------------------------------------------------------------------
		 * 추상메소드		|	추상메소드 0개 이상		|
		 * 표현법/개수		|	명시적으로 abstract		| 		묵시적으로 abstract (생략가능)
		 * ----------------------------------------------------------------------------		
		 * 일반메소드		|		있다(o)			|				없다(x)
		 * ----------------------------------------------------------------------------
		 * 필드			|		일반필드 가능		|	상수필드만 가질 수 있음(묵시적으로 public static final)			
		 * 
		 * 
		 * extends 일반클래스 --> extends 추상클래스 --> implements 인터페이스
		 * ----------------------------------------------------------------------------
		 *
		 *						강제성이 짙어진다. (규약이 더 쌔짐.)
		 *
		 *
		 */
		
		// 팀장은 보통 설계, 인터페이스만 짜준다.
		
	}

}
