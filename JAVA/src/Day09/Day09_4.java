package Day09;

public class Day09_4 {
	public static void main(String[] args) {
		// @Override : ������
		// ���� ���� �μ��� �޼ҵ�� �Ұ���
		// ���� : ������ �޼ҵ带 ������(=����)
			// ��� �޾Ҵ��� �޼ҵ尡 ���� �ȵ�
		int r = 10;
		
		Calculator calculator = new Calculator();
		// ����Ŭ������ ��ü ����
		System.out.println("�� ���� : " + calculator.areaCircle(r));
		System.out.println();
		// ����Ŭ������ ���� ��ü�� �޼ҵ� ȣ��
		Computer computer = new Computer();
		// ����Ŭ������ ��ü ����
		System.out.println("�� ���� : " + computer.areaCircle(r));
		// ����Ŭ������ ���� ��ü�� �޼ҵ� ȣ��
		
		// ����Ŭ������ ����Ŭ������ �޼ҵ�� �ٸ�.
	}
}
