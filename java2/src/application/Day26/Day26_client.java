package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day26_client {
public static void main(String[] args)  {
	// 1. 소켓 만들기
	Socket socket = new Socket();
	
	// 2. 서버소켓으로 연결하기
	try {
	while(true) { // 서버소켓의 ip와 port
		socket.connect(new InetSocketAddress("192.168.17.91",5000));
		System.out.println("[[서버와 연결 성공]]");
		Scanner sc = new Scanner(System.in);
		System.out.println("서버에게 보낼 메시지 : "); String msg = sc.next();
		OutputStream outputStream =socket.getOutputStream();
		outputStream.write(msg.getBytes());
		// 서버에게 데이터 수신 받기
		InputStream inputStream = socket.getInputStream();
		byte[] bytes = new byte[1000];
		inputStream.read(bytes);
		System.out.println("서버가 보낸 메시지 : " + new String(bytes));
		sc.close();
	}}catch(Exception e) {System.out.println(e);}
	
}
}
