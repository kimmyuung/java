package Day06;

public class Day06_2 { // c  s

	public static void main(String[] args) { // m  s
		
		Car mycar = new Car(); // <--------- ���赵 ������ ����Ұ�
		// 1. Car : ���ǵ� Ŭ������
		// 2. mycar : ��ü�̸� [�ƹ��ų�]
		// 3. new : �޸� �Ҵ� ������
		// 4. Car() : ������????
		
		// 2. ��ü�� �ʵ� ȣ�� [. : ���ٿ�����(��ü�� �������)]
		System.out.println("����ȸ�� 	: " + mycar.company);
		System.out.println("�𵨸� 	: " + mycar.model);
		System.out.println("���� 	: " + mycar.color);
		System.out.println("�ְ�ӵ�	: " + mycar.maxspeed);
		System.out.println("����ӵ� 	: " + mycar.speed);
		// mycar ��ü�� �ʵ� ����
		// mycar(��ü��).����̸� -> ��� ȣ��
		
		// ��ü �� �ʵ尪 ����
		mycar.speed = 60;
		// mycar ��ü�� speed �ʵ� ȣ���Ͽ� 60�̶�� �����͸� ����
		System.out.println("������ �ӵ� : " + mycar.speed);
		
		// ���ο� �ڵ��� ��ü ����
		Car yourcar = new Car();
		System.out.println("2�� �ڵ��� : " + yourcar.speed);
	
	
	} // m  e
} // c  e
