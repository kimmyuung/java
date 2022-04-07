package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	// 서버에 들어오는 클라이언트의 클래스
	
	public Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		recive(); // 서버와 연결된 클라이언트 객체가 생성될때 받기 메소드
	}
	// 3. 서버로 메시지 받는 메소드
	public void recive() { // 실행조건 : 서버와 클라이언트가 연결되었을때
		// 1. 멀티스레드 [ Thread 클래스 vs Runnable 인터페이스 ]
		Runnable runnable = new Runnable() { // 익명 구현 객체
			public void run() { // 인터페이스는 추상메소드가 존재하기 때문에 구현 필수
				// 계속적으로 메시지 받는 상태
				try {
				while(true) {
					InputStream inputStream = socket.getInputStream();// 1. 입력스트림
					byte[] bytes = new byte[1000];
					inputStream.read(bytes); // 입력스트림으로 바이트 읽어오기
					String msg = new String(bytes); // 바이트열 -> 문자열 변환
					// * 서버가 받은 메시지를 현재 서버에 접속된 모든 클라이언트에게 받은 메시지 보내기
					for(Client temp : Server.clientlist) {
						temp.send(msg); // 받은 메시지를 서버에 접속된[clientlist] 모든 클라이언트들에게 전송
					}
				}
				}catch(Exception e) {System.out.println("서버처리 오류 : " + e);}
			}
		}; // 멀티스레드 구현 끝
		Server.threadpool.submit(runnable); // 해당 멀티스레드를 스레드
	}
	// 4. 서버가 메시지 보내는 메소드
	public void send(String msg) {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(msg.getBytes());
					}catch(Exception e) {}
		}
		};
	}
}
