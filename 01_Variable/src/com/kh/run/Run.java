package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_printf;
import com.kh.variable.D_Cast;

public class Run {
	
	public static void main(String[] args) { // main 메소드 기능 : 자바를 실행하는 역할
	 
	// System.out.println("되냐");
	
	 // 클래스 파일들을 불러서 실행하는 방법
	 // 클래스명 별칭 = new
	 A_Variable a = new A_Variable();
	 
	 // 해당 클래스의 메소드를 실행하는 방법
	 // 별칭.메소드명()
	 
	 a.printVariable();
	 // a.decleareVariable();
	 
	 B_KeyboardInput b = new B_KeyboardInput();
	 b.charAtTest();
	 // b.inputTest3();
	 // b.inputTest4();
		
		
	 C_printf c = new C_printf();
	 c.C_printTest();
		
	 D_Cast d = new D_Cast();
//	 d.autoCasting();
	 d.forceCasting();
	 	 
	 
	}

}