package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4
{
public static void main(String[] args) throws InterruptedException
{
	// p.544 DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
		// ���� ����
			// 0 : �ڸ��� [���ڸ��� 0���� ����]
			// # : �ڸ��� [���ڸ��� ä���]
	double num = 1234567.89;
	DecimalFormat df = new DecimalFormat("0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("##########.#####");
	System.out.println(df.format(num));

	df = new DecimalFormat("#.0"); // ������ �Ҽ��� ���ڸ� ǥ��
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("-#.0");
	System.out.println(df.format(num));
	
	// ************ õ ���� ���� ��ǥ ******************
	df = new DecimalFormat("#,##0"); // �ᵵ �� !!
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.###"); 
	System.out.println(df.format(num));	
	
	df = new DecimalFormat("0.000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#,##0");
	System.out.println(df.format(0));
	
	df = new DecimalFormat("#.###");
	System.out.println(df.format(0));	
	
	df = new DecimalFormat("0.000");
	System.out.println(df.format(0));
	
	df = new DecimalFormat("0.0E0"); // E : ��������
	System.out.println(df.format(num));
	
	df = new DecimalFormat("[��]+#,### ;[��]-#.###"); // ��� ; ����
	System.out.println(df.format(123));
	System.out.println(df.format(-123));
	
	// ��ǻ�ʹ� ������� �� [ ���� 1 = 100%, 0.5 = 50%, 0.05 = 5% ]
	df = new DecimalFormat("#.#%");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u00A4 #,###"); // ��ȭ��ȣ�� ����
			System.out.println(df.format(num));
	// DecimalFormat Ŭ���� : ���� ���� ��ȯ
	// p.545 SimpleDatrFormat Ŭ���� : �޷������� �ٹж� ��		
	// p.547 MessageFormat Ŭ���� : �޼��������� �ٹж� ��
			
		String id = "�ڹ�";
		String name = "�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \n ȸ�� �̸� : {1} \n ȸ�� ��ȭ : {2}"; //{ } : ������ ���� ��ġ
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);				// {0}, {1}, {2}
		
		
		// DB���� ��� ����
		String sql = "inser into member valuse({0},{1},{2})";
									  // �迭�ε���: 0 , 1 , 2
		Object[] array = {id, name, tel};
		String result2 = MessageFormat.format(sql, array);
		System.out.println(result2);
		
		
		// LocalDate : ���糯¥ // LocalTime : ����ð�
		LocalDate currdate = LocalDate.now();
		System.out.println("���� ��¥ " + currdate);
		
		LocalTime currtime = LocalTime.now();
		System.out.println("���� �ð� " + currtime);
			
		// Date ���� ��¥/�ð� [������ �ȵǰų� �񱳱�� �����]
		
		LocalDateTime currdatime = LocalDateTime.now();
		System.out.println("���糯¥/�ð� : " + currdatime);
		
		// �ð� ���
		Instant istant1 = Instant.now();
		Thread.sleep(1000); // 1�� ���[�ڵ尡 1�ʰ� ����] // �Ϲ� ���� // ���� : �и���
		Instant istant2 = Instant.now();
		
		if(istant1.isBefore(istant2)) {
			System.out.println("istant1�� �� ����");
		}
		else if(istant1.isAfter(istant2)) {System.out.println("istank2�� �� �ʽ��ϴ�");}
		else System.out.println("������ �ð��Դϴ�.");
		
		System.out.println("�ð� �� : " + istant1.until(istant2, ChronoUnit.NANOS));
						// �и��� = 1/1000�� 		����ũ���� = 1/1000000		������ = 1/1000000000
}	
}
