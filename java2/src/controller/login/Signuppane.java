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
	    	System.out.println("뒤로 가기!!");
	    	Login.get본인객체().loadpage("/view/login/loginpane.fxml");
	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	// 컨트롤에 입력된 데이터 가져오기 [ fxid명.gettext() ]
	    	String id = txtid.getText();
	    	String pw = txtpw.getText();
	    	String passwordconfirm = txtpwconfirm.getText();
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	
	    	// 현재날짜 가져오기 [ SimpleDateFormat : 날짜 모양(형식) 변환 클래스 ]
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	String since = format.format(new Date());
	    	// 유효성 체크 [ 제한 ]
	    		// 1. id 중복체크
	    	boolean result = MemberDao.memberDao.idcheck(id);
	    	if(result) {
	    		txtfail.setText("사용중인 아이디입니다.");
	    		return;
	    	}
	    		// 2. id 길이체크
	    	if(id.length() < 4 || id.length() > 10) {
	    		txtfail.setText("아이디 4-10 사이로 입력");
	    		return;
	    	}
	    		// 3. 비밀번호 형식 체크
	    	if(pw.length() < 4 || pw.length() > 10
	    			|| passwordconfirm.length() < 4 || passwordconfirm.length() > 10) {
	    		txtfail.setText("비밀번호는 4~10자리로 입력해주세요");
	    		return; // 가입 못하게 메소드 종료
	    	}
	    		// 4. 비밀번호 일치 체크
	    	if(! pw.equals(passwordconfirm)) {
	    		txtfail.setText("비밀번호 불일치");
	    		return;
	    	}
	    		// 5. 이메일 체크
	    	if( !(email.contains("@"))) { // 만약에 입력한 이메일에 @가 없으면
	    		txtfail.setText("이메일 형식이 올바르지 않습니다");
	    		return;
	    	}
	    		// 6. 주소 체크
	    	if(!(address.contains("시") && address.contains("구") && address.contains("동"))) {
	    		txtfail.setText("주소 형식이 올바르지 않습니다");
	    		return;
	    	}
	    	// 모든 유효성 검사 통과시 DB에 저장
	    		// 1. 객체화 [ 회원번호 없음, id, pw, email, address, 포인트없음=0, cine ]
	    		Member member = new Member(0, id, pw, email, address, 0, since);
	    		// 2. DB 객체내 메소드 호출
	    		boolean result2 = MemberDao.memberDao.signup(member);
	    		// 3. 확인
	    		if(result2) {
	    			// 1. 메시지창 출력 [ Alert : 메세지[알람] 클래스
	    			Alert alert = new Alert(AlertType.INFORMATION);
	    			alert.setTitle("알림"); // 메세지 제목 설정
	    			alert.setHeaderText("안산시 중고거래에 가입을 축하합니다");
	    			alert.setContentText("회원가입 성공");
	    			
	    			alert.showAndWait();
	    			Login.get본인객체().loadpage("/view/login/loginpane.fxml");
	    		}
	    		else {System.out.println("가입 실패"); return;}
	    }
}
