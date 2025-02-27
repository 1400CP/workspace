package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {
	
	
	// 클라이언트용 프로그램
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null; // 초기화
		PrintWriter pw = null;
		
		Socket socket = null;
		
		// 요청하고자 하는 서버 ip : 192.168.20.44
		// 포트번호 : 3000
		
		int port = 3000; // 포트번호 변수를 만든 것뿐
		
		String serverIP = null;
		
		// 1) 서버에 연결 요청 보내는 구문(요청하고자 하는 서버의 ip주소와 지정된 포트번호를 제시하면서 소켓 객체 생성)
		
		// socket = new Socket(서버의 아이피주소, port);
		try {
			serverIP = "192.168.219.155";
			socket = new Socket(serverIP, port);
			// 서버가 꺼져있거나 못 찾으면 (통신실패) socket 안에 null이 담김!
			
			if(socket != null) { // 서버와 잘 연결됐을 경우
				System.out.println("서버와 연결 성공!");
				
				// 2) 서버와 입출력 기반스트림 생성
				// 3) 보조스트림을 통한 성능 개선
				
				// 연결이 되고 나면 해야 할 것. 입출력 스트림.
				// 입력용 스트림 
				// br = new BufferedReader(문자기반) => 근데 바이트스트림이 와야한다
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					// 4) 스트림을 통해 읽고 쓰기
					System.out.println("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버로부터 전달받은 메시지 : " + message);
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 5) 통신 종료
			try {
				pw.close();
				br.close();
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
