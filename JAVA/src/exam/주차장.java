package exam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class ������ {
	// ���� ��Ȳ ǥ ����
			// 1. ���� ���� -> M(�� : ������, ����) : V(��� : �Է�, ���) : C(��Ʈ�� : �̺�Ʈ�۵�)
			// 2. �� ���� 
				// [ �ĺ� ] : 1. Car Ŭ���� (�ʵ�, ������(�⺻ �ϳ�, ��� �ʵ� ���� ������ 1��), �޼ҵ�(set, get) )
				// �ʵ� : ������ȣ, �����ð� , �����ð�
				// ���� : ��¥, �ݾ�
				// �ڷ��� : Localdate, Localtime, String, String(or int)
			// 3. �̺�Ʈ ó��
				// ���� : ���� ��ȣ �Է��ؼ� ���������ϸ� ���� ���������ϸ� ����
				// ���� : ������ȣ�� �־ ���������ϸ� �ݾ� ��� �����ϸ� ����
		// * �޼ҵ� ����� : static ����������� 2. �μ�, ��ȯ �ľ�
			// 4. �� <---> �� ���� : ��Ʈ�ѷ�
				// 1. ȭ�鱸��
					// 2. ��ư����
	// ������ �ؾ��Ұ� : �ð� ���Ĺٲٱ�
	// ���� �� ���
	// �ð����
	public static void main(String[] args) {
		��Ʈ�ѷ� con = new ��Ʈ�ѷ�();
		Date Date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String strNowDate = sdf.format(Date);
		try {
			while(true) {
				System.out.println("������");
				System.out.println("\t\t\t" + strNowDate + "\t\t\t");
				System.out.println("��¥ \t\t ������ȣ \t\t �����ð� \t\t �����ð� \t\t �ݾ�");
				for(Car temp : ��Ʈ�ѷ�.parklist) {
					if(temp != null && temp.get�ݾ�() == 0) { 
						System.out.printf("%s \t %s \t %s \t %s \t %d \n" ,
								temp.get��¥(), temp.get������ȣ(), temp.get�����ð�(), 
								temp.get�����ð�(), temp.get�ݾ�());
					}
				}
				System.out.println("1. ���� \t\t 2. ����");
				int ch = con.sc.nextInt();
				if(ch == 1) {
					System.out.println("���� ������ �����մϴ�");
					System.out.println("������ȣ�� �Է����ּ���");
					String number = con.sc.next();
					boolean result = con.����(number);
					if(result) System.out.println("���� ����!!");
					else System.out.println("���� ����!!");
				}
				else if(ch==2) {
					System.out.println("���� �������� �����ϴ�");
					System.out.println("������ ������ȣ�� �Է����ּ���");
					String number1 = con.sc.next();
					boolean result1 = con.����(number1);
					if(result1) {
						System.out.println("����� ���ּ���");
						
					}
					else {System.out.println("�� ������ ����!!");}
				}
				else if(ch < 0) {
					System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				}
				else {System.out.println("��ϵ��� ���� �����Դϴ�. �ٽ� �Է����ּ���");}
			}
		}catch(Exception e) {System.out.println("���ڿ��� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		
		
		
	}
}
