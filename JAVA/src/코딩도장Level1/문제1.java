package �ڵ�����Level1;

public class ����1 { // c  s
public static void main(String[] args) { // m  s

// ����1. 10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3, 5, 6, 9�̴�.
	// �̵��� ������ 23�̴�.
	// 1000�̸��� �ڿ������� 3,5 ����� ������ ���϶�
	int sum = 0; // ���� ����
for(int i = 1; i <1000; i++) 
		{ // for1 s
	if(i % 3 == 0 || i % 5 ==0) {
		sum += i;
			}

		} // for1 e
System.out.println("1000�̸��� �ڿ������� 3, 5 ����� ���� : " + sum);	
	} // m  e
} // c  e
