package application.Day22;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DB�׽�Ʈ��Ʈ�ѷ� implements Initializable{
									// fxml�� ���� �������� �ʱⰪ[ó����] ���� �޼ҵ� ����
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { //�ʱⰪ[ó����] ���� �޼ҵ� ����
		Day22_2 DB���� = new Day22_2(); // �����ڿ� db���� �ڵ� �־��� ������ ��ü ����� ��������
		
	}
	
    @FXML
    private TextField txtwriter;

    @FXML
    private TextField txtcontent;

    @FXML
    private Button btnget;

    @FXML
    private Button btnwrite;

    @FXML
    private TextArea txtcontentlist;

    @FXML
    void get(ActionEvent event) {
    	System.out.println("DB�� �����͸� ȣ���մϴ�.");
    	// 1. db������ü �����
    	Day22_2 db���� = new Day22_2();
    	// 2. db ��ü�� �޼ҵ� ȣ�� �� ����� ����Ʈ�� �ޱ�
    	ArrayList<������> �����͸�� = db����.get();
    	
    	// 3. ����Ʈ�� ��Ʈ�ѿ� �־��ֱ�
    	for(������ temp : �����͸��) {
    		// txtcontentlist.appendText : �ش� ��Ʈ�ѿ� ���� �߰�
    		txtcontentlist.appendText(
    				 temp.get��ȣ() + ". " +
      				 temp.get�ۼ���() + " : " +
    				 temp.get����() + "\n"
    				);
    	}
    }

    @FXML
    void write(ActionEvent event) {
    	System.out.println("DB�� �����͸� �����մϴ�.");
    	String �ۼ��� = txtwriter.getText(); 
    	// fxid��.getText() : �ش� ��Ʈ�ѿ� �Էµ� ���� ��������
    	String ���� = txtcontent.getText();
    	// 1. DB ���� ��ü �����
    	Day22_2 db���� = new Day22_2();
    	// 2. db���� ��ü ������ ���� �޼ҵ� ȣ��
    	boolean result = db����.writer(�ۼ���, ����);
    	if(result) {System.out.println("DB�� ������ ���� ����");
    	// ������ ��Ʈ�ѿ� �Էµ� ������ �����ֱ�
    	txtwriter.setText(""); // ������ �Է�â �������� ����
    	txtcontent.setText("");
    	}
    	else {System.out.println("DB�� ������ ���� ����");}
    }


}
