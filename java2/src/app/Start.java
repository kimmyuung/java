package app;

import controller.Chatting;
import controller.login.Login;
import dao.RoomDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
		// stage = ������â�� x��ư ��������
		stage.setOnCloseRequest(e -> {
			if(Login.member != null) {
				// 1. �� ���Ӹ�� ����
				RoomDao.roomDao.roomlivedelete(Login.member.getMid());
				// 2. �� ����
				if(Chatting.selectroom != null) {
					// ���࿡ �濡 ���ӵǾ� �ִ� �����̸�
					RoomDao.roomDao.roomdelete(Chatting.selectroom.getRonum());
				}
				// 3. ���� �� �ʱ�ȭ
				Chatting.selectroom = null;
			}
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("����Ǿ����ϴ�.");
		});
	stage.setResizable(false); // �������� ũ�� ���� �Ұ�
	stage.setTitle("��������"); // �������� ����
	stage.show();
}
public static void main(String[] args) {
	launch(args);
}
}
