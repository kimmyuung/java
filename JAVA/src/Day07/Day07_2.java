package Day07;

public class Day07_2 { // cs
	public static void main(String[] args) { // ms
		Car mycar = new Car(); // ��ü����(������� = �⺻������)
		
		// �޼ҵ� ȣ�� 
		mycar.setGas(5);
		
		
		if(mycar.isLeftGas()) {
					System.out.println("����մϴ�.");
					mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		} else System.out.println("gas�� �����ϼ���");
	} // me
} // ce
