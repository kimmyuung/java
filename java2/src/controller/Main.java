package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

	
	
public class Main implements Initializable{
	// Initializable : view가 열렸을 때 초기값 설정 메소드 제공
	
	public static Main instance;
	public Main() {
		instance = this;
	}
	@FXML
    private BorderPane borderpane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("Main 뷰가 실행되었습니다.");
		loadpage("/view/login/login.fxml");
	}
	public void loadpage(String page) {// 파일 경로를 인수로 받음
		try {
			// 페이지(fxml) 객체화
		Parent parent = FXMLLoader.load(getClass().getResource(page)); // 해당 파일 불러오기
		borderpane.setCenter(parent); // main.fxml에 존재하는 borderpane객체내 center를 해당 파일로 변경
		// 컨테이너 가운데에 다른 페이지 넣기
		}catch(Exception e) {System.out.println("페이지 연결 실패!" );}
	}
	
}
