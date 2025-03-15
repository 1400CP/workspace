package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main (String[] args) {
		
		int[] arr = {10, 20, 30};
		
		// for each문 (향상된 for문 / 개선된 for문)
		// 배열 또는 컬렉션과 함께 사용됨
		// 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		
		
		/*
		 * [표현법]
		 * for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열명 또는 컬렉션명) {
		 * 		반복적으로 실행할 내용
		 * }
		 * 
		 * => for문 몇번 돌아요? 배열 또는 컬렉션의 크기만큼 돕니다...
		 */
		
		for(int value : arr) {								// value = arr[0] => value = arr[1] => value = arr [2] 끝남!!
			System.out.println(value);						// 첨부터 마지막까지 쓸 생각일때만
		}
		
		
		// 객체 배열만 생성
		Phone[] phones = new Phone[3];
		
		// 객체 생성
		phones[0] = new Phone("갤럭시", "쉠쉉", 50, "S24");
		phones[1] = new Phone("아이폰", "애플", 1200000, "아이폰16");
		phones[2] = new Phone("벨벳폰", "엘지", 100, "1시리즈");
		
		System.out.println(phones[0].information());
		
		phones[2].setPrice(50000);
		System.out.println(phones[2].information());
		
		int total = 0;
		for(Phone p : phones) {						// p = phones[0] => p = phones[1] => p = phones[2]
			System.out.println(p.information());
			total += p.getPrice();
		}
		
		System.out.println("총합계 : " + total);
		System.out.println("평균가 : " + total / phones.length);
		
		
		// 구매하고자 하는 휴대폰 : 
		// 당신이 구매하고자 하는 휴대폰은 xx원입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신이 구매하고자 하는 휴대폰 : ");
		String buy = sc.nextLine();
		
		for (Phone p : phones) {					// p = phones[0] => p = phones[1] => p = phones[2]
			if(p.equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + p.getPrice() + "원입니다.");
				break;
			}
		}
		
		sc.close();
		/*
		for(Phone ph : phones) {
			if(ph.equals(sm)) {
				System.out.println("당신이 구매하고자 하는 휴대폰 가격은 " + ph.getPrice() + "원입니다.");
			}
		}
		*/
		
		
	}
	
	
}
