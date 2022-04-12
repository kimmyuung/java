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
				// fxml ����� �ʱⰪ ���� �������̽�
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
    void accproduct1(MouseEvent event) { // ���� �Ƿ� ����
    	loadpage("/view/product/product.fxml"); category = "Men";
    }

    @FXML
    void accproduct2(MouseEvent event) { // ���� �Ƿ� ����
    	loadpage("/view/product/product.fxml"); category = "Women";
    }

    @FXML
    void accproduct3(MouseEvent event) { // ���ӱ�� ����
    	loadpage("/view/product/product.fxml"); category = "Game";
    }

    @FXML
    void accproduct4(MouseEvent event) { // ��Ȱ ����
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
	// ��ü
	public static Home home;
	// ������
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
	loginId.setText(Login.member.getMid() + "��");
	labelpoint.setText("����Ʈ : "+Login.member.getMpoint() + "��");
}
	@FXML // �α׾ƿ� ���̺��� Ŭ�������� �̺�Ʈ
	public void logout(MouseEvent E) {
		// 1. Login ���� �����
		Login.member = null;
		// 2. ������ ��ȯ
		Main.instance.loadpage("/view/login/login.fxml");
	}
	@FXML // ȸ��Ż�� ���̺��� Ŭ�������� �̺�Ʈ
	public void delate(MouseEvent E) {
		// 1. �޽��� ����
		Alert alert = new Alert(AlertType.CONFIRMATION); // Ȯ��, ��� ��ư Ÿ��
		alert.setHeaderText("���� Ż���Ͻðڽ��ϱ�?");
		// 2. ��ư Ȯ�� [ optional : 
		Optional<ButtonType> optional = alert.showAndWait(); // ���� 
		if(optional.get() == ButtonType.OK) { // Ȯ�ι�ư�� ������ ��
			System.out.println("Ȯ��" + Login.member.getMnum()  );
			boolean result = MemberDao.memberDao.delate(Login.member.getMnum() ); // �� �׷���???? �̵��� �ٽ� ����...
			if(result) {
				// ��������ȯ
				Main.instance.loadpage("/view/login/login.fxml");
				// �α׾ƿ�
				Login.member = null;
			} // Ż�� ����
			else {} // Ż�� ����
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
	@FXML // Sell�� Ŭ��������
	public void accproduct(MouseEvent E) {
		loadpage("/view/product/product.fxml"); category = null; 
	}
	 @FXML
	    void backhome(MouseEvent event) {
		loadpage("/view/home/home.fxml");
	    }

	
}
