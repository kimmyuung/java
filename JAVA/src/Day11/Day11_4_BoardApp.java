package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp
{
	// �Խ��� + ��� ���α׷� [ ����ó��, ����ó��, ����Ʈ ]
	// 	�Խù� Ŭ����
			// ����, ����, ��й�ȣ, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
			// ��۸���Ʈ
	//	��� Ŭ����
			// ����, �н�����, �ۼ���, �ۼ���
	//  ��Ʈ�ѷ� Ŭ����
			// 1. ��� 2. ���� 3. ���� 4. ���� 5. ���� 6. ��۾���
			// 7. �Խù� ���� 8. �Խù� �ҷ����� 9. ��� ���� 10. ��ۺҷ�����
	//  Day11_4_BoardApp Ŭ���� : ��Ʈ�ѷ� �޼ҵ� ȣ��, ����� [�Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����]
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true) {
			try { // ���ܹ߻� : ����ڰ� �����Է½� ���ܹ߻� -> catch�� �̵�
				Controller.boardlist(); // ��ü���� �޼ҵ� ȣ���� �Ǵ� ����
				// static �޼ҵ��̱� ������ ����
				System.out.println("1. ���� 2. ���� :");
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("�Խù� ���");
					sc.nextLine();
					System.out.println("���� : "); String ���� = sc.nextLine();
					// nextLine : ������ ��ä�� ���� -> �ǳʶٱ�
					// �׷��� nextLine �տ� �ִ� next�� �ϳ��� �����
					// �ذ��� : �Ϲ� next �� nextLine ���̿� �ƹ� nextLine�� �߰�
					System.out.println(����); 	  
					
					System.out.println("���� : "); String ���� = sc.nextLine();
					System.out.println(����);
			
					System.out.println("�ۼ��� : "); String �ۼ��� = sc.next();
					System.out.println(�ۼ���);
				
					System.out.println("��й�ȣ : "); String ��й�ȣ = sc.next();
					System.out.println(��й�ȣ);
					Controller.write(����, ����, �ۼ���, ��й�ȣ); // �μ� ����
				}
				else if (ch == 2) {}
				else {}
				}catch(Exception e) {
					System.out.println("�޼���]] ��ȣ�� �Է����ּ���"); 
					sc = new Scanner(System.in);} 
			
		}
	}
}
