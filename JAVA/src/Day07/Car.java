package Day07;

public class Car {
	// Ŭ���� ����
	
	// 1. �ʵ�
	int gas;
	// 2. ������
	
	// 3. �޼ҵ�
	// ������ �ܺηκ��� �޾Ƽ� ���ο� gas ����
	void setGas(int gas) { // �μ� O, ��ȯ X
		this.gas = gas;// ���� x, �޼ҵ��(�μ�1) {���κ��� = �ܺκ���}
	}// ���κ����� �ܺκ��� -> this.�ʵ�� : ����(��Ŭ���� ����)����
	
	boolean isLeftGas() {
		if(gas == 0 ) {
			System.out.println("gas�� �����ϴ�.");
			return false; // ���κ����� gas�� 0�̸� false ��ȯ
		}
		else {System.out.println("gas�� �ֽ��ϴ�");
			  return true;} // ���κ����� gas�� 0�̸� false ��ȯ
	}
	
	void run() { // gas 0�϶����� �����ϴµ� �����Ҷ����� ���� 1�� ����
		// gas�� 0�̸� �Լ� ����
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�" + gas + ")");
				gas--;
			}
			else {System.out.println("����ϴ�.(gas�ܷ�" + gas + ")");
			return;}//(=break;), run �޼ҵ� ���� ����
			// return = �Լ� ����[Ż��]
		}
		
	}
	
	
}
