package �������̽�����;

import java.util.Random;

public class �����佺 implements �������̽�_��Ÿ{
	int �̳׶�;
	int ����;
	int �α���;
	
	int ����;
	
	
	 @Override
	public boolean ���ֻ���(int sum, int sum1) {
		// TODO Auto-generated method stub
		 System.out.println("���� ���� ��� : �̳׶� 200, ���� 200");
		 if(sum > 200 && sum1 > 200) {
			 System.out.println("���������� �Ϸ�Ǿ����ϴ�.");
			 sum = sum - 200; sum1 = sum1-200;
			 �α���++;
			 ����++;
			 return true;
		 }
		
		return false;
	}
	 @Override
		public int �ڿ�ä��(int sum) {
			// TODO Auto-generated method stub
			System.out.println("���κ갡 �̳׶��� ä���մϴ�.");
			Random random = new Random();
			int �̳׶� = random.nextInt(8)+1;
			sum += �̳׶�;
			return sum;
		}
		@Override
		public int ����ä��(int sum1) {
			// TODO Auto-generated method stub
			Random random = new Random();
			System.out.println("���κ갡 ������ ä���մϴ�.");
			int ���� = random.nextInt(8)+1;
			sum1 += ����;
			return sum1;
		}
		
	 @Override
	public void ��������() {
		// TODO Auto-generated method stub
		System.out.println("�����佺�� �÷����մϴ�.");
	}
}
