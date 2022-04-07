package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Chatting implements Initializable{
	 @FXML
	    private Button btnconnect;

	    @FXML
	    private TextArea txtcontent;

	    @FXML
	    private Button btnsend;

	    @FXML
	    private TextField txtmsg;

	    @FXML
	    private TextField txtip;

	    @FXML
	    private TextField txtname;

	    @FXML
	    private TextField txtport;
	    Socket socket; // 1. 클라이언트 소켓 선언
	    // 2. 클라이언트 실행 메소드
	    public void clientstart() {
	    	// 멀티스레드
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				socket = new Socket("127.0.0.1", 1234);
	    				send(Login.member.getMid() + "님 입장하셨습니다.\n");
	    				receive();
	    			} catch(Exception e) {System.out.println(e);}
	    		}; 
	    	};
	    	thread.start(); // 멀티스레드 실행
	    }
	    // 3. 클라이언트 종료 메소드
	    public void clientstop() {
	    	try {socket.close();} catch(Exception e) {}
	    }
	    // 4. 서버에게 메시지 보내기 메소드
	    public void send(String msg) {
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				OutputStream outputStream = socket.getOutputStream();
	    				outputStream.write(msg.getBytes());
	    				outputStream.flush(); // 스트림 초기화(바이트 지우기)
	    			} catch(Exception e) {System.out.println(e);}
	    		}
	    	};
	    	thread.start();
	    }
	    // 5. 서버에게 메시지 받기 메소드
	    public void receive() {
	    	try {
	    	while(true) {
	    	InputStream inputStream = socket.getInputStream();
	    	byte[] bytes = new byte[1000];
	    	inputStream.read(bytes);
	    	String msg = new String(bytes);
	    	txtcontent.appendText(msg); // 입력받은 내용을 채팅창에 추가하기
	    	}
	    	} catch(Exception e) {System.out.println(e);}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("채팅방 입장")) {
	    		// 만약에 버튼의 텍스트가 채팅방 입장이라면 
	    		// 클라이언트 실행 메소드
	    		txtcontent.appendText(" ---------- 채팅방 입장 ---------- \n");
	    		btnconnect.setText("채팅방 나가기");
	    		txtmsg.setText("");
		    	txtmsg.setEditable(true); // 수정 금지 상태
		    	txtcontent.setEditable(true); // 채팅창 목록 사용금지
		    	btnsend.setDisable(false); // 전송버튼 사용 금지 
		    	txtmsg.requestFocus(); //  
	    	}
	    	else {
	    		// 클라이언트 종료 메소드
	    		txtcontent.appendText(" ---------- 채팅방 퇴장 ---------- \n");
	    		btnconnect.setText("채팅방 입장");
	    		txtmsg.setText("채팅방 입장후 사용 가능");
		    	txtmsg.setEditable(false); // 수정 가능
		    	txtcontent.setEditable(false); // 채팅창 목록 사용금지
		    	btnsend.setDisable(false); // 전송버튼 사용 금지 
		    	txtmsg.requestFocus(); // 
	    	}
	    }

	    @FXML
	    void send(ActionEvent event) {
	    	String msg = txtmsg.getText() + "\n"; // 보낼 메시지
	    	send(msg);
	    	txtmsg.setText(""); // 보내기 후 메세지 입력창 지우기
	    	txtmsg.requestFocus(); // 보내기 후 메시지 입력창으로 포커스(커서) 이동
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtmsg.setText("채팅방 입장후 사용 가능");
	    	txtmsg.setEditable(false); // 수정 금지 상태
	    	txtcontent.setEditable(false); // 채팅창 목록 사용금지
	    	btnsend.setDisable(false); // 전송버튼 사용 금지 
	    	txtmsg.requestFocus(); //  
	    }

}
