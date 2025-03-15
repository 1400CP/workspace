package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
		// 게시판 첨부파일 등을 위해서 알아야 한다.
		// 메모리는 휘발성임.
		// 가나다라 라고 쓰면 컴퓨터 끄면 지워짐!! => 휘발성
		// 기록하기 위해 파일이 필요함.
		
		// 간단하게 파일(file) 만들어지는 과정
		// java.io.File 클래스 가지고!
		// 여기서는 예외처리가 필수!!
		
//		File f1 = new File(); // 객체 => 기본 생성자 필요없습니다.
		
//		File f1 = new File("test.txt");
//		f1.createNewFile();		// 예외처리를 하지 않았다.
		try {
			// 1. 경로지정을 딱히 하지 않은 상태로 파일 생성 => project 폴더에 파일이 생성
			File f1 = new File("test.txt"); // 예외가 발생될 수 있는 구문을 넣어도 되고 안 넣어도 되고.
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐!
			
			// 2. 존재하는 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
//			File f3 = new File("D:\\temp\\test.txt");
//			f3.createNewFile();
			
			// 3. 폴더 먼저 만들고 파일까지 만들기
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir(); //mkdir(); 폴더가 만들어지게 하는 메소드
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			// 실행할 때마다 파일이 계속 같은 게 만들어지는가?
			// 해당 파일이 존재하면 그냥 덮어쓰기가 됨. 수정사항이 없으면 그대로.
			
			System.out.println(f1.exists()); // boolean으로 대답함.
			System.out.println(new File("ttt.txt").exists());
			
			System.out.println(f1.isFile()); // 파일인가요? boolean
			System.out.println(tempFolder.isFile()); // 폴더인가요? boolean
			
			
			// ---------------------------------------------
			
			File folder = new File("parent"); 
			folder.mkdir();							// 폴더 만들기
			
			File file = new File("parent\\person.txt"); // 경로지정
			file.createNewFile();					// 파일 만들기
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			// 상대경로도 있음.
			System.out.println("파일용량 : " + file.length()); // 아무것도 안 써있으면 0;
			System.out.println("상위폴더 : " + file.getParent());
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * 프로그램상에 데이터를 외부매개체로 출력을 한다거나 외부매개체를 통해 입력을 받아올거임!
	 * 반드시 그 외부매체와 통하는 통로를 만들어야 됨!
	 * 그게 바로 스트림!!
	 * 
	 * * 스트림(통로) 특징
	 * - 스트림 : 개울 / 한방향으로 흐름
	 * - 단방향 : 입력이면 입력 / 출력이면 출력만 가능!!
	 * 			=> 입력과 출력을 동시다발적으로 하고자 한다면? 입력용스트리 따로 열어야됨!
	 * - 선입선출(FIFO) : first in first out, 먼저 들어간 데이터가 먼저 나온다. // 통로(파이프) 같은 개념.
	 * - 시간지연 (delay) 문제가 생길 수 있음.
	 * 
	 * * 스트림의 구분
	 * > 통로의 사이즈 (1byte 짜리 / 2byte 짜리)
	 * - 1byte = 바이트스트림 : 1바이트만 왕복 사이즈. => 입력(InputStream) / 출력(OutputStream)
	 * - 2byte = 문자스트림 : 2바이트 왕복 사이즈. => 입력(Reader) / 출력(Writer)
	 * 
	 * > 외부매체 직접 연결하는 유무
	 * - 기반스트림 : 외부매체와 직접적으로 연결되는 통로(필수)
	 * - 보조스트림 : 말 그대로 보조 역할만 하는 통로(속도를 빠르게 한다거나, 그 외에 유용한 기능)
	 * 				보조스트림 단독으로는 사용 불가!! 기반 스트림은 반드시 기본적으로 있어야 함!
	 * 
	 * 우리는 외부매체를 파일로.
	 * 첨부파일 기능 구현할 때 필요한 개념.
	 */
	

}
