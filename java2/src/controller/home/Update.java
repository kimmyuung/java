package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import controller.login.Login;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Update implements Initializable{
	
	 @FXML
	    private Button btnupdate;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private TextField txtaddress;

	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtemail.setText(Login.member.getMemail());
	    	txtaddress.setText(Login.member.getMaddress());
	    }
	    
	    @FXML
	    void update(ActionEvent event) {
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	// 2. 업데이트 처리
	    	boolean result = MemberDao.memberDao.update(Login.member.getMnum(), email, address);
	    	if(result) {
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setHeaderText("회원정보가 수정되었습니다. [다시 로그인 해주세요 ] ");
	    		alert.showAndWait();
	    		Main.instance.loadpage("/view/login/login.fxml");
	    		Login.member = null; // 로그인 정보 null
	    	}
	    	else {Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("회원 수정 실패! ");}
	    }
}
