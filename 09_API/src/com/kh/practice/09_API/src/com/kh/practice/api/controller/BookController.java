package com.kh.practice.api.controller;

import com.kh.practice.api.model.vo.Book;

public class BookController {
	
	// private 접근제한자로 크기 6의 Book 객체 배열 생성 
	private String newTitle;
	private String newAuthor;
	private String newPublisher;
	private String newDate;
	private String newPrice;

	
	public BookController() {}
	

	
	public void printAll() {
		
		// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
		// 1. 도서 전체 출력 기능 메소드 
		
		Book[] bks = new Book[5];
		bks[0] = new Book(newTitle, newAuthor, newPublisher, null, 0)
		bks[1] = new Bo
		
		
		
		
		int total = 0;
		for(int i=0; i<bks.length, i++) {
			System.out.println();
		}
		
	}
	
	
	
	public void String(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		
	}
	
	public void printBookPublisherDate() {
		
		
	}
	
	public void serchBook(String searchTitle) {
		
		
		
	}
	
	

}
