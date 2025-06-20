package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();
		
	public StudentMenu() {
		// [] : 배열!!
		Student[] info = ssm.printStudent();
		
		info[0] = new Student("김길동", "자바", 100);
		info[1] = new Student("박길동", "디비", 50);
		info[2] = new Student("이길동", "화면", 85);
		info[3] = new Student("정길동", "서버", 60);
		info[4] = new Student("홍길동", "자바", 20);
		
		
		System.out.println("=========== 학생 정보 출력 ===========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		
		for(int i=0; i<info.length; i++) {
			System.out.println("이름 : " + info[i].getName() + " / 과목 : " + info[i].getSubject() + " / 점수 : " + info[i].getScore());
		}
		
		System.out.println();
		System.out.println("=========== 학생 성적 출력 ===========");
		// StudentController에 avgScore를 통해 점수 합계와 평균 출력
		
		int sumScore = 0;
		for(int i=0; i<info.length; i++) {
			sumScore += info[i].getScore();
		}
		
		double[] avgScore = new double[2];
		avgScore[0] = sumScore;
		avgScore[1] = sumScore / info.length;
		
		System.out.println("학생 점수 합계 : " + (int)avgScore[0]);
		System.out.println("학생 점수 평균 : " + avgScore[1]);
		
		/*
		System.out.print("학생 점수 합계 : " + sumScore);
		System.out.print("학생 점수 평균 : " + (double)(avgScore));
		*/
		System.out.println();
		System.out.println("=========== 학생 결과 출력 ===========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		// for문과 if문을 통해서 학생 그리고 점수를 파악하고 파이널 CUT_LINE 활용.
		
		for(int i=0; i<info.length; i++) {
			if(info[i].getScore() < 60) {
				System.out.println(info[i].getName() + "학생은 재시험 대상입니다.");
			}else
				System.out.println(info[i].getName() + "학생은 통과입니다.");
		}
		
		
		
		
		
		
//	
//	public StudentController() {
//		sArr[1] = new Student("김길동", "자바", 100);
//		System.out.println(sArr[1].information());
//		
//		sArr[2] = new Student("박길동", "디비", 50);
//		System.out.println(sArr[2].information());
//		
//		sArr[3] = new Student("이길동", "화면", 85);
//		System.out.println(sArr[3].information());
//		
//		sArr[4] = new Student("정길동", "서버", 60);
//		System.out.println(sArr[4].information());
//		
//		sArr[5] = new Student("홍길동", "자바", 20);
//		System.out.println(sArr[5].information());
//	}
//	
//	
//	public Student[] printStudent() {
//		return sArr;
//	}
//	
//	public int sumScore() {
//		int sumScore = 0;
//		for(int i=0; i<sArr.length; i++) {
//			sumScore += sArr[i].getScore();
//			System.out.println(sumScore);
//		}
//		return sumScore;
//	}
//	
//	public double[] avgScore() {
//		double[] avgScore = new double[2];
//		int sumScore = 0;
//		for(int i=0; i<sArr.length; i++) {
//			sumScore += sArr[i].getScore();
//			System.out.println(sumScore);
//		}
//		
//		avgScore[0] = sumScore;
//		avgScore[1] = sumScore / sArr.length;
//		return avgScore;
//	}
//	
//	
//	
//		
//		for(int i=0; i<sArr.length; i++) {
//			if(sArr[i].getscore == CUT_LINE) {
//				System.out.println(sArr[i].name + "학생은 통과입니다.");
//			}else
//				System.out.println(sArr[i].name + "재시험 대상입니다.");
//		}
//		
		
	}

	
}
