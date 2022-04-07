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
	    	
	    }
	    // 3. �������� �޼ҵ�
	    public void serverstop() {
	    	
	    }
	    @FXML
	    void server(ActionEvent event) { // ���� ���� ��ư
	    	if(btnserver.getText().equals("���� ����")) {
	    		txtserver.appendText("���� �����մϴ�.\n");
	    		btnserver.setText("���� ����");
	    	} else { // ��ư�� �ؽ�Ʈ�� ���� ���� �̸�
	    		txtserver.appendText("���� �����մϴ�.\n");
	    		btnserver.setText("���� ����");
	    	}
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtserver.setDisable(true); // �ش� fxid ������
	    	
	    }
}
