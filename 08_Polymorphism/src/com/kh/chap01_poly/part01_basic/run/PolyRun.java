package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		// 기억해둘 것!! ' = ' 기준으로 해서 왼쪽과 오른쪽의 자료형(타입)은 같아야 함!!!!!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		
		// p1 래퍼런스가 Parent 일때만 접근 가능!!
		
		
		System.out.println("2. 자식타입 레퍼랜스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		((Parent)(c1)).printParent();					// 자동형변환 됐음. (Child1 ==> Parent)
		// c1이 가지고 있는 Child1 이라는 레퍼런스로
		// Child1도, Parent도 접근 가능
		// Parent 접근 시 자동으로 형변환 된 채로 진행된 거임.
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우 (다형성)");
		Parent p2 = new Child1();				// 자료형이 다르다? => 에러가 안 뜬다. => 자동형변환.
		p2.printParent();
//		p2.printChild1();
		((Child1)p2).printChild1();				// 강제형변환으로 호출은 가능하다.
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 하면 접근은 가능!!
		
		/*
		 * 상속 구조의 클래스들 간에는 형변환 가능!
		 * 
		 * 1. UpCasting
		 * 		자식타입 --> 부모타입으로 형변환 (자동으로 해줌)
		 * 		자동형변환
		 * 		ex) 자식.부모메소드();
		 *			부모 = 자식객체;
		 * 2. DownCasting
		 * 		부모타입 --> 자식타입으로 형변환
		 * 		강제형변환
		 * 		ex) 부모.자식메소드();
		 * 			((자식).부모)자식메소드();
		 */
		
//		String str = new Child1();				상속구조에서만 통용된다.
		
		
		// 다형성 정의
		// - 부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 타입 하나라도 다룰 수 있다.
		
		// 다형성을 쓰는 목적(장점)
		
		// 다형성을 배우기 전...
		Child1[] arr1 = new Child1[2];
		//Child1 객체 배열 만듦 + Child2 객체 배열 만듦 ==> 
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0]	= new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		// ---------------------------------------
		
		// 다형성을 적용한 후...
		// Parent 배열 하나만 만듦.
		Parent[] arr = new Parent[4];
		// Parent의 자료(배열)
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		// 자동형변환으로 자식넣을 수 있다!!
		arr[2] = new Child2(5, 7, 2);
		arr[3] = new Child1(2, 3, 5);
		// 하나의 부모타입만으로 여러 자식 객체들을 받을 수 있다 => 편리하다, 코드 길이 감소.
		
		
		System.out.println("==========================");
//		arr[0].printChild1(); ==> 엄연하게는 부모클래스라서 안 된다.
		((Child1)arr[0]).printChild1();
//		arr[1].printChild2();
		((Child2)arr[1]).printChild2();
//		((Child1)arr[2]).printChild1(); 		ClassCastException : 부적절한 형변환
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();			// 형변환 시에는 똑바로 봐야한다.
		
		System.out.println("============= 반복문을 이용해서 출력 =============");
		
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof 연산자 => 연산결과 true / false로 변환
			 * 현재 레퍼런스가 실질적으로 어떤 클래스로 만들어졌는지를 확인해주는 연산자
			 */
			
			if(arr[i] instanceof Child1) {		//해당 레퍼런스가 실제로 Child1을 참조하고 있다면 true 아니면 false
				((Child1)arr[i]).printChild1();				//true로 출력되면서 결과값이 나옴
			}else {
				((Child2)arr[i]).printChild2();				//false일 경우 결과값이 나옴
			}
			
			
//			if(i == 0 || i == 3) {
//				((Child1)arr[i]).printChild1();
//			}else {
//				((Child2)arr[i]).printChild2();
//			}

		}
		
		System.out.println("==========================");
		Parent pp = new Child1();
		pp.print();
		//오버라이딩 됐네. ==> 자식에게 오버라이드되면 자식이 먼저된다.
		
		/*
		 * 동적바인딩 : 프로그램이 실행되기 전에는 컴파일되면서 정적바인딩.
		 * 			단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩이 되어있으면
		 * 			프로그램이 실행시 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		
	}

}
