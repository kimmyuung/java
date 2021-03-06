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
    	Login.get본인객체().loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void findid(ActionEvent event) throws SQLException { // 아이디 찾기 버튼 누름
    	try {
    		// 컨트롤에 입력된 이메일을 가져옴.
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	String result = MemberDao.memberDao.findid(email, address);
    	if(result!=null) {
    		Alert alert = new Alert(AlertType.INFORMATION); // 메시지 객체
    		alert.setTitle("알림");
    		alert.setHeaderText("아이디 찾기 결과");
    		alert.setContentText(result);
    		alert.showAndWait(); // 메시지 실행
    	}
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION); // 메시지 객체
    		alert.setTitle("알림");
    		alert.setHeaderText("아이디 찾기 결과");
    		alert.setContentText("존재하지 않는 이메일입니다");
    		alert.showAndWait(); // 메시지 실행
    	}
    
    	} catch(Exception e) {System.out.println(e);}
    }
}
