package application;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Day21_1 extends Application{
					// Application JAVAFX GUI ���� Ŭ����	
					// ��ӹ����� ����Ŭ������ ����� ��� ����
	@Override // ���ø����̼� Ű�� ���� ����
	public void start(Stage stage) throws Exception {
	// javafx�� �����ϴ� �޼ҵ� [�߻� -> ����]
		// start(Stage ���������̸�)
		// 1. �����̳� ����� (������ ��Ʈ���� ���η� ����)
		VBox box = new VBox();
		// 2. ��Ʈ�� �����
		Button button = new Button();
		button.setText("�ݱ�");
		button.setOnAction(e -> Platform.exit());
						// �� -> �μ� ���ٽ�( �̸��� ���� �޼ҵ� )
		// 3. �����̳ʿ� ��Ʈ�� �ֱ�
		box.getChildren().add(button);
		// 4. ��(Scene) �����(���� �����̳� �ֱ�)
		Scene scene = new Scene(box, 500, 500); // �����̳� �̸�, ����, ����
		// 5. ���������� �� �ֱ�
		stage.setScene(scene);
		stage.show();	
		// ���� : �������� -> �� -> �����̳� -> �������� ��Ʈ��(��ư, �Է»���, ǥ ���)
	}
	public static void main(String[] args) { // ���� ������ ������ �ִ� �޼ҵ�
		launch(args); // start �޼ҵ� ȣ��
		// ������ â 1���� ���������� ��������...
		
	}
}
