package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {
	
	public static void main (String[] args) {
		
		Phone[] arr = new Phone[3];
		
		// --------------1번째 문제의 조치내용-------------
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		// 1. 조치 취하기
		
		// for(int i=0; i<=arr.length; i++) {
		// 2. 조치 취하기
		for(int i=0; i<arr.length; i++) {	
			System.out.println(arr[i].getName());
		}
		
		// 잘못된 부분
		// 1. NullPointerException : 객체의 각 인덱스에 담긴 값이 null인 상태에서 메소드를 호출하려 했기 떄문이다.
									// 조치내용 => 객체배열 만든 후 각 인덱스 별로 객체 생성을 진행
		// 2. ArrayIndexOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어났기 때문이다.
											// 조건식으로 i<=배열의 길이라고 제시되어있음.
											// 배열의 마지막 인덱스보다 큰값이 제시되어있음.
									// 조치내용 => 조건식 수정 (i<배열의 길이)
		
	}

}
