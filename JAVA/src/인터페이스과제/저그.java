package �������̽�����;

import java.util.Random;

public class ���� implements �������̽�_��Ÿ{
	
	int �̳׶�;
	int ����;
	int �α���;
	
	
	int ���۸�;
	
	@Override
	public boolean ���ֻ���(int sum, int sum1) {
		// TODO Auto-generated method stub
		System.out.println("���۸� ���� ��� : �̳׶� 100, ���� 100");
		 if(sum > 200 && sum1 > 200) {
			 System.out.println("���۸������� �Ϸ�Ǿ����ϴ�.");
			 sum = sum - 100; sum1 = sum1-100;
			 �α���++;
			 ���۸�++;
			 return true;
		 }
		return false;
	}
	@Override
	public int �ڿ�ä��(int sum) {
		// TODO Auto-generated method stub
		System.out.println("SCV�� �̳׶��� ä���մϴ�.");
		Random random = new Random();
		int �̳׶� = random.nextInt(8)+1;
		sum += �̳׶�;
		return sum;
	}
	@Override
	public int ����ä��(int sum1) {
		// TODO Auto-generated method stub
		Random random = new Random();
		System.out.println("SCV�� ������ ä���մϴ�.");
		int ���� = random.nextInt(8)+1;
		sum1 += ����;
		return sum1;
	}
	
	@Override
	public void ��������() {
		// TODO Auto-generated method stub
		System.out.println("���׷� �÷����մϴ�.");
	}
	
}
