package com.kh.chap01_poly.part02_electronic.controller;
// 다형성 개념을 적용했을 때

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

public class ElectronicShop2 {
	
	// 용산 전자상가
	// 자리를 마련하자
	
	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식 객체를 담을 수 있음!!
	// (무조건 부모타입이 나와야 다형성이 된다.)
	
	// 부모 : Electonic
	// 자식 : Desktop, NoteBook, Tablet
	
	// Parent[] arr = new Parent[4];
	// Parent 타입
	// arr[0] = new Child1(1, 2, 4);
	// arr[1] = new Child2(4, 5, 6);
	
	// 부모타입 배열로 모든 자식 객체 다루기
	private Electronic[] elec = new Electronic[3];
	private int count = 0; // 캡슐화!! 반드시 잊으면 안 된다.
	
	// Electronic[] => static
	// Electronic => heap
	
	// insert 함수 구현
	// 매개변수 => Desktop, NoteBook, Tablet 전부 다 받을 수 있어야 한다!
	// 이걸 다 받을 수 있는 부모 Electronic으로 생성!
	
	public void insert(Electronic any) {
		//elec[?] = any;
		elec[count++] = any;
		
		// 맨처음 => count : 0 이었을 경우
		// es.insert(new Desktop("삼성", "뉴", 1200000, "gtx2060"));
		
		// Electronic any = new Desktop("삼성", "뉴", 1200000, "gtx2060");
		// 이거시 다형성이다.
		// elec[0] = any;
		// 따라서 elec[0] = new Desktop("삼성", "뉴", 1200000, "gtx2060");
		
		// 그 다음 => count : 1 이었을 경우
		// es.insert(new NoteBook("LG", "그램", 2000000, 4));
		// Electronic any = new NoteBook("LG", "그램", 2000000, 4);
		// elec[1] = any;
		
		// 그 다음 => count : 2 이었을 경우
		// es.insert(new Tablet("Apple", "아이패드", 800000, false));
		// Electronic any = new Tablet("Apple", "아이패드", 800000, false);
		// elec[2] = any;
		
	}
	
	// 조회용 메소드
	
	public Electronic select(int index) {
		// 0 => Desktop
		// 1 => NoteBook
		// 2 => Tablet
		
		// elec[], elec배열에 있는 값들을 출력해야 함!!
		// 사용자가 원하는 인덱스를 받아와야 함!! ==> 매개변수를 받아올 수밖에 없다.
		// public void select(자료형 변수명)
		return elec[index];
				
	}
	
	

}
