package com.kh.practice.api.controller;

import com.kh.practice.api.model.vo.Book;

public class BookController {
	
	// private 접근제한자로 크기 6의 Book 객체 배열 생성 
	private String newTitle;
	private String newAuthor;
	private String newPublisher;
	private String newDate;
	private String newPrice;
	// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
	
	public BookController() {}
	

	// 1. 도서 전체 출력 기능 메소드 
	public void printAll() {
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오. 
		   
		// 1) for loop문 방법 
		   
		// 2) for each문 방법 (향상된 for문) 
		
		
		Book[] bks = new Book[5];
		bks[0] = new Book(newTitle, newAuthor, newPublisher, null, 0)
		bks[1] = new Bo
		
		
		
		
		int total = 0;
		for(int i=0; i<bks.length, i++) {
			System.out.println();
		}
		
	}
	
	
	// 2. 도서 추가 기능 메소드
	public void String(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업 (int price라는 변수에 담으시오)
		// "20000" -->  20000
		
		  // 2. 매개변수로 전달받은 newDate값   ==>       String --> Date로 변환 작업  (Date publishDate에 담으시오) 
		  //   '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용 
		   
		   
		  // 1) StringTokenizer를 이용한 방법 
		 
		  //  1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리("2020", "07", "01") 
		    
		  //  1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기 
		    
		  //  1_3) year, month, date 가지고 Date객체 생성하기 
		   
		   
		  // 2) split 메소드를 이용한 방법 
		   
		  // 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기 
		   
		  // 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서 int 변수들에 담기 
		   
		  // 2_3) year, month, date 가지고 Date객체 생성하기 
		     
		 
		  // 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고 
		  // Book클래스의 매개변수 생성자를 통해 생성 
		 
		
	}
	
	
	// 3. 도서 출간일 출력 기능 메소드 
	public void printBookPublisherDate() {
		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력 
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력 
		// SimpleDateFormat을 이용하여 출력
		
	}
	
	// 4. 도서 검색 기능 메소드
	public void serchBook(String searchTitle) {
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용) 
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력   
		   
		// 1) for loop문 방법 
		   
		// 2) for each문 방법 (향상된 for문) 
	
		
	}
	
	

}
