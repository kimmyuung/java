package controller;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dto.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Server implements Initializable {
	 @FXML
	    private TextArea txtserver;

	    @FXML
	    private Button btnserver;

	    // * 서버에 연결된 클라이언트 저장하는 리스트
	    public static Vector<Client> clientlist = new Vector<>();
	    // 동기화 : 여러 스레드가 하나의 메소드 접근시에 대기 상태 만들기
	    // * 멀티스레드를 관리해주는 스레드풀 사용
	    public static ExecutorService threadpool;
	    	// ExecutorService : 스레드풀 지원 인터페이스
	    
	    // 스레드풀 : 스레드의 과부하 방지 위해 사용
	    // 서로 다른 스레드의 요청을 처리하기 위해 작업큐를 만듦.
	    // (요청 순으로 스레드들을 대기상태로 만듦) 선입선출로 작업 처리
	    // 채팅 : 사용자간의 채팅 X, 사용자와 서버간 채팅 O
	    // 채팅 : 유저가 메세지 보냄 -> 서버에 기록 -> 서버에서 저장된것 다시 채팅방유저들에게 보냄
	    
	    // 1. 서버소켓 선언
	    ServerSocket serverSocket;
	    // 2. 서버실행 메소드
	    public void serverstart() {
	    	try {
	    	// 1. 서버 소켓 메모리할당
	    	serverSocket = new ServerSocket();
	    	// 2. 서버 소켓 바인딩 [ip와 port 설정]
	    	serverSocket.bind(new InetSocketAddress("127.0.0.1",1234) );
	    	
	    	}catch(Exception e) {}
	    	// 3. 클라이언트의 요청 대기 [ 멀티스레드 사용이유 : 클라이언트 연결, 보내기, 받기 ]
	    	Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
					while(true) {
						Socket socket = serverSocket.accept(); // 1. 요청 수락후에 수락된 소켓을 저장
						clientlist.add(new Client(socket)); // 2. 연결된 클라이언트(연결된 소켓) 생성후에 리스트에 저장
					}
				} catch(Exception e) {}
			}
	    	}; // 멀티스레드 구현 끝
	    	threadpool = Executors.newCachedThreadPool(); // 스레드풀에 메모리 초기화[할당]
	    	threadpool.submit(runnable); // 위에서 구현된 멀티스레드를 스레드풀에 넣어주기
	    }
	    // 3. 서버종료 메소드
	    public void serverstop() throws IOException {
	    	for(Client temp : clientlist) {
	    		temp.socket.close();
	    	}
	    	serverSocket.close();
	    	threadpool.shutdown();
	    }
	    @FXML
	    void server(ActionEvent event) throws Exception { // 서버 실행 버튼
	    	if(btnserver.getText().equals("서버 실행")) {
	    		serverstart();
	    		txtserver.appendText("서버 실행합니다.\n");
	    		btnserver.setText("서버 중지");
	    	} else { // 버튼의 텍스트가 서버 중지 이면
	    		serverstop();
	    		txtserver.appendText("서버 중지합니다.\n");
	    		btnserver.setText("서버 실행");
	    	}
	    }
	    @Override
	    	public void initialize(URL arg0, ResourceBundle arg1) {
	    		// TODO Auto-generated method stub
	    		
	    	}	 
	    	
	    	
	    	    
} // ce