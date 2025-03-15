package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {
	
	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상시켜주는 스트림
	 * 			기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 시킴 + 
	 * 			>> 외부 매체와 직접적으로 연결되는 스트림 아님!!
	 * 				단독사용 불가! (반드시 기반스트림과 함께)
	 */
	
	// 프로그램 -----> 파일 (출력)
	public void fileSave() {
		// FileWriter (2byte) 기반스트림 가지고 해보자 (필수)
		// 파일과 직접적으로 연결해서 2byte 단위로 출력할 수 있는 스트림
		// BufferdWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도 향상) : 기반스트림이랑 (메소드)이름이 비슷하다
		
		// BufferedWriter bw = new BufferedWriter("C_bufferd.txt"); 단독 사용 불가
		
		// 1. 기반스트림 먼저 생성.
//		FileWriter fw = new FileWriter("c_buffer.txt");
		
		// 2. 보조스트림 생성 시 기반스트림 객체를 전달하면서 생성
//		BufferedWriter bw = new BufferedWriter(fw);
		
		// 1+2.
//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter( new FileWriter("c_buffer.txt"));
//			
//			// write 메소드 이용해서 데이터 출력
//			bw.write("안녕하세요\n");
//			bw.write("반갑습니다");
//			bw.newLine(); // 추가적인 메소드 활용 가능
//			bw.write("저리가세요");
//			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌
//			// => 속도 향상에 좋다.
//			
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try~with~resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음
		// jdk 7버전 이상부터
		
		/*
		 * [표현법]
		 * try(try블럭){
		 * 
		 * } catch(예외클래스) {
		 * 
		 * }
		 * 
		 */
		
//		try(스트림 객체 생성) {
//			
//		}catch(IOException e) {
//			
//		}
		
//		try(BufferedWriter bw = new BufferedWriter(기반생성구문)) {
//			
//		}catch(IOException e) {
//			
//		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
			
		}catch(IOException e) {
			
		} // 자원 반납 구문 안 써도 됨! 자동으로 반납까지 해줍니다.
	}

	// 프로그램 <----- 파일 (입력)
	public void fileRead() {
		
		// 기반 => FileReader : 파일과 연결해서 2byte 단위로 데이터를 입력받을 수 있는 기반스트림.
		// 보조 => BufferedReader : 속도 향상 도움이 되는 보조스트림.
		
//		try(BufferedReader br = new BufferedReader(기반스트림 생성 구문)){
//			
//		}catch(IOException e) {
//			
//		}
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			// br.read(); 이건 반환형이 int. 그래서 형변환을 해야 함.
			// br.readLine(); 한 문장씩 가져오게 되어있음. 반환형 스트링!
			
//			System.out.println(br.read()); 
//			System.out.println(br.read());
//			System.out.println(br.read());
//			System.out.println(br.read()); // 파일의 끝을 만나면 null이 나온다.
			
			String value = null;
			// null과 비교할 때는 equals 안 써도 됨.
			
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
				
			
		}catch(IOException e) {
			
		}
		
	}
	
}
