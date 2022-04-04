package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class Info implements Initializable{

	@FXML
	private Label labelid;
	@FXML
	private Label labelemail;
	@FXML
	private Label labeladdress;
	@FXML
	private Label labelpoint;
	@FXML
	private Label labelsince;
	
	@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	labelid.setText(Login.member.getMid());
	labelemail.setText(Login.member.getMemail());
	labeladdress.setText(Login.member.getMaddress());
	labelpoint.setText(Login.member.getMpoint() + "Á¡");
	labelsince.setText(Login.member.getMsince());
}
}
