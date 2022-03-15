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
	int [][] scores = new int[100][3]; // 과목점수
	int [] ranks = new int[100]; // 석차
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("                    성      적      표                    ");
		System.out.println("번호   이름    국어   영어   수학   총점   평균    석차");
		
		System.out.println("[1. 학생점수 등록 2. 학생점수 삭제");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("학생점수를 등록합니다.");
			System.out.println("학생 이름을 입력하세요"); String sname = sc.next();
			System.out.println("국어 점수를 입력하세요"); int kor = sc.nextInt();
			System.out.println("수학 점수를 입력하세요"); int math = sc.nextInt();
			System.out.println("영어 점수를 입력하세요"); int eng = sc.nextInt();
			for(int i = 0; i < 100; i++) {
				if(name[i] != null) {name[i] = sname;}
				if(scores[i][0] != 0 && scores[i][1] != 0 && scores[i][2] != 0) {
					scores[i][0] = kor;
					scores[i][1] = math;
					scores[i][2] = eng;
					System.out.println("학생점수가 등록되었습니다.");
					break;
				}
			}
			
			
		}
		else if(ch==2) {
			
		}
		else {System.out.println("입력할 수 없는 숫자입니다. 다시 입력해주세요.");}
		
		}
	
	
	
	} // me
} // ce
