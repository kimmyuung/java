package app;

import controller.Chatting;
import controller.login.Login;
import dao.RoomDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application{
@Override
public void start(Stage stage) throws Exception {
		// 5. 컨테이너 불러오기
	Parent parent = 
			FXMLLoader.load(getClass().getResource("/view/main.fxml"));
	Scene scene = new Scene(parent);
	stage.setScene(scene);
	Image image = new Image("/img/stagelogo.jpg");
	// 1. 이미지 불러오기
	// Image image = new Image("C:/Users/505-t/git/ezen_Webezen_web_2022_A/java2/src/img/stagelogo.jpeg"); 
	// 절대경로 vs 상대경로
	
	stage.getIcons().add(image);
	
	// * 외부폰트 설정
		// 1. 폰트 가져오기
		Font.loadFont( getClass().getResourceAsStream("Jaemin_v2.ttf"), 15);
		// 2. 외부 스타일시트 적용
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm() );
		// stage = 윈도우창에 x버튼 눌렀을때
		stage.setOnCloseRequest(e -> {
			if(Login.member != null) {
				// 1. 방 접속명단 삭제
				RoomDao.roomDao.roomlivedelete(Login.member.getMid());
				// 2. 방 삭제
				if(Chatting.selectroom != null) {
					// 만약에 방에 접속되어 있는 상태이면
					RoomDao.roomDao.roomdelete(Chatting.selectroom.getRonum());
				}
				// 3. 선택 방 초기화
				Chatting.selectroom = null;
			}
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("종료되었습니다.");
		});
	stage.setResizable(false); // 스테이지 크기 변경 불가
	stage.setTitle("이젠마켓"); // 스테이지 열기
	stage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
