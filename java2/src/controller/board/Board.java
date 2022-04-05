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
	    private TableView<dto.Board> boardtable; // ���̺� ���� �ڷ��� ���� [ ���̺� �Խù� ǥ���ϱ� ���� ]

	    @FXML
	    private Button btnwrite;

	    public static dto.Board board; // ���̺��� Ŭ���� ��ü�� �����ϴ� ��ü
	    
	    @FXML
	    void accwrite(ActionEvent event) {
	    	// * HomeŬ������ borderpane center ����
	    	Home.home.loadpage("/view/board/boardwrite.fxml");
	    }
	    
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	// 1. db���� ��� �Խñ� ��������
	    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
	    	TableColumn tc = boardtable.getColumns().get( 0 );
	    		// TableColumn : ���̺� ��
	    		// boardtable(fxid).getColumns().get(0); : 0��° �� ȣ��
	    	// 2. tableview�� �߰�
	    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
	    	// tc.setCellValueFactory(new PropertyValueFactory<>"����Ʈ �� �ʵ��");
	    	
	    	
	    	// ���̺��� �ι�°�� ��������
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
	    	
	    	// 3. tableview�� list ����
	    	boardtable.setItems(boardlist);;
	    	// ���̺��(fxid).setItems( ObservableList ); // ���̺� ǥ���� ����Ʈ(arraylist �Ұ�) ����
	    	
	    	// * tableview ���� �ش� ���� Ŭ�������� �̺�Ʈ
    		//boardtable.setOnMouseClicked( �μ� -> { �����ڵ� } ) : ���̺��� Ŭ��������
	    	
	    	boardtable.setOnMouseClicked(e -> {
	    		board = boardtable.getSelectionModel().getSelectedItem() ;
	    		
	    		Home.home.loadpage("/view/board/boardview.fxml");
	    	});
	    	
	    	// -> ���ٽ� (�͸��Լ� : �̸��� ���� �Լ� [ �μ��� �����ڵ常 ���� ])
	    }
}
