package Day12;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1
{
public static void main(String[] args) throws IOException
	{
	// String Ŭ����	
		// String ���ڿ� Ŭ����
			// 1. java.lang ��Ű�� [import] �Ҽ�
			// 2. ��ü�ε� �ڵ� ���ͷ� [ ��ü�� �ڵ� ����]
			// 3. 13���� ������[ ���ڿ�, ����Ʈ�� ] 
			// 4. �ܺ�[����, ��Ʈ��ũ ��]�� ���� �����ʹ� ���� ����Ʈ��
	String ����1 = new String("���缮");
	String ����2 = "���缮"; 
	// ����1�� ����2�� ���� ����
	
	// ����Ʈ -> ���� ��ȯ ���� ����
		// 1.  ����Ʈ -> +- 127 ǥ�� ����
		// 2. �ƽ�Ű�ڵ� -> 0 or 1 ���յ� 7�ڸ� => 2�� 7����
		// 3. ����Ʈ -> �ƽ�Ű�ڵ� ��ȯ
	//p497
	// 1. ������ ����Ʈ�� ������ �� �ִ� ����Ʈ�迭 ����
	byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; 
	// 2. ����Ʈ �迭 -> ���ڿ� ��ȯ
	String str1 = new String(bytes); // ����Ʈ�ڵ带 ���ڿ��� ��ȯ
	// 3. Ȯ��
	System.out.println("����Ʈ �迭 -> ���ڿ� ��ȯ : " + str1);
	
	String str2 = new String(bytes, 6, 4); // new string(�迭��, ����, ��)
	System.out.println("����Ʈ �迭 �� 6���ε������� 4�� ��ȯ : " + str2);
	
	// p.498
	
	System.out.println(); // �ý���Ŭ������ ����ʵ�
	byte[] bytes2 = new byte[100];
	
	System.out.println("�Է� : ");
	int readByteNo = System.in.read( bytes2 );
	// �ܺ� ��� : �ڹ����α׷��� Ű����, ����, ��Ʈ��ũ �� ����� �Ϲݿ���
	
	// Ű���� �Է� --- ��Ʈ��[���:����Ʈ] -----> ��ǻ��
	// a -> 97 //	a ���� -> 97, 13[\n: �ٹٲ�] , 10[\r: Ŀ���� ������]
	
	System.out.println("�Է¹��� ����Ʈ -> ���ڿ� ��ȯ : " + Arrays.toString(bytes2));
	// �޼ҵ� ȣ���� : ��ü ���� ��, ������ �̿��� �޼ҵ� ȣ��
	// static �ʵ�/�޼ҵ�� ��ü���� Ŭ������.�ʵ�/�޼ҵ�
	String str = new String(bytes,0,readByteNo-2);
									// ��������Ʈ�� -2
	// Scanner Ŭ���� System.in ���κ��� �Է¹��� ����Ʈ�� ��ü�� ����
	Scanner sc1 = new Scanner(System.in);
	sc1.next(); // ����Ʈ -> ���ڿ� ��ȯ
	sc1.nextInt(); // ����Ʈ -> ������ ��ȯ
	sc1.nextDouble(); // ����Ʈ -> �Ǽ��� ��ȯ
	}
}
