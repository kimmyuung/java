package Day09;

public class Computer extends Calculator{
	// 1. field
	// 2. constructor
	// 3. method
@Override // ��ӹ��� �θ� ������ �ִ� �޼ҵ� ȣ��
double areaCircle(double r) { 
	// ��Ģ������ ���� �μ��� ������ �޼ҵ�� �ȵ�
	// ��, �ٸ� �ڷ����̰�, ���� �μ��� ����
	System.out.println("Computer ��ü�� areaCircle() ����");
	return Math.PI * r * r;
	}
}
