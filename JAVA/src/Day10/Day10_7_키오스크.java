package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_Ű����ũ
{
	// Ŭ���� : �Ե�����, ����ŷ
	// ��� : ����
	// �������̽� : Ű����ũ �������̽�
	// ����ó�� : ��ǰ���� ����

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in); // �Է°�ü
		ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
		// * ���� �Է�
		// 1. ���� �Է°�ü
		try
		{ // try {}�ȿ� ����[����] �߻��� �� ���� �ڵ� �ֱ�(����)
			FileInputStream inputStream = new FileInputStream("D:/�ڹ�/�Ե��������.txt");
			// 2. ���� �о���� [ ���� ---> ��Ʈ��(����Ʈ��) ---> ]
			// 1. ����Ʈ�迭 ����
			byte[] bytes = new byte[1024];
			// 2. �о�ͼ� �迭 ����
			inputStream.read(bytes);
			// 3. ���� [, : �ʵ� ���� \n : ��ü(��ǰ) ���� ]
			String ���ϳ��� = new String(bytes);
			// String ���� �޼ҵ� -> split("����");
			String[] ��ǰ��� = ���ϳ���.split("\n");

			for (String temp : ��ǰ���)
			{
				String[] �ʵ� = temp.split(",");
				��ǰ ��ǰ = new ��ǰ(�ʵ�[0], Integer.parseInt(�ʵ�[1]), Integer.parseInt(�ʵ�[2]));
				��ǰ����Ʈ.add(��ǰ);
			}
			// ���ڿ� ---> ������ ��ȯ [Integer.parseInt("���ڿ�")]
		} catch (Exception e)
		{
		}
		Ű����ũ_�������̽� �Ե����� = new �Ե�����("���缮", ��ǰ����Ʈ); // �Ե����� Ű����ũ ����
		// ���ְ� ���缮�� �Ե����� Ű����ũ ��ü ����
		// catch : ���� ��� -> Exception Ŭ������ ��ü�� ����

		while (true)
		{
			�Ե�����.��ǰ���();
			int ch = sc.nextInt();
			if (ch == -1)
			{
				�Ե�����.��ǰ�߰�();
			} else if(ch == 0) {�Ե�����.����(); } 
			else
			{
				//�Ե�����.��ٱ���(ch);
			}
		}
	}
}
