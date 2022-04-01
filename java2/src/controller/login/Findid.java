package controller.login;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Findid implements Initializable{
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		txtfail.setText("");
	}
	
	@FXML
    private TextField txtemail;

    @FXML
    private Button btsignup;

    @FXML
    private Button btnback;

    @FXML
    private TextField txtaddress;

    @FXML
    private Label txtfail;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("�ڷ� ����!");
    	Login.get���ΰ�ü().loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void findid(ActionEvent event) throws SQLException {
    	try {
    	String id = txtemail.getText();
    	String address = txtaddress.getText();
    	String result = MemberDao.memberDao.findid(id, address);
    	if(id!=null) {
    		Alert alert = new Alert(AlertType.INFORMATION); // �޽��� ��ü
    		alert.setTitle("�˸�");
    		alert.setHeaderText("���̵� ã�� ���");
    		alert.setContentText(id);
    		alert.showAndWait(); // �޽��� ����
    	}
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION); // �޽��� ��ü
    		alert.setTitle("�˸�");
    		alert.setHeaderText("���̵� ã�� ���");
    		alert.setContentText("�������� �ʴ� �̸����Դϴ�");
    		alert.showAndWait(); // �޽��� ����
    	}
    
    	} catch(Exception e) {System.out.println(e);}
    }
}
