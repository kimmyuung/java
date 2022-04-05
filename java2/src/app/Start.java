package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application{
@Override
public void start(Stage stage) throws Exception {
		// 5. �����̳� �ҷ�����
	Parent parent = 
			FXMLLoader.load(getClass().getResource("/view/main.fxml"));
	Scene scene = new Scene(parent);
	stage.setScene(scene);
	Image image = new Image("/img/stagelogo.jpg");
	// 1. �̹��� �ҷ�����
	// Image image = new Image("C:/Users/505-t/git/ezen_Webezen_web_2022_A/java2/src/img/stagelogo.jpeg"); 
	// ������ vs �����
	
	stage.getIcons().add(image);
	
	// * �ܺ���Ʈ ����
		// 1. ��Ʈ ��������
		Font.loadFont( getClass().getResourceAsStream("Jaemin_v2.ttf"), 15);
		// 2. �ܺ� ��Ÿ�Ͻ�Ʈ ����
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm() );
		
	stage.setResizable(false); // �������� ũ�� ���� �Ұ�
	stage.setTitle("��������"); // �������� ����
	stage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
