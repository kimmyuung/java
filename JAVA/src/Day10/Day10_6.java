package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6
{
	// �ֱ����ġ 		: 	�޸�(RAM) : ���α׷� ����ÿ��� ���� �޸�(�ֹ߼�)
	// ���������ġ	: 	C����̺�, D����̺�, Usb, CD..(���ֹ߼�)
	// ����ó�� 		: 	console�� �޸� 	---> 	���������ġ�� �ű�
	// DBó�� 		: 	�ڹٳ� �޸𸮸� 	---> 	DB ����[PC]�� �ű�
		// ��Ʈ��(Stream) : ���α׷��� �ܺ�[Ű����, ����, ��Ʈ��ũ ��] ���
			// �ƽ�Ű�ڵ�(8�ڸ� = 1����Ʈ) -> ��Ŵ��� : byte
		// FileOutputStream	: 	������� Ŭ����
			// ��ü��.write(����Ʈ��);
		// FileInputStream 	: 	�����Է� Ŭ����
			// ��ü��.read(����Ʈ�迭);
		// Strings Ŭ����
			// ���ڿ�.equals() : ���ڿ� �� �޼ҵ�
			// ���ڿ�.getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
			// new String(����Ʈ�迭) : ����Ʈ�迭 -> ���ڿ� ��ȯ
	
	public static void main(String[] args) throws IOException  
	{
	
	// 1. ������� [ ���� -> �ڹ� ]
		FileOutputStream stream = new FileOutputStream("D:/�ڹ�/java1.txt"); // ������ ����
		String context = "�ڹٿ��� �Էµ� ������";
		stream.write(context.getBytes() );
		
	// 2. �����Է� [ �ڹ� -> ���� ] 
		// FileInputStream : ��������� Ŭ����
		// FileInputStream(���ϰ��/���ϸ�.Ȯ����); // txt : �޸���
		// ����ó��(=����ó��) : 	
		FileInputStream stream2 = new FileInputStream("D:/�ڹ�/java1.txt"); // ������ ����
		byte[] bytes = new byte[1000]; // 1000����Ʈ�� ���� �� �ִ� �迭 
		stream2.read(bytes);
		System.out.println("���ϳ��� : " + new String(bytes));
		
		
	}
}
