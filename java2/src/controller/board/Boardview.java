package controller.board;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.BoardDao;
import dto.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class Boardview implements Initializable {

    @FXML
    private AnchorPane board;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnrewrite;

    @FXML
    private Button btnback;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label labeldate;

    @FXML
    private Label labelwriter;

    @FXML
    private Label labelview;

    @FXML
    private TextArea txtreply;

    @FXML
    private TableView<Reply> replytable;

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/board/board.fxml");
    }
    
    public void replytableshow() {
    	// 현재 게시물 번호
    	int bnum = controller.board.Board.board.getBnum();
    	// 
    	ObservableList<Reply> replylist = BoardDao.boardDao.replylist(bnum);
    	// 3.
    	TableColumn tc = replytable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
    	
    	tc = replytable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));
    	
    	tc = replytable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
    	
    	tc = replytable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
    	
    	// 테이블뷰에 저장
    	replytable.setItems(replylist);
    }

    @FXML
    void delete(ActionEvent event) {
    	// 경고메시지 알림
    	// 확인버튼 눌렀을때
    	// 삭제 처리
    // 1. 메시지 설정
    	Alert alert = new Alert(AlertType.CONFIRMATION); // 확인, 취소 버튼 타입
    	alert.setHeaderText("정말 삭제하시겠습니까?");
    // 2. 버튼 확인 [ optional : 
    	Optional<ButtonType> optional = alert.showAndWait(); // 실행 
    	if(optional.get() == ButtonType.OK) { // 확인버튼을 눌렀을 때
    		boolean result = BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
    				if(result) {
    				BoardDao.boardDao.delete(controller.board.Board.board.getBnum() );	
    				
    			// 페이지전환
    			Home.home.loadpage("/view/board/board.fxml");
    			
    			} // 삭제 성공
    }
    }
    @FXML
    void rewrite(ActionEvent event) { // 댓글 작성 버튼을 눌렀을 때
    	// 컨트롤에 입력된 데이터가져오기
    	String rcontent = txtreply.getText();
    	// 2. 현재 로그인된 정보에서 아이디 가져오기
    	String rwrite = Login.member.getMid();
    	// 3. 현재 테이블뷰에서 클릭된 게시물의 게시물 번호 가져오기
    	int bnum = controller.board.Board.board.getBnum();
    	// 객체화
    	Reply reply = new Reply(0, rcontent, rwrite, null, bnum);
    	// db처리
    	boolean result = BoardDao.boardDao.rwrite(reply);
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("댓글 등록 성공!");
    		alert.showAndWait();
    		// 댓글 입력창 닫기
    		txtreply.setText("");
    		// 댓글 작성 후 테이블 새로고침
    		replytableshow();
    	}
    }
    boolean upcheck = true; // 수정 버튼 스위치 변수
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		if(upcheck) {
    	alert.setHeaderText("게시글 수정후 수정 완료 버튼 눌러주세요");
		alert.showAndWait();
		txttitle.setEditable(true);
		txtcontent.setEditable(true);
		btnupdate.setText("수정 완료");
		upcheck = false; }
		else { // 수정 완료
			// db처리
			BoardDao.boardDao.update(controller.board.Board.board.getBnum(), 
					txttitle.getText(), 
					txtcontent.getText() );
			
			alert.setHeaderText("수정이 완료 되었습니다.");
			alert.showAndWait();
			txttitle.setEditable(false);
			txtcontent.setEditable(false);
			btnupdate.setText("수정");
			upcheck = true;
		}
    }
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	replytableshow();
	dto.Board board = controller.board.Board.board; // board컨트롤내 테이블에서 선택된 객체 호출
	
	labelwriter.setText("작성자 : " + board.getBwrite());
	labeldate.setText("작성일 : " + board.getBdate());
	labelview.setText("조회수 : " + board.getBview());
	txttitle.setText(board.getBtitle());
	txtcontent.setText(board.getBcontent());
	if(! board.getBwrite().equals(Login.member.getMid() ) ) {
		btndelete.setVisible(false); // 버튼 숨기기
		btnupdate.setVisible(false); // false = 버튼 숨기기 true = 버튼 보이기
		
	}
	// 텍스트필드 컨트롤 수정 못하게 잠금처리
	txttitle.setEditable(false);
	txtcontent.setEditable(false);
}
}
