package exam2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;




public class ���α׷��־������_���ȣ {

	public static void main(String[] args) {
		 ��Ʈ�ѷ� con = new ��Ʈ�ѷ�();
		try {
		while(true) {
			Date date = new Date(); // ��¥ ��ü ����
			String ����ð� = ��Ʈ�ѷ�.sdf.format(date); // ���� �ð��� ����� + �ð��� ����ϰ� �����Ͽ� ���
			System.out.println(" ---------------- ���� ��Ȳ ǥ ----------------- ");
			System.out.println("���� �ð� : \t\t" + ����ð�);
			System.out.println("��¥ \t\t ������ȣ \t\t �����ð� \t\t �����ð� \t\t �ݾ�");
			for(Car temp : ��Ʈ�ѷ�.parklist) { // �ݺ����� ����Ͽ� ��������Ʈ ���
				if(temp.get�����ð�() == null ) { // ������ null�� ��� -> ������ ���� �ʾ��� ���
					DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // ��¥ ��� ���� ����
					String ������¥ = temp.get������¥().format(format);
					DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm");
					String �����ð� = temp.get�����ð�().format(format2);
					System.out.printf("%s \t %s \t\t %s \t\t ���� �� \t\t ������ \n" ,// �迭 �� ������ ���
					������¥, temp.get������ȣ(), �����ð�);
				}
				else {
					DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm"); // ��¥ ��� ���� ����
					String �����ð� = temp.get�����ð�().format(format2);
					String �����ð� = temp.get�����ð�().format(format2);
					System.out.printf("%s \t %s \t\t %s \t\t %s \t\t %d \n" ,
							temp.get������¥(), temp.get������ȣ(), �����ð�, �����ð�, temp.get�ݾ�());
				} // �迭 �� ������ ���
			}
			System.out.println("1. ���� 2. ����"); // ����ڷκ��� ������ ����� �Է¹���
			int ch = ��Ʈ�ѷ�.sc.nextInt();
			if(ch == 1) { // ����
				System.out.println("������ȣ�� �Է����ּ���"); // ����ڰ� ������ȣ�� �Է�
				String number = con.sc.next(); 
				boolean result = con.����(number); // ��Ʈ�ѷ��� ���� �޼ҵ带 ����(�μ��� ������ȣ)
				if(result) System.out.println("���� ����!!"); // �޼ҵ� ���� ��� ���̶�� ������ ����
				else System.out.println("���� ����!!"); // �޼ҵ� ���� ��� �����̶�� ������ ����
			}
			if(ch == 2) { // ����
				System.out.println("������ȣ�� �Է����ּ���"); // ����ڰ� ���� �� ������ȣ�� �Է�
				String number = con.sc.next(); 
				boolean result = con.����(number); // ��Ʈ�ѷ��� ���� �޼ҵ带 ����(�μ��� ������ȣ)
				if(result) { // ���� �޼ҵ��� �������� ���̶��
					System.out.println("����� ���ּ���"); // ������� ��� ����
					for(Car temp : ��Ʈ�ѷ�.parklist) {
						System.out.println(temp.get�ݾ�() + "���� �������ּ���"); // �����ϴ� ���� ����ϰ� ����ڿ��� ���� �Է¹���
						int ch1 = con.sc.nextInt();
						if(temp.get�ݾ�() > ch1) { // ������ ����ݾ׺��� �۴ٸ�
							System.out.println("���� �����մϴ�." + (temp.get�ݾ�()-ch1) + "�� �� �������ּ���");
							}
						else System.out.println("�����Ǿ����ϴ�. �ܵ� : " + (temp.get�ݾ�()-ch1) + "��"); break;
						}
					}
					
				else {System.out.println("������ �����Ͽ����ϴ�. �ٽ� �õ����ּ���.");}
			}
			
		}
		}catch(Exception e) {System.out.println("���ڿ��� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");} // ����,������ �������ʰ� ���ڿ��� �Է����� ���
	}
}
