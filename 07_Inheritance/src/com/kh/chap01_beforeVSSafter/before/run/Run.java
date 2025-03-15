package com.kh.chap01_beforeVSSafter.before.run;

import com.kh.chap01_beforeVSSafter.before.medel.vo.Desktop;
import com.kh.chap01_beforeVSSafter.before.medel.vo.SmartPhone;
import com.kh.chap01_beforeVSSafter.before.medel.vo.Tv;

public class Run {
	
	public static void main (String[] args) {
		
		// boolean is ==> 이것만 get 이 아닙니다. is입니다.
		
		// Desktop 객체
		// brand. pCode, pName, price, allInOne
		
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		
		
		// Tv 객체
		// brand. pCode, pName, price, inch
		
		Tv t = new Tv("어쩌고", "t-1", "겁나 얉아", 1000000, 6);
		
				
		// SM 객체
		// brand. pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		// 유지보수 요청 : pName => productName 으로 바꿔달라.
		
		/*
		 * 세 클래스에 공통적인 필드와 메소드들이 존재함.
		 * 이런 중복된 코드들을 따로 "부모클래스"로 한번만 정의해두면 중복된 코드들을 줄일 수 있음!!
		 * => 수정과 같은 유지보수 요청이 들어왔을 때 일일이 찾아서 수정할 필요없이
		 * 한번만 정의해둔 부모클래스만 수정하면 전체적으로 반영됨.
		 * 
		 * 
		 * 세 클래스가 공통적으로 가지고 있는 것.
		 * => brand, pCode, pName, price 필드들, getter / setter 메소드, information
		 */
		
		
	}

}
