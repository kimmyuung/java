package Day09;

public class Day09_2 {
public static void main(String[] args) {
	
	// ��� : �θ𿡰� �����޴� �� --> �θ� Ŭ������ ����� �ڽ� Ŭ�������� �����ִ� ��
		// ���� : �θ� ---> �ڽ� // ���α׷��� : �ڽ� ---> �θ� ����
	// = ���赵�� ����(extends) --> ���� : �ڵ��� �ߺ��� �ٿ� ���� ����
		// ex) �ڵ��� ����ȸ�� ���� --> �ڵ����� �⺻ ����(=�θ�Ŭ����) 
								 // ---> �⺻ ����(���� �ִ� �ڵ�) + �ڵ������� Ư¡ => �ڽ�Ŭ����
	// ����Ŭ������ ��ü ����
	DmbCellPhone dmb = new DmbCellPhone("�ڹ���", "����", 10);
	
	// ���� Ŭ������ ������� ��ü�� ����Ŭ����(1��)�� ���[�ʵ�] ����
	System.out.println("Model : " + dmb.model);
	System.out.println("Color : " + dmb.color);
	// ���� Ŭ������ ������� ��ü�� ���� ��� ����
	System.out.println("Channel : " + dmb.channel);
	
	// ����Ŭ������ ������� ��ü�� ����Ŭ������ ���[�޼ҵ�] ����
	dmb.powerOn(); // ����Ŭ������ ����� �޼ҵ�(ȣ�� ����)
	dmb.bell();
	dmb.sendVoice("Hello");
	dmb.receiveVoice("Ah~ Hi. Nice to meet you.");
	dmb.hangup();
	// ����Ŭ������ ������� ��ü�� ���� �������
	dmb.turnOnDmb();
	dmb.changeChanneDmb(12);
	dmb.turnOffDmb();
	
	}
}
