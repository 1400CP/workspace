package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {

	/*
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스의 형태를 갖추게끔!!
	 * 
	 * * 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법 중 하나로
	 * 			클래스에서 가장 중요한 목적인 "데이터의 접근 제한" 을 원칙으로
	 * 			외부로부터 "데이터의 직접 접근을 막고"
	 * 			대신에 "데이터를 간접적으로나마 처리(값을 대입, 값을 돌려주거나)"할 메소드를 클래스 내부에 작성해서 관리
	 * 
	 * 1) 정보 은닉 : private 
	 * 		직접 접근을 막기 위해 private 라는 접근 제한자 사용.
	 * 
	 */
	
	public static void main(String[] args) {
		
		Student cha = new Student();
		cha.setName("차은우");
		cha.setAge(20);
		cha.setHeight(176);
		cha.setKorScore(100);
		cha.setMathScore(90);
		// System.out.println(cha.name); 직접 접근 불가함
		/*
		cha.name = "차은우";
		cha.age = 20;
		cha.height = 180.5;
		cha.korScore = 90;
		cha.mathScore = 100;
		
		// 직접 접근했다.
		*/
		
		System.out.println(cha.getName());
		System.out.println(cha.getAge());
		System.out.println(cha.getHeight());
		System.out.println(cha.getKorScore());
		System.out.println(cha.getMathScore());
		
		// 수정하고 싶다??
		
		
	}
	
}
