package exam;

import java.util.Scanner;

public class 프로그래밍언어활용_김명호
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
				System.out.println("\t 성 \t 적 \t 표 \t");
				System.out.println("--------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				for (int i = 0; i < st.length; i++)
				{
					if (st[i] != null)
					{
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", i + 1, st[i].getName(), st[i].getKor(),
								st[i].getEng(), st[i].getMath(), st[i].getTotal(), st[i].getAvg(), i + 1);
					}
				}
				System.out.println("--------------------------------------------");
				System.out.println("메뉴 : 1. 학생점수 등록 2. 학생점수 삭제");
				int select = sc.nextInt();

				if (select == 1)
				{ // 점수등록 시작
					System.out.println("학생 이름을 입력하세요.");
					String name = sc.next();
					System.out.println("국어 성적을 입력하세요.");
					int kor = sc.nextInt();
					System.out.println("영어 성적을 입력하세요.");
					int eng = sc.nextInt();
					System.out.println("수학 성적을 입력하세요.");
					int math = sc.nextInt();
					int index = 0;
					int tmp = 0;
					for (int i = 0; i < st.length; i++)
					{
						if (st[i] == null)
						{
							System.out.println("학생 등록이 완료되었습니다.");
							st[index] = new Student(name, kor, eng, math, kor + eng + math, (kor + eng + math) / 3);
							rank[index] = 1; // 모든 학생들은 1등으로 시작
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

				} // 점수등록 끝

				else if (select == 2)
				{
					System.out.println("학생 번호를 입력해주세요.");
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
					System.out.println("양수를 입력해야만 정상적으로 작동합니다. 다시 입력해주세요");
				} else
					System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");

			}
			/* we */} catch (Exception e)
		{
			System.out.println("숫자를 입력하세요.");
		} // t1 e
	} // m e
} // c e
