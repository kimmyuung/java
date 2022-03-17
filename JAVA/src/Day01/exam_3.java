package Day01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exam_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] students = new String[100][8];
 		try {
			while(true) {
				System.out.println("-------------------------------------------------------------------");
				System.out.println("\t성\t적\t표");
				System.out.println("-------------------------------------------------------------------");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				//성적표 나오는 곳
				
				int in = 0;
				for(String[] temp : students) {
					try {
						if(students[in] != null) {
							double avg2 = Double.valueOf(students[in][6]);
							System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%.2f\t%s\n",in+1,students[in][1],students[in][2],students[in][3],students[in][4],students[in][5],avg2,in+1);
						}
					}
					catch(NullPointerException e) {
						System.out.println();
						break;
					}
					in++;
				}
				
				System.out.println("-------------------------------------------------------------------");
				System.out.println("1)학생등록 2)학생삭제");
				
				int ch = scanner.nextInt();
				if(ch == 1) {
					System.out.println("학생추가)");
					System.out.println("이름 입력 :");
					String name = scanner.next();
					System.out.println("국어점수 : ");
					int korean = scanner.nextInt();
					System.out.println("영어점수 : ");
					int english = scanner.nextInt();
					System.out.println("수학점수 : ");
					int math = scanner.nextInt();
					int total = korean+english+math;
					double avg = total/3;

					for(int i = 0; i < students.length; i++) {
						if(students[i][0] == null) {
							
							String str_i = String.valueOf(i+1);
							String str_kor = String.valueOf(korean);
							String str_eng = String.valueOf(english);
							String str_mat = String.valueOf(math);
							String str_tot = String.valueOf(total);
							String str_avg = String.valueOf(avg);
							students[i][0] = str_i;
							students[i][1] = name;
							students[i][2] = str_kor;
							students[i][3] = str_eng;
							students[i][4] = str_mat;
							students[i][5] = str_tot;
							students[i][6] = str_avg;
							System.out.println("학생등록 완료~!");
							for(int j = 0; j< students.length; j++) {
								if(students[i][5] != null && students[j][5] != null && students[j] != null && students[i] != null) {
									int total1 = Integer.parseInt(students[i][5]);
									int total2 = Integer.parseInt(students[j][5]);
									if(total1 > total2) {
										String[] temp = students[i];
										students[i] = students[j];
										students[j] = temp;
									}
								}
							}
							break;
						}
					}
				}
				else if (ch == 2) {
					System.out.println("학생삭제)");
					System.out.println("학생 번호 :");
					String num = scanner.next();
					
					for(int i = 0; i < students.length-1;i++) {
						if(students[i][0] != null && students[i][1].equals(num)){
							System.out.println("학생삭제 완료~!");
							students[i] = null;
							if( i == students.length-1) {
								students[ students.length-1 ] = null;
								break;
							}
							else {
								students[i] = students[i+1];
								students[i+1] = null;
								break;
							}

							
							/*
							if( students[i] ) {
								students[i-1 ] = null;
								break;
							}
							else {
								
								students[i] = null;
								break;
							}
							*/
						}
					}
				}
				else {
					System.out.println("잘못된 입력");
				}
			}
		}
		catch(InputMismatchException e) {
		System.out.println("숫자만 입력 가능합니다.");
		}
	}
}
