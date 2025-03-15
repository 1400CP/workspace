package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	
	
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
//		String at = "";
		str = "";
		while(stn.hasMoreTokens()) { // 반복이 수행될 조건 : 토큰이 남아있을 때만 
			str += stn.nextToken();
		}
		
		return str;
//		return at;
		
	}
	
	public String firstCap(String input){
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		
//		String input1 =input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
		return input.toUpperCase().charAt(0) + input.substring(1).toLowerCase();
//		return input1;
		
		}
	
	public int findChar(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			
			if(one == input.charAt(i)) {
				count++;
			}
		}
		return count;
		}

}
