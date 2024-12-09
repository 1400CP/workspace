package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {
	
	public static void main(String[] args) {
		
		// -------FieldTest1--------
		
		// FieldTest1 f1 = new FieldTest1();
		// f1.test(1);
		
		
		// public
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub);
		
		// protected
		// System.out.println(f2.pro); 				// 상속되어있지 않아서 안 됨.
													// Test에서는 상속되어있어서 됨.
		
		
		System.out.println(Math.PI);				// 상수필드 개념.
		
		System.out.println(FieldTest3.sta);			// 상수필드가 아님.
		// 수정하고 싶다?
		FieldTest3.sta = "^^";
		System.out.println(FieldTest3.sta);			// 개념이 변경됨.
		// 절대 변경 안 되게 하고 싶다면? => 상수필드로 선언
		System.out.println(FieldTest3.STA_FIN);		// 상수필드로 변경됨.
		// FieldTest3.STA_FIN = "gggg";				변경 안 됨.
		
		
	}
	
}
