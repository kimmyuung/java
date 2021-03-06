package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dto.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Login implements Initializable{
	// 해당 클래스의 메모리를 반환하는 메소드 필요
	// 1. 현재 클래스로 객체 선언
	public static Login 본인객체;
	// * 생성자
	// 2. 생성자에서 객체내에 this 넣기
	public Login () {
		본인객체 = this; // super : 슈퍼클래스(상속) // this : 현클래스
		// this : 현재클래스 자체 메모리 호출
	}
	public static Login get본인객체() {
		return 본인객체;
	}
	// 로그인 성공한 회원객체 [ static 사용하는 이유 : 다른 클래스에서 호출하기 위해 ] 
	public static Member member;
	
	@FXML
	private MediaView mediaview;
    @FXML
    private BorderPane borderpane;
    
   
	@Override
public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
		// 1. 동영상 삽입하기
					// 1. 동영상파일 객체화
					Media media = new Media( getClass().getResource("/img/login.mp4").toString());
					// 2. 미디어플레이어 객체에 동영상 넣기 
					MediaPlayer mediaPlayer = new MediaPlayer(media);
					// 3. 미디어뷰에 미디어플레이어 넣기 
					mediaview.setMediaPlayer(mediaPlayer);
					// 4. 미디어플레이어 시작
					mediaPlayer.play();
					mediaPlayer.setOnEndOfMedia(new Runnable() {
						@Override
						public void run() { // 멀티 스레드
							mediaPlayer.seek(Duration.ZERO);
							// 미디어의 위치를 처음으로 돌리기
						}
					 } ) ;
	loadpage("/view/login/loginpane.fxml");
}
	
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch(Exception e) {System.out.println("해당 파일 없음" + e );}
	}
	
}
