package Day03;

import java.util.Scanner;

public class Day03_4 { // c  s
	public static void main(String[] args) { // m  s
	
		Scanner scanner = new Scanner(System.in);
		
		// ��� 1. if�� 2. switch��
		// if : ���˻�(true or false) -> ����� ���� ������ ���� �ʴ� ���
			// >=, <=, <, >, ==, != ��ü�� �Ұ���!
		// swithch : �����Ͱ˻�(��������) -> ����� ���� ������ �ִ� ���
		// braek; ���� ����� �߰�ȣ�� ���� -> switch�� break�� ��Ʈ!
		// ����
			/* switch(�˻���){
				case '��' : ���๮;
				case '��' : ���๮;
				case '��' : ���๮;
				dafault : ���๮;
				} */
		//��1 ������ 90�̸� A, 80�̸� B, 70�̸� C, �׿� Ż��
		int score = 80;
		if(score == 90) System.out.println("A Grade");
		else if(score == 80) System.out.println("B Grade");
		else if(score == 70) System.out.println("C Grade");
		else System.out.println("Fail");
		
		switch(score) {
		case 90 : System.out.println("A Grade"); 	break;
		case 80 : System.out.println("B Grade");	break;
		case 70 : System.out.println("C Grade"); 	break;
		default : System.out.println("Fail"); 		break;
		}
	// ��2  
		
		System.out.println("������ ������ �Ͻʴϱ�");
		int button = scanner.nextInt();
		switch(button) {
		case 1 : System.out.println("1������ �̵�");	break;	
		case 2 : System.out.println("2������ �̵�");		break;
		case 3 : System.out.println("3������ �̵�");		break;
		case 4 : System.out.println("4������ �̵�");		break;
		default : System.out.println("����");     break;
		}
	// ��3
		char ��� = 'B';
		switch(���) {
		case 'A' : //System.out.println("��� ȸ��"); -> ���� �ڵ� ������ �ۼ� ���ص� ��
		case 'B' : System.out.println("��� ȸ��"); 	break;
		case 'C' : //System.out.println("�Ϲ� ȸ��");
		case 'D' : System.out.println("�Ϲ� ȸ��"); 	break;
		default : System.out.println("�մ�");
		}
	// ��4	
		String ���� = "����";
		switch(����) { // ���������̱� ������ .equals ��� X
		case "����" : System.out.println("700����"); 		break;
		case "����" : System.out.println("500����"); 		break;
		default : System.out.println("300����"); 			break;
		}
	
	// ��1 ����, ����, ���� ������ �Է¹޾� ����� 90���̻��̸� A��� 80���̻��̸� B��� ������ Ż��
	System.out.println("���� ������ �Է��ϼ���");  int lan = scanner.nextInt();
	System.out.println("���� ������ �Է��ϼ���");  int math = scanner.nextInt();
	System.out.println("���� ������ �Է��ϼ���");  int eng = scanner.nextInt();
	int avg = (lan + math + eng) / 3;
	System.out.println("��� :" + avg + "������ / 10" + avg/10);
		switch(avg/10) { // >=�� ������ ������ �����ڸ��� ������ ���� 10���� ����
		case 8 : System.out.println("B���"); break;
		case 9 : System.out.println("A���"); break;
		case 10 : System.out.println("A���"); break;
		default : System.out.println("Ż��"); break;
	}
	
		
		
	}// m  e
}// c  e
