package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		// Object equals() => 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false
		// Object hashCode() => 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		
		// String equals() => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true / 일치하지 않으면 false를 반환
		// String hashCode() => "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환
		
		HashSet<String> hs1 = new HashSet<>(); // 버전이 업그레이드 되면서 <> 안에 안 써도 된다.
		
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add("여러분.");
		hs1.add("안녕하세요.");
		hs1.add(new String("여러분."));
		
		System.out.println(hs1); // 저장 순서 유지 안 됨. (인덱스 개념 없음!)
		// 중복된 데이터 보관 불가능
		// 기본적으로 equals 비교를 한다. => 중복된 파일을 발견하면 보관이 불가능하다.
		
		HashSet<Student> hs2 = new HashSet<>();
		// 존잘월드에 3명이 산다고 가정
		
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("이제훈", 30, 95));
		hs2.add(new Student("공유", 43, 100));	// 주소값이 새것이기 때문에 equals 로는 같다고 판단하지 않는다.
		
		System.out.println(hs2); // 저장 순서 유지 안 됨!! (인덱스 개념 없음) / 중복 제거 안 됨 => 왜? 동일객체로 판단이 안 되고 있어서...
		
		// HashSet 이라는 공간에 객체가 추가가 될 때마다 동일객체인지 비교!
		// 동일 객체 : equals() 비교시 true 일경우, 각 객체마다 hashCode() 호출 결과가 일치
		
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
							// this					vs					other
		
		
		
		
		// hs.get (인덱스);
		// 인덱스 개념도 없고, get메소드 자체가 정의되어있지 않음!! (한 객체만 뽑아올 수 없음!)
		
		System.out.println("========================================");
		// HashSet에 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능 (단, 향상된 for문만)
		
		for(Student s : hs2) { // s
			System.out.println(s);
		}
		
		System.out.println("========================================");
		// 2. ArrayList에 담아둔 다음 ArrayList 반복문 돌려가며 접근
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hs2);
		
		// ArrayList 생성과 동시에 통째로 추가하기
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// 왜 쓰는 걸까?
		// 중복된 데이터가 들어오면 절대 안 되는 경우
		// => 근데 거의 안 쓰인다.
		
		System.out.println("========================================");
		// 3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		it.next(); // NoSuchElementException => 더이상 뽑을 요소가 없다
		
		
		
	}

}
