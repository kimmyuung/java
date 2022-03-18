package Day13;

import java.util.Random;

public class Day13_1
{
public static void main(String[] args)
	{
	// p. 534 : math Ŭ���� [ ���� ���� �޼ҵ� ���� ] ��ü���� ��밡��
	// 1. ���밪 : Math.abs
	System.out.println("���밪 : " + Math.abs(-5));
	System.out.println("���밪 : " + Math.abs(-3.14));
	// 2. �ø� : Math.ceil
	System.out.println("�ø��� : " + Math.ceil(5.3)); // �Ҽ��� ù°�ڸ����� �ø�
	System.out.println("�ø��� : " + Math.ceil(-5.3)); // �ø��̴ϱ� �� ū���ڷ� �÷��� ��
	// 3. ���� : Math.floor
	System.out.println("������ : " + Math.floor(5.3)); // �Ҽ��� ù°�ڸ����� ����
	System.out.println("������ : " + Math.floor(-5.3)); // �����̴ϱ� �� �������ڷ� ���� ��
	// 4. �ִ� : Math.max(����1, ����2)
	System.out.println("�ִ� : " + Math.max(5, 9)); // 9
	System.out.println("�ִ� : " + Math.max(5.3, 2.5)); // 5.3
	// 5. �ּڰ� : Math.min(����1, ����2)
	System.out.println("�ִ� : " + Math.min(5, 9)); // 5
	System.out.println("�ִ� : " + Math.min(5.3, 2.5)); // 2.5
	// 6. ���� : 0 ~ 1 ������ ���� �߻� (�Ҽ��� ���� �߻�)
	System.out.println("���� : " + Math.random() ); // 0 ~ 1 ������ ���� �߻� (�Ҽ��� ���� �߻�)
	// vs
	Random random = new Random(); 	random.nextInt();
	// �Է�
	// 1. System. in . read() : ����Ʈ��[�迭] -> ����ȯ�� �����ؾ� �� 
	// 2. Scanner Ŭ���� : ����Ʈ��[��ü] -> next, nextInt..
	// Math.random() : 0~1 ����ȯ�� �����ؾ� ��
	// Random Ŭ���� : ����ȯ ���� ���ص� ��
	
	// 7. ����� ������ �Ǽ��� : Math.rint(����) == �ݿø�
	System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.3)); // 5.0 --> Math.rint : �ݿø�
	System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.7)); // 6.0
	
	// 8. ����� ������ ������ : Math.rint(����) == �ݿø�
	System.out.println("����� ������ ������ : " + Math.round(5.3)); // 5 ---> ������ ���
	System.out.println("����� ������ ������ : " + Math.rint(5.7)); // 6
	// 9. Ư�� �Ҽ��� ��ġ���� �ݿø�[ round[] : �Ҽ��� ù°�ڸ����� �ݿø� ] 
	double value = 12.3456; // �Ҽ� ��°�ڸ����� �ݿø�
	double temp1 = value * 100; // 12.3456 -> 1234.56���� �Ű� �ݿø� ����
	long temp2 = Math.round(temp1);
	double value16 = temp2 / 100.0; // temp2 / 100 ���� �Է��ϴ� ��� 1ong / int�� ��
				// temp2 / 100.0 => long / double -> �⺻�Ǽ��� : double�� ��
	System.out.println("value 16 : " + value16);
	System.out.println("0-1 ������ �Ǽ��� : " + Math.random()); 	// 0 ~ 1 
	System.out.println(Math.random() * 6 );						// 0 ~ 6
	System.out.println(Math.random() * 6 +1);					// 1 ~ 7
	int num = (int)(Math.random() * 6 )+ 1;						// (0 < num < 6(�ȳ���) = 0 ~ 5) +1 => 1 ~ 6(����) 
			// double -> int�� ��ȯ�� �Ҽ��� �� ©���� ��
	System.out.println(num);
	
	}
}
