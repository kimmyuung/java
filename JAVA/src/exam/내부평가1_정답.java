package exam;

import java.util.Scanner;

public class ������1_���� {
	
	public static void main(String[] args) {
		
		Student[] studentlist = new Student[100];
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("--------------------------------------");
				System.out.println(" \t��\t��\tǥ");
				System.out.println("--------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				
				// ���� ���� �������� �迭�� �ε��� �����ϱ� 
				for(int i = 0; i <studentlist.length;i++) {
					for(int j = 0; j < studentlist.length;j++) {
						if(studentlist[i] != null && studentlist[j] != null){
							if(studentlist[i].getTotal() > studentlist[j].getTotal()) {
								Student[] temp = new Student[1];
								temp[0] = studentlist[i];
								studentlist[i] = studentlist[j];
								studentlist[j] = temp[0];
								}
						}
					}
				}
				// ��� 
				int h=0; // �ε��� 
				for(Student temp : studentlist) {
					if(temp != null) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
								/*temp.getNo()*/h,temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),temp.getTotal(),temp.getAvg(),(h+1));
					}
					h++;
				}
				
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println("�޴� : 1.�л����� ��� 2.�л����� ����");
				int ch = scanner.nextInt();
				if(ch == 1) {
					// �л����� �Է¹ޱ� 
					System.out.print("��ȣ�Է� : ");	int no = scanner.nextInt();
					System.out.print("�̸� �Է� :");	String name = scanner.next();
					System.out.print("�������� : ");	int korean = scanner.nextInt();
					System.out.print("�������� : ");	int english = scanner.nextInt();
					System.out.print("�������� : ");	int math = scanner.nextInt();
					// ��ȣ �ߺ�üũ 
//					boolean check = true;
//					for( Student temp : studentlist ) {
//						if( temp != null && temp.getNo() == no ) {
//							check = false; break;
//						}
//					}
					// �ߺ��� ������ �л�����ϱ� 
//					if( check ) {
//						int total = korean+english+math;
//						double avg = total/3.0;
//						
//						Student students = new Student(name, korean, english, math, total, avg);
//						int j = 0;
//						for(Student temp : studentlist) {
//							if(temp == null) {
//								studentlist[j] = students;
//								break;
//							}
//							j++;
//						}
//					}
					
				}
				else if(ch == 2) {
					System.out.println("������ �л� ��ȣ �Է� : ");
					int num = scanner.nextInt();
					int j = 0 ;
					
					// �л���ȣ�� ã�Ƽ� ������ ������ �ε��� �ڷ� ��ĭ�� ����
//					for( Student temp : studentlist  ) {
//						if( temp != null && /*temp.getNo()*/ == num ) {
//							for(int i = j;i <studentlist.length;i++) {
//								if( i == studentlist.length-1) {
//									studentlist[ studentlist.length-1 ] = null;
//								}
//								else {
//									studentlist[i] = studentlist[i+1];
//								}
//							}
//						}
//						j++;
//					}
				}
			}
			catch(Exception e) {
				System.out.println("�޼���)) ����");
				scanner = new Scanner(System.in);
			}
			
			
		}
		
	}
	
}