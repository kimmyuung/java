package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.login.Login;
import dao.RoomDao;
import dto.Room;
import dto.Roomlive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
	    private TableView<Room> roomtable;

	    @FXML
	    private Button btnadd;

	    @FXML
	    private TextField txtroomname;

	    @FXML
	    private TextArea txtmidlist;

	    @FXML
	    private Label lblselect;
	    // 서버 소켓 생성 [ 모든 메소드에서 사용 ]
	    public Server server;
	    public static Room selectroom; // 테이블뷰에서 선택된 방객체
	    
	    public void show() { // 사용되는 곳 [ initialize, add 메소드 ]
	    	// DB에서 모든 방 목록 가져오기
	    	ObservableList<Room> roomlist =
	    			RoomDao.roomDao.roomlist();
	    	// 테이블 뷰의 첫번째 필드를 가져와 방번호 필드로 설정
	    	TableColumn tc = roomtable.getColumns().get(0);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
	    	// 테이블 뷰의 두번째 필드를 가져와 방이름 필드로 설정
	    	tc = roomtable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
	    	// 테이블 뷰의 세번째 필드를 가져와 방인원 필드로 설정
	    	tc = roomtable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
	    	// 테이블뷰에 리스트를 넣어주기
	    	roomtable.setItems( roomlist );
	    	// 해당 테이블뷰 클릭했을 때,
	    	roomtable.setOnMouseClicked( e -> {
	    	selectroom = roomtable.getSelectionModel().getSelectedItem();
	    	
	    	lblselect.setText("현재 선택된 방 : " + selectroom.getRoname());
	    	btnconnect.setDisable(false);
	    	}	
	    			);
	    }
	    @FXML
	    void add(ActionEvent event) { // 방 개설 버튼을 눌렀을때
	    	// 1. 컨트롤에 입력된 방 이름 가져오기
	    	String roomname = txtroomname.getText();
	    	if(roomname.length() < 4) {
	    		// 만약에 방이름이 4글자 이하이면 방개설 실패(4글자 이하면 port오류 발생할 수 있어서)
	    		Alert alert = new Alert(AlertType.INFORMATION);
		    	alert.setHeaderText("방 개설 실패 [ 방은 4글자 이상 작성 ]");
		    	alert.showAndWait();
	    		return;
	    	}
	    	// 2. 방 객체
	    	Room room = new Room(0, roomname, "127.0.0.1", 0);
	    	
	    	// 3. db 처리
	    	RoomDao.roomDao.roomadd(room);
	    	// 4. 해당 방 서버 실행
	    	server = new Server();
	    	
	    	server.serverstart(room.getRoip(), RoomDao.roomDao.getroomnum());
	    	show(); // 테이블 새로고침
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	txtroomname.setText(""); // 개설후 방이름 입력창 공백 처리
	    	alert.setHeaderText("방이 개설되었습니다. 방번호 : " + RoomDao.roomDao.getroomnum());
	    	alert.showAndWait();
	    	
	    }


	    @FXML
	    void msg(ActionEvent event) { // 입력창에서 입력후 엔터를 눌렀을 때
	    	String msg = Login.member.getMid() + " : " + txtmsg.getText() + "\n";
	    	send(msg);
	    	txtmsg.setText("");
	    	txtmsg.requestFocus();
	    }

	    @FXML
	    void roomname(ActionEvent event) {

	    }

	    Socket socket; // 1. 클라이언트 소켓 선언
	    // 2. 클라이언트 실행 메소드
	    public void clientstart(String ip, int port) {
	    	// 멀티스레드
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				socket = new Socket(ip, port);
	    				send(Login.member.getMid() + "님 입장하셨습니다.\n");
	    				receive();
	    			} catch(Exception e) {System.out.println(e);}
	    		}; 
	    	}; // 멀티스레드 실행
	    	thread.start(); // 멀티스레드 실행
	    }
	    // 3. 클라이언트 종료 메소드
	    public void clientstop() {
	    	try {socket.close();} catch(Exception e) {}
	    }
	    // 4. 서버에게 메시지 보내기 메소드
	    public void send( String msg ) {
	    	Thread thread = new Thread() { 
	    		@Override
	    		public void run() {
	    			try {
	    				OutputStream outputStream = socket.getOutputStream(); // 1. 출력 스트림
	    				outputStream.write( msg.getBytes() ); // 2. 내보내기
	    				outputStream.flush(); // 3. 스트림 초기화 [ 스트림 내 바이트 지우기 ]
	    			}catch( Exception e ) {} 
	    		}
	    	};// 멀티스레드 구현 끝 
	    	thread.start();
	    }
	    // 5. 서버에게 메시지 받기 메소드
	    public void receive() {
	    	try {
		    	while(true) {
		    		InputStream inputStream = socket.getInputStream(); // 1. 입력 스트림
		    		byte[] bytes = new byte[1000]; 	// 2. 바이트배열 선언 
		    		inputStream.read(bytes);		// 3. 읽어오기 
		    		String msg = new String(bytes);	// 4. 바이트열 -> 문자열 변환
		    		txtcontent.appendText(msg); 	// 4. 받은 문자열을 메시지창에 띄우기 
		    	}
	    	}catch( Exception e ) {System.out.println("서버에서 메시지 받기 오류 " + e);}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("채팅방 입장")) {
	    		// 만약에 버튼의 텍스트가 채팅방 입장이라면 
	    		// 클라이언트 실행 메소드
	    		clientstart(selectroom.getRoip(), selectroom.getRonum());
	    			// 현재 방 접속명단 추가
	    			Roomlive roomlive = new Roomlive(0, selectroom.getRonum(), Login.member.getMid());
	    			// db처리
	    			RoomDao.roomDao.addroomlive(roomlive);
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
		    	btnsend.setDisable(true); // 전송버튼 사용 금지 
	    	}
	    }

	    @FXML
	    void send(ActionEvent event) {
	    	String msg = txtmsg.getText() + "\n"; // 보낼 메시지
	    	send(msg);
	    	txtmsg.setText(""); // 보내기 후 메세지 입력창 지우기
	    	txtmsg.requestFocus(); // 보내기 후 메시지 입력창으로 포커스(커서) 이동
	    	ArrayList<Roomlive> roomlivelist = RoomDao.roomDao.getroomlivelist(selectroom.getRonum());
	    	txtmidlist.setText("");
	    	int i = 1;
	    	for(Roomlive temp : roomlivelist) {
	    		txtmidlist.appendText(i + "번 " + temp.getMid() + "\n");
	    		i++;
	    	}
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtmsg.setText("채팅방 입장후 사용 가능");
	    	txtmsg.setEditable(false); // 수정 금지 상태
	    	txtcontent.setEditable(false); // 채팅창 목록 사용금지
	    	btnsend.setDisable(true); // 전송버튼 사용 금지 
	    	btnconnect.setDisable(true); // 입장버튼 사용 금지 
	    	txtmidlist.setDisable(true); // 방접속회원 목록 사용 금지
	    	show();
	    }

}
