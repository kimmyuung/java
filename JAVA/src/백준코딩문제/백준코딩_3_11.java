package �����ڵ�����;

import java.util.Scanner;
// ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class �����ڵ�_3_11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int x = sc.nextInt();
	int[] nlist = new int[x];
	int z = sc.nextInt();
	for(int i =0; i < x; i++) {
		 nlist[i]= sc.nextInt();
	}
	sc.close();
	for(int i =0; i < x; i++) {
		if(nlist[i] < z) {System.out.println(nlist[i]);}
	}
}
}
