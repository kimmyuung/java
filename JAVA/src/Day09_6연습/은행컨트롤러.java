package Day09_6����;

import java.util.ArrayList;

public class ������Ʈ�ѷ� {
	// �ش� Ŭ������ ���� ���� ��Ʈ�ѷ�
		// M : �� [������]
		// V : �� [HTML]
		// C : ��[M]�� ��[V] ���� ����
		
		// ������ : �⺻������
		
	// �信�� ��û�ϴ� ����[���]�� ����
		// 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸�� 6. ����
		// 1. ���� (Create)
	static ArrayList<Bank> ���¸���Ʈ = new ArrayList<>();
	static int[] ���� = new int[100];
	boolean ���»��� (String bnum, String account, String name, String pw, int money) {
		
		for(Bank temp : ���¸���Ʈ) {
			if(temp.getBnum().equals(bnum)) {
				return false;
			}
		}
			Bank bank = new Bank(bnum, account, name, pw, money);
			���¸���Ʈ.add(bank);
			return true;
	}
	boolean �Ա� (String bnum, int money) {
		for(Bank temp : ���¸���Ʈ) {
			if(temp.getBnum().equals(bnum)) {
				temp.setMoney(money);
				return true;
			}
		}
		return false;
	}
	boolean ��� (String bnum, String pw, int money) {
		for(Bank temp : ���¸���Ʈ) {
			if(temp.getBnum().equals(bnum) && temp.getPw().equals(pw) 
					&& temp.getMoney() >= money) {
				temp.setMoney(temp.getMoney() - money);
				return true;
			}
		}
		return false;
	}
	boolean ��ü (String bnum, String pw, int money) {
		for(int i = 0 ; i < ���¸���Ʈ.size() ; i++) {
			for(int j = 0; j < ���¸���Ʈ.size(); j++) {
				if(���¸���Ʈ.get(i).getPw().equals(pw) && ���¸���Ʈ.get(j).getBnum().equals(bnum)) {
					���¸���Ʈ.get(i).setMoney(���¸���Ʈ.get(i).getMoney() - money);
					���¸���Ʈ.get(j).setMoney(���¸���Ʈ.get(j).getMoney() + money);
					return true;
				}	
			}
		}
		return false;
		
	}
	void ���¸�� () {
		for(Bank temp : ���¸���Ʈ) {
			if(temp != null) {
				System.out.println("���¹�ȣ :" + temp.getBnum());
				System.out.println("�����̸� : " + temp.getAccount());
				System.out.println("�����ܰ� : " + temp.getMoney());
			}
		}
	}
	boolean ���� (String bnum, int sumMoney, int �����ε���) {
		for(Bank temp : ���¸���Ʈ)
			if(temp.getBnum().equals(bnum)) {
				temp.setMoney(temp.getMoney() + sumMoney);
			} 
		for(int temp : ����) {
			if(temp == 0) {
				����[�����ε���] = sumMoney;
				�����ε���++;
				return true;
			}
		}
	return false;
	}
	boolean ��ȯ(String bnum, int money, int �����ε���) {
		for(Bank temp : ���¸���Ʈ) {
			if(temp.getBnum().equals(bnum)) {
				temp.setMoney(temp.getMoney() - money);
			}
		}
		for(int temp : ����) {
			if(temp != 0) {
				����[�����ε���] -= money;
				return true;
			}
		}
	return false;
	}
	
}
