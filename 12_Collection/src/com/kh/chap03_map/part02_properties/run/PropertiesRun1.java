package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
	
	public static void main (String[] args) {
		
		// Properties : Map 계열의 컬렉션 => 키 + 벨류 세트로 저장
		// HashMap과의 차이점 : Properties에는 키값도 String, 벨류값도 String으로 담는다.
		
		Properties prop = new Properties();
		
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		
		// 하지만 Properties 사용하는 경우는 주로 Properties에 담긴 것들을 파일로 출력 또는 입력받아 올때 사용함!
		// Properties에서 제공하는 store(), load() 메소드를 사용하기 위해서
		
		try {
			prop.store(new FileOutputStream("test.properties"), "proerties Test");
			// ClassCastException
			// 내부적으로 store 메소드 실행시 Properties에 담겨있는 키 + 벨류 String으로 형변환해서 출력함.
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 기반스트림을 만드는 것임. (멀티캡쳐 클릭 후 처리하면 됨.)
		*/
		
		// 파일 입출력하고 싶으면 다른 메소드를 사용해야 함!!
		
		// 1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 순서 유지 안 됨. (Map이니까)
		// 저장 순서 유지 안 됨.
		// key 갑 중복시 덮어씌워짐.
		
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("ssss"));
		// 존재하지 않는 키값 제시시 null
		
		try {
			// 3. store(OutputStream os, Stream comment) : Properties에 담겨있는 key - value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			
			// 4. xml 확장자로 만들 때!
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
