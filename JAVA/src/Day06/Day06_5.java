package Day06;

public class Day06_5 { // cs
public static void main(String[] args) { // ms
	
	Korean k1 = new Korean();
	k1.name = "���缮";
	k1.ssn = "123456-123456";
	System.out.println("k1 ���� : " + k1.nation);
	System.out.println("k1 �̸� : " + k1.name);
	System.out.println("k1 �ֹι�ȣ : " + k1.ssn);
	// 2. �ʵ� 2���� ���� �����ڷ� ��ü ����
	Korean k2 = new Korean("���ڹ�","123566-878965");
	System.out.println("k2 ���� : " + k2.nation);
	System.out.println("k2 �̸� : " + k2.name);
	System.out.println("k2 �ֹι�ȣ : " + k2.ssn);
	
	Korean �ѱ���1 = new Korean();
	// �ѱ���1 : ���� ���ѹα� // �̸��� �ֹι�ȣ�� ����
	Korean �ѱ���2 = new Korean("���缮");
	// �ѱ���2 : ����, �̸� ��� // �ֹι�ȣ �����
	Korean �ѱ���3 = new Korean("��ȣ��", "123456-123456");
	// �ѱ���3 : ����, �̸�, �ֹι�ȣ ���
	Korean �ѱ���4 = new Korean("�Ϻ�", "�ŵ���", "123465-123456");
	// �ѱ���4 : ����(�Ϻ�), �̸�, �ֹι�ȣ ���
	} // me  
} // ce
