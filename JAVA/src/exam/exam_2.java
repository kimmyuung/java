package exam;

import java.util.Scanner;

public class exam_2
{
//	1. ����ǥ�� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//	2. �޴����� 1�� ���ý� �л������� �߰� �մϴ�. [ 5�� ]
//	3. �޴����� 2�� ���ý� �л������� ���� �մϴ�. [ 5�� ]
//	4. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ�. [ 5�� ]
//	5. ���� �Է��� 5������ �ϵ�, �ִ� 100�� �� �����ϵ��� �ۼ��մϴ�. [ 5�� ]
//	6. ��ȣ �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�. [ 5�� ]
//	7. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�. [ 5�� ]
//	8. ������ �̿��Ͽ� ������ ���մϴ�. [ 5�� ]
//	9. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] members = new String[100];
		int[][] scores = new int[100][3];
		int[] total = new int[100];
		int[] ranks = new int[100]; // ���� �迭
		
		while(true) {
		try {	
		System.out.println("[[1. �л� ��� 2. �л� ����]]");
		System.out.println("��ȣ" + "\t" + "�̸�" + "\t" + "����"+ "\t"+ "����"+ "\t"+ "����" +"\t"+ "����" +"\t"+ "���"+ "\t"+ "����");
		int temp = 0;
		for(int i = 0; i<members.length; i++) {
			if(members[i] != null ) {
				double avg = (scores[i][0]+scores[i][1] + scores[i][2]) / 3.0;
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",i+1, members[i], scores[i][0], 
						scores[i][1], scores[i][2], total[i], avg, ranks[i]+1 );
				}
		}
		int ch = sc.nextInt();
		
		if(ch == 1) { // if 1 s
			System.out.println("�л� �̸��� �Է��ϼ���"); String name = sc.next();
			System.out.println("���� ������ �Է��ϼ���"); int kor = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���"); int math = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���"); int eng = sc.nextInt();
			for(int i = 0; i<members.length; i++) {
				if(members[i] == null && scores[i][0] == 0) {
				members[i] = name; 
				scores[i][0] = kor;
				scores[i][1] = math;
				scores[i][2] = eng;
				total[i] = kor + math + eng; // ����
				ranks[i] = 1; // ����� �� 1������ ����.
				break;}
			}
			for(int i=0; i<ranks.length; i++) { // �������� ����
				for(int j=0; j<ranks.length; j++) {
					if(total[i] > total[j]) {
						temp = ranks[i]; ranks[i] = ranks[j]; ranks[j] = temp; 
					}
				}
			}
		} // if1 e
		else if(ch == 2) {
			System.out.println("�л� ��ȣ�� �Է��ϼ���"); int snum = sc.nextInt();
			for(int i = 0; i<members.length; i++) {
				if(members[i] != null && ranks[i] == snum) {
					System.out.println("�л� ���� ����");
					members[i] = null; 
					scores[i][0] = 0;
					scores[i][1] = 0;
					scores[i][2] = 0;
					total[i] = 0;
					ranks[i] = 0;
					
				} 
			
				if(i == members.length-1) {
					members[members.length-1] = null; 	
					scores[members.length-1][0] = 0;
					scores[members.length-1][1] = 0;
					scores[members.length-1][2] = 0;
					total[members.length-1] = 0;
					ranks[members.length-1] = 0;
					break;
				} // if 1 e
				else {
					members[i] = members[i+1]; 	
					scores[i][0] = scores[i+1][0];
					scores[i][1] = scores[i+1][1];
					scores[i][2] = scores[i+1][2];
					total[i] = total[i+1];
					ranks[i] = ranks[i+1];
					break;
				}
					} // for e
		}
		else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");}
		} catch(Exception e) {System.out.println("���ڸ� �Է����ּ���");}
		}
} // me
} // ce
