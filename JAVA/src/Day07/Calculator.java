package Day07;

public class Calculator {
 // Ŭ���� ����
	
	// 1. �ʵ�
	// 2. ������ : ���� ������ ���� ������ �⺻�����ڰ� �ڵ� �߰�
	// �⺻������ : �Ű�����(�μ�)�� ����. -> Calculator();

	// 3. �޼ҵ�
		// 1. ����Ÿ�� : void(= �Լ��� ����Ǹ鼭 ������ �����Ͱ� ����)
		// 2. �޼ҵ� �̸� : powerOn
		// 3. (�Ű�����[�μ�]) : �Լ��� ������ �����͵�
		// 4. {���� �ڵ�} : �Լ� �����
	void powerOn() {// method s
		// powerOn : �μ��� ����(), ��ȯ�� ����(void)
		System.out.println("������ ŵ�ϴ�.");
	} // method e
	
	int plus(int x, int y) { // �μ� O, ��ȯ O
		int result = x + y;
		return result;
	}
	// int : ����Ÿ��[�Լ��� ����Ǹ鼭 int�� �����Ͱ� ��ȯ]
	// plus : �޼ҵ��̸�[�ƹ��ų�]
	// (int x, int y) : �Լ� ȣ��� �Լ��� ������ x�� y�� int������ ����
	//					= int�� 2�� �Ű����� �ޱ�
	// return result : ���� ������ ��
		// ����Ÿ���� int �̱⶧���� return���� ������ int�� �����Ͱ� �Է¹ް� ��µǾ�� ��
	// { ����� } : 
	double divide(int x, int y) { // �μ� O, ��ȯ O
		double result = (double)x / (double)y;
		// (�ڷ���) ������ : ��������ȯ
			// int �� ���� -> double ���� 
				// ������ �� �Ҽ����� ���� ���� �ֱ� ����
		return result; // ����� -----> �޼ҵ� ȣ���� ������ �̵�
	}
	void powerOff() {// method s
		// powerOff : �μ��� ����(), ��ȯ�� ����(void)
		System.out.println("������ ���ϴ�.");	
	} // method e
	
	
	
}
