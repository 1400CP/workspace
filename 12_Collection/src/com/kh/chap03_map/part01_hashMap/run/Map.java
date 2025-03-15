package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Data;

public class Map {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<>();
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고싶은 단어는? : ");
			String eng = sc.nextLine();
			
			if(eng.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			// 영문명을 통해 조회해 맞는 것이 있으면 한글(값)로 출력
			// eng값을 가져왔는데, dic 없으면 => 없는 단어 => null 값이 kor에 저장됨~!
			
			String kor = dic.get(eng);
//			System.out.println(kor);
			if(kor == null) {
				System.out.println(eng + "은/는 없는 단어입니다.");
			}else {
				System.out.println(eng + "의 뜻은 " + kor + "입니다.");
			}
			sc.close();
		}
		
		// Hash Map을 만들기 => dic
		
		
		// 데이터 3개
		// baby - 아기
		// love - 사랑
		// apple - 사과									=> Data 완성
		
		
		// while 무한 반복을 돌리면서							=> keySet으로 완성할까?
		// 사용자에게 물어보기 => 찾고싶은 단어는?					=> sca 필요?
		// 사용자 : love									=> 사용자 입력
		// love의 뜻은 사랑입니다.							=> if문
		// kiwi는 없는 단어입니다.							=> else if
		// exit는 프로그램을 종료합니다.\						=> else
		
//		HashMap<String, Data> hm = new HashMap<>();
//		hm.put("baby", new Data("아기", "사랑", "사과"));
//		hm.put("love", new Data("아기", "사랑", "사과"));
//		hm.put("apple", new Data("아기", "사랑", "사과"));
//		
//		Set<String> keySet = hm.keySet();
//		keySet.iterator();
//		Iterator<String> dt = keySet.iterator();		// dt => Data를 따서 만듦
//		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("찾고 싶은 단어는? : ");
//		String fr = sc.nextLine();						// fr = 찾고 싶은 단어
//		
//		while(dt.hasNext()) {
//			String key = dt.next();
//			Data value = (Data)hm.get(key);
//			System.out.println(key + value);
//
//		}
//		

		
		// 사용자의 질문에 맞는 출력문을 형성,
		// if문인데 HashMap에 맞는 조건이 들어가서 결과값이 출력되어야 하는데...
		// value key 맞다면이 되어야 하는데.
//		if(fr.equals(key)) {
//			System.out.println();
//		}
		
	}

}
