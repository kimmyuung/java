package Day07;

public class Calculator2 {
	// 1. �ʵ�
	
	// 2. ������
	
	// 3. �޼ҵ�
	void excute() { // �μ� x, ��ȯ x, ����޼ҵ�
		double result = avg(7, 10); // ���ο��� ȣ��� .��ü �ʿ����
		printIn("������ : " + result);
	}
	
	double avg(int x, int y) { // ��� �޼ҵ�
		// �μ� O, ��ȯ O
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
		}
	int plus(int x, int y) { 
		// �μ� O, ��ȯ O, ���ϱ� �޼ҵ�
		int result = x + y;
		return result;
	}
	void printIn(String message) { 
		// �μ� x, ��ȯ x, ��� ��� �޼ҵ�
		System.out.println(message);
	}
}
