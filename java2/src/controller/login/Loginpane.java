package controller.login;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.Main;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable{
	
	public static ArrayList<dto.Logincheck> loginlist = new ArrayList<>();
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
	
	Login.get���ΰ�ü().loadpage("/view/login/findid.fxml");
}

@FXML
void accfindpw(ActionEvent event) {
	
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
void login(ActionEvent event) throws SQLException {

	String id = txtid.getText();
	String pw = txtpw.getText();
	boolean result = MemberDao.memberDao.login(id, pw);
	if(result) {
		// �α��� ������ ������ ȸ������ ���� [ �α׾ƿ� �� �ʱ�ȭ ]
		Login.member = MemberDao.memberDao.getmember(id);
		labelconform.setText("�α��μ���");
		Main.instance.loadpage("/view/home/home.fxml");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		String ���ӳ� = sdf1.format(LocalDate.now());
		get���ӳ�¥(Login.member.getMnum());
		����Ʈ�Ǵ�(Login.member.getMnum(), ���ӳ�);
	}
	else {
		labelconform.setText("������ ȸ���� �����ϴ�.");
	}
	if(id.equals("admin") && pw.equals("1234")) {
		labelconform.setText("������ ����!!!");
	}
	else labelconform.setText("������ ȸ�������� �����ϴ�.");
	
	System.out.println("�α��� ó��");
}

public void get���ӳ�¥(int mnum) {
	try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/���ӱ��.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sdf1 = sdf.format(LocalDate.now()); 
		String ���� = mnum + "," + sdf1 + "\n";
		fileOutputStream.write(����.getBytes());
		fileOutputStream.close();
	
		
	} catch(Exception e) {System.out.println(e);}
	
}


public void ���ӱ��load(int mnum) {
	try {
		FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/���ӱ��.txt");
		byte[] ����Ʈ�迭 = new byte[1000];
		fileInputStream.read(����Ʈ�迭);
		String ���� = ����Ʈ�迭.toString();
		String[] ���ӳ�¥ = ����.split("\n");
		for(String temp : ���ӳ�¥) {
			String[] field = temp.split(",");
			dto.Logincheck logincheck = new dto.Logincheck(Integer.parseInt(field[0]), field[1]);
			loginlist.add(logincheck);
			fileInputStream.close();
			
		}
		fileInputStream.close();
	} catch(Exception e) {System.out.println(e);}
	
}

public boolean ����Ʈ�Ǵ�(int mnum, String ���ӳ�) {
	
	get���ӳ�¥(mnum);
	���ӱ��load(mnum);
	for(dto.Logincheck temp : loginlist) {
	if(Login.member.getMnum() == temp.getMnum()) {
		if(temp.get������().equals(���ӳ�)) {
			Login.member.setMpoint(Login.member.getMpoint() + 10);
			return true;
		}
		else {Login.member.setMpoint(Login.member.getMpoint() + 0); 
			return true;
		} 
	}
	
	
	}
	return false;
}


}
