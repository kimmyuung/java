package Day16;

public class Day16_1 {
public static void main(String[] args) {
	
	
	// ���׸�
	
	// �����׸� ��1)
	// 1. �ڽ� ��ü ����
	Box box = new Box();
	// 2. ��ü�� �޼ҵ� ȣ��(�μ� : String) : Object ����
	box.set("ȫ�浿");
	// 3. ��ü�� �޼ҵ� ȣ�� (��ȯ : Object)
	String name = (String) box.get();
	
	box.set(new Apple());
	Apple apple = (Apple) box.get();
	
	// �ڽİ�ü -> �θ�ü [ �ڵ�����ȯ ]
	// �θ�ü -> �ڽİ�ü [ �ڵ� X, ���� O ]
}
}
