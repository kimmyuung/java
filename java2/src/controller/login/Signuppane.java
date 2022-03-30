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

public class Signuppane implements Initializable{

	@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}
	  @FXML
	    private TextField txtid;

	    @FXML
	    private PasswordField twtemail;

	    @FXML
	    private Button btsignup;

	    @FXML
	    private Button btnback;

	    @FXML
	    private PasswordField txtaddress;

	    @FXML
	    private TextField twtpw;

	    @FXML
	    private TextField twtpwconfirm;

	    @FXML
	    private Label txtfail;

	    @FXML
	    void back(ActionEvent event) {
	    	System.out.println("뒤로 가기!!");
	    	Login.get본인객체().loadpage("/view/login/loginpane.fxml");
	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	
	    }
}
