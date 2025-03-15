package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		
		
		Properties prop = new Properties(); // [] => 비어있음
		
		// 5. load(InputStream is) => 2번째 서라운드 catch로 할 것.
		try {
			
			//prop.load(new FileInputStream("test.properties")); // load 함
			
		// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop); // load 후 채워짐.
		
		
		/*
		 * * .properties 를 사용하는 이유
		 * 		프로그램상에 필요한 기본 환경설정관련한 문구를 기술하는 경우
		 * 		=> 모두 문자열로 이루어져 있기 때문에 개발자가 아니라 일반인 관리자가 해당 문서를 파악해서 수정하기 쉽다!!
		 * 	
		 * 		*.xml 파일의 특징
		 * 		프로그래밍 언어들간에 있어서 호환이 쉽다!!
		 */
		
		// 먼저 List를 알아야 한다.
		// properties는 알아두면 좋다. (파일 만들기, 입력. 출력)

	}

}
