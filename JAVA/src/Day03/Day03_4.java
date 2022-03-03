package Day03;

import java.util.Scanner;

public class Day03_4 { // c  s
	public static void main(String[] args) { // m  s
	
		Scanner scanner = new Scanner(System.in);
		
		// 제어문 1. if문 2. switch문
		// if : 논리검사(true or false) -> 경우의 수가 정해져 있지 않는 경우
			// >=, <=, <, >, ==, != 객체에 불가능!
		// swithch : 데이터검사(선택조건) -> 경우의 수가 정해져 있는 경우
		// braek; 가장 가까운 중괄호를 나감 -> switch와 break는 세트!
		// 형태
			/* switch(검사대상){
				case '값' : 실행문;
				case '값' : 실행문;
				case '값' : 실행문;
				dafault : 실행문;
				} */
		//예1 점수가 90이면 A, 80이면 B, 70이면 C, 그외 탈락
		int score = 80;
		if(score == 90) System.out.println("A Grade");
		else if(score == 80) System.out.println("B Grade");
		else if(score == 70) System.out.println("C Grade");
		else System.out.println("Fail");
		
		switch(score) {
		case 90 : System.out.println("A Grade"); 	break;
		case 80 : System.out.println("B Grade");	break;
		case 70 : System.out.println("C Grade"); 	break;
		default : System.out.println("Fail"); 		break;
		}
	// 예2  
		
		System.out.println("몇층을 가려고 하십니까");
		int button = scanner.nextInt();
		switch(button) {
		case 1 : System.out.println("1층으로 이동");	break;	
		case 2 : System.out.println("2층으로 이동");		break;
		case 3 : System.out.println("3층으로 이동");		break;
		case 4 : System.out.println("4층으로 이동");		break;
		default : System.out.println("정지");     break;
		}
	// 예3
		char 등급 = 'B';
		switch(등급) {
		case 'A' : //System.out.println("우수 회원"); -> 동일 코드 있으면 작성 안해도 됨
		case 'B' : System.out.println("우수 회원"); 	break;
		case 'C' : //System.out.println("일반 회원");
		case 'D' : System.out.println("일반 회원"); 	break;
		default : System.out.println("손님");
		}
	// 예4	
		String 직급 = "과장";
		switch(직급) { // 선택조건이기 때문에 .equals 사용 X
		case "부장" : System.out.println("700만원"); 		break;
		case "과장" : System.out.println("500만원"); 		break;
		default : System.out.println("300만원"); 			break;
		}
	
	// 문1 국어, 영어, 수학 점수를 입력받아 평균이 90점이상이면 A등급 80점이상이면 B등급 나머지 탈락
	System.out.println("국어 점수를 입력하세요");  int lan = scanner.nextInt();
	System.out.println("영어 점수를 입력하세요");  int math = scanner.nextInt();
	System.out.println("수학 점수를 입력하세요");  int eng = scanner.nextInt();
	int avg = (lan + math + eng) / 3;
	System.out.println("평균 :" + avg + "나누기 / 10" + avg/10);
		switch(avg/10) { // >=를 못쓰기 때문에 일의자리를 버리기 위해 10으로 나눔
		case 8 : System.out.println("B등급"); break;
		case 9 : System.out.println("A등급"); break;
		case 10 : System.out.println("A등급"); break;
		default : System.out.println("탈락"); break;
	}
	
		
		
	}// m  e
}// c  e
