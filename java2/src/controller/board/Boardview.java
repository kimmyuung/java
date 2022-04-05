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
    	// ���� �Խù� ��ȣ
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
    	
    	// ���̺�信 ����
    	replytable.setItems(replylist);
    }

    @FXML
    void delete(ActionEvent event) {
    	// ���޽��� �˸�
    	// Ȯ�ι�ư ��������
    	// ���� ó��
    // 1. �޽��� ����
    	Alert alert = new Alert(AlertType.CONFIRMATION); // Ȯ��, ��� ��ư Ÿ��
    	alert.setHeaderText("���� �����Ͻðڽ��ϱ�?");
    // 2. ��ư Ȯ�� [ optional : 
    	Optional<ButtonType> optional = alert.showAndWait(); // ���� 
    	if(optional.get() == ButtonType.OK) { // Ȯ�ι�ư�� ������ ��
    		boolean result = BoardDao.boardDao.delete(controller.board.Board.board.getBnum());
    				if(result) {
    				BoardDao.boardDao.delete(controller.board.Board.board.getBnum() );	
    				
    			// ��������ȯ
    			Home.home.loadpage("/view/board/board.fxml");
    			
    			} // ���� ����
    }
    }
    @FXML
    void rewrite(ActionEvent event) { // ��� �ۼ� ��ư�� ������ ��
    	// ��Ʈ�ѿ� �Էµ� �����Ͱ�������
    	String rcontent = txtreply.getText();
    	// 2. ���� �α��ε� �������� ���̵� ��������
    	String rwrite = Login.member.getMid();
    	// 3. ���� ���̺�信�� Ŭ���� �Խù��� �Խù� ��ȣ ��������
    	int bnum = controller.board.Board.board.getBnum();
    	// ��üȭ
    	Reply reply = new Reply(0, rcontent, rwrite, null, bnum);
    	// dbó��
    	boolean result = BoardDao.boardDao.rwrite(reply);
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("��� ��� ����!");
    		alert.showAndWait();
    		// ��� �Է�â �ݱ�
    		txtreply.setText("");
    		// ��� �ۼ� �� ���̺� ���ΰ�ħ
    		replytableshow();
    	}
    }
    boolean upcheck = true; // ���� ��ư ����ġ ����
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
		if(upcheck) {
    	alert.setHeaderText("�Խñ� ������ ���� �Ϸ� ��ư �����ּ���");
		alert.showAndWait();
		txttitle.setEditable(true);
		txtcontent.setEditable(true);
		btnupdate.setText("���� �Ϸ�");
		upcheck = false; }
		else { // ���� �Ϸ�
			// dbó��
			BoardDao.boardDao.update(controller.board.Board.board.getBnum(), 
					txttitle.getText(), 
					txtcontent.getText() );
			
			alert.setHeaderText("������ �Ϸ� �Ǿ����ϴ�.");
			alert.showAndWait();
			txttitle.setEditable(false);
			txtcontent.setEditable(false);
			btnupdate.setText("����");
			upcheck = true;
		}
    }
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	replytableshow();
	dto.Board board = controller.board.Board.board; // board��Ʈ�ѳ� ���̺��� ���õ� ��ü ȣ��
	
	labelwriter.setText("�ۼ��� : " + board.getBwrite());
	labeldate.setText("�ۼ��� : " + board.getBdate());
	labelview.setText("��ȸ�� : " + board.getBview());
	txttitle.setText(board.getBtitle());
	txtcontent.setText(board.getBcontent());
	if(! board.getBwrite().equals(Login.member.getMid() ) ) {
		btndelete.setVisible(false); // ��ư �����
		btnupdate.setVisible(false); // false = ��ư ����� true = ��ư ���̱�
		
	}
	// �ؽ�Ʈ�ʵ� ��Ʈ�� ���� ���ϰ� ���ó��
	txttitle.setEditable(false);
	txtcontent.setEditable(false);
}
}
