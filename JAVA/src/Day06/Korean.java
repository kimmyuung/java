package Day06;

public class Korean {
	// Korean Ŭ���� ����
	
		// 1. �ʵ�
		String nation = "���ѹα�";
		// ���� ������ �̸� ���ѹα� ����
		String name ;
		// �̸� �������� �ʱ�ȭ X -> NULL
		String ssn;
		// �ֹε�Ϲ�ȣ �������� �ʱ�ȭ X -> NULL
		
		// 2. ������
		// ����1. �������̸� == Ŭ�����̸� ����
		// ����2. �ܺηκ��� ������ �Ű���[�μ�] ����
		// ����3. ������ ������ �̸��� ���� �� ����.
			// �����ε� : ������ �̸��� ��� �ڵ带 ������
		
		Korean() { // 1. �������
			// ���빰 X
		}
		Korean(String name) {
			this.name = name;
		}
		// �ʵ� 2���� ������ ������
		Korean(String name, String ssn) {
			this.name = name; // name ���κ��� , n �ܺκ���
			this.ssn = ssn;
		}
		
		
		// �ʵ� 3���� ������ ������
		Korean(String nation, String name, String ssn) {
			this.nation = 	nation;
			this.name 	= 	name;
			this.ssn	= 	ssn;
			// ���κ��� == �ܺκ����� ������ �浹
			// -> ���ʴ� ���κ����� �ܺκ����� �̸��� ���� ��
			// ���κ��� ǥ�� ���
			// �ذ��� : �տ� this�� ����
			// this.�ʵ�� : ����Ŭ���� �� �ʵ� ȣ��
			// this.nation(����) = nation(�ܺ�)
		}
		// 3. �޼ҵ�
}
