package Day01;

	

	import java.util.Scanner;
	// ȸ������ǥ�� ������!
	// �Էº��� : ���̵�, ��й�ȣ, ����, �̸���
	// ��� �� : >>>>>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� <<<<<<<<<<<<<
	public class Day01_5 {// c  s

		public static void main(String[] args) { // m  s
		Scanner scanner = new Scanner(System.in); // 1. �Է°�ü ����
		
		System.out.println("�̸� : "); // 2. �Է� ���� ������ �ȳ�(�̸�, ���̵�, ��й�ȣ, �̸���)
		String �̸� = scanner.next(); // �Է� ���� ������(�̸�)�� �ٸ� ���� ����
		
		System.out.println("���̵� : ");     	String id = scanner.next();
		System.out.println("��й�ȣ : ");		String pw = scanner.next();
		System.out.println("�̸��� : ");		String em = scanner.next();
		// 3. �����͸� �Է� ����
		
		// 4. �����͸� ���
		System.out.println(">>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� <<<<<<<<");
		System.out.println("�̸�\t���̵�\t��й�ȣ\t�̸���\t���");
		System.out.printf("%s\t%s\t%s\t%s\n", �̸�,id, pw, em);
		System.out.println(�̸� + "\t" + id + "\t" + pw + "\t" + em);
		
		

		
		
		
		
		
			
		} // m  e
		
	}// c  e

