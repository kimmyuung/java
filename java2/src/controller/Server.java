package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server { // fxml ������� �ʴ� Ŭ���� [ ���� ��Ʈ�� ��� ] 
	
	// ��øŬ���� [ Client ]
	public class Client {
		// ������ ������ Ŭ���̾�Ʈ�� Ŭ����
		
		public Socket socket;
		
		public Client(Socket socket) {
			this.socket = socket;
			recive(); // ������ ����� Ŭ���̾�Ʈ ��ü�� �����ɶ� �ޱ� �޼ҵ�
		}
		// 3. ������ �޽��� �޴� �޼ҵ�
		public void recive() {
			// ��Ƽ������ [ Thread Ŭ���� vs  Runnable �������̽� ] 	// run �޼ҵ带 �ʼ������� �����ؾ���.
			// �������̽��� �߻�޼ҵ尡 �����ϱ� ������ �����ʼ�[ Ŭ�������� implements vs  �͸� ��ü ]
			Runnable runnable = new Runnable() {
				@Override
				public void run() { // �߻�޼ҵ� ���� 
					// ��������� �޽��� �޴� ���� 
					while(true) {
						try {
							InputStream inputStream = socket.getInputStream(); // 1. �Է½�Ʈ�� 
							byte[] bytes = new byte[1000]; 	// 2. ����Ʈ �迭 ���� [ ��Ʈ���� ����Ʈ���� �̱� ������ ]
							inputStream.read( bytes ); 		// 3. �Է½�Ʈ������ ����Ʈ �о���� 
							String msg = new String(bytes);	// 4. ����Ʈ�� -> ���ڿ� ��ȯ
							// * ������ ���� �޽����� ���� ������ ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �޽��� ������
							for( Client client   : clientlist ) {
								client.send( msg ); // ���� �޽����� ������ ���ӵ�[ clientlist ] ��� Ŭ���̾�Ʈ���� �޽��� ������
							}
					
						}catch( Exception e ) { 
							
							System.out.println("������ �޽��� �ޱ� ����:"+e); 
							break;
						}
					}
					
				}
			}; // ��Ƽ������ ���� �� 
			threadpool.submit(runnable);  // �ش� ��Ƽ�����带 ������Ǯ�� �־��ֱ� 
		}
		// 4. ������ �޽��� ������ �޼ҵ�
		public void send( String msg ) { 
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						OutputStream outputStream = socket.getOutputStream(); 	// 1. ��� ��Ʈ��
						outputStream.write( msg.getBytes() ); 					// 2. ��������
					}catch( Exception e ) { 
						serverstop();
						System.out.println("������ �޽��� ������ ����:"+e); }
				}
				
			}; // ��Ƽ������  ���� �� 
			threadpool.submit(runnable); // �ش� ��Ƽ�����带 ������Ǯ�� �־��ֱ� 
		}
	} // ��ø Ŭ���� end
	
	    // * ������ ����� Ŭ���̾�Ʈ �����ϴ� ����Ʈ
	    public  Vector<Client> clientlist = new Vector<>();
	    // ����ȭ : ���� �����尡 �ϳ��� �޼ҵ� ���ٽÿ� ��� ���� �����
	 // Vector ����ϴ����� : ����ȭ ����(o)    // ����ȭ : ���� �����尡 �ϳ��� �޼ҵ������� ��� ��� ���� �����
	    // * ��Ƽ�����带 �������ִ� ������Ǯ ���
	    public  ExecutorService threadpool;
	    	// ExecutorService : ������Ǯ ���� �������̽� [����Ŭ����(implements) vs ��������(�͸�ü)
	    
	    // ������Ǯ : �������� ������ ���� ���� ���
	    // ���� �ٸ� �������� ��û�� ó���ϱ� ���� �۾�ť�� ����.
	    // (��û ������ ��������� �����·� ����) ���Լ���� �۾� ó��
	    // ä�� : ����ڰ��� ä�� X, ����ڿ� ������ ä�� O
	    // ä�� : ������ �޼��� ���� -> ������ ��� -> �������� ����Ȱ� �ٽ� ä�ù������鿡�� ����
	    
	    // 1. �������� ����
	    ServerSocket serverSocket;
	    // 2. �������� �޼ҵ�
	    public void serverstart(String ip, int port) { // �μ��� ip�� ��Ʈ�� �޾� ���� ip��port�� �������� ���ε�(����)
	    	try {
	    	// 1. ���� ���� �޸��Ҵ�
	    	serverSocket = new ServerSocket();
	    	// 2. ���� ���� ���ε� [ip�� port ����]
	    	serverSocket.bind(new InetSocketAddress(ip, port) );
	    	
	    	}catch( Exception e ) { 
	    		
	    		System.out.println("���� ���� ����:"+e); }
	    	// 3. Ŭ���̾�Ʈ�� ��û ��� [ ��Ƽ������ ������� : Ŭ���̾�Ʈ ����, ������, �ޱ� ]
	    	Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
					while(true) {
						Socket socket = serverSocket.accept(); // 1. ��û �����Ŀ� ������ ������ ����
						clientlist.add(new Client(socket)); // 2. ����� Ŭ���̾�Ʈ(����� ����) �����Ŀ� ����Ʈ�� ����
					}
				} catch(Exception e) {
				System.out.println("������ Ŭ���̾�Ʈ ������� :" + e);   }
			}
	    	}; // ��Ƽ������ ���� ��
	    	threadpool = Executors.newCachedThreadPool(); // ������Ǯ�� �޸� �ʱ�ȭ[�Ҵ�]
	    	threadpool.submit(runnable); // ������ ������ ��Ƽ�����带 ������Ǯ�� �־��ֱ�
	    }
	    // 3. �������� �޼ҵ�
	    public void serverstop() { 
	    	try {
		    	// 1. ���ӵ� ��� Ŭ���̾�Ʈ���� ���� �ݱ� 
		    	for( Client client :  clientlist) {
		    		client.socket.close();
		    	}
		    	// 2. �������� �ݱ�
		    	serverSocket.close();
		    	// 3. ������Ǯ �ݱ�
		    	threadpool.shutdown();
	    	}catch( Exception e ) {}
	    }
	     	
	    	    
} // ce