package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

// BookManager 인터페이스 구현
public class BookController implements BookManager  {
	
// public ArrayList<Book> list = new ArrayList<>();
	private ArrayList<Book> bList = new ArrayList<>(); // addBook 이라는 메소드를 통해서 bList 채우기

	
	
	@Override
	public void addBook(Book nBook) {
		boolean find = true;
		
		for(Book b : bList) {
			if(b.getbNo().equals(nBook.getbNo())) {
				System.out.println("도서명 : " + nBook.getTitle() + "도서는 이미 소장하고 있는 책입니다.");
				find = false;
				break;
			}
		}
		
		if(find == true) {
			bList.add(nBook);
			System.out.println("도서명 : " + nBook.getTitle() + "도서가 성공적으로 추가됐습니다.");
		}
//		bList.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}
	
	
	@Override
	public Book searchBookBybNo(String bNo) {  // 무조권 한권이 있거나 0권이 있거나
		
		Book search = new Book();
		for(Book b : bList) {
			if(b.getbNo().equals(bNo)) {
				search = b;
			}
		}
		
		return null;
	}
//		Book b = null; 
//		
//		for(Book sb : bList) {
//			if(sb.getbNo().equals(bNo)) {
//				b = sb;
//			}
//		}
//	
//		for(int i=0; i <list.size(); i++) {
//			if(list.get(i).getbNo().equals(bNo)) {
//				b = list.get(i);
//			}
//		}
	
	
	@Override
	public ArrayList<Book> searchBookByTitle(String title) { // 여러권이 있을 가능성
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getTitle().contains(title)) {
				searchList.add(b);
			}
		}
		
		return searchList;
	}	
//		for(Book b : bList) {
//			if(b.getTitle().contains(title)) {
//				TitleList.add(b);
//			}
//		}
		
		
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getTitle().contains(title)) {
//				TitleList.add(list.get(i));
//			}
//		}
		
		
	
	@Override
	public ArrayList<Book> onlySearchBook() { // 여러 권이 있을 가능성 = ArrayList
		ArrayList<Book> bookList = new ArrayList<>(); // []
		
		for(Book b : bList) { // Book 객체 b
			if(b instanceof Magazine == false) { // instanceof => 검증해주는 메소드.
				continue; // 건너뛰기, Magazine은 건너뛰기!!!
			}else {
				bookList.add(b);
			}
		}
		return bookList;
		
	}
	
	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> magazineList = new ArrayList<>(); // []
		
		for(Book b : bList) { // Book 객체 b
			if(b instanceof Magazine) { // Magazine 넣기
				magazineList.add(b);
			}
		}
		
		return magazineList;
	}
	
	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> mList = new ArrayList<>();
		
		for(Book b : bList) {
			if(b instanceof Magazine) { // 잡지만 나옴
				if(((Magazine)b).getYear() == year) {
					mList.add(b);
				}
			}
		}
		
		return mList;
	}
		
//		for(int i=0; i<onlySearchMagazine().size(); i++) {
//		
//			if(((Magazine)(onlySearchMagazine().get(i))).getYear() == year) {
//				yearList.add(onlySearchMagazine().get(i));
//			}
//			
//		}
		
//		for(Book b : onlySearchMagazine()) {
//			
//			if(((Magazine)(b)).getYear() == year) {
//				yearList.add(b);
//			}
//			
//		}
	
	
	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
		ArrayList<Book> publishList = new ArrayList<>();
		
		for(Book b : bList) {
			
			if(b.getPublisher().contains(publisher)) {
				publishList.add(b);
			}
			
		}
		
		return publishList;
		
	}
	
	@Override
	public ArrayList<Book> searchBookByPrice(int price) { // 여러권 가능성 있음
		ArrayList<Book> pList = new ArrayList<>();
		
		for(Book b : bList) {
			if(b.getPrice() < price) {
				pList.add(b);
			}
		}
		
		return pList; // [] | 뭐라도 담겨있거나
	}
		
//		for(Book b : bList) {
//			
//			if(b.getPrice() < price) {
//				priceList.add(b);
//			}
//			
//		}
	
	
	@Override
	public int getTotalPrice() {
		
		int total = 0;
		
		for(Book b : bList) {
			total += b.getPrice();
		}
		
		return total;
		
	}
	
	
	@Override
	public int getAvgPrice() {
		return getTotalPrice() / bList.size(); // (int / int)
		
	}

}
