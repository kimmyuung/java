package controller.board;

import java.net.URL;
import java.util.ResourceBundle;
import controller.home.Home;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class Board implements Initializable{

	    @FXML
	    private TableView<dto.Board> boardtable; // 테이블에 넣을 자료형 선택 [ 테이블에 게시물 표시하기 위해 ]

	    @FXML
	    private Button btnwrite;

	    public static dto.Board board; // 테이블에서 클릭한 객체를 저장하는 객체
	    
	    @FXML
	    void accwrite(ActionEvent event) {
	    	// * Home클래스내 borderpane center 변경
	    	Home.home.loadpage("/view/board/boardwrite.fxml");
	    }
	    
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	// 1. db에서 모든 게시글 가져오기
	    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
	    	TableColumn tc = boardtable.getColumns().get( 0 );
	    		// TableColumn : 테이블 열
	    		// boardtable(fxid).getColumns().get(0); : 0번째 열 호출
	    	// 2. tableview에 추가
	    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
	    	// tc.setCellValueFactory(new PropertyValueFactory<>"리스트 내 필드명");
	    	
	    	
	    	// 테이블에서 두번째열 가져오기
	    	tc = boardtable.getColumns().get(1);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));
	    	
	    	tc = boardtable.getColumns().get(2);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("bcontent"));
	    	
	    	tc = boardtable.getColumns().get(3);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));
	    	
	    	tc = boardtable.getColumns().get(4);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));
	    	
	    	tc = boardtable.getColumns().get(5);
	    	tc.setCellValueFactory(new PropertyValueFactory<>("bview"));
	    	
	    	// 3. tableview에 list 연결
	    	boardtable.setItems(boardlist);;
	    	// 테이블명(fxid).setItems( ObservableList ); // 테이블에 표시할 리스트(arraylist 불가) 설정
	    	
	    	// * tableview 에서 해당 셀을 클릭했을때 이벤트
    		//boardtable.setOnMouseClicked( 인수 -> { 실행코드 } ) : 테이블을 클릭했을때
	    	
	    	boardtable.setOnMouseClicked(e -> {
	    		board = boardtable.getSelectionModel().getSelectedItem() ;
	    		
	    		Home.home.loadpage("/view/board/boardview.fxml");
	    	});
	    	
	    	// -> 람다식 (익명함수 : 이름이 없는 함수 [ 인수와 실행코드만 존재 ])
	    }
}
