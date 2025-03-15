package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
		
	public Sports(int people) {
		this.people = people;
	}
	
	// getter - setter
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	
	// toString
	@Override
	public String toString() {
		return "people : " + people;
	}
	
	
	// 추상메소드(미완성된 메소드)
	// public void rule();  => 머리부만 있고, 몸통이 없다고 에러가 발생!
	public abstract void rule();
	
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성이라는 말이다.
	
	// 그럼 언제 완성합니까? => 해당 추상클래스를 상속받는 자식에서!
	
	
}
