package Day08;

import java.util.Scanner;

public class Day08_5 {

	//����� ��ũ ���α׷�
		// �䱸����
		//ȸ���ֿ���: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
		//�����ֿ���:  1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸��
		// ����: ����, �����ǰ, ȸ��
			//�ʵ� 
			//�޼ҵ�
	
	static Scanner scanner = new Scanner(System.in);
	static Member [] members = new Member[1000];
	static Money [] account = new Money[1000];
	
	public static void main(String[] args) {
			Day08_5 application = new Day08_5();
			application.menu();
	}
		void menu() {
			while(true) {
				System.out.println("-------����� ��ŷ ����-----");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
				int ���� = scanner.nextInt();
				
				Member member = new Member();
				Money money = new Money();
				if(����==1) {
					boolean result = member.ȸ������();
					if(result) {
						System.err.println("ȸ������ ����");
					}
					else System.err.println("ȸ������ ����");
				}
				else if(����==2) {
					String result = member.�α���();
					// ���¸޴�
					System.out.println("1.���»��� 2.�Ա� 3.��� 4.����");
					int ����1 = scanner.nextInt();
					if (����1 == 1) {
						money.���»��� ();
						
						}
					if (���� == 2) {
						money.�Ա�();
					}
					if(result==null) {
						System.out.println("������ ȸ���� �ֽ��ϴ�.");
					}
					else {
						System.err.println("�α��� �Ϸ�");
					}
				}
				else if(����==3) {
					member.���̵�ã��();
				}
				else if(����==4) {
					member.��й�ȣã��();
				}
				else System.out.println("�˼����� ��ȣ�Դϴ�.");
				
				
			}
		}
		
	
	
	
}
