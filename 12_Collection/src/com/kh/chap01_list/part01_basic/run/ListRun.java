package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class ListRun {
	
	/*
	 * * 컬렉션이란?
	 * 		자료구조 개념이 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
	 * 
	 * - 자료구조 : 방대한 데이터 보다 효율적으로 관리(조회, 정렬, 추가, 수정, 삭제)할 수 있도록 도와주는 개념
	 * - 프레임워크 : 만들어져있는 틀(뼈대) => 그냥 가져다 쓰면 됨
	 * 
	 * * 배열의 단점과 컬렉션의 장점
	 * > 배열의 단점
	 * 1. 배열은 우선 크기 지정을 해야 함! 한번 지정된 크기를 변경할 수 없음!
	 * 		새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들고 기존 것을 복사하는 코드를 직접 기술해야 함.
	 * 2. 배열 중간 위치에 추가한다거나 삭제하는 경우 값을 매번 땡겨주는 복잡한 알고리즘을 직접 기술해야 됨...
	 * 3. 한 공간에 한 타입의 데이터들만 저장 가능함.
	 * 
	 * > 컬렉션의 장점
	 * 1. 크기 지정해줄 필요없음. 만일 지정했다고 해도 더 많은 데이터들이 들어오면 사이즈를 늘려줌
	 * 		크기의 제약이 없음.
	 * 2. 중간에 값을 추가한다거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요없음!
	 * 		단지 메소드 호출만으로 알아서 내부적으로 진행됨
	 * 3. 한 공간에 여러 타입의 데이터 저장 가능.
	 * 
	 * * 방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용한다.
	 * 		방대한 데이터들을 보관, 추가, 삭제 등 이런 과정들이 빈번할 경우 컬렉션을 많이 사용한다.
	 * 
	 */
	
	public static void main (String[] args) {
		
		// 별도로 제네릭 설정을 하지 않으면 ArrayList<Object>로 설정이 된다.
		ArrayList list = new ArrayList(3); // 객체 생성 , 너무 개방해서 경고중인 겁니다.
		// 크기 지정을 해도 되고 안 해도 되고.
		// 기본 크기는 10개입니다.
		System.out.println(list); // [] : 안에 아무것도 없다는 뜻. 비어있다
		
		// E -> Element : 리스트에 담길 데이터들 (요소)
		
		// 1. add(E e) : 리스트 공간 "끝"에 전달될 데이터를 추가시켜주는 메소드
//		list.add(음악데이터 추가)
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코")); // 뉴진스 뒤에 새삥이 추가됐다.
		list.add(new Music("죽일놈", "다이나믹듀오"));
		list.add("가보자고"); // 때려박기 가능.
		
		// 지정된 크기보다 더 많이 넣어도 오류x => 장점1 : 크기 제약x
		// 다양한 타입의 데이터 담을 수 있음 => 장점3 : 여러 타입 보관 가능
		
		System.out.println(list); // list 특징 : 순서 유지하면서 담김 (0번 인덱스부터 하나 둘)
		
		// 오버로딩
		// 2. add(int index, E e) : 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터를 추가시키주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		System.out.println(list);
		
		// 중간 위치에 데이터 추가시 복잡한 알고리즘 직접 구현 안함 => 장점2
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터 삭제시켜주는 메소드
		list.remove(1);
		
		System.out.println(list);
		
		// 4. set(int index, E e) : 해당 인덱스 위치의 데이터를 새로이 전달된 e로 수정시켜주는 메소드
		list.set(0, new Music("nextLevel", "에스파"));
		
		System.out.println(list);
		
		// 5. size() : 해당 리스트의 사이즈를 반환시켜주는 메소드 ==> 중요해!!!!!!
		// ** 즉, 몇개의 데이터가 담겨있는지 확인시켜줌
		System.out.println("리스트의 사이즈 : " + list.size());
		// 리스트에 몇 개가 들어가 있어? 담겨있어?
		
		// 6. get(int index) : 해당 위치의 인덱스 위치의 객체를 반환해주는 메소드
		Music m = (Music)list.get(0);
		String s = (String)list.get(3);

		System.out.println(m);
		System.out.println(s);
		System.out.println(list.get(1));
		System.out.println(((Music)list.get(1)).getTitle());
		// 형변환을 잘 해야 원하는 것을 얻을 수 있다.
		// Object 타입으로 반환하기 때문에 강제형변환 해줘야 한다!
		
		// 7. subList(int index1, int index2) : List => 추출해서 새로운 List 반환 : substring 같은 것...
		List sub = list.subList(0, 2);
		
		System.out.println(sub);
		
		// 8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list);
		
		// 9. isEmpty() : boolean => 컬렉션이 비어있는지 묻는 메소드
		System.out.println(list.isEmpty());
		
		// 10. clear() : 리스트 안의 내용을 다 비우는 메소드
		/*
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		*/
		
		
		// 반복문을 통해 순차적으로 출력
		
		System.out.println("=======================");
		
		// 1) for loop문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=======================");
		
		// 2) 향상된 for문, for each문
//		for(: 배열명, 컬렉션명) {
//		for(자료형 : list) {	
		for(Object o : list) { // o=list.get(0) => list.get(1) => (2) => (3) ...
			System.out.println(o);
		}
		
	}

}
