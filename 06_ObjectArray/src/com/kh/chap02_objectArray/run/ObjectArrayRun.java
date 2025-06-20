package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {
	
	public static void main (String[] args) {
		
		int[] arr= new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		Phone[] phones = new Phone[3];
		
		/*
		System.out.println(phones);
		System.out.println(phones[0]);
		phones[0].setName("아이폰");						// 인덱스가 형성이 안 된 상태에서는 null이 나온다.
		*/
		
		phones[0] = new Phone();									// 초기화 (인덱스 부여)
		phones[1] = new Phone("아이폰", "애플", 1300000, "아이폰16");	// 주소값 부여
		phones[2] = new Phone("갤럭시", "삼성", 1100000, "갤럭시S24");	// 주소값 부여
		
		// 초기화 후, 수정한 값을 넣은 것임.
		phones[0].setName("벨벳폰");
		phones[0].setBrand("LG");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1시리즈");
		
		// for문으로 수많은 작업을 최소화하자.
		int total = 0;
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i].information());						// phones는 배열이니까 information은 안 됩니다.
			total += phones[i].getPrice();
		}
		
		System.out.println("총가격 : " + total);
		System.out.println("평균가격 : " + total / phones.length);
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력 받아
		// 해당 휴대폰을 찾은 후에 그 가격이 얼마인지 알려주도록
		// 구매하고자 하는 휴대폰 입력 : 
		// 당신이 구매하고자 하는 휴대폰은 가격은 XX 원입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매하고자 하는 휴대폰 입력 : ");
		String buy = sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.print("당신이 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice() + "원입니다.");
			}
		}
		
		sc.close();
		
		/*
		System.out.println("찾고자 하는 휴대폰 명을 입력해주세요 : ");
		String cp = sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(cp){
				System.out.println("당신이 구매하고자 하는 휴대폰 가격은 : " + phones[i].getPrice());
			}
		}
		*/
		
	}

}
