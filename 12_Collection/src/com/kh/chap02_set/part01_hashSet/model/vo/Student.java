package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {}
	
	// alt + shift + s
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	@Override
	public int hashCode() { // 모든 필드에 담긴 값이 일치하면 동일한 hashCode 반환하도록
		String str = name + age + score; // "공유43100", "차은우2685", "이제우3095", "공유43100"
		return str.hashCode();
	}
	
	@Override // 선생님의 오리지널 코드
//	public boolean equals(Object obj) { // 현재 객체와 전달받은 객체의 각 필드값들이 모두 일치하면 true, 하나라도 일치하지 않으면 false 반환
	public boolean equals(Object obj) { // str1.equals(str2)
				// this(현 객체)		vs			obj(전달받은 객체)
				// Student 타입					Object 타입
	
		Student other = (Student) obj; // 비교하기 위해 Student 타입 맞추기
		
		//	this(현 객체)		vs		obj(전달받은 객체)
		//	this.name				other.name		일치하는지
		//	this.age				other.age		일치하는지
		//	this.score				other.score		일치하는지
		
		if(name.equals(other.name) && age == other.age && score == other.score) { // this.는 이곳을 가리키기 때문에 지워도상관없다.
			return true;
		}else {
			return false;
		}
		
	}

}
