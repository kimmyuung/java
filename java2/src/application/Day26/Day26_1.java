package application.Day26;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day26_1 {
	// ��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����� �� �ִ� ��
		// ��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� ��
			// �������� : ��ǻ�ͳ���/��ǻ�ͻ��� ������ ��ȯ ����� �����ϴ� ��Ģ[ü��]
				// SMTP : ���� ���� ��������
				// IP : ���ͳ� ��������
	//TCP/IP
	// TCP : Transmission Control Protocol : ��� ����
	// IP : Internet Protocol address : ��� �ν� ��ȣ [�ּ� - pc�ּ� - �ּ�] : 0.0.0.0 ~ 255.255.255.255
		// �츮�� < ------------------ > ģ����
		//							  ģ������ ���ּ�
	
		// ����ǻ�� < ----------------- > ���̹���ǻ��(Ȩ������)
		// 								www.naver.com [ �������ּ� : �����̱⶧���� ��� �ܿ� ]
									// 223.130.195.200 [ ip�ּ� : �����̱⶧���� ��� �ܿ�� ����� ]
											// �����ּ�(ip)  ----- > �����ּ�(DNS)
	public static void main(String[] args) throws UnknownHostException {
		// 1. ���� pc�� ip �ּ� Ȯ��
		// �������ư -> cmd �˻� -> ���������Ʈ
		// ipconfig �Է½� ��Ʈ��ũ(ip) wjdqhfmf dkf tn dlTdma
		// 2. �ڹٿ��� ip �ּ� Ȯ��
		InetAddress inetAddress = InetAddress.getLocalHost(); // �ڹ� �� ����� ��� �Ϲݿ��� �߻�
		//InetAddress : ��Ʈ��ũ ������ �����ϴ� Ŭ����
			// InetAddress.getLocalHost(); : ����(��pc)�� ���� ȣ��
		System.out.println("���� pc�� ��Ʈ��ũ ��ü : " + inetAddress);
		System.out.println("���� pc�� �̸� : " + inetAddress.getHostName() );
		System.out.println("���� pc�� ip�ּ� : " + inetAddress.getHostAddress());
		// ���̹� ip �ּ� Ȯ��
		InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
		System.out.println("���̹� pc�� ������ü : " + inetAddress2);
		System.out.println("���̹� pc�� �̸� : " + inetAddress2.getHostName() );
		System.out.println("���̹� pc�� ip�ּ� : " + inetAddress2.getHostAddress());
		
		InetAddress inetAddress3 = InetAddress.getByName("www.facebook.com");
		System.out.println("���̽��� pc�� ������ü : " + inetAddress3);
		System.out.println("���̽��� pc�� �̸� : " + inetAddress3.getHostName() );
		System.out.println("���̽��� pc�� ip�ּ� : " + inetAddress3.getHostAddress());
	}
}
