package Day09;

import java.util.Scanner;

public class Day09_1 {
// this.�ʵ�� // this.�޼ҵ�� // this() : ������� ȣ�� // this(������, ������) : ������
// Override : �������̵�(������ �޼ҵ带 ������ ����)
// static : ���� ���(�����ڿ� ���� X) , ��ü ���� Ŭ���� ���� ���� ���� <------> new ��ü�� ����
// final : ���[�����Ұ�]
// ��Ű�� : Ŭ�������� �׷�ȭ, �̸��� ���� Ŭ�������� �ĺ�, ��Ű�� ���� �ؾ� ��
// dafault : �ش� ��Ű�� / private : �ش� Ŭ����
	// {} ������ ������ Ȥ�� �޼ҵ�
	// Ŭ������� �̸� ���� �� ������
	// Ŭ������� �̸� �ٸ� �� �޼ҵ�
// ������ ����� : Ŭ���� �̸� ���� 
	//	ex) Member(String name, String id) {this. name = name; this. id = id;}
// �޼ҵ� ����� : Ŭ���� �̸��� �ٸ�[��ȯŸ��, �޼ҵ��(�μ�1, �μ�2) {���๮} ] 
	// ex) void logout (String id) {System.out.print("logout"); return id;} // 
	// boolean login(String id, Sting pw) {
	// if(id.equals("ȫ") && pw.equals("12345") {return true;}
	// else return false;}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// ��ü�� ���� �޼ҵ� ȣ��
	// �޼ҵ� �������̵� : ������ �̸����� �޼ҵ带 ���𰡴�(��, ���� �ٸ� �μ�[�Ű�����] ���)
//	void printIn /*���� ���� ��*/(int x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//		System.out.println(x); // ������ �ִ� ��
//		}
//	void printIn /*���� ���� ��*/(boolean x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//		System.out.println(x); // ������ �ִ� ��
//		}
//	void printIn /*���� ���� ��*/(double x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//		System.out.println(x); // ������ �ִ� ��
//		}
//	void printIn /*���� ���� ��*/(String x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//		System.out.println(x); // ������ �ִ� ��
//		}
	// ��ü�� ������ �ʰ� �޼ҵ� ȣ��(static�� ���� ȣ�� , but �޸𸮸� ���� ���)
//	static printIn /*���� ���� ��*/(int x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//	System.out.println(x); // ������ �ִ� ��
//	}
//  static printIn /*���� ���� ��*/(boolean x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//	System.out.println(x); // ������ �ִ� ��
//	}
//  static printIn /*���� ���� ��*/(double x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//	System.out.println(x); // ������ �ִ� ��
//	}
//  static printIn /*���� ���� ��*/(String x) { // �ܺηκ��� int�� ������ �μ��� �޾� ���
//	System.out.println(x); // ������ �ִ� ��
//	}	
	}	
}
