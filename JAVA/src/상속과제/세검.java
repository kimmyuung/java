package ��Ӱ���;

public class ���� extends ����{

	
	public ���� (int ���ݷ�, String �����̸�, int ���õ�) {
		super(���ݷ�, �����̸�, ���õ�);
	}
	
	@Override
	public int ������() {
		// TODO Auto-generated method stub
		for(int i = 0; i < ���ݷ�; i++) {
			���õ�++;
			if(���õ� == 100) System.out.println("���� ���õ��� �ִ�ġ�� �����Ͽ����ϴ�.");
			return ���õ�;
		}
		return 0;
	}
	
	
}
