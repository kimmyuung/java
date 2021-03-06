package application.Day22;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DB테스트컨트롤러 implements Initializable{
									// fxml이 새로 열렸을때 초기값[처음값] 설정 메소드 제공
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { //초기값[처음값] 설정 메소드 제공
		Day22_2 DB연동 = new Day22_2(); // 생성자에 db연동 코드 넣었기 때문에 객체 선언시 연동실행
		
	}
	
    @FXML
    private TextField txtwriter;

    @FXML
    private TextField txtcontent;

    @FXML
    private Button btnget;

    @FXML
    private Button btnwrite;

    @FXML
    private TextArea txtcontentlist;

    @FXML
    void get(ActionEvent event) {
    	System.out.println("DB내 데이터를 호출합니다.");
    	// 1. db연동객체 만들기
    	Day22_2 db연동 = new Day22_2();
    	// 2. db 객체내 메소드 호출 후 결과를 리스트로 받기
    	ArrayList<데이터> 데이터목록 = db연동.get();
    	
    	// 3. 리스트를 컨트롤에 넣어주기
    	for(데이터 temp : 데이터목록) {
    		// txtcontentlist.appendText : 해당 컨트롤에 내용 추가
    		txtcontentlist.appendText(
    				 temp.get번호() + ". " +
      				 temp.get작성자() + " : " +
    				 temp.get내용() + "\n"
    				);
    	}
    }

    @FXML
    void write(ActionEvent event) {
    	System.out.println("DB내 데이터를 저장합니다.");
    	String 작성자 = txtwriter.getText(); 
    	// fxid명.getText() : 해당 컨트롤에 입력된 값을 가져오기
    	String 내용 = txtcontent.getText();
    	// 1. DB 연동 객체 만들기
    	Day22_2 db연동 = new Day22_2();
    	// 2. db연동 객체 내에서 삽입 메소드 호출
    	boolean result = db연동.writer(작성자, 내용);
    	if(result) {System.out.println("DB에 데이터 저장 성공");
    	// 성공시 컨트롤에 입력된 데이터 지워주기
    	txtwriter.setText(""); // 성공시 입력창 공백으로 변경
    	txtcontent.setText("");
    	}
    	else {System.out.println("DB에 데이터 저장 실패");}
    }


}
