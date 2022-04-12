package controller.home;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import controller.login.Login;
import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home implements Initializable{
				// fxml 실행시 초기값 설정 인터페이스
	@FXML
	private Label loginId;
	
	@FXML
    private ImageView image2;
    
	@FXML
	private Label labelpoint;
	
	@FXML
	private Label labellogout;
	
	@FXML
	private Label labeldelate;
	
	@FXML
	private Label labelinfo;
	
	@FXML
	private BorderPane borderPane;
	
	@FXML
	private Label labelupdate;
	
	@FXML
	private Label lblboard;
	
	@FXML
	private Label lblproduct;
	
	@FXML
    private Label lblproduct1;

    @FXML
    private Label lblproduct2;

    @FXML
    private Label lblproduct3;

    @FXML
    private Label lblproduct4;
    
    @FXML
    private Label labelrecord;
    
    @FXML
    private Label labelmy;
    
    
    public static String category;
    
    @FXML
    void accproduct1(MouseEvent event) { // 남성 의류 선택
    	loadpage("/view/product/product.fxml"); category = "Men";
    }

    @FXML
    void accproduct2(MouseEvent event) { // 여성 의류 선택
    	loadpage("/view/product/product.fxml"); category = "Women";
    }

    @FXML
    void accproduct3(MouseEvent event) { // 게임기기 선택
    	loadpage("/view/product/product.fxml"); category = "Game";
    }

    @FXML
    void accproduct4(MouseEvent event) { // 생활 선택
    	loadpage("/view/product/product.fxml"); category = "Life";
    }
   
    @FXML
    void accrecord(MouseEvent event) {
    	loadpage("/view/record.fxml");
    }
    @FXML
    void mycontext(MouseEvent e) {
    	loadpage("/view/mine.fxml");
    }
	// 객체
	public static Home home;
	// 생성자
	public Home() {
		home = this;
	}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderPane.setCenter(parent);
			
		}catch(Exception e) {System.out.println(e);}
	}
	
	@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	loadpage("/view/chatting.fxml");
	loginId.setText(Login.member.getMid() + "님");
	labelpoint.setText("포인트 : "+Login.member.getMpoint() + "점");
}
	@FXML // 로그아웃 레이블을 클릭했을때 이벤트
	public void logout(MouseEvent E) {
		// 1. Login 정보 지우기
		Login.member = null;
		// 2. 페이지 전환
		Main.instance.loadpage("/view/login/login.fxml");
	}
	@FXML // 회원탈퇴 레이블을 클릭했을때 이벤트
	public void delate(MouseEvent E) {
		// 1. 메시지 설정
		Alert alert = new Alert(AlertType.CONFIRMATION); // 확인, 취소 버튼 타입
		alert.setHeaderText("정말 탈퇴하시겠습니까?");
		// 2. 버튼 확인 [ optional : 
		Optional<ButtonType> optional = alert.showAndWait(); // 실행 
		if(optional.get() == ButtonType.OK) { // 확인버튼을 눌렀을 때
			System.out.println("확인" + Login.member.getMnum()  );
			boolean result = MemberDao.memberDao.delate(Login.member.getMnum() ); // 왜 그러죠???? 이따가 다시 보죠...
			if(result) {
				// 페이지전환
				Main.instance.loadpage("/view/login/login.fxml");
				// 로그아웃
				Login.member = null;
			} // 탈퇴 성공
			else {} // 탈퇴 실패
		}
		else if(optional.get() == ButtonType.NO) {
			
		}
		
	}
	
	public void accinfo(MouseEvent e) {loadpage("/view/home/memberinfo.fxml");}
	
	public void update(MouseEvent e) {
		loadpage("/view/home/update.fxml");
	}
	
	public void accboard(MouseEvent e) {
		loadpage("/view/board/board.fxml");
	}
	@FXML // Sell을 클릭했을때
	public void accproduct(MouseEvent E) {
		loadpage("/view/product/product.fxml"); category = null; 
	}
	 @FXML
	    void backhome(MouseEvent event) {
		loadpage("/view/home/home.fxml");
	    }

	
}
