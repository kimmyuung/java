package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_����� {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ����ȣ = 0;
	ArrayList<���> ����ڵ� = new ArrayList<���>();
	// ����� ���α׷�
		// �޴� : 1. ��� �߰� 2. ��� ��� 3. [������] 3. ���������
			// ����߰� : �ο��� �Է¹޾� ����ȣ(�ε���) ��ȯ
			// ������ : ����ȣ �Է¹޾� ��ܿ��� ���
			// ��������� : ���� ù��° ������� ����ȣ ȣ��
	try {
	while(true) {
		System.out.println(" ����ȣ \t �ο��� \t ��⿹��ð�");
	for(��� temp : ����ڵ�) {
		if(����ڵ�.indexOf(temp) == 0) {System.out.println("����!");}
		System.out.println(temp.����ȣ +"\t" +temp.�ο��� + "\t"+����ڵ�.indexOf(temp));
	}
	System.out.println("����� ���α׷�");
	System.out.println("1. ����߰� 2. ��� ��� [������] 3. ���������");
	int ch = sc.nextInt();
	if(ch == 1) {
		System.out.println("����� ��ܿ� �߰��մϴ�.");
		System.out.println("��ȭ��ȣ�� �Է����ּ���"); 	String number = sc.next();
		System.out.println("�ο����� �Է����ּ���");
		int members = sc.nextInt();
		// 2. 3�� ������ 1���� ��üȭ
		��� temp = new ���(����ȣ, number, members);
		// 3. ��� �ο����� ����Ʈ�� ����
		����ڵ�.add(temp);
		����ȣ++;
	}
	else if(ch == 2) {
		System.out.println("����ȣ�� �Է����ּ���");
		int i = sc.nextInt();
		for(��� temp : ����ڵ�) {
		if(temp.����ȣ == i) {
			System.out.println("��Ⱑ ��ҵǾ����ϴ�.");
			����ڵ�.remove(i);
			break; // break�� ������ ����Ʈ �� ��� ������ ����(�ݺ����̱� ����)
		}
		}
	}
	else if(ch == 3) {
		System.out.println("���� �տ� �ִ� ������� ���� ��ŵ�ϴ�."); 
		����ڵ�.remove(0); // 0��° �ε��� ����
	}
	else {}
	}
	}catch(Exception e) {}
}
}
