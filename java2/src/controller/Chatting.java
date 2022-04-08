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
	    // ���� ���� ���� [ ��� �޼ҵ忡�� ��� ]
	    public Server server;
	    public static Room selectroom; // ���̺�信�� ���õ� �水ü
	    
	    public void show() { // ���Ǵ� �� [ initialize, add �޼ҵ� ]
	    	// DB���� ��� �� ��� ��������
	    	ObservableList<Room> roomlist =
	    			RoomDao.roomDao.roomlist();
	    	// ���̺� ���� ù��° �ʵ带 ������ ���ȣ �ʵ�� ����
	    	TableColumn tc = roomtable.getColumns().get(0);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
	    	// ���̺� ���� �ι�° �ʵ带 ������ ���̸� �ʵ�� ����
	    	tc = roomtable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
	    	// ���̺� ���� ����° �ʵ带 ������ ���ο� �ʵ�� ����
	    	tc = roomtable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
	    	// ���̺�信 ����Ʈ�� �־��ֱ�
	    	roomtable.setItems( roomlist );
	    	// �ش� ���̺�� Ŭ������ ��,
	    	roomtable.setOnMouseClicked( e -> {
	    	selectroom = roomtable.getSelectionModel().getSelectedItem();
	    	
	    	lblselect.setText("���� ���õ� �� : " + selectroom.getRoname());
	    	btnconnect.setDisable(false);
	    	}	
	    			);
	    }
	    @FXML
	    void add(ActionEvent event) { // �� ���� ��ư�� ��������
	    	// 1. ��Ʈ�ѿ� �Էµ� �� �̸� ��������
	    	String roomname = txtroomname.getText();
	    	if(roomname.length() < 4) {
	    		// ���࿡ ���̸��� 4���� �����̸� �氳�� ����(4���� ���ϸ� port���� �߻��� �� �־)
	    		Alert alert = new Alert(AlertType.INFORMATION);
		    	alert.setHeaderText("�� ���� ���� [ ���� 4���� �̻� �ۼ� ]");
		    	alert.showAndWait();
	    		return;
	    	}
	    	// 2. �� ��ü
	    	Room room = new Room(0, roomname, "127.0.0.1", 0);
	    	
	    	// 3. db ó��
	    	RoomDao.roomDao.roomadd(room);
	    	// 4. �ش� �� ���� ����
	    	server = new Server();
	    	
	    	server.serverstart(room.getRoip(), RoomDao.roomDao.getroomnum());
	    	show(); // ���̺� ���ΰ�ħ
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	txtroomname.setText(""); // ������ ���̸� �Է�â ���� ó��
	    	alert.setHeaderText("���� �����Ǿ����ϴ�. ���ȣ : " + RoomDao.roomDao.getroomnum());
	    	alert.showAndWait();
	    	
	    }


	    @FXML
	    void msg(ActionEvent event) { // �Է�â���� �Է��� ���͸� ������ ��
	    	String msg = Login.member.getMid() + " : " + txtmsg.getText() + "\n";
	    	send(msg);
	    	txtmsg.setText("");
	    	txtmsg.requestFocus();
	    }

	    @FXML
	    void roomname(ActionEvent event) {

	    }

	    Socket socket; // 1. Ŭ���̾�Ʈ ���� ����
	    // 2. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstart(String ip, int port) {
	    	// ��Ƽ������
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				socket = new Socket(ip, port);
	    				send(Login.member.getMid() + "�� �����ϼ̽��ϴ�.\n");
	    				receive();
	    			} catch(Exception e) {System.out.println(e);}
	    		}; 
	    	}; // ��Ƽ������ ����
	    	thread.start(); // ��Ƽ������ ����
	    }
	    // 3. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstop() {
	    	try {socket.close();} catch(Exception e) {}
	    }
	    // 4. �������� �޽��� ������ �޼ҵ�
	    public void send( String msg ) {
	    	Thread thread = new Thread() { 
	    		@Override
	    		public void run() {
	    			try {
	    				OutputStream outputStream = socket.getOutputStream(); // 1. ��� ��Ʈ��
	    				outputStream.write( msg.getBytes() ); // 2. ��������
	    				outputStream.flush(); // 3. ��Ʈ�� �ʱ�ȭ [ ��Ʈ�� �� ����Ʈ ����� ]
	    			}catch( Exception e ) {} 
	    		}
	    	};// ��Ƽ������ ���� �� 
	    	thread.start();
	    }
	    // 5. �������� �޽��� �ޱ� �޼ҵ�
	    public void receive() {
	    	try {
		    	while(true) {
		    		InputStream inputStream = socket.getInputStream(); // 1. �Է� ��Ʈ��
		    		byte[] bytes = new byte[1000]; 	// 2. ����Ʈ�迭 ���� 
		    		inputStream.read(bytes);		// 3. �о���� 
		    		String msg = new String(bytes);	// 4. ����Ʈ�� -> ���ڿ� ��ȯ
		    		txtcontent.appendText(msg); 	// 4. ���� ���ڿ��� �޽���â�� ���� 
		    	}
	    	}catch( Exception e ) {System.out.println("�������� �޽��� �ޱ� ���� " + e);}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("ä�ù� ����")) {
	    		// ���࿡ ��ư�� �ؽ�Ʈ�� ä�ù� �����̶�� 
	    		// Ŭ���̾�Ʈ ���� �޼ҵ�
	    		clientstart(selectroom.getRoip(), selectroom.getRonum());
	    			// ���� �� ���Ӹ�� �߰�
	    			Roomlive roomlive = new Roomlive(0, selectroom.getRonum(), Login.member.getMid());
	    			// dbó��
	    			RoomDao.roomDao.addroomlive(roomlive);
	    		txtcontent.appendText(" ---------- ä�ù� ���� ---------- \n");
	    		btnconnect.setText("ä�ù� ������");
	    		txtmsg.setText("");
		    	txtmsg.setEditable(true); // ���� ���� ����
		    	txtcontent.setEditable(true); // ä��â ��� ������
		    	btnsend.setDisable(false); // ���۹�ư ��� ���� 
		    	txtmsg.requestFocus(); //  
	    	}
	    	else {
	    		// Ŭ���̾�Ʈ ���� �޼ҵ�
	    		txtcontent.appendText(" ---------- ä�ù� ���� ---------- \n");
	    		btnconnect.setText("ä�ù� ����");
	    		txtmsg.setText("ä�ù� ������ ��� ����");
		    	txtmsg.setEditable(false); // ���� ����
		    	txtcontent.setEditable(false); // ä��â ��� ������
		    	btnsend.setDisable(true); // ���۹�ư ��� ���� 
	    	}
	    }

	    @FXML
	    void send(ActionEvent event) {
	    	String msg = txtmsg.getText() + "\n"; // ���� �޽���
	    	send(msg);
	    	txtmsg.setText(""); // ������ �� �޼��� �Է�â �����
	    	txtmsg.requestFocus(); // ������ �� �޽��� �Է�â���� ��Ŀ��(Ŀ��) �̵�
	    	ArrayList<Roomlive> roomlivelist = RoomDao.roomDao.getroomlivelist(selectroom.getRonum());
	    	txtmidlist.setText("");
	    	int i = 1;
	    	for(Roomlive temp : roomlivelist) {
	    		txtmidlist.appendText(i + "�� " + temp.getMid() + "\n");
	    		i++;
	    	}
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtmsg.setText("ä�ù� ������ ��� ����");
	    	txtmsg.setEditable(false); // ���� ���� ����
	    	txtcontent.setEditable(false); // ä��â ��� ������
	    	btnsend.setDisable(true); // ���۹�ư ��� ���� 
	    	btnconnect.setDisable(true); // �����ư ��� ���� 
	    	txtmidlist.setDisable(true); // ������ȸ�� ��� ��� ����
	    	show();
	    }

}
