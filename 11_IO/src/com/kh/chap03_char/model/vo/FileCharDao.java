package com.kh.chap03_char.model.vo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	/*
	 * "문자 기반 스트림"을 가지고 입출력 해보기!
	 * - 문자스트림 : 데이터를 2byte 단위로 전송하는 통로. (넓다.)
	 * - 기반스트림 : 외부 매체와 직접적으로 연결되는 통로.
	 * 
	 * - (XXX)Reader : 입력용 스트림
	 * - (XXX)Writer : 출력용 스트림
	 */
	
	// 프로그램 -----> 파일 (출력)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2byte 단위로 출력할 수 있는 스트림
		
		FileWriter fw = null; // 초기화만
		
		// 1. FileWriter 객체 생성
		try {
			fw = new FileWriter("b_char.txt", true);
			// 해당 파일이 없으면 새로 만들고 연결
			// 있으면 그냥 연결
			
			/*
			 * true 미작성시 => 해당 파일이 존재할 경우 기존의 데이터 덮어씌워짐.
			 * 기존값 false
			 * true 작성시 => 해당 파일이 존재할 경우 기존의 데이터에 이어서 작성.
			 */
			
			// 2. write 메소드 이용해서 데이터 출력
			//		2byte단위로 데이터 전송
			fw.write("와! IO 재밌다... ㅎ"); // 실제로는 해당 문자열이 한글자씩 전송되는 개념
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. 스트림 반납
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}
	
	// 프로그램 <------ 파일 (입력 : 파일로부터 자료를 받음)
	public void fileRead() {
		// FileReader : 파일로부터 데이터를 2byte 단위로 입력받을 수 있는 스트림
		
		FileReader fr = null;
		
		// 1. FileReader 객체 생성
		try {
			fr = new FileReader("b_char.txt");
		
			// 2. read 메소드를 통해서
			// 파일의 끝을 불러보자
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		 
	}

}
