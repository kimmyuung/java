package Day08_5����;

public class Day08_5���� {
	// ����� ��ũ ���α׷�
	// �䱸����
	// ȸ���ֿ���: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	// �����ֿ���: 1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸��
	// ����: ����, �����ǰ, ȸ��
	// �ʵ�
	// �޼ҵ�
	public static void main(String[] args) {
		Day08_5���� app = new Day08_5����();
		app.menu();
	}

	void menu() {
		Controleer controleer = new Controleer();
		try {
		while (true) {
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			int ch = Controleer.sc.nextInt();
			if (ch == 1) {
				boolean result = controleer.ȸ������();
				if (result) {
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				} else
					System.out.println("ȸ�����Կ� �����Ͽ����ϴ�. �ٽ� �õ����ּ���.");
			} else if (ch == 2) {
				boolean result = controleer.�α���();
				int i = 0;
				for (Member temp : controleer.memberlist) {
					if (result) {
						System.out.println("�α��� ����");
						System.out.println("ȯ���մϴ�\t" + controleer.memberlist[i].getId() + "��");
						System.out.println("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸��");
						int ch1 = controleer.sc.nextInt();
						if (ch1 == 1) {
							boolean result1 = controleer.���»���();
							if(result1) {System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");}
							else {System.out.println("���� ���� ����!!");}
						} else if (ch1 == 2) {
							System.out.println("�Ա� ������");
							System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.�Ա�(money);
							if(result) {System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");}
							else System.out.println("�Աݿ� �����Ͽ����ϴ�.");
							
						} else if (ch1 == 3) {
							System.out.println("��� ������");
							System.out.println("���� ��й�ȣ�� �Է��ϼ���");
							String pw = controleer.sc.next();
							System.out.println("����Ͻ� �ݾ��� �Է��ϼ���");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.���(money, pw);
							if(result) {System.out.println("����� �Ϸ�Ǿ����ϴ�.");}
							else System.out.println("��ݿ� �����Ͽ����ϴ�.");
							
						} else if (ch1 == 4) {
							System.out.println("��ü ������");
							System.out.println("��ü�Ͻ� ������ �̸��� �Է��ϼ���");
							String name = controleer.sc.next();
							// ���¹�ȣ ��� �̸����� �߽��ϴ�...
							System.out.println("��й�ȣ�� �Է��ϼ���.");
							String pw = controleer.sc.next();
							System.out.println("��ü �ݾ��� �Է��ϼ���");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.��ü(name, pw, money);
							if(result1) System.out.println("��ü ����!!");
							else System.out.println("��ü ����!!");
							
						} else if (ch1 == 5) {
							System.out.println("���� ������");
							System.out.println("1. ��������(���� 5%) 2. �Ϲݴ���(���� 3%)");
							int ch2 = controleer.sc.nextInt();
							System.out.println("�����Ͻ� �ݾ��� �Է��ϼ���");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.����(money);
							if(result1 == true && ch2 == 1) {
								System.out.println("���� ����!!");
								System.out.println("�����Ͻűݾ� : " + money);
								System.out.printf("\n���ƾƾ��ϴ� �ݾ� : %d", ((int)money + money *0.05));
							}
							else if(result == true && ch2 == 2) {
								System.out.println("���� ����!!");
								System.out.println("�����Ͻűݾ� : " + money);
								System.out.printf("\n���ƾƾ��ϴ� �ݾ� : %d", ((int)money + (money *0.03)));
							}
							else {System.out.println("���� ����!!");}
						} else if (ch1 == 6) {
							controleer.���¸��();
						} else {
							System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						}
					} else {
						System.out.println("�α����� �����Ͽ����ϴ�.");
					}
				}
			} else if (ch == 3) {
				boolean result = controleer.���̵�ã��();
				int i = 0;
				for (Member temp : controleer.memberlist) {
					if (result) {
						System.out.println("����� ���̵�� : " + controleer.memberlist[i].getId());
						break;
					} else {
						System.out.println("����Ͻ� ȸ�������� ���� ���̵� �����ϴ�.");
					}
				}
			} else if (ch == 4) {
				boolean result = controleer.��й�ȣã��();
				int i = 0;
				for (Member temp : controleer.memberlist) {
					if (result) {
						System.out.println("����� ��й�ȣ : " + controleer.memberlist[i].getPw());
						break;
					} else {
						System.out.println("�Է��Ͻ� ȸ�������� ���� ȸ���� �����ϴ�.");
					}
				}
			} else {
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			
		}
		}catch(Exception e) {System.out.println("���ڿ��� �Է��߽��ϴ�. �ٽ� �Է����ּ���");}
	}
}
