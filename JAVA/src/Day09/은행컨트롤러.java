package Day09;

import java.util.Random;

public class ������Ʈ�ѷ� {
 // �ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
	// M : �� [������]
	// V : �� [HTML]
	// C : ��[M]�� ��[V] ���� ����
	
	// ������ : �⺻������
	
// �信�� ��û�ϴ� ����[���]�� ����
	// 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸�� 6. ����
	// 1. ���� (Create)
	public boolean ����(String pw, String name, int bnum) {
		// 1. �Է¹��� ���� ������[�μ�]
			// ���¹�ȣ �ڵ�����
		Random random = new Random(); // 4�ڸ� ����
		int ���� = random.nextInt(10000); // 0~9999 ����
		String ���¹�ȣ = String.format("%04d", ����);
		// %d : ����, %4d ���� 4�ڸ�[���� �ڸ��� ������ ����ó��]
		// %04d ���� 4�ڸ�[���� �ڸ��� ������ 0ó��]
		
		// 2. ��üȭ(�ټ��� ������ �ϳ��� ��ü�� �����)
		if(bnum == 1) {
			Bank temp = new ��������("0", pw, name, 0);
		}
		else if(bnum == 2) {
			Bank temp = new ��������("0", pw, name, 0);
		}
		else if(bnum == 3) {
			Bank temp = new �ϳ�����("0", pw, name, 0);
		}
		// 3. �迭�� ����
		int i = 0;
		for(Bank temp2 : Day09_6_����������α׷�.���¸���Ʈ) {
			if(temp2 == null) {
				Day09_6_����������α׷�.���¸���Ʈ[i] = temp2;
				System.out.println("*** ���� ��� ***");
				return true;
			}
			i++;
		}
		return false;
	}
	
	// 2. �Ա� (Update)
	public boolean �Ա� () {
		return false;
	}
	// 3. ��� (Update)
	public boolean ��� () {
		return false;
	}
	// 4. ��ü (Update)
	public boolean ��ü () {
		return false;
	}
	// 5. ���¸�� (Reading)
	public boolean ���¸�� () {
		return false;
	}
	// 6. ����
	public boolean ���� () {
		return false;
	}
}
