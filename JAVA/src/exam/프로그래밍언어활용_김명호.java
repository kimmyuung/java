package exam;

import java.util.Scanner;

public class ���α׷��־��Ȱ��_���ȣ
{ // c s

	public static void main(String[] args)
	{ // m s
		Scanner sc = new Scanner(System.in);
		int[] rank = new int[100];
		Student[] st = new Student[100];

		try
		{ // t1 s
			while (true)
			{
				System.out.println("--------------------------------------------");
				System.out.println("\t �� \t �� \t ǥ \t");
				System.out.println("--------------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				for (int i = 0; i < st.length; i++)
				{
					if (st[i] != null)
					{
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", i + 1, st[i].getName(), st[i].getKor(),
								st[i].getEng(), st[i].getMath(), st[i].getTotal(), st[i].getAvg(), i + 1);
					}
				}
				System.out.println("--------------------------------------------");
				System.out.println("�޴� : 1. �л����� ��� 2. �л����� ����");
				int select = sc.nextInt();

				if (select == 1)
				{ // ������� ����
					System.out.println("�л� �̸��� �Է��ϼ���.");
					String name = sc.next();
					System.out.println("���� ������ �Է��ϼ���.");
					int kor = sc.nextInt();
					System.out.println("���� ������ �Է��ϼ���.");
					int eng = sc.nextInt();
					System.out.println("���� ������ �Է��ϼ���.");
					int math = sc.nextInt();
					int index = 0;
					int tmp = 0;
					for (int i = 0; i < st.length; i++)
					{
						if (st[i] == null)
						{
							System.out.println("�л� ����� �Ϸ�Ǿ����ϴ�.");
							st[index] = new Student(name, kor, eng, math, kor + eng + math, (kor + eng + math) / 3);
							rank[index] = 1; // ��� �л����� 1������ ����
							break;
						}
						index++;
					}
//					for (int i = 0; i < st.length; i++)
//					{
//						for (int j = i + 1; j < st.length; j++)
//						{
//							if (st[i].getTotal() > st[j].getTotal())
//							{
//								tmp = rank[i];
//								rank[i] = rank[j];
//								rank[j] = tmp;
//							}
//						}
//						break;
//					}

				} // ������� ��

				else if (select == 2)
				{
					System.out.println("�л� ��ȣ�� �Է����ּ���.");
					int select1 = sc.nextInt();
					st[select - 1] = null;
					for (int i = select1 - 1; i < st.length; i++)
					{
						if (i == st.length - 1)
						{
							st[i] = null;
						} else
						{
							st[i] = st[i + 1];
						}
					}

				} else if (select < 0)
				{
					System.out.println("����� �Է��ؾ߸� ���������� �۵��մϴ�. �ٽ� �Է����ּ���");
				} else
					System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");

			}
			/* we */} catch (Exception e)
		{
			System.out.println("���ڸ� �Է��ϼ���.");
		} // t1 e
	} // m e
} // c e
