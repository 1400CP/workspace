package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	
	// 기본생성자??
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	/*
	 * 접근제한자 반환형 메소드명(){
	 * 
	 * }
	 */
	
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		int sumScore = 0;
		for(int i=0; i<sArr.length; i++) {
			sumScore += sArr[i].getScore();
		}
		return sumScore;
	}
	
	public double[] avgScore() {
		double[] avgScore = new double[2];
		int sumScore = 0;
		for(int i=0; i<sArr.length; i++) {
			sumScore += sArr[i].getScore();
			System.out.println(sumScore);
		}
		
		avgScore[0] = sumScore;
		avgScore[1] = sumScore / sArr.length;
		return avgScore;
	}
	
	
}
