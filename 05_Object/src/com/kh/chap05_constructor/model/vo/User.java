package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 접근제한자 ==> 필드를 만드는 것이다.
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * * 생성자
	 * public ===반환형=== 클래스명 () {						// 반환형 필요없이 바로 적으면 된다.
	 * }
	 * 
	 * 이것을 왜 써야하는가?
	 * * 생성자를 작성해야 하는 목적
	 * 1. 반드시 생성자명은 클래스명과 동일해야 함. (대/소문자 구분) => 그렇지 않으면 오류가 난다.
	 * 2. 반환형이 존재하지 않음. (ex: String 등) (만약 반환형을 쓰면 메소드로 인식함.)
	 * 3. 매개변수 생성자를 명시적으로 작성하게 되면기본생성자를 JVM이 자동으로 안 만들어준다.
	 * 	즉, 어찌됐던 간에 기본생성자는 항상 작성하는 습관을 들이자!!
	 */
	
	
	
	public User() {
		
		// 기본생성자 (매개변수가 없는 생성자)
		// System.out.println("이거 되나?");
		// 단지 객체 생성만을 목적으로 할 때 사용
		// 기본생성자를 생략했을 경우 => "JVM"이 자동으로 만들어줬기 때문에 항상 객체 생성 가능!!
		
	}
	
	// 매개변수 생성자
	// 객체 생성과 동시에 전달값들을 매개변수로 받아서 해당 각 필드에 초기화할 목적
	public User(String userId, String userPwd, String userName) {
	// setter 메소드 실행시 수행됐던 코드들
		// 순서를 절대로 바꾸지 마시오.
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	// this.age = age;							==>?
	// this.gender = gender;					==>?
	
	//전체 매개변수 생성자
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this(userId, userPwd, userName);
		this.age = age;
		this.gender = gender;
		}

	/*
	 * 위와 같이 중복되는 동일한 초기화하는 내용의 생성자가 이미 존재할 경우
	 * this() 생성자 활용가능
	 * => 같은 클래스 내에 생성자에서 또 다른 생성자를 호출하고자 할 때 사용함.
	 * 유의사항 : 반드시 첫줄에 작성해야 함!! 위치가 맨 위. 아래에 있으면 오류 남.
	 */
	

//	public String User(String userId, String UserPwd, String userName, int age, char gender) {
//		return ("userId : " + userId + ", userPwd : " + userPwd + ", userName : " + userName + ", int age : " + age + ", char gender" + gender);
//	}
	
	
	// get - set (한번에, 세트로 만들어주세요.)
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " + userName + ", int age : " + age + ", char gender" + gender;
	}
	

}
