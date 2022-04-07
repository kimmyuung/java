package dto;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	// ������ ������ Ŭ���̾�Ʈ�� Ŭ����
	
	public Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		recive(); // ������ ����� Ŭ���̾�Ʈ ��ü�� �����ɶ� �ޱ� �޼ҵ�
	}
	// 3. ������ �޽��� �޴� �޼ҵ�
	public void recive() { // �������� : ������ Ŭ���̾�Ʈ�� ����Ǿ�����
		// 1. ��Ƽ������ [ Thread Ŭ���� vs Runnable �������̽� ]
		Runnable runnable = new Runnable() { // �͸� ���� ��ü
			public void run() { // �������̽��� �߻�޼ҵ尡 �����ϱ� ������ ���� �ʼ�
				// ��������� �޽��� �޴� ����
				try {
				while(true) {
					InputStream inputStream = socket.getInputStream();// 1. �Է½�Ʈ��
					byte[] bytes = new byte[1000];
					inputStream.read(bytes); // �Է½�Ʈ������ ����Ʈ �о����
					String msg = new String(bytes); // ����Ʈ�� -> ���ڿ� ��ȯ
					// * ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
					for(Client temp : Server.clientlist) {
						temp.send(msg); // ���� �޽����� ������ ���ӵ�[clientlist] ��� Ŭ���̾�Ʈ�鿡�� ����
					}
				}
				}catch(Exception e) {System.out.println("����ó�� ���� : " + e);}
			}
		}; // ��Ƽ������ ���� ��
		Server.threadpool.submit(runnable); // �ش� ��Ƽ�����带 ������
	}
	// 4. ������ �޽��� ������ �޼ҵ�
	public void send(String msg) {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(msg.getBytes());
					}catch(Exception e) {}
		}
		};
	}
}
