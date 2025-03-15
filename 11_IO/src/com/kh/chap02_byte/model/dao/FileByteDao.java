package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	
	//Dao(Data Access Object)
	
	/*
	 * "바이트 기반 스트림" 가지고 데이터 입출력해보기!
	 * 
	 * - 바이트 스트림 : 데이터를 1byte 단위로 전송하는 통로(좁은 통로임... 한글 깨짐)
	 * - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로!
	 * 
	 * (File)(XXXX)InputStream : XXXX매체로부터 데이터를 입력받는 통로 (외부매체로부터 데이터 읽어오겠음!)
	 * (File)(XXXX)OutputStream : XXXX매체로 데이터를 출력하는 통로 (외부매체로부터 데이터를 보내겠다!)
	 */
	
	// 프로그램(자바 또는 메모리) -----> 외부매체(파일) (출력 : 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {
		
		// FileOutputStream : 파일과 직접적으로 연결해서 1byte 단위로 출력하는 스트림.
		
		// 1. 스트림 생성(통로만들기)
		// 2. 스트림으로 데이터를 출력(메소드 활용)
		// 3. 다 사용한 후 스트림 반납 (반드시 반납을 해야 한다.)
		
		
		FileOutputStream fout = null; // 초기화 => 어디서든지 사용할 수 있는 메소드가 된다.
		try {
			// 1. FileOutputStream 객체 생성. => 해당 파일과의 연결 통로가 만들어짐! 
//			FileOutputStream fout = new FileOutputStream("a_byte.txt"); // 객체 생성은 무조건 new 로 시작합니다.
			// 해당 파일이 없으면 새로 만들어서 통로를 만들어준다.	
			// 있으면 통로 연결.
			fout = new FileOutputStream("a_byte.txt");
			
			
			// 2. 파일에 데이터를 출력하고 할 때 write 메소드 사용
			//		숫자를 출력하든 문자를 출력하든 실상 파일에 기록되는 건 문자로 기록됨(아스키코드)
			//		숫자(0~127)
			
			fout.write(97); // 'a'가 저장된다.
			// 두번째 오류를 클릭하면 다중 catch문을 형성해준다.
			fout.write('b'); // 'b'가 저장된다.
//			fout.write('헐'); // 한글은 2byte여서 깨진다 => 바이트스트림으로는 제한이 있다.
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); // cde 문자가 저장된다.
			
			// write(byte[] b, int off, int len) : byte 배열의 off 번째 인덱스부터 len 개수만큼 출력
			fout.write(arr, 1, 2);// de문자가 저장될 것. (추가됐네.)
			
			// 3. 스트림 다 이용했으면 반납하기! (반드시 실행해야 한다!)
//			fout.close();
			// 위에서 write() 메소드 등 IOException 발생했을 경우 => catch 블럭 실행 후 빠져나갈 것. (반납하는 코드 실행 안 됨!)
			// 반드시 실행해야만 하는 구문이기 때문에 finally{}에 기술
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 이 안에 작성된 코드는 예외가 발생했던 간에 마지막에 무조건 실행한다.
			try {
				// 3. 스트림 다 이용했으면 반납하기! (반드시 실행해야 한다!)
				fout.close(); // try~catch문으로 한번 더 해야 한다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// a_byte.txt에 내용 ab가 적혀서 나온다.
				
	}
	
	//프로그램 <----- 파일 (입력 : 파일로부터 데이터 가죠오기)
	public void fileRead() {
		
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		
		// 1. 스트림 생성 (통로 만들기)
		// 2. 스트림 통해서 입력받아옴 (메소드 활용)
		// 3. 사용이 끝난 스트림 반납
		
		
		FileInputStream fin = null; // 선언
		try {
			// 1. FileInputStream 객체 생성 => 해당 파일과 연결 통로 만들어짐
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 파일로부터 데이터 읽어들이고자 할 때 read 메소드 사용
			//		1byte 단위로 하나씩 읽어옴 / 반환형이 int여서 숫자로 읽어들임.
			
			
			
			/* 반복문 수행시 매번 read()가 두번씩 실행되기 때문에 건너 읽는다.
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/
			
			// read() 호출 반복문 수행시에만 실행되도록
			// 해결방법1. 무한반복 돌리면서 매번 조건검사
//			while(true) {
//				int value = fin.read();
//				if(value == -1) {
//					break;
//				}
//				System.out.println(value);
//			}
			
			
			// 해결방법2. 권장방법
			int value = 0; // 초기화
			while((value = fin.read()) != -1) {
				System.out.println(value);
			}
			
			
//			System.out.println(fin.read()); 
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			
//			System.out.println(fin.read()); // 파일의 끝을 만나는 순간 -1을 받아오는 것을 확인!
//			System.out.println(fin.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 다 사용한 스트림 반납
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}
