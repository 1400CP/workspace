package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {
	
	public static void main (String[] args) {
		
		
	// 1. 기본 생성자로 객체 생성
	// User a = new User();
	
	// System.out.println(a.information());
	
	// 각 필드에 JVM의 초기값이 담겨있음!!
	
	
	User u2 = new User();
	
	u2.setUserId("user02");
	u2.setUserPwd("pass02");
	u2.setUserName("LYH");
	
	System.out.println(u2.information());
	
	
	/*
	 * 바뀐 값으로 나오게 됨.
	 * public 이라서 변경이 가능.
	 * 바꾸지 않은 것은 그대로 null 값이 나옴.
	 */
	
	
	String userId = null;
	String userPwd = null;
	String userName = null;
	// 회원가입시 필수 입력사항만 받는다면?
	User u21 = new User(userId, userPwd, userName);
	System.out.println(u21.information());
	
	
	// setter를 안 만들어도 되지 않을까? => 놉!!
	u21.setUserName("엘오에이치"); // 개명
	
	// getter는?
	// 아이디를 까먹은 경우에는 아이디만 보여줘야함.
	System.out.println(u21.getUserName());
	
	System.out.println(u21.information());
		
	// 3. 매개변수 5개짜리 생성자로 객체 생성
	// 출력
	
	// 연습하자 - User a2 = new User("user03", "ddd", "oooo", 33, "m");
	
	
	}
	

}
