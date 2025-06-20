package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun {
	
	public static void main (String[] args) {
		
		
		
		
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("종이비행기", 1.0, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		// 처음에는 그냥 움직인다. 이렇게 나옴.
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println(" ===================================== ");
		
//		ArrayList<E>
		ArrayList<Vehicle> list = new ArrayList<Vehicle>(); // []
		list.add(new Car("벤틀리", 12.5, "세단", 4));
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("종이비행기", 0.01, "제트기", 10, 4));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이(유지보수, 생산성 UP)
		 * 
		 * * 상속의 특징
		 * - 클래스간의 상속에 있어서는 다중상속이 안 된다. (단일상속이 원칙!)
		 * - 부모클래스에 정의되어있는 protected 필드는 자식 클래스에서 직접 접근 가능.
		 * 원래 protected는 다른 클래스에서 접촉 불가능하다.
		 * - 자식객체는 부모클래스에 있는 메소드를 마치 제것처럼 호출 가능.
		 * 			+ 부모클래스에 있는 메소드가 맘에 안 들면 자식 클래스에서 오버라이딩 가능(재정의)
		 * - 명시되어 있진 않지만 모든 클래스(제공하는 클래스, 직접 만드는 클래스)는 Object 클래스의 후손이다.
		 * 		=> Object 클래스에 있는 메소드를 마음대로 호출 가능!
		 * 		=> 뿐만 아니라 오버라이딩을 통해서 재정의도 가능함!!
		 * 
		 */
		
		// System.out.println(c == s)); 안 돼, 안 돼. 주소값 비교라서.
		System.out.println(c.equals(s));
		System.out.println(c.equals(s));
		System.out.println(c.hashCode());
		System.out.println(c);
		System.out.println(c/*.toString()*/);
		
		
		
		
	}

}
