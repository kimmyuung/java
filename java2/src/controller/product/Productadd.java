package controller.product;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Productadd implements Initializable{
	@FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontent;

    @FXML
    private TextField txtpprice;

    @FXML
    private Button btnimg;

    @FXML
    private RadioButton opt1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt2;

    @FXML
    private RadioButton opt3;

    @FXML
    private RadioButton opt4;

    @FXML
    private ImageView image;

    @FXML
    private Button btnproduct;

    @FXML
    private Button btnback;

    @FXML
    private Label txtpath;

    @FXML
    void add(ActionEvent event) {
    	// 1. ��Ʈ�ѿ� �Էµ� ������ ��������
    	String pname = txtpname.getText();
    	String pcontent = txtpcontent.getText();
    	int pprice = Integer.parseInt( txtpprice.getText() ) ;
    	
    	String pcategory = "";
    	if(opt1.isSelected()) { // ���࿡ opt1�̶�� fxid�� ��Ʈ���� ���õǾ�����
    		pcategory = "Men";
    	}
    	if(opt2.isSelected()) {	pcategory = "Women";}
    	if(opt3.isSelected()) { pcategory = "Game"; }
    	if(opt4.isSelected()) { pcategory = "Life"; }
    	int mnum = Login.member.getMnum();
    	
    	// 2. ��üȭ
    	Product product = new Product(0, pname, null, pcontent, pcategory, pprice, 1, null, mnum);
    	// 3. DBó��
    	boolean result = ProductDao.produtctDao.add(product);
    	// 4. ���ó��
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("��ǰ ��� ����!");
    		alert.showAndWait();
    		Home.home.loadpage("/view/product/product.fxml");
    	}
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("��ǰ ��� ����!");
    		alert.showAndWait();
    	}
    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");
    }
    private String pimg = null; // �޼ҵ� �ۿ��� �����ϴ� ���� : imgadd�޼ҵ�� add �޼ҵ忡�� ����ϱ� ����
    @FXML
    void imgadd(ActionEvent event) {
    	// 1. ���� ���� Ŭ����
    	FileChooser fileChooser = new FileChooser();
    	
    	// 2. ���� ����[����] ����
    	fileChooser.getExtensionFilters().add(
    			new ExtensionFilter("�̹�������:image file", "*png", "*jpeg", "*jpg", "*gif") );
    	// 3. ���ο� stage(������â)
    	File file = fileChooser.showOpenDialog(new Stage() );
    	
    	// 4. ������ ������ ���
    	txtpath.setText("���� ��� : " + file.getPath());
    	
    	// 5. ���ϰ��
    	pimg = file.toURI().toString();
    	// 6. �̸����� �̹�����Ʈ�ѿ� ����
    	Image image2 = new Image(pimg); // �ش� �̹����� ��� ������ /�� ���� �Ǿ� �־�� ��
    	image.setImage(image2); // ImageView�� �ش� �̹��� �־��ֱ�
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	
    }
}
