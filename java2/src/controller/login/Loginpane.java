package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable{
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	
}
@FXML
private TextField txtid;

@FXML
private PasswordField txtpw;

@FXML
private Button btnlogin;

@FXML
private Button btnfindid;

@FXML
private Button btnsignup;

@FXML
private Button btnfindpw;

@FXML
private Label labelconform;

@FXML
void accfindid(ActionEvent event) {
	System.out.println(" ���̵�ã�� �������� �̵� ");
	Login.get���ΰ�ü().loadpage("/view/login/findid.fxml");
}

@FXML
void accfindpw(ActionEvent event) {
	System.out.println(" ��й�ȣ ã�� �������� �̵� ");
	Login.get���ΰ�ü().loadpage("/view/login/findpw.fxml");
}

@FXML
void accsignup(ActionEvent event) {
	System.out.println(" ȸ������ �������� �̵� ");
	// login ��Ʈ�ѿ� �����ϴ� borderpane ��ü�� ���� ����
		// ���� : borederpane ��ü�� �ٸ� ��Ʈ�ѷ��� ����
		// * new : ���ο� �޸��Ҵ�[���� borderpane �ƴ� ���ο� borderpane ] 
		// ���� login Ŭ�������� ������� borderpane;
	Login.get���ΰ�ü().loadpage("/view/login/signuppane.fxml"); 
}

@FXML
void login(ActionEvent event) {
	System.out.println(" �α��� �������� �̵� ");
	String id = txtid.getText();
	String pw = txtpw.getText();
	if(id.equals("admin") && pw.equals("1234")) {
		labelconform.setText("������ ����!!!");
	}
	else labelconform.setText("�Ϲ�ȸ���̽ñ���");
	
	System.out.println("�α��� ó��");
}
}
