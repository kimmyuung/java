package Day15;

public class Day15_4 {

	// 12�� : ������
		// �ڵ� -> ���� -> ���μ���[���α׷�]
		// ���� : ����ó��
		// main �޼ҵ忡 main ������ ����
		// �����
			// 1. Thread Ŭ����
	
			// 2. Runnable �������̽�
		// run �޼ҵ� : ��Ƽ�������� �����ڵ�
	
	// ��1) Thread Ŭ������ �̿��� ���� ó��
public static void main(String[] args) {
	���� m1 = new ����();
	m1.start(); // run�޼ҵ� ���� -> ������ ����
	// ��2) Runnable �������̽��� �̿��� ����ó�� ��ü �����
	ä�� c1 = new ä��();
	//c1.start(); // �������̽��� start()�޼ҵ尡 ����
	Thread thread = new Thread(c1);
	thread.start();
	
	while(true) {
		System.out.println("���α׷� �۵���");
		try{Thread.sleep(500);}catch(Exception e) {}
	}
	
	
	
	
}
}
