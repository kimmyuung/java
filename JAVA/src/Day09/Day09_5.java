package Day09;

public class Day09_5 {
public static void main(String[] args) {
	
	Car mycar = new Car();
	
	for(int i = 1; i <= 5; i++) {
		int problemLocation = mycar.run(); 
		// �ڵ��� ȸ�� �޼ҵ� ȣ��
		// ��ũ�� ��ġ 
	switch(problemLocation) {
	case 1 : 
		System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
		mycar.frontLeftTire = new HankookTire(15, "�տ���");
		// ����Ŭ���� ��ü�� = new ����Ŭ����(); 
		// ����� ������ ����!!!
		break;
	case 2 : 
		System.out.println("�տ����� �ѱ�Ÿ�̾� ��ü");
		mycar.frontRightTire = new KumhoTire(13, "�տ�����");
		// ����Ŭ���� ��ü�� = new ����Ŭ����();
		break;
	case 3 : 
		System.out.println("�ڿ��� �ѱ�Ÿ�̾� ��ü");
		mycar.backLeftTire = new HankookTire(14, "�ڿ���");
		// ����Ŭ���� ��ü�� = new ����Ŭ����();
		break;
	case 4 : 
		System.out.println("�ڿ����� �ѱ�Ÿ�̾� ��ü");
		mycar.backRightTire = new KumhoTire(17, "�ڿ�����");
		// ����Ŭ���� ��ü�� = new ����Ŭ����();
		break;
	// ���ÿ� ���� ���� �ƴϱ⶧���� ������ ������ ��ũ�� �� �ȳ�!
			}
	System.out.println("---------------");
		}	
	}
}
