package exam;

import java.util.Scanner;

public class exam_1 { // ce
public static void main(String[] args) { // ms
//	1. 성적표는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//	2. 메뉴에서 1번 선택시 학생점수를 추가 합니다. [ 5점 ]
//	3. 메뉴에서 2번 선택시 학생점수를 삭제 합니다. [ 5점 ]
//	4. 데이터는 키보드로 입력받아 배열에 저장합니다. [ 5점 ]
//	5. 성적 입력은 5명으로 하되, 최대 100명 이 가능하도록 작성합니다. [ 5점 ]
//	6. 번호 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다. [ 5점 ]
//	7. 평균은 소숫점 이하 2자리까지로 합니다. [ 5점 ]
//	8. 총점을 이용하여 석차를 구합니다. [ 5점 ]
//	9. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]
	String[] name = new String [100]; // 학생이름
	int [] ranks = new int[100]; // 석차
	int[] kor = new int[name.length];
	int[] eng = new int[name.length];
	int[] mat = new int[name.length];
	int[] tot = new int[name.length];
	double[] avg = new double[name.length];
	int[] rank = new int[name.length];
	Scanner sc = new Scanner(System.in);
	while(true) { // w1 s
		System.out.println("성      적      표");
		System.out.println("번호   이름    국어   영어   수학   총점   평균    석차");
		for(int i=0; i<name.length; i++) {
			if(name[i] != null && kor[i] != 0)
			System.out.print("번 호 : " + i);	
			System.out.print("이 름 : " + name[i] + " | ");
			System.out.print("총 점 : " + tot[i] + "점 | ");
			
			System.out.printf("평 균 : %.2f점 | ", avg[i]);
			System.out.print("석 차 : " + rank[i] + "등");
			System.out.println();
			break;
		}
		System.out.println("[1. 학생점수 등록 2. 학생점수 삭제");
		int ch = sc.nextInt();
		if(ch == 1) {
			for(int i=0; i<name.length; i++) {
				//// 이름과 각 과목의 점수 배열에 저장 ////
				System.out.print("학생 이름 입력 : ");
				name[i] = sc.next();
				
				System.out.print("국어 점수 입력 : ");
				kor[i] = sc.nextInt();
				
				System.out.print("영어 점수 입력 : ");
				eng[i] = sc.nextInt();
				
				System.out.print("수학 점수 입력 : ");
				mat[i] = sc.nextInt();
				
				System.out.println("**********************");
				
				//// 총점과 평균과 학점 구하기 ////
				// 총점
				tot[i] = kor[i] + eng[i] + mat[i];
				// 평균
				avg[i] = tot[i] / 3.0;
				
				// 석차
				// 모든 학생은 본인이 1등이라고 생각한다.
				rank[i] = 1; break;
			} // 석차
			for(int i=0; i<rank.length; i++) {
				for(int j=0; j<rank.length; j++) {
					if(tot[i] < tot[j]) {
						// 총점이 다음 사람보다 적으면 내 등수가 1++
						rank[i]++; 
					}
				}
			}
				
				
		// 출력
		
			}
		else if(ch==2) {		}	
		else {System.out.println("입력할 수 없는 숫자입니다. 다시 입력해주세요.");}	
		
		
		
		
} // w1 e
} // me
} // ce
