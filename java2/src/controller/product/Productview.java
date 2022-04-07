package controller.product;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.home.Home;
import controller.login.Login;
import dao.MemberDao;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Productview implements Initializable{
	@FXML
    private ImageView image;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btnback;

    @FXML
    private Button btndelete;

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextField txttitle;

    @FXML
    private Label txtpdate;

    @FXML
    private Label txtmid;

    @FXML
    private Label txtpprice;

    @FXML
    private Label txtpactivation;
    @FXML
    private Button btnactivation;

    @FXML
    void activation(ActionEvent event) {
    	if(btnactivation.getText().equals("거래 중")) {
    		txtpactivation.setText("상태 : 거래 중"); btnactivation.setText("판매 완료"); // 컨트롤의 값 변경 
    		ProductDao.produtctDao.activation(Productcontrol.select.getPnum() ); // DB 상태 변경
    		Productcontrol.select.setPactivation(2); // 선택된 제품의 상태 변경
    		return;
    	}
    	if(btnactivation.getText().equals("판매 완료")) {
    		txtpactivation.setText("상태 : 판매 완료"); btnactivation.setText("판매 중");
    		ProductDao.produtctDao.activation(Productcontrol.select.getPnum() );
    		Productcontrol.select.setPactivation(3);
    		return;
    	}
    	if(btnactivation.getText().equals("판매 중")) {
    		txtpactivation.setText("상태 : 판매 중"); btnactivation.setText("거래 중");
    		ProductDao.produtctDao.activation(Productcontrol.select.getPnum() );
    		Productcontrol.select.setPactivation(1);
    		return;
    	}
    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("제품을 삭제하시겠습니까?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		ProductDao.produtctDao.delete(Productcontrol.select.getPnum());
    		Home.home.loadpage("/view/product/product.fxml");
    	}
    }

    @FXML
    void update(ActionEvent event) {
    	Home.home.loadpage("/view/product/productupdate.fxml");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// 1. 목록에서 선택된 제품의 객체를 호출
    Product product = Productcontrol.select;
    	image.setImage(new Image(product.getPimg()));
    	txttitle.setText(product.getPname());
    	txtcontent.setText(product.getPcontent());
    		// * 천단위 쉼표
    		DecimalFormat decimalFormat = new DecimalFormat("가격 : #,##0원");
    	txtpprice.setText(decimalFormat.format(product.getPprice()));
    	txtmid.setText("등록 회원 : " + product.getMnum());
    	txtpdate.setText("제품 등록일 : " + product.getPdate());
    	if(product.getPactivation() == 1) {
    		txtpactivation.setText("상태 : 판매 중");
    		btnactivation.setText("거래 중");
    		}
    	if(product.getPactivation() == 2) {
    		txtpactivation.setText("상태 : 거래 중");
    		btnactivation.setText("판매 완료");
    		}
    	if(product.getPactivation() == 3) {
    		txtpactivation.setText("상태 : 판매 완료");
    		btnactivation.setText("판매 중");
    		}
    	// 회원번호를 이용한 회원 id 찾기 [ Dao에서 메소드 이용 ] 
    	txtmid.setText("제품 등록회원 : " + MemberDao.memberDao.getmid(product.getMnum() ) );
    	txttitle.setEditable(false);
    	txtcontent.setEditable(false);
    	// * 제품등록회원과 로그인된회원이 동일하지 않으면
    	if(product.getMnum() != Login.member.getMnum()) {
    		btndelete.setVisible(false);
    		btnupdate.setVisible(false);
    	}
    }
}
