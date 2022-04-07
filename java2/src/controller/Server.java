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

	    // * ������ ����� Ŭ���̾�Ʈ �����ϴ� ����Ʈ
	    public static Vector<Client> clientlist = new Vector<>();
	    // ����ȭ : ���� �����尡 �ϳ��� �޼ҵ� ���ٽÿ� ��� ���� �����
	    // * ��Ƽ�����带 �������ִ� ������Ǯ ���
	    public static ExecutorService threadpool;
	    	// ExecutorService : ������Ǯ ���� �������̽�
	    
	    // ������Ǯ : �������� ������ ���� ���� ���
	    // ���� �ٸ� �������� ��û�� ó���ϱ� ���� �۾�ť�� ����.
	    // (��û ������ ��������� �����·� ����) ���Լ���� �۾� ó��
	    // ä�� : ����ڰ��� ä�� X, ����ڿ� ������ ä�� O
	    // ä�� : ������ �޼��� ���� -> ������ ��� -> �������� ����Ȱ� �ٽ� ä�ù������鿡�� ����
	    
	    // 1. �������� ����
	    ServerSocket serverSocket;
	    // 2. �������� �޼ҵ�
	    public void serverstart() {
	    	try {
	    	// 1. ���� ���� �޸��Ҵ�
	    	serverSocket = new ServerSocket();
	    	// 2. ���� ���� ���ε� [ip�� port ����]
	    	serverSocket.bind(new InetSocketAddress("127.0.0.1",1234) );
	    	
	    	}catch(Exception e) {}
	    	// 3. Ŭ���̾�Ʈ�� ��û ��� [ ��Ƽ������ ������� : Ŭ���̾�Ʈ ����, ������, �ޱ� ]
	    	Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
					while(true) {
						Socket socket = serverSocket.accept(); // 1. ��û �����Ŀ� ������ ������ ����
						clientlist.add(new Client(socket)); // 2. ����� Ŭ���̾�Ʈ(����� ����) �����Ŀ� ����Ʈ�� ����
					}
				} catch(Exception e) {}
			}
	    	}; // ��Ƽ������ ���� ��
	    	threadpool = Executors.newCachedThreadPool(); // ������Ǯ�� �޸� �ʱ�ȭ[�Ҵ�]
	    	threadpool.submit(runnable); // ������ ������ ��Ƽ�����带 ������Ǯ�� �־��ֱ�
	    }
	    // 3. �������� �޼ҵ�
	    public void serverstop() throws IOException {
	    	for(Client temp : clientlist) {
	    		temp.socket.close();
	    	}
	    	serverSocket.close();
	    	threadpool.shutdown();
	    }
	    @FXML
	    void server(ActionEvent event) throws Exception { // ���� ���� ��ư
	    	if(btnserver.getText().equals("���� ����")) {
	    		serverstart();
	    		txtserver.appendText("���� �����մϴ�.\n");
	    		btnserver.setText("���� ����");
	    	} else { // ��ư�� �ؽ�Ʈ�� ���� ���� �̸�
	    		serverstop();
	    		txtserver.appendText("���� �����մϴ�.\n");
	    		btnserver.setText("���� ����");
	    	}
	    }
	    @Override
	    	public void initialize(URL arg0, ResourceBundle arg1) {
	    		// TODO Auto-generated method stub
	    		
	    	}	 
	    	
	    	
	    	    
} // ce