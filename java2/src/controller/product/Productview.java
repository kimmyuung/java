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
    	if(btnactivation.getText().equals("�ŷ� ��")) {
    		txtpactivation.setText("���� : �ŷ� ��"); btnactivation.setText("�Ǹ� �Ϸ�"); // ��Ʈ���� �� ���� 
    		ProductDao.produtctDao.activation(Productcontrol.select.getPnum() ); // DB ���� ����
    		Productcontrol.select.setPactivation(2); // ���õ� ��ǰ�� ���� ����
    		return;
    	}
    	if(btnactivation.getText().equals("�Ǹ� �Ϸ�")) {
    		txtpactivation.setText("���� : �Ǹ� �Ϸ�"); btnactivation.setText("�Ǹ� ��");
    		ProductDao.produtctDao.activation(Productcontrol.select.getPnum() );
    		Productcontrol.select.setPactivation(3);
    		return;
    	}
    	if(btnactivation.getText().equals("�Ǹ� ��")) {
    		txtpactivation.setText("���� : �Ǹ� ��"); btnactivation.setText("�ŷ� ��");
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
    	alert.setHeaderText("��ǰ�� �����Ͻðڽ��ϱ�?");
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
    	// 1. ��Ͽ��� ���õ� ��ǰ�� ��ü�� ȣ��
    Product product = Productcontrol.select;
    	image.setImage(new Image(product.getPimg()));
    	txttitle.setText(product.getPname());
    	txtcontent.setText(product.getPcontent());
    		// * õ���� ��ǥ
    		DecimalFormat decimalFormat = new DecimalFormat("���� : #,##0��");
    	txtpprice.setText(decimalFormat.format(product.getPprice()));
    	txtmid.setText("��� ȸ�� : " + product.getMnum());
    	txtpdate.setText("��ǰ ����� : " + product.getPdate());
    	if(product.getPactivation() == 1) {
    		txtpactivation.setText("���� : �Ǹ� ��");
    		btnactivation.setText("�ŷ� ��");
    		}
    	if(product.getPactivation() == 2) {
    		txtpactivation.setText("���� : �ŷ� ��");
    		btnactivation.setText("�Ǹ� �Ϸ�");
    		}
    	if(product.getPactivation() == 3) {
    		txtpactivation.setText("���� : �Ǹ� �Ϸ�");
    		btnactivation.setText("�Ǹ� ��");
    		}
    	// ȸ����ȣ�� �̿��� ȸ�� id ã�� [ Dao���� �޼ҵ� �̿� ] 
    	txtmid.setText("��ǰ ���ȸ�� : " + MemberDao.memberDao.getmid(product.getMnum() ) );
    	txttitle.setEditable(false);
    	txtcontent.setEditable(false);
    	// * ��ǰ���ȸ���� �α��ε�ȸ���� �������� ������
    	if(product.getMnum() != Login.member.getMnum()) {
    		btndelete.setVisible(false);
    		btnupdate.setVisible(false);
    	}
    }
}
