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
	
	Login.get본인객체().loadpage("/view/login/findid.fxml");
}

@FXML
void accfindpw(ActionEvent event) {
	
	Login.get본인객체().loadpage("/view/login/findpw.fxml");
}

@FXML
void accsignup(ActionEvent event) {
	System.out.println(" 회원가입 페이지로 이동 ");
	// login 컨트롤에 존재하는 borderpane 객체내 센터 변경
		// 문제 : borederpane 객체가 다른 컨트롤러에 존재
		// * new : 새로운 메모리할당[기존 borderpane 아닌 새로운 borderpane ] 
		// 기존 login 클래스에서 사용중인 borderpane;
	Login.get본인객체().loadpage("/view/login/signuppane.fxml"); 
}

@FXML
void login(ActionEvent event) throws SQLException {

	String id = txtid.getText();
	String pw = txtpw.getText();
	boolean result = MemberDao.memberDao.login(id, pw);
	if(result) {
		// 로그인 성공시 성공한 회원정보 저장 [ 로그아웃 시 초기화 ]
		Login.member = MemberDao.memberDao.getmember(id);
		labelconform.setText("로그인성공");
		Main.instance.loadpage("/view/home/home.fxml");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		String 접속날 = sdf1.format(LocalDate.now());
		get접속날짜(Login.member.getMnum());
		포인트판단(Login.member.getMnum(), 접속날);
	}
	else {
		labelconform.setText("동일한 회원이 없습니다.");
	}
	if(id.equals("admin") && pw.equals("1234")) {
		labelconform.setText("관리자 라고욧!!!");
	}
	else labelconform.setText("동일한 회원정보가 없습니다.");
	
	System.out.println("로그인 처리");
}

public void get접속날짜(int mnum) {
	try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/접속기록.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sdf1 = sdf.format(LocalDate.now()); 
		String 내용 = mnum + "," + sdf1 + "\n";
		fileOutputStream.write(내용.getBytes());
		fileOutputStream.close();
	
		
	} catch(Exception e) {System.out.println(e);}
	
}


public void 접속기록load(int mnum) {
	try {
		FileInputStream fileInputStream = new FileInputStream("D:/자바/접속기록.txt");
		byte[] 바이트배열 = new byte[1000];
		fileInputStream.read(바이트배열);
		String 내용 = 바이트배열.toString();
		String[] 접속날짜 = 내용.split("\n");
		for(String temp : 접속날짜) {
			String[] field = temp.split(",");
			dto.Logincheck logincheck = new dto.Logincheck(Integer.parseInt(field[0]), field[1]);
			loginlist.add(logincheck);
			fileInputStream.close();
			
		}
		fileInputStream.close();
	} catch(Exception e) {System.out.println(e);}
	
}

public boolean 포인트판단(int mnum, String 접속날) {
	
	get접속날짜(mnum);
	접속기록load(mnum);
	for(dto.Logincheck temp : loginlist) {
	if(Login.member.getMnum() == temp.getMnum()) {
		if(temp.get접속일().equals(접속날)) {
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
