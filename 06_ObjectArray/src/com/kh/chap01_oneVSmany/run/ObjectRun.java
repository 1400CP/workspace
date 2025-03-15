package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main (String[] args) {
		
	
		// 복습시간
		// 방법 1. 기본생성자로 생성한 후 setter 메소드를 이용해서 값 초기화
		
		/*
		Book bk = new Book();							// 필드가 4개니까 heap에 4개가 생김.
		bk.setTitle("자바의 정석");				// String
		bk.setAuthor("차은우");				// String
		bk.setPrice(10000);					// int
		bk.setPublisher("kh");				// String	// 기본을 만들고, 값을 만들기.
		*/
			
		// 방법 2. 매개변수 생성자를 통해서 생성과 동시에 값을 초기화
		// Book bk = new Book("자바의 정석", "차은우", 10000, "kh");
		
		// [응용] 사용자에게 입력받은 값으로 객체 생성 후 초기화
		Scanner sc = new Scanner(System.in);			// 매개변수 생성자로 만들고 있었던 System.in
		
		/*
		System.out.print("도서명 : ");					// 필드부 순서와 같게 작성하라.
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();				// 객체 생성 시작!
		
		Book bk = new Book(title, author, price, publisher);		// 순서대로 만들면 나옴.
		
		System.out.println(bk.information());
		*/
		
		// 세개의 Book 개체를 관리해야 한다면?
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// for문을 돌려야 하는 이유. 3번이니까
		// 세 도서에 대한 정보를 반복적으로 사용자에게 입력받기
		// => 입력받은 후 각 객체 생성과 동시에 초기화
		for(int i=0; i<3; i++) {
			
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else{
				bk3 = new Book(title, author, price, publisher);
			}
			
		}
		// 객체 생성 끝
		
		// 전체 도서 정보 조회하기 => 일일이 각 객체의 출력문 작성(반복문 활용x)
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.print(bk1.information());
		}
		if(bk2.getTitle().equals(search)) {
			System.out.print(bk1.information());
		}
		if(bk3.getTitle().equals(search)) {
			System.out.print(bk1.information());
		}
		
		sc.close();
	}
	
	
}
