package ���ΰ�������;


import java.util.Scanner;

public class ��Ÿũ����Ʈ_���丮�� {
public static void main(String[] args) {
//���ö��� ���� 3�� �Ǽ�, �����̳ʸ� �Ǽ�, 100 ������ ���� ä��
Scanner sc = new Scanner(System.in);

	while(true) {
		System.out.println("��Ÿũ����Ʈ !!");
		System.out.println("1. ķ���� ���� 2. ����");
		System.out.println(">>>> �޴� ���� ");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("ķ������ �����մϴ�.");
			System.out.println("��� ������ ķ������ �����ϰڽ��ϱ�?");
			System.out.println("1. �׶� 2. ���� 3. �����佺");
			int ch1 = sc.nextInt();
			if(ch == 1) {
				System.out.println("�׶��� ķ������ �����մϴ�.");
				System.out.println("1. �ź� �Ʒü�");
			}
			else if(ch == 2) {
			
			}
			else if(ch == 3) {
				
			}
		}
		else if(ch == 2) {
			System.out.println("��Ÿũ����Ʈ�� �����մϴ�.");
			break;
		}
		else System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
	}
}
}
