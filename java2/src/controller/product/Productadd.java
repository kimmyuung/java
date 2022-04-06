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
    	// 1. 컨트롤에 입력된 데이터 가져오기
    	String pname = txtpname.getText();
    	String pcontent = txtpcontent.getText();
    	int pprice = Integer.parseInt( txtpprice.getText() ) ;
    	
    	String pcategory = "";
    	if(opt1.isSelected()) { // 만약에 opt1이라는 fxid의 컨트롤이 선택되었으면
    		pcategory = "Men";
    	}
    	if(opt2.isSelected()) {	pcategory = "Women";}
    	if(opt3.isSelected()) { pcategory = "Game"; }
    	if(opt4.isSelected()) { pcategory = "Life"; }
    	int mnum = Login.member.getMnum();
    	
    	// 2. 객체화
    	Product product = new Product(0, pname, null, pcontent, pcategory, pprice, 1, null, mnum);
    	// 3. DB처리
    	boolean result = ProductDao.produtctDao.add(product);
    	// 4. 결과처리
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("제품 등록 성공!");
    		alert.showAndWait();
    		Home.home.loadpage("/view/product/product.fxml");
    	}
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("제품 등록 실패!");
    		alert.showAndWait();
    	}
    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");
    }
    private String pimg = null; // 메소드 밖에서 선언하는 이유 : imgadd메소드와 add 메소드에서 사용하기 위해
    @FXML
    void imgadd(ActionEvent event) {
    	// 1. 파일 선택 클래스
    	FileChooser fileChooser = new FileChooser();
    	
    	// 2. 파일 선택[필터] 형식
    	fileChooser.getExtensionFilters().add(
    			new ExtensionFilter("이미지파일:image file", "*png", "*jpeg", "*jpg", "*gif") );
    	// 3. 새로운 stage(윈도우창)
    	File file = fileChooser.showOpenDialog(new Stage() );
    	
    	// 4. 선택할 파일의 경로
    	txtpath.setText("파일 경로 : " + file.getPath());
    	
    	// 5. 파일경로
    	pimg = file.toURI().toString();
    	// 6. 미리보기 이미지컨트롤에 띄우기
    	Image image2 = new Image(pimg); // 해당 이미지의 경로 구분이 /로 구분 되어 있어야 함
    	image.setImage(image2); // ImageView에 해당 이미지 넣어주기
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	
    }
}
