package Day10;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class �Ե����� extends ����
{
// 1. �ʵ�
	private String ����;
	private ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<>();
	
// 2. ������
	public �Ե�����() {
//		��ǰ ��ǰ = new ��ǰ("�������", 10, 1000);
//		��ǰ ��ǰ2 = new ��ǰ("�Ұ�����", 10, 2000);
//		��ǰ����Ʈ.add(��ǰ); ��ǰ����Ʈ.add(��ǰ2); // ��ǰ �߰�
	}
public �Ե�����(String ����, ArrayList<��ǰ> ��ǰ����Ʈ)
{
	super();
	this.���� = ����;
	this.��ǰ����Ʈ = ��ǰ����Ʈ;
}
// 3. �޼ҵ�
	@Override // �������̵� [������]
	public void ��ǰ���() {
		System.out.println("�Ե����� ��ǰ ���");
		int i = 1;
		for(��ǰ temp : ��ǰ����Ʈ) {
			System.out.print(i + "." + temp.get��ǰ��() + "("+ temp.get����() +")");
			i++;
		}
		System.out.println();
	}
	@Override // �������̵� [������]
	public void ��ǰ�߰�() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** �Ե����� ��ǰ�߰� *** ");
		System.out.println("��ǰ�� : "); 	String ��ǰ�� = sc.next();
		System.out.println("��� : ");	int ��� = sc.nextInt();
		System.out.println("���� : ");	int ���� = sc.nextInt();
		// 2. ��ü [ ���� ���� -> �ϳ� ��ü ]
		��ǰ ��ǰ = new ��ǰ(��ǰ��, ���, ����);
		// 3. ����Ʈ�� ����
		��ǰ����Ʈ.add(��ǰ); 
		// 4. ���� ó��
		try { // ����(����)�� �߻��� �� ���� �ڵ� ����(����)				// ���� ��� , �̾��=true(�ɼ�)
		FileOutputStream outputStream = new FileOutputStream("D:/�ڹ�/�Ե��������.txt", true);
		String �������� = ��ǰ�� + ","+ ��� +"," + ���� + "\n"; // , : �ʵ� ���п�   \n : ��ǰ����
		outputStream.write(��������.getBytes() );
		}catch(Exception e) { // ���� ó�� ��� : Exception Ŭ����
			
		} 
		System.out.println("�˸�]] ��ǰ ���� �Ϸ�");		
	}
	
}
