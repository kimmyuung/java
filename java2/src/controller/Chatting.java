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
	    Socket socket; // 1. Ŭ���̾�Ʈ ���� ����
	    // 2. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstart() {
	    	// ��Ƽ������
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				socket = new Socket("127.0.0.1", 1234);
	    				send(Login.member.getMid() + "�� �����ϼ̽��ϴ�.\n");
	    				receive();
	    			} catch(Exception e) {System.out.println(e);}
	    		}; 
	    	};
	    	thread.start(); // ��Ƽ������ ����
	    }
	    // 3. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstop() {
	    	try {socket.close();} catch(Exception e) {}
	    }
	    // 4. �������� �޽��� ������ �޼ҵ�
	    public void send(String msg) {
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				OutputStream outputStream = socket.getOutputStream();
	    				outputStream.write(msg.getBytes());
	    				outputStream.flush(); // ��Ʈ�� �ʱ�ȭ(����Ʈ �����)
	    			} catch(Exception e) {System.out.println(e);}
	    		}
	    	};
	    	thread.start();
	    }
	    // 5. �������� �޽��� �ޱ� �޼ҵ�
	    public void receive() {
	    	try {
	    	while(true) {
	    	InputStream inputStream = socket.getInputStream();
	    	byte[] bytes = new byte[1000];
	    	inputStream.read(bytes);
	    	String msg = new String(bytes);
	    	txtcontent.appendText(msg); // �Է¹��� ������ ä��â�� �߰��ϱ�
	    	}
	    	} catch(Exception e) {System.out.println(e);}
	    }
	    @FXML
	    void connect(ActionEvent event) {
	    	if(btnconnect.getText().equals("ä�ù� ����")) {
	    		// ���࿡ ��ư�� �ؽ�Ʈ�� ä�ù� �����̶�� 
	    		// Ŭ���̾�Ʈ ���� �޼ҵ�
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
		    	btnsend.setDisable(false); // ���۹�ư ��� ���� 
		    	txtmsg.requestFocus(); // 
	    	}
	    }

	    @FXML
	    void send(ActionEvent event) {
	    	String msg = txtmsg.getText() + "\n"; // ���� �޽���
	    	send(msg);
	    	txtmsg.setText(""); // ������ �� �޼��� �Է�â �����
	    	txtmsg.requestFocus(); // ������ �� �޽��� �Է�â���� ��Ŀ��(Ŀ��) �̵�
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtmsg.setText("ä�ù� ������ ��� ����");
	    	txtmsg.setEditable(false); // ���� ���� ����
	    	txtcontent.setEditable(false); // ä��â ��� ������
	    	btnsend.setDisable(false); // ���۹�ư ��� ���� 
	    	txtmsg.requestFocus(); //  
	    }

}
