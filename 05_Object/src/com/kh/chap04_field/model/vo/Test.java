package com.kh.chap04_field.model.vo;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;

public class Test {
	
	public static void main(String[] args) {
		
		// -------FieldTest1--------
		
		// FieldTest1 f1 = new FieldTest1();
		// f1.test(1);
		
		
		// public
		FieldTest2 f2 = new FieldTest2();
		// System.out.println(f2.pub);
		
		// protected
		System.out.println(f2.pro); 				// 여긴 상속되어 있어서 됨.
		
		// default
		System.out.println(f2.def);					// 같은 패키지에서만 접근 가능.
		
		// private 
		System.out.println(f2.pro);					// only 해당 클래스에서만 접근 가능!
		
		
	}
	
	
	
}
