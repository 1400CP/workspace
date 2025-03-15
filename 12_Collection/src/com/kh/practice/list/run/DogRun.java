package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {
		
		
		// * 처음에는 4마리의 강쥐 ArrayList 생성 후 (크기 4짜리)
		//   2번 인덱스에 마지막 강쥐를 추후에 추가 할 것!(끼워넣기) 
		// + 구 포함한 이름을 가진 강쥐가 몇마리 인지 출력하시오. 
		
		
		// 5마리의 강쥐 이름을 입력 받아서
		// ArrayList에 저장한 후에
		// 이들 중 '구' 라는 이름이 포함된 강쥐를 모두 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		// 초기화 블럭 (일단 4개부터)
			for(int i=0; i<5; i++) {
				
				System.out.print((i+1) + "번째 깡쥐 이름 입력 : ");
				String name = sc.nextLine();
				
				System.out.print("깡쥐 나이 입력 : ");
				int age = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("깡쥐 종 입력 (ex. 말티즈) : ");
				String kind= sc.nextLine();
			
				list.add(new Dog(name, age, kind));
				
				if(list.size() == 5) {
					list.add(2, new Dog(name, age, kind));
					list.remove(5);
				}
				
			}
			
			System.out.println("===========================");
			System.out.println("전체 깡쥐 출력");
			System.out.println("===========================");
			
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("===========================");
			System.out.println("이름에 '구'가 들어간 강쥐 정보 출력");
			System.out.println("===========================");
			int sum = 0;
			for(int i=0; i<list.size(); i++) {
				Dog dd = (Dog)list.get(i);
				String d1 = dd.getName();
				if(d1.contains("구")) {
					System.out.println(list.get(i));
					sum += 1;	
				}
				
			}
			System.out.println("이름에 '구' 가 들어간 강쥐는 총 " + sum + "마리 입니다.");
			
	}
}
