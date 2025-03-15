package com.kh.run;

public class BubleSortRun {
	
	public static void main(String[] args) {
		
		int[] arr = {22,90,30,68,87,1,13};		// 오름차순으로 정렬
		/*
		22 -> 90 => x
		90 -> 30 => 90은 임시 공간 이동. 30이 이동.
					=> 여러번 반복해야 함.
		*/
		int temp = 0;							// 임시 공간 생성
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[j-1] > arr[j]) {			// 앞 자료와 비교해서 자리 교환. (j-1 > j 일 경우)
					temp = arr[j-1];			// j-1 자료를 임시 공간으로 보냄. (임시보관소에 j - 큰 숫자 보관)
					arr[j-1] = arr[j];			// j를 j-1로 보냄. (더 작은 숫자를 앞자리에 넣기)
					arr[j] = temp;				// j-1 자료를 임시 공간의 뒷자리로(j의 자리) 다시 보냄.
				}
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	

}
