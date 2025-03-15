package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;
//import com.kh.chap01_poly.part02_electronic.run.Desktop;

// 다형성 적용 안 했을 때!!
public class ElectronicShop1 {
	
	// 용산 전자상가에 있는 가게
	// private int a; 
	private Desktop desk;
	//내가 만든 자료형 Desktop
	private NoteBook note;
	private Tablet tab;
	
	// 이건 실제로 객체 생성이 된 건 아님
	// desk, note, tab => 주소값이 들어가 있어야 함.

	// 반환값을 모르겠으면 일단 void로 입력, 짜자.
	// 웬만하면 접근제한자는 public이다. (가져와야 하니까.)

	public void insert(Desktop d) {				// Desktop d = new Desktop("삼성", "짱짱데스크탑", 1200000, "gtx2060");
		desk = d;
		// 내가 넘겨받은 데스크탑 객체를 위에 파랑이 필드인 desk에 넘겨받겠다.
	}	
		
//	public void insert(매개변수 = 자료형 변수명) {
//		
//	}
	
	public void insert(NoteBook n) {			// NoteBook n = new NoteBook("LG", "그램", 2000000, 4);
		note = n;
		// 내가 넘겨받은 노트북 객체를 위에 파랑이 필드인 desk에 넘겨받겠다.
	}
	
//	public void insert(자료형 변수명) {
//		
//	}
	
	public void insert(Tablet t) {				// Tablet t = new Tablet("Apple", "아이패드", 800000, false);
		tab = t;
		// 내가 넘겨받은 태블릿 객체를 위에 파랑이 필드인 desk에 넘겨받겠다.
	}
	
	// 동일한 클래스에 동일한 메소드명으로 여러 개 만들어지는 것 => 오버로딩
	// 단, 매개변수 종류가 달라야 한다!!
	// 오버로딩 적용이 되어있음.
	
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	// insert 처럼 select도 같은 이름으로 하면 안 되는 이유는?
	// 매개변수가 없기 떄문에 불가능!!
	// 오류 발생.
	
	// 현재는 메소드가 총 6개!
	// 다형성을 적용하면 2~3개로 줄이기 가능!!
		
	
}
