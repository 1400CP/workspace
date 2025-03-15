package com.kh.chap01_oneVSmany.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
	
	public static void main (String[] args) {
		
		// ArrayList를 활용해서 똑같이 짜보기!!!
		
		// 전체 도서 정보들 조회하기
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Book> bk = new ArrayList<Book>();
				
		
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
			
			bk.add(new Book(title, author, price, publisher));
		}
		
		// 전체 도서 정보들 조회
		for(int i=0; i<bk.size(); i++) {
			System.out.println(bk.get(i).information());
		}
		
		// 도서 제목으로 검색하는 서비스
		System.out.println("검색할 책 제목 : ");
		String title = sc.nextLine();
		
		for(int i=0; i<bk.size(); i++) {
			if((bk.get(i)).getTitle().equals(title)) {
				System.out.println(bk.get(i).information());
			}
		}
		
			
		
		/*
		Scanner sc = new Scanner(System.in);
		// 객체 배열 활용해서 해보기!!
		// 세권의 Book 객체를 관리한다면?
		Book[] books = new Book[3];
				
		
		// 세개의 도서에 대한 정보를 반복적으로 입력받아 각 인덱스에 객체 생성
		for(int i=0; i<books.length; i++) {
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
			
			
			books[0] = new Book(title, author, price, publisher);
			books[1] = new Book(title, author, price, publisher);
			books[2] = new Book(title, author, price, publisher);
			
			
			// 각각의 인덱스에 차곡차곡 객체 생성
			books[i] = new Book(title, author, price, publisher);	// 객체 생성중!!
			
		}
		
		// 객체 생성 끝
		
		// 전체 도서 정보들 조회하기 => 반복문 활용 가능
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색하는 서비스
		
		System.out.println("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
		*/
	
	}
	
}
