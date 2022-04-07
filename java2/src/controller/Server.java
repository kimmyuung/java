package controller;

import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import dto.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Server implements Initializable{
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
	    	
	    }
	    // 3. 서버종료 메소드
	    public void serverstop() {
	    	
	    }
	    @FXML
	    void server(ActionEvent event) { // 서버 실행 버튼
	    	if(btnserver.getText().equals("서버 실행")) {
	    		txtserver.appendText("서버 실행합니다.\n");
	    		btnserver.setText("서버 중지");
	    	} else { // 버튼의 텍스트가 서버 중지 이면
	    		txtserver.appendText("서버 중지합니다.\n");
	    		btnserver.setText("서버 실행");
	    	}
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtserver.setDisable(true); // 해당 fxid 사용금지
	    	
	    }
}
