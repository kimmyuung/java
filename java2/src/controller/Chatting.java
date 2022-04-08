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
	    
	    public Server server; // ���� ���� ���� [ ��� �޼ҵ忡�� ��� ]
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
	    	
	    	System.out.println(selectroom.getRoip()+selectroom.getRonum());
	    	
	    	lblselect.setText("���� ���õ� �� : " + selectroom.getRoname());
	    	btnconnect.setDisable(false);
	    	}	);
	    }
	    @FXML
	    void add(ActionEvent event) { // �� ���� ��ư�� ��������
	    	// 1. ��Ʈ�ѿ� �Էµ� �� �̸� ��������
	    	String roomname = txtroomname.getText();
	    	if(roomname.length() < 4) {
	    		// ���࿡ ���̸��� 4���� �����̸� �氳�� ����(4���� ���ϸ� port���� �߻��� �� �־)
	    		txtroomname.setText("");// ������ ���̸� �Է�â ���� ó��
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
	    	server = new Server(); // �޸��Ҵ�
    		// **���� ���� [ �μ��� ip �� port=���ȣ �ѱ�� ]
    	server.serverstart(  room.getRoip() ,  RoomDao.roomDao.getroomnum() ); 
    	
    	txtroomname.setText("");// ������ ���̸� �Է�â ���� ó��
    	
    	show(); // ���̺� ���ΰ�ħ
    	
    	// �޽��� ����
    	Alert alert = new Alert( AlertType.INFORMATION);
    		alert.setHeaderText("�� ������ �Ǿ����ϴ� ���ȣ : "
    						+ RoomDao.roomDao.getroomnum());
    		alert.showAndWait();
    }
	    public void midshow() { // �������� : ä�� �޽���������(���� or ����)
	    	ArrayList<Roomlive> roomlivelist = RoomDao.roomDao.getroomlivelist(selectroom.getRonum() );
	    	txtmidlist.setText(""); // 2.��� �ʱ�ȭ
	    	int i = 1; 
			for( Roomlive temp : roomlivelist ) { // 3.����Ʈ�� ��� ��ü�� �ϳ��� ��ܿ� �߰�
				txtmidlist.appendText( i +"�� "+ temp.getMid() +"\n");
				i++;
			}
	    }

	    @FXML
	    void msg(ActionEvent event) { // �Է�â���� �Է��� ���͸� ������ ��
	    	String msg = Login.member.getMid() + " : " + txtmsg.getText() + "\n";
	    	send(msg);
	    	txtmsg.setText("");
	    	txtmsg.requestFocus();
	    	midshow();
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
	    				socket = new Socket(ip, port); // ������ ip�� ��Ʈ��ȣ �־��ֱ�[������ ����]
	    				send(Login.member.getMid() + "�� �����ϼ̽��ϴ�.\n");
	    				receive(); // ���Ӱ� ���ÿ� �ޱ� �޼ҵ�� ���ѷ���
	    			} catch(Exception e) {System.out.println(e); clientstop();}
	    		}; 
	    	}; // ��Ƽ������ ����
	    	thread.start(); // ��Ƽ������ ����
	    }
	    // 3. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstop() {
	    	try {socket.close();} catch(Exception e) {System.out.println(e);}
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
	    			}catch( Exception e ) {System.out.println(e);} 
	    		}
	    	};// ��Ƽ������ ���� �� 
	    	thread.start();
	    }
	    // 5. �������� �޽��� �ޱ� �޼ҵ�
	    public void receive() {
	    	while(true) {
	    		try {
		    		InputStream inputStream = socket.getInputStream(); // 1. �Է� ��Ʈ��
		    		byte[] bytes = new byte[1000]; 	// 2. ����Ʈ�迭 ���� 
		    		inputStream.read(bytes);		// 3. �о���� 
		    		String msg = new String(bytes);	// 4. ����Ʈ�� -> ���ڿ� ��ȯ
		    		txtcontent.appendText(msg); 	// 4. ���� ���ڿ��� �޽���â�� ���� 
	    		}
		    	catch( Exception e ) { 
		    		
		    		System.out.println( e );
		    		break;
		    	}
	    	}
	    }
	    @FXML
	    void connect(ActionEvent event)  { // ���ӹ�ư�� ��������
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
		    	txtmsg.setDisable(false); // ���� ���� ����
		    	txtcontent.setDisable(false); // ä��â ��� ������
		    	btnsend.setDisable(false); // ���۹�ư ��� ���� 
		    	txtmsg.requestFocus(); // 
		    	
		    	txtroomname.setDisable(true); 	// ä�ù��̸� �Է�â ������
		    	btnadd.setDisable(true); // ä�� ���� ��ư ��� ����
		    	roomtable.setDisable(true); // ������������ ä�ù� ��� ��� ����
	    	}
	    	else {
	    		// Ŭ���̾�Ʈ ���� �޼ҵ�
	    		clientstop();
	    		txtcontent.appendText(" ---------- ä�ù� ���� ---------- \n");
	    		btnconnect.setText("ä�ù� ����");
	    		txtmsg.setText("ä�ù� ������ ��밡��");
	        	txtmsg.setDisable(true); 		// ä���Է�â ������ 
	        	txtcontent.setDisable(true); 	// ä��â ��� ������
	        	btnsend.setDisable(true); 		// ���۹�ư ������
	        	btnconnect.setDisable(true);
	
		    	txtroomname.setDisable(false);
		    	btnadd.setDisable(false);
		    	roomtable.setDisable(false); 
		    	// 1. �� ���� ��ܿ��� ����[����]�ϱ�
		    	RoomDao.roomDao.roomlivedelete(Login.member.getMid());
		    	
		    	// 2. ���࿡ �� ���� ����� 0���̸� �� ����
		    	boolean result = RoomDao.roomDao.roomdelete(selectroom.getRonum());
		    	if(result) {server.serverstop();}
		    	// 3. �������� ����
		    	// * ���õ� ���̺�信�� ���õ� �水ü �ʱ�ȭ
		    	selectroom = null;
		    	// * ���õ� �� ���̺� �ʱ�ȭ
		    	lblselect.setText("���� ���õ� �� : ");
		    	show(); // ���� ���̺� ���ΰ�ħ
	    	}
	    }

	    @FXML
	    void send(ActionEvent event) { // ���۹�ư�� ������ ��
	    	String msg = Login.member.getMid()+" : "+ txtmsg.getText()+"\n"; // ���� �޽��� // ���� �޽���
	    	send(msg);
	    	txtmsg.setText(""); // ������ �� �޼��� �Է�â �����
	    	txtmsg.requestFocus(); // ������ �� �޽��� �Է�â���� ��Ŀ��(Ŀ��) �̵�
	    	txtmidlist.setText("");
	    	midshow();
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	// ä��fxml �������� �ʱⰪ �޼ҵ�  	// * ä�ù� �������� �Ʒ� fxid�� �����ϰ� ���� 
	    	txtmsg.setText("ä�ù� ������ ��� ����");
	    	txtmsg.setDisable(true); 		// ä���Է�â ������ 
	    	txtcontent.setDisable(true); 	// ä��â ��� ������
	    	btnsend.setDisable(true); 		// ���۹�ư ������
	    	btnconnect.setDisable(true); 	// �����ư ������
	    	txtmidlist.setDisable(true);  	// ������ȸ�� ��� ������ 
	    	// ä�ù��� �ǽð����� �����ϱ� ���� ������ ���
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			while(true) {
	    				try {
	    					show();
	    					Thread.sleep(1000);
	    				} catch(Exception e) {}
	    			}
	    		}
	    	};
	    	thread.start();
	    }

}
