package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_3_13 {
public static void main(String[] args) {
	// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { // hasNextInt() �� ��� �Է°��� �����ϰ�� true�� ��ȯ�ϸ� 
			//������ �ƴҰ�� �ٷ� ���ܸ� ������ ���̻��� �Է��� ���� �ʰ� 
			//hasNextInt()���� false�� ��ȯ�ϸ鼭 �ݺ����� ����
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+y);
		if(x==0 && y ==0) {sc.close(); break;}
		}
}
}
