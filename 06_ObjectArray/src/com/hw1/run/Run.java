package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
	
	public static void main (String[] args) {
		
		// 객체 배열을 크기 3으로 할당 한 뒤							==> for문이 3개
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성 					==> int=0, 문자는 null
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성 		==> 글자 6개짜리 매개변수로 생성
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력  ==> 글자 10개짜리 매개변수로 생성

		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로) ==> 결과 화면대로 넣자.
		 
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력 			
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12 	==> int total = 0에서 계산
		   
		// 3명 직원의 연봉 평균을 구하여 출력 						==> 3명이니까 arr.length로 나눠서 계산
		
		// int[] emp = new int[3];
		Employee[] emp = new Employee[3];
		
		emp[0] = new Employee();
		System.out.println("emp[0] : " + emp[0].information());
		
		emp[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
		System.out.println("emp[1] : " + emp[1].information());
		
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		System.out.println("emp[2] : " + emp[2].information());
		
		System.out.println("=============================================");
		
		emp[0].setEmpName("이사람");
		emp[0].setJob("행정직");
		emp[0].setDept("과장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01044445555");
		emp[0].setAddress("서울 강북");
		
		emp[1].setJob("생산직");
		emp[1].setDept("부장");
		emp[1].setAge(25);
		emp[1].setGender('F');
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		
		/*
		emp[0] = new Employee(0, "이사람", "행정직", "과장", 30, 'M', 3000000, 0.2, "01044445555", "서울 강북");
		System.out.println("emp[0] : " + emp[0].information());
		
		emp[1] = new Employee(1, "홍길동", "생산직", "부장", 25, 'F', 4000000, 0.3, "01022223333", "서울 잠실");
		System.out.println("emp[1] : " + emp[1].information());
		*/
		
		System.out.println("=============================================");
		
		for(int i=0; i<emp.length; i++) {
			if(emp[i].getEmpName().equals(emp[0].getEmpName())) {
				System.out.print(emp[0].getEmpName() + "의 연봉 : " + (int)((emp[0].getSalary() + (emp[0].getSalary() * emp[0].getBonusPoint())) * 12) + "원");
			}else if(emp[i].getEmpName().equals(emp[1].getEmpName())) {
				System.out.print(emp[1].getEmpName() + "의 연봉 : " + (int)((emp[1].getSalary() + (emp[1].getSalary() * emp[1].getBonusPoint())) * 12) + "원");
			}else {
				System.out.print(emp[2].getEmpName() + "의 연봉 : " + (int)((emp[2].getSalary() + (emp[2].getSalary() * emp[2].getBonusPoint())) * 12) + "원");
			}
			System.out.println();
			// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12 ==> 샐러리에 보너스
		}
		
		System.out.println("=============================================");
		
		int total = 0;
		for(int i=0; i<emp.length; i++) {
			total += (emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) *12 / emp.length;
		}
		System.out.println("직원들의 연봉의 평균 : " + total + "원");
		
	}
	
}
