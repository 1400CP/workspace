package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {
	
	public static void main (String[] args) {
		//실행용 클래스는 납품업체
	
		ElectronicShop2 es = new ElectronicShop2();
		
		//추가용 메소드 => insert
		
		es.insert(new Desktop("삼성", "뉴", 1200000, "gtx2060"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		
//		Desktop d = (Desktop)es.select(0);			// 강제형변환(다운케스팅)
//		NoteBook n = (NoteBook)es.select(1);		// 강제형변환
//		Tablet t = (Tablet)es.select(2);			// 강제형변환
		
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);
		
		System.out.println(d.toString());
		System.out.println(n.toString());
		System.out.println(t.toString());
		
		// toString() 할 때 부모에 있는 toString()을 불러오지 않을까?
		// 아님!! => 왜? 동적 바인딩 때문에
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입 배열로 다양한 자식객체를 받을 수 있음
		 * 2. 메소드 만들 때 매개변수로 다형성을 적용하게 되면 메소드의 개수가 확!! 줄어든다!
		 * 3. 필수로 써야하는 곳이 있음 => 추상클래스.(인터페이스) => 클래스를 추상화한 것.(완벽한 상태가 아님.)
		 */
		
		
		
		/*
		ElectronicShop1 es = new ElectronicShop1();
		// 객체를 생성해주기 위해서 우선 es 생성!
		
		// 메소드를 써서 생성하겠음.
		// 먼저 필요한 메소드를 생각해보자
		
		// 추가용 메소드 => insert
		// 데스크탑이라는 객체를 생성해서 넘기는 메소드
		
		es.insert(new Desktop("삼성", "짱짱데스크탑", 1200000, "gtx2060")); // 매개변수 안에 써야한다. 매개변수 안에 담겨야 옮겨진다.
		// 아직은 해당 메소드가 없기 때문에 에러가 난다.
		
		// 노트북이라는 객체를 생성해서 넘기는 메소드
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		// 아직은 해당 메소드가 없기 때문에 에러가 난다.
		// Desktop을 받는 메소드는 있지만, NoteBook을 받는 메소드는 없음! => 각각 만들어야 함!!
		
		// 태블릿이라는 객체를 생성해서 넘기는 메소드
		es.insert(new Tablet("Apple", "아이패드", 800000, false));
		// 아직은 해당 메소드가 없기 때문에 에러가 난다.
		// Desktop, NoteBook을 받는 메소드는 있지만, Tablet을 받는 메소드는 없음. => 만들어야 함!!
		
		
		// 가게에 해당 객체들이 잘 생성됐는지 확인
		// 조회용 메소드 => select
		
		Desktop d = es.selectDesktop();
		System.out.println(d);
		
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(n);
		System.out.println(t);
		
		
		// toString이라는 메소드를 이미 오버라이딩 했기 떄문에
		// 주소값이 아니라 출력문이 나온다!!
		*/
		
	}

}
