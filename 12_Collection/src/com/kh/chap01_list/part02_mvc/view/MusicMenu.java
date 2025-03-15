package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicMenu {
	
	// 전역변수 == 필드부
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
		
	
	// 메인화면 : 프로그램 실행 시 처음 보여주는 화면이다.
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n======Welcome 별밤======");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				insertMusic();
				break;
			case 2 :
				selectMusic();
				break;
			case 3 :
				deleteMusic();
				break;
			case 4 : 
				searchMusic();
				break;
			case 5 : 
				updateMusic();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
				return;
			default :
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해 주세요.");
			}
			
		}
		
	}

	
	//alt + shift + j
	/**
	 * 1. 새로운 곡 추가하는 서브 화면
	 */
	public void insertMusic() {
		
		System.out.println("\n======= 새로운 곡 추가 =======");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		// 메소드 호출!!!
		mc.insertMusic(title, artist);
		
	}
	
	/**
	 * 2. (아마도) 특정곡 조회하는 서브 화면
	 */
	public void selectMusic() {
		System.out.println("\n======= 전체 곡 리스트 =======");
		
		// 메소드 호출!!!
		ArrayList<Music> list = mc.selectMusic();
		
		/* 리스트가 비어있을 때는 이 for문이 작동 안 한다.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		if(list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
	}
	
	/**
	 * 3. 특정곡 삭제시켜주는 서브 화면
	 */
	public void deleteMusic() {
		System.out.println("\n======= 특정곡 삭제 =======");
		
		System.out.print("삭제하고자 하는 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result == 1) { // result == 1 성공!
			System.out.println("성공적으로 삭제됐습니다");
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다");
		}
		
	}
	
	/**
	 * 4. 특정곡 검색해주는 서브 화면
	 */
	public void searchMusic() {
		System.out.println("\n======= 특정곡 검색 =======");
		
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		System.out.println(">> 메뉴 선택 : ");
		
		int menu = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("검색 키워드 : ");
		String keyword = sc.nextLine();
			
			ArrayList<Music> sl = mc.searchMusic(keyword);
						
			if(sl.isEmpty()) {
				System.out.println("검색된 결과가 없습니다");
			}else {
				for(int i=0; i<sl.size(); i++) {
					System.out.println(sl.get(i));
				}
			}
		
	}
		// 1. 간단버전
		/*
		System.out.print("검색할 곡명(키워드만도 가능) : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword); // [] | 뭐라도 있거나
		*/
		
		// 2. 심화버전
//		System.out.println("1) 제목으로 검색");
//		System.out.println("2) 가수명으로 검색");
//		System.out.println(">> 메뉴 선택 : ");
//		
//		int menu = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("검색 키워드 : ");
//		String keyword = sc.nextLine();
		
		//~~~~
		
//		System.out.println("검색 키워드 : ");
//		String keyword = sc.nextLine();
//		
//		
//		if(searchList.isEmpty()) {
//			System.out.println("검색된 결과가 없습니다");
//		}else {
//			for(int i=0; i<searchList.size(); i++) {
//				System.out.println(searchList.get(i));
//			}
//		}
			
	/**5. 특정곡 수정해주는 서브 화면
	 * 
	 */
	public void updateMusic() {
		System.out.print("수정하고자 하는 곡명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(가수) : ");
		String upArtist = sc.nextLine();
		
		System.out.print("수정 내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("성공적으로 수정되었습니다.");
		}else {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}
	}

}
