package exam;

import java.util.Scanner;

public class exam_1
{
// 성적표 출력
	// 초기메뉴 [1. 학생점수 등록 2. 학생점수 삭제]
	// 입력받는 것 : 이름 , 국어, 영어, 수학
	// 성적 입력은 5명으로 하되 100명까지 가능하도록 작성
	// 평균은 소숫점 이하2자리까지
	// 석차대로 출력
public static void main(String[] args)
{
	String [] 학생이름 = new String[100];
	int [][] 점수 = new int[100][3];
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println(" ----- 학생 성적부 ----- ");
		System.out.println("[1. 학생점수 등록 2. 학생점수 삭제"); 
		
		int ch = sc.nextInt();
	if(ch == 1) {
		System.out.println("학생 이름을 입력하세요."); String name = sc.next();
		System.out.println("국어 점수를 입력하세요"); int kor = sc.nextInt();
		System.out.println("수학 점수를 입력하세요"); int math = sc.nextInt();
		System.out.println("영어 점수를 입력하세요"); int eng = sc.nextInt();
		for(int i = 0; i<학생이름.length; i++) {
			if(학생이름[i] == null) {
				System.out.println("학생 이름 등록 성공");
				학생이름[i] = name; 
				break;
				}
		}
		for(int i = 0; i<점수.length; i++) {
			if(점수[i][0] == 0) {
				점수[i][0] = kor;
				점수[i][1] = math;
				점수[i][2] = eng;
				System.out.println("점수등록 성공");
				break;
			}
		}
		System.out.print("이름\t 국어\t 수학\t 영어\t 총점\t 평균\t 석차\t \n");
		
	}
	else if(ch == 2) {
		System.out.println("삭제할 학생의 이름을 입력하세요"); String name = sc.next();
		for(int i = 0 ; i<학생이름.length; i++) {
			if(학생이름[i] != null && 학생이름[i].equals(학생이름)) {
				학생이름[i] = null; 점수[i][0] -= 0; 점수[i][1] -= 0; 점수[i][2] -= 0;
				break;
			}
		}	
	}
	else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력하세요");}
	for(int i = 0; i<점수.length; i++) {
		if(점수[i][0] != 0 && 학생이름[i] != null) {
			int sum = 점수[i][0] + 점수[i][1] + 점수[i][2];
			double avg = 점수[i][0] + 점수[i][1]+ 점수[i][2];
			System.out.println(학생이름[i] + "\t" + 점수[i][0] + "\t" + 점수[i][1] + "\t" + 점수[i][2] 
					+ "\t" + sum + "\t" + avg + "\t");
		}
	}	
	}
}	
	
}
