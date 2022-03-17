package Day12;

public class Day12_2
{
	public static void main(String[] args)
	{
		// p. 499 String �޼ҵ�
		// charAt() : ���ڿ����� Ư������ ���� 
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		
		switch(sex) { // switch ��� [ switch(�˻���) {case}
		case 1 : 
		case 3 : System.out.println("����"); break;
		case 2 :
		case 4 : System.out.println("����"); break;
		}
		// �ڹ� �޸�[JVM]
			// ���� �޸� : ��������
			// �� �޸� :  ��ü
			// �޼ҵ� �޸� : 
		// p. 501 equals() : ���ڿ� ��
			// �⺻�ڷ��� ����ϴ� ������ ������ ��밡�� [ == ]
			// ������ ����ϴ� ������ ������ ���Ұ��� [ equals ]
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö"; // ��ü�� new �����ڰ� �ʼ������� String Ŭ������ �ڵ���ü ����
		
		// ���ڿ� ��
		if(strVar1 == strVar2) { // ���ڿ��� == �Ұ�, ==�� �밳 �޸��ּҸ� ���ϴ� ������� ó���ǹǷ� ���ڿ��� ó���� �ȵ�
			System.out.println("���� String ��ü�� ����");
		} else System.out.println("�ٸ� String ��ü�� ����");
		if(strVar1.equals(strVar2)) System.out.println("���� ���ڿ��� ����");
		else System.out.println("�ٸ� ���ڿ��� ����");
		
		// getBytes() : ���ڿ� -> ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes(); // ���ڿ� -> ����Ʈ�� ��ȯ
		System.out.println("������ 1����Ʈ �ѱ�2����Ʈ : " + bytes1.length); // �迭��.length : �迭���� �ʵ�
		String str1 = new String(bytes1); // ����Ʈ�� -> ���ڿ� ��ȯ
		System.out.println("����Ʈ�� -> ���ڿ� : " + str1);
		try { // ���ڵ�Ÿ��[���ڵ�/���ڵ� : ��ȯ���]
		// 1. EUC-KR [�ѱ�/���� : �ѱ� 2����Ʈ]
		byte[] bytes2 = str.getBytes("EUC-KR"); // �Ϲ� ���� �߻�, �ƽ�Ű�ڵ忡 �ѱ� �߰�
		System.out.println("EUC-KR ���� : " + bytes2.length);
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("����Ʈ�� -> ���ڿ� : " + str2);
		
		// 2. UTF-8 : ������ ����� ��� ����(�ѱ� 3����Ʈ)
		byte[] bytes3 = str.getBytes("UTF-8"); // �����ڵ�
		System.out.println("UTF-8 ���� : " + bytes3.length);
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("����Ʈ�� -> ���ڿ� : " + str3);
		
		}catch(Exception e) {}
		
		// indexof : ���ڿ��� Ư�� ���ڿ� ��ġ[�ε���] ã��
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���"); 
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) { // �ε����� 0������ ���� : -1 �ε����� ����
			System.out.println("�ڹٿ� ���� å");
		} else System.out.println("�ڹٿ� ���þ��� å");
		
		String ssn2 = "7306241230123";
		int length = ssn2.length();// ���ڿ��� ���� ����(=���� ���ϱ�)
		if(length == 13) { // ��ȿ���˻� �� ���
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
		} else System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		
		System.out.println("------------------------------");
		// p. 506 replace("��������", "���ο��"); : ���ڿ� ��ġ
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�","JAVA");
		System.out.println("�������ڿ� : " + oldStr);
		System.out.println("���ο�ڿ� : " + newStr);
		
		// substring() vs split(): ���ڿ� �ڸ���
		String ssn3 = "880815-1234567";
		String firstNum = ssn3.substring(0,6); // �����ε���(0) - �������ε���(6)
		System.out.println("Ȯ�� : " + firstNum);
		
		String secondNum = ssn3.substring(7); // �������ε������� (7)
		System.out.println("Ȯ�� : " + secondNum);
		System.out.println("------------------------------");
		// substring() : �ε��� ����, split() : ���� ����
		// "880815-1234567"�� -�� �������� split���� �ڸ� �� 2�κ����� ���� -> �迭�� ��ȯ 
		// -�� �������� split���� �ڸ� �� 2�κ����� ���� -> "-"��� X
		System.out.println("�պκ� Ȯ�� : " + ssn3.split("-")[0]);
		System.out.println("�޺κ� Ȯ�� : " + ssn3.split("-")[1]);
		// �������ڿ�.toLowerCase -> ������ �ҹ��� 
		// �������ڿ�.toUpperCase -> ������ �빮��
		// ���ڿ�.trim() : �հ� ���� ���� ����[�߰��� ����� �������� ����] -> �ܺηκ��� ���� �ڷ� ���Խ� ����ġ ���� ���� ���� �� ���
		
		// valueOf() : �⺻Ÿ��[int, double ��] -> ���ڿ� ��ȯ
		String str2 = String.valueOf(10); // int�� 10�� -> String 10���� ��ȯ
		String str3 = String.valueOf(10.5); // double�� 10.5�� -> ���ڿ� 10.5�� ��ȯ
		String str4 = String.valueOf(true); // boolean�� true -> ���ڿ� true
		String str5 = 10+""; // int���� String������ ����[�Ұ���] -> +�����ڸ� ���� ���� �����ϸ� ���ڿ��� ���� ����

		System.out.println(str2 + 10);  // ���� + ���� : ���� -> 1010 ���
		System.out.println(str3 + 10);
		// if(str4) ���� : str5���� boolean ���� �ƴ� ������ true ����
 	
	
	}

}
