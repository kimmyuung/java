package ��Ӱ���;

public class ���� {
int ���ݷ�;
String �����̸�;
int ���õ�;

public ����(int ���ݷ�, String �����̸�, int ���õ�) {
	super();
	this.���ݷ� = ���ݷ�;
	this.�����̸� = �����̸�;
	this.���õ� = ���õ�;
}

public int ������() { // ���� ��� ����
	for(int i = 0; i < ���ݷ�; i++) {
		���õ�++;
		if(���õ� == 100) System.out.println("���õ��� �ִ�ġ�� �����Ͽ����ϴ�.");
		return ���õ�;
	}
	return 0;
}



}
