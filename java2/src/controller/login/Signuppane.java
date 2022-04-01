package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Signuppane implements Initializable{

	

	@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	txtfail.setText("");
}
	  @FXML
	    private TextField txtid;

	    @FXML
	    private PasswordField txtemail;

	    @FXML
	    private Button btsignup;

	    @FXML
	    private Button btnback;

	    @FXML
	    private PasswordField txtaddress;

	    @FXML
	    private TextField txtpw;

	    @FXML
	    private TextField txtpwconfirm;

	    @FXML
	    private Label txtfail;

	    @FXML
	    void back(ActionEvent event) {
	    	System.out.println("�ڷ� ����!!");
	    	Login.get���ΰ�ü().loadpage("/view/login/loginpane.fxml");
	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	// ��Ʈ�ѿ� �Էµ� ������ �������� [ fxid��.gettext() ]
	    	String id = txtid.getText();
	    	String pw = txtpw.getText();
	    	String passwordconfirm = txtpwconfirm.getText();
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	
	    	// ���糯¥ �������� [ SimpleDateFormat : ��¥ ���(����) ��ȯ Ŭ���� ]
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	String since = format.format(new Date());
	    	// ��ȿ�� üũ [ ���� ]
	    		// 1. id �ߺ�üũ
	    	boolean result = MemberDao.memberDao.idcheck(id);
	    	if(result) {
	    		txtfail.setText("������� ���̵��Դϴ�.");
	    		return;
	    	}
	    		// 2. id ����üũ
	    	if(id.length() < 4 || id.length() > 10) {
	    		txtfail.setText("���̵� 4-10 ���̷� �Է�");
	    		return;
	    	}
	    		// 3. ��й�ȣ ���� üũ
	    	if(pw.length() < 4 || pw.length() > 10
	    			|| passwordconfirm.length() < 4 || passwordconfirm.length() > 10) {
	    		txtfail.setText("��й�ȣ�� 4~10�ڸ��� �Է����ּ���");
	    		return; // ���� ���ϰ� �޼ҵ� ����
	    	}
	    		// 4. ��й�ȣ ��ġ üũ
	    	if(! pw.equals(passwordconfirm)) {
	    		txtfail.setText("��й�ȣ ����ġ");
	    		return;
	    	}
	    		// 5. �̸��� üũ
	    	if( !(email.contains("@"))) { // ���࿡ �Է��� �̸��Ͽ� @�� ������
	    		txtfail.setText("�̸��� ������ �ùٸ��� �ʽ��ϴ�");
	    		return;
	    	}
	    		// 6. �ּ� üũ
	    	if(!(address.contains("��") && address.contains("��") && address.contains("��"))) {
	    		txtfail.setText("�ּ� ������ �ùٸ��� �ʽ��ϴ�");
	    		return;
	    	}
	    	// ��� ��ȿ�� �˻� ����� DB�� ����
	    		// 1. ��üȭ [ ȸ����ȣ ����, id, pw, email, address, ����Ʈ����=0, cine ]
	    		Member member = new Member(0, id, pw, email, address, 0, since);
	    		// 2. DB ��ü�� �޼ҵ� ȣ��
	    		boolean result2 = MemberDao.memberDao.signup(member);
	    		// 3. Ȯ��
	    		if(result2) {
	    			// 1. �޽���â ��� [ Alert : �޼���[�˶�] Ŭ����
	    			Alert alert = new Alert(AlertType.INFORMATION);
	    			alert.setTitle("�˸�"); // �޼��� ���� ����
	    			alert.setHeaderText("�Ȼ�� �߰�ŷ��� ������ �����մϴ�");
	    			alert.setContentText("ȸ������ ����");
	    			
	    			alert.showAndWait();
	    			Login.get���ΰ�ü().loadpage("/view/login/loginpane.fxml");
	    		}
	    		else {System.out.println("���� ����"); return;}
	    }
}
