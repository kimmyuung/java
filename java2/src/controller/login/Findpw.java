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

public class Findpw implements Initializable{
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}
@FXML
private TextField txtid;

@FXML
private Button btsignup;

@FXML
private Button btnback;

@FXML
private TextField txtaddress;

@FXML
private Label txtfail;

@FXML
private TextField txtemail;

@FXML
void back(ActionEvent event) {
	System.out.println("�ڷ� ����!");
Login.get���ΰ�ü().loadpage("/view/login/loginpane.fxml");
}

@FXML
void findpw(ActionEvent event) throws SQLException {
	 
	    	String id = txtid.getText();
	    	String email = txtemail.getText();
	    	String password = MemberDao.memberDao.findpw(id, email);
	    	if(password!=null) {
	    		Alert alert = new Alert(AlertType.INFORMATION); // �޽��� ��ü
	    		alert.setTitle("�˸�");
	    		alert.setHeaderText("��й�ȣ ã�� ���");
	    		alert.setContentText(password);
	    		alert.showAndWait(); // �޽��� ����
	    	}
	    	else {
	    		Alert alert = new Alert(AlertType.INFORMATION); // �޽��� ��ü
	    		alert.setTitle("�˸�");
	    		alert.setHeaderText("��й�ȣ ã�� ���");
	    		alert.setContentText("���̵�� �̸��������� ��ġ���� �ʽ��ϴ�.");
	    		alert.showAndWait(); // �޽��� ����
	    	}

	    
}

}
