package Day07;

public class Day07_1 { // cs
	public static void main(String[] args) { // ms
		
		// ��ü���� ���α׷� : ��ǰ�� �����Ͽ� �ϼ��� ��ǰ
		// �޼ҵ�(=�Լ�) : 1. main �޼ҵ�
		// �޼ҵ� ȣ�� ���� : print(), printIn(), .equals(), nextInt()...
			//
	    // �޼ҵ� ���� : ���ϰ�, �޼ҵ��, �Ű���, �����
		// 1. �μ� O ��ȯ O : �Լ��� ������ �� O // �Լ��� ������ �� O
		// 1. �μ� O ��ȯ X : �Լ��� ������ �� O // �Լ��� ������ �� X
		// 1. �μ� X ��ȯ O : �Լ��� ������ �� X // �Լ��� ������ �� O
		// 1. �μ� X ��ȯ X : �Լ��� ������ �� X // �Լ��� ������ �� X
		
		// 1. �Լ� ��� ���� : �ڵ� ��Ȱ�� + �μ��� ���� ����� ���� �ٸ�
		// -> 100���� �Ѵ� �ڵ带 �ۼ��ϱ� ���ٴ� �ѹ� �ڵ带 �ۼ��ϰ� �׸� �޼ҵ�ȭ�Ͽ� ȣ���ϴ°��� ȿ����
		// 2. �޼ҵ� ȣ�� ���
			// 1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			// 2. ��ü��.�޼ҵ��() : ex) scanner.nextInt();
			// . : ���ٿ�����(�ʵ峪 �޼ҵ� ȣ��� ���)
		// 1. ��ü ����
			Calculator myCalc = new Calculator();
			// Ŭ������ ��ü��(�̸�) = �޸��Ҵ� ������;
		// 2. �޼ҵ� ȣ��
			myCalc.powerOn();
		// 3. �޼ҵ� ȣ�� [�μ� 2��]
			int result1 = myCalc.plus(5, 6);
			// �޼ҵ忡 5�� 6�� ���� �Ŀ� 11�̶�� ������� �޾Ƽ� ������ ����
			System.out.println("result1 : "+ result1);
			// 5 = int x, 6 = int y
			
			byte x = 10;
			byte y = 4;
			double result2 = myCalc.divide(x, y);
			System.out.println("result2 : "+ result2);
			
			myCalc.powerOff();
	} // me
} // ce 
