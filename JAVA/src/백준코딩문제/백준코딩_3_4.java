package �����ڵ�����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class �����ڵ�_3_4 {
public static void main(String[] args) throws Exception, IOException {// ���� �����͸� ���� �Ϲ� ���� �߻�!
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	int t = Integer.parseInt(bufferedReader.readLine());
	for(int i = 0; i < t; i ++) {
		st = new StringTokenizer(bufferedReader.readLine());
		bufferedWriter.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ) + "\n");
	}
	bufferedReader.close();
	bufferedWriter.flush();
	bufferedWriter.close();
	// Buffer : ���۰� ���� ���ų�, ���� ���� ������ ���� ���� �� ���� ����
	// Scanner : Ű������ �Է��� ���� ������ �� ���ھ� ���۷� ����
	// ���� : �����͸� �� ������ �ٸ� �� ������ �����ϴ� ���� �Ͻ������� �����͸� �����ϴ� �ӽ� �޸�
	// ���� �÷���(buffer flash) : ���ۿ� ���� �ִ� �����͸� ���(= ���� ���)
	// Scanner : ����(�����̽�)�� ����(���๮��)�� ���� �Է� �� �ν� -> ���� �ʿ� ����
	// ���� : ���͸� ���� �ν��ϰ� ���� �����Ͱ� String���� ����
	// ���� ���� ���� : readLine() �����͸� ���� ������ ����
	// ���� ������ �����͸� �˷��� StringTokenizer�� nextToken �Լ� �̿� or String�� spilt �̿�
	// ���� ������ : System.out.print("");�� ����
		// -> ���ڿ���°� ���� ���ÿ� ���� �ʱ� ������ ���� ���ϸ� \n or newLine �Լ� ���
//	StringTokenizer st = new StringTokenizer(s); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
	// StringTokenizer Ŭ������ ���ڿ��� �츮�� ������ �����ڷ� ���ڿ��� �ɰ��� Ŭ���� 
	// �׷��� �ɰ����� ���ڿ��� �츮�� ��ū(token)�̶�� �θ��ϴ�.
//	int a = Integer.parseInt(st.nextToken()); //ù��° ȣ��
//	int b = Integer.parseInt(st.nextToken()); //�ι�° ȣ��
//
//	String array[] = s.split(" "); //���鸶�� ������ ��� �迭�� ����
}
}
