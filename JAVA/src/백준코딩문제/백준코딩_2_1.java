package �����ڵ�����;

import java.util.Scanner;

// ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
// �����̸� 1, �ƴϸ� 0 ���
// ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
// 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�.
// ������, 2000���� 400�� ����̱� ������ �����̴�.
import java.util.Scanner;

public class �����ڵ�_2_1 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		in.close();
        
		if(y%4==0) {
			if(y%400==0) System.out.println("1");
			else if(y%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}
}
