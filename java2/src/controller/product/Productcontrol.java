package controller.product;

import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class Productcontrol implements Initializable{

    @FXML
    private Button btnadd;

    @FXML
    private ScrollPane scrollpane;

    @FXML
    private VBox vbox;

    @FXML
    private Button btnback;
    
    @FXML
    void accadd(ActionEvent event) {
    	Home.home.loadpage("/view/product/productadd.fxml");
    }
    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/home/home.fxml");
    }

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	
}
