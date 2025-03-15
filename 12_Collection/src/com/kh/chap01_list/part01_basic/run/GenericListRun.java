package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {
		
		// <Music> 으로 제네릭 설정
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
//		list.add("가보자고"); // 뮤직만 들어올 수 있게 해놔서 에러가 뜬다.
		// 다른 타입 담기 불가.
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		// list.add(2, "가보자고"); // 불가능
		System.out.println(list);
		
		list.subList(0, 2); // 반환이 List<Music> 이다.
		
//		list.addAll(sub);
		
		Music m = list.get(0);
		System.out.println(m);
		
		System.out.println(list.get(0).getTitle());
		
//		for(자료형 변수명 : list) { // 제네릭에서는 일반과 달리 Object가 아니다.
		for(Music o : list) {
			System.out.println(o);
		}

	}
	
	/*
	 * <제네릭>을 사용하는 이유
	 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있다.
	 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 매번 형변환하는 절차를 없애기 위해
	 */
	// 별도로 제네릭 설정을 하지 않으면 ArrayList<Object>로 설정이 된다.
}
