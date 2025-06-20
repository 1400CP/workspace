package com.kh.practice.student.model.vo;

public class Student {
	
	private String name;
	private String subject;
	private int score;
	
	// 기본생성자
	public Student() {}
	
	// 전체 생성자
	public Student (String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	
	// getter-setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	// information - String
	public String information() {
		return name + ", " + subject + ", " + score;
	}
	
}
