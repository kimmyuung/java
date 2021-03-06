package controller.login;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
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
	txtfail.setText("");
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
Login.get본인객체().loadpage("/view/login/loginpane.fxml");
}

@FXML
void findpw(ActionEvent event) throws SQLException {
	 
	    	String id = txtid.getText();
	    	String email = txtemail.getText();
	    	String password = MemberDao.memberDao.findpw(id, email);
	    	if(password!=null) {
	    		Member.sendmail(email, password);
	    		Alert alert = new Alert(AlertType.INFORMATION); // 메시지 객체
	    		alert.setTitle("알림");
	    		alert.setHeaderText("해당 이메일로 비밀번호를 전송했습니다.");
	    		alert.showAndWait(); // 메시지 실행
	    	}
	    	else {
	    		Alert alert = new Alert(AlertType.INFORMATION); // 메시지 객체
	    		alert.setTitle("알림");
	    		alert.setHeaderText("비밀번호 찾기 결과");
	    		alert.setContentText("아이디와 이메일정보가 일치하지 않습니다.");
	    		alert.showAndWait(); // 메시지 실행
	    	}

	    
}

}
