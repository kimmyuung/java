package Day07;

public class Car2 {
	// Ŭ���� ����
	
	// 1. �ʵ�
	int speed;
	// 2. ������
	
	// 3. �޼ҵ�
	// ���� �ʵ尪�� ��ȯ���ִ� �޼ҵ�
	int getspeed() { // �μ� x, ��ȯ o
		return speed;
	}
	// ��� �޼ҵ�
	void keyTurnon() { // �μ� x, ��ȯ x
		System.out.println("Ű�� �����ϴ�");
	}
	// ���ǵ� ���� �޼ҵ�
	void run() { // �μ� x, ��ȯ x
		for(int i = 10; i <= 50; i+=10) {
			speed = i; // i�� 10���� 50���� 10�������ϸ� �ݺ� -> 5ȸ
			System.out.println("�޸��ϴ�.(�ü� : " + speed + "km/h");
		}
	}
	
}
