package Day09;

public class Day09_3 {
public static void main(String[] args) {
	
	// super() : �θ�Ŭ������ �� ������ ȣ��
	// super(�μ�1, �μ�2) : �θ�Ŭ������ 2�� �μ�
	// super(�μ�1, �μ�2, �μ�3) : �θ�Ŭ������ [3���μ�] ������ ȣ��
	// 1. ���� Ŭ������ ��ü ����
	Student student = new Student("ȫ�浿", "123456-123456", 1);
	
	// 2. ����Ŭ������ ���� ��ü�� ����Ŭ������ ��� ����
	System.out.println("name : " + student.name);
	System.out.println("ssn : " + student.ssn);
	System.out.println("studentNo : " + student.studnetNo);
}
}
