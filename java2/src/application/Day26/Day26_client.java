package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day26_client {
public static void main(String[] args)  {
	// 1. ���� �����
	Socket socket = new Socket();
	
	// 2. ������������ �����ϱ�
	try {
	while(true) { // ���������� ip�� port
		socket.connect(new InetSocketAddress("192.168.17.91",5000));
		System.out.println("[[������ ���� ����]]");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �޽��� : "); String msg = sc.next();
		OutputStream outputStream =socket.getOutputStream();
		outputStream.write(msg.getBytes());
		// �������� ������ ���� �ޱ�
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1000];
		inputStream.read(bytes);
		System.out.println("������ ���� �޽��� : " + new String(bytes));
		sc.close();
	}}catch(Exception e) {System.out.println(e);}
	
}
}
