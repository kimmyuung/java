package ���ΰ�������;

import java.util.Scanner;

public class �����巡��Ʈ_���� {// c s

	public static void main(String[] args) { // m s
		�����巡��Ʈ_��Ʈ�ѷ� con = new �����巡��Ʈ_��Ʈ�ѷ�();
		Scanner sc = new Scanner(System.in);
		con.��������load();
		con.�����ε�();
		while (true) { // w s
			System.out.println("�����巡��Ʈ�� ���� �� ȯ���մϴ�.");
			System.out.println("1. ���� ���� 2. ���� ���� 3. ���� ���� 4. ���� ���� ");
			System.out.println("�޴� ���� >> ");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("���� �巡��Ʈ�� �������� �ִ� ������ �� ���� ���� ���� ������ ������� �����ϴ� �����Դϴ�");
				System.out.println("�÷��̾�� ��ǻ�Ϳ� ���Ҿ� ���� ������ �� ���Ҵ��� �ܷ�� �˴ϴ�.");
				System.out.println("�� �������� �ó����� Ư���� �� ���� �������ּ���");
				System.out.println("�� ���� �ִ� ������ 4����� �Դϴ�.");
			} else if (ch == 2) {
				System.out.println("������ �����մϴ�. ");
				System.out.println("���̵��� �������ּ���");
				System.out.println("1. �ſ� ���� : +5���� ��� �����մϴ�.");
				System.out.println("2. ���� : +3���� ��� �����մϴ�.");
				System.out.println("3. ���� : +1���� ��� �����մϴ�.");
				System.out.println("4. ���� ����� : -1���� ��� �����մϴ�.");
				System.out.println("5. ����� : -3���� ��� �����մϴ�.");
				System.out.println("6. �ſ����� : -5���� ��� �����մϴ�.");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					System.out.println("�ſ� ���� ���̵��� ������ �����մϴ�.");
					while(true) {
						System.out.println("[[���� �޴� 1. ���� �̱� 2. ���� Ȯ�� 3. ���� ���� ]]");
						System.out.print("\n �޴����� >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.�����̱�();
							System.out.println(select + "�� ������ �����ðڽ��ϱ�?");
							System.out.println("1. �� 2. �ƴϿ�");
							String team = sc.next();
							if(team.equals("1") || team.equals("��")) {
								for(���� temp : con.��������Ʈ)
									if(temp.get�����̸�().equals(select)) {
								con.��������(select, temp.get����Ư��(), temp.get�����ó���());
								}
							}
							else if(team.equals("2") || team.equals("�ƴϿ�")) {
								select = con.�����̱�();
							}
						}
						
						con.�ó����Ǵ�();
						con.ȿ���Ǵ�();
						}
						else if(ch3 == 2) {
							for(���� temp : con.�������ø���Ʈ) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("������ �����մϴ�.");
							break;
						}
						else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
					}
				}
				else if(ch2 == 2) {
					System.out.println("���� ���̵��� ������ �����մϴ�.");
					while(true) {
						System.out.println("[[���� �޴� 1. ���� �̱� 2. ���� Ȯ�� 3. ���� ���� ]]");
						System.out.print("\n �޴����� >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 5; i++) {
							String select = con.�����̱�();
							System.out.println(select + "�� ������ �����ðڽ��ϱ�?");
							System.out.println("1. �� 2. �ƴϿ�");
							String team = sc.next();
							if(team.equals("1") || team.equals("��")) {
								for(���� temp : con.��������Ʈ)
									if(temp.get�����̸�().equals(select)) {
								con.��������(select, temp.get����Ư��(), temp.get�����ó���());
								}
							}
							else if(team.equals("2") || team.equals("�ƴϿ�")) {
								// �ڷΰ���� ���� ���ص��ɵ�??
							}
						}
						
						int �ó������� = con.�ó����Ǵ�();
						int ȿ������ = con.ȿ���Ǵ�();
						int �������� = �ó������� + ȿ������;
						System.out.println("����� ������ : " + �������� +" �� �Դϴ�.");
						
						}
						else if(ch3 == 2) {
							for(���� temp : con.�������ø���Ʈ) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("������ �����մϴ�.");
							break;
						}
						else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
					}
				}
				else if(ch2 == 3) {
					System.out.println("���� ���̵��� ������ �����մϴ�.");
					while(true) {
						System.out.println("[[���� �޴� 1. ���� �̱� 2. ���� Ȯ�� 3. ���� ���� ]]");
						System.out.print("\n �޴����� >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.�����̱�();
							System.out.println(select + "�� ������ �����ðڽ��ϱ�?");
							System.out.println("1. �� 2. �ƴϿ�");
							String team = sc.next();
							if(team.equals("1") || team.equals("��")) {
								for(���� temp : con.��������Ʈ)
									if(temp.get�����̸�().equals(select)) {
								con.��������(select, temp.get����Ư��(), temp.get�����ó���());
								}
							}
							else if(team.equals("2") || team.equals("�ƴϿ�")) {
								select = con.�����̱�();
							}
						}
						
						con.�ó����Ǵ�();
						con.ȿ���Ǵ�();
						}
						else if(ch3 == 2) {
							for(���� temp : con.�������ø���Ʈ) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("������ �����մϴ�.");
							break;
						}
						else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
					}
				}
				else if(ch2 == 4) {
					System.out.println("���� ����� ���̵��� ������ �����մϴ�.");
					while(true) {
						System.out.println("[[���� �޴� 1. ���� �̱� 2. ���� Ȯ�� 3. ���� ���� ]]");
						System.out.print("\n �޴����� >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.�����̱�();
							System.out.println(select + "�� ������ �����ðڽ��ϱ�?");
							System.out.println("1. �� 2. �ƴϿ�");
							String team = sc.next();
							if(team.equals("1") || team.equals("��")) {
								for(���� temp : con.��������Ʈ)
									if(temp.get�����̸�().equals(select)) {
								con.��������(select, temp.get����Ư��(), temp.get�����ó���());
								}
							}
							else if(team.equals("2") || team.equals("�ƴϿ�")) {
								select = con.�����̱�();
							}
						}
						
						con.�ó����Ǵ�();
						con.ȿ���Ǵ�();
						}
						else if(ch3 == 2) {
							for(���� temp : con.�������ø���Ʈ) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("������ �����մϴ�.");
							break;
						}
						else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
					}
				}
				else if(ch2 == 5) {
					System.out.println("����� ���̵��� ������ �����մϴ�.");
					while(true) {
						System.out.println("[[���� �޴� 1. ���� �̱� 2. ���� Ȯ�� 3. ���� ���� ]]");
						System.out.print("\n �޴����� >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.�����̱�();
							System.out.println(select + "�� ������ �����ðڽ��ϱ�?");
							System.out.println("1. �� 2. �ƴϿ�");
							String team = sc.next();
							if(team.equals("1") || team.equals("��")) {
								for(���� temp : con.��������Ʈ)
									if(temp.get�����̸�().equals(select)) {
								con.��������(select, temp.get����Ư��(), temp.get�����ó���());
								}
							}
							else if(team.equals("2") || team.equals("�ƴϿ�")) {
								select = con.�����̱�();
							}
						}
						
						con.�ó����Ǵ�();
						con.ȿ���Ǵ�();
						}
						else if(ch3 == 2) {
							for(���� temp : con.�������ø���Ʈ) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("������ �����մϴ�.");
							break;
						}
						else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
					}
				}
				else if(ch2 == 6) {
					System.out.println("�ſ� ����� ���̵��� ������ �����մϴ�.");
					while(true) {
						System.out.println("[[���� �޴� 1. ���� �̱� 2. ���� Ȯ�� 3. ���� ���� ]]");
						System.out.print("\n �޴����� >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.�����̱�();
							System.out.println(select + "�� ������ �����ðڽ��ϱ�?");
							System.out.println("1. �� 2. �ƴϿ�");
							String team = sc.next();
							if(team.equals("1") || team.equals("��")) {
								for(���� temp : con.��������Ʈ)
									if(temp.get�����̸�().equals(select)) {
								con.��������(select, temp.get����Ư��(), temp.get�����ó���());
								}
							}
							else if(team.equals("2") || team.equals("�ƴϿ�")) {
								select = con.�����̱�();
							}
						}
						
						con.�ó����Ǵ�();
						con.ȿ���Ǵ�();
						}
						else if(ch3 == 2) {
							for(���� temp : con.�������ø���Ʈ) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("������ �����մϴ�.");
							break;
						}
						else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
					}
				}
				else System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				
			} else if (ch == 3) {
				System.out.println("���� �����Դϴ�.");
				System.out.println("������ �÷��� �ϴ� �� ���� ���� ������ ����� ����� �� �� �ֽ��ϴ�.");
				System.out.println("�� ���� ���翡 ���� �� �ִ� �� �ſ� ����� ���̵��� �÷����� ����� ������ ��ϵ˴ϴ�");
				System.out.println("��ŷ�� Ȯ���� �� �ֽ��ϴ�.");
				// ��������Ʈ �ݺ��� �̿��Ͽ� ���
			} else if (ch == 4) {
				System.out.println("������ �����մϴ�.");
				sc.close();
				break;
			}
			else if(ch == -1) {
				while(true) {
				System.out.println("������ ��带 �����մϴ�.");
				System.out.println("[[�޴� 1. ���� ��� 2. ���� ���� 3. ���� ��� Ȯ�� 4. ���� ���� 5. ������]]");
				int ch1 = sc.nextInt();
				if(ch1 == 1) {
					
					System.out.println("������ �̸��� �Է����ּ���"); String name = sc.next();
					for(String temp : con.�����ó���) {
						System.out.print(temp + "\t");
					}
					System.out.println("\n�ó����� �������ּ���");
					String combie = sc.next();
					
					for(String temp : con.����Ư��) {
						System.out.print(temp + "\t");
					}
					System.out.println("\nƯ���� �������ּ���");
					String skill = sc.next();
					boolean result = con.�������(name, skill, combie);
					if(result) System.out.println("���� ��� ����!");
					else System.out.println("���� ��� ����!");
				}
				else if(ch1 == 2) {
					System.out.println("������ ������ �̸��� �Է��ϼ���");
					String name = sc.next();
					for(String temp : con.����Ư��) {
						System.out.print(temp + "\t");
					}
					System.out.println("\n������ ������ Ư���� �������ּ���");
					String skill = sc.next();
					for(String temp : con.�����ó���) {
						System.out.print(temp + "\t");
					}
					System.out.println("������ ������ �ó����� �Է��ϼ���");
					String combie = sc.next();
					boolean result = con.��������(name, skill, combie);
					if(result) System.out.println("���� ���� ����!");
					else System.out.println("���� ���� ����!");
				}
				else if(ch1 == 3) {
					for(���� temp : con.��������Ʈ) {
						System.out.print((temp.get������ȣ()+1) + "\t" +temp.get�����̸�()+ "\t" + temp.get����Ư��()+ "\t" + temp.get�����ó���() + "\n");
					}
				}
				else if(ch1 == 4) {
					System.out.println("������ ������ �̸��� �Է��ϼ���");
					String name = sc.next();
					boolean result = con.��������(name);
					if(result) System.out.println("���� ���� ����");
					else System.out.println("���� ����!");
				}
				else if(ch1 == 5) {
					System.out.println("�����ڸ�带 �����ϴ�."); break;
				}
				}
			}
		} // we
	} // me
} // ce
