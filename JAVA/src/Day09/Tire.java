package Day09;

public class Tire {
	// 1. field
	public int maxRotation; // �ִ�ȸ����[ȸ�����ɼ�]
	public int accmulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ
	// 2. constructor
	public Tire(int maxRotation, String location) {
		
		this.maxRotation = maxRotation; 
		// �ܺηκ��� ���޹��� �μ��� ���κ����� ����
		this.location = location;
	}
	
	// 3. method
	public boolean roll() {// Ÿ�̾� ȸ�� ���� �޼ҵ�
		accmulatedRotation++; // ����ȸ������ 1����
		if(accmulatedRotation<maxRotation) { // ���࿡ ����ȸ������ �ִ�ȸ�������� ������(���� ����)
		System.out.println(location + "Tire ���� : " 
		+ (maxRotation-accmulatedRotation) + "ȸ");
		return true;	}
		else {System.out.println("***" + location + "Tire ��ũ ***");
		return false; // �ƴϸ� [�������]
		}
	}
}
