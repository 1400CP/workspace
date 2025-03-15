package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[3];
		
		arr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		arr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		arr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		System.out.println("==================Student 결과값==================");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		System.out.println();
		
		
		
		System.out.println("==================Employee 결과값==================");
		
		int sum = 0;
		Employee[] arr2 = new Employee[10];
		
		while(true) {
			
		for(int i=0; i<arr2.length; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();

			System.out.print("나이 : ");
			int age = sc.nextInt();
		
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			sc.nextLine();
			String dept = sc.nextLine();
			
			arr2[i] = new Employee(name, age, height, weight, salary, dept);
			System.out.println(arr2[i].toString());
			
			System.out.print("추가해 말어");
			
			char yn = sc.nextLine().charAt(0);
				if(yn == 'y' || yn == 'Y') {
					sum++;
					if(sum == 10) {
						return;
					}
					break;
				}else if(yn == 'n' || yn == 'N') {
					System.out.println("그만하겠습니다.");
					System.out.println(sum);
					return;
				}else
					return;
			
		}
		
		sc.close();
		
		}
		
		
	}
	
}				
				
//			for(int i=0; i<wk.length; i++) {
				
//			}break;

