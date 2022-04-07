package Day13_3연습;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_연습3 {
	// 달력프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력객체 선언
		System.out.println("검색할 연도를 입력하세요"); int year = sc.nextInt(); // 사용자로부터 연도를 입력받음
		System.out.println("검색할 달을 입력하세요"); int month = sc.nextInt(); // 사용자로부터 달을 입력받음
		달력(year, month); // 연월을 인수로 하여 달력 메소드 실행
		sc.close(); // 입력객체 닫음
	}
	public static void 달력(int year, int month) {
		while(true) {// 무한루프 종료조건 : 프로그램 종료시
			Scanner sc = new Scanner(System.in); // 입력객체 선언
			Calendar calendar = Calendar.getInstance(); // 지금의 날짜를 객체로 선언
			calendar.set(year, month-1, 1); // 사용자 설정 달력(1일 설정)
			// month에서 1을 뺀 이유 : 컴퓨터는 0부터 시작하므로 설정시에 맞춰주기 위해
			int sweek = calendar.get(Calendar.DAY_OF_WEEK); // 작성한 월의 1일의 위치를 알기 위해
			int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 달력이 최대 몇일인지 설정
			System.out.println("*****" + year + "년 " + month + "월 *****"); 
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int i = 1; i < sweek; i++) { // 주를 위해 설정
				System.out.print("\t"); // 
			}
			for(int i = 1; i <= eday; i++) { // 일 설정
				System.out.print(i + "\t"); // 일을 출력하고 띄어씀
				if(sweek % 7 ==0) System.out.println(); // 7일이 되면 줄바꿈
				sweek++; // 하루씩 요일 증가
			}
			
			System.out.println("\n[[메뉴 1. 이전 달 2. 다음 달 3. 다시 검색 4. 종료]]");
			int ch = sc.nextInt();
			if(ch == 1) { // 달 1감소, 달이 0이되면 연수가 1감소하고 달은 12월이 됨
				month -= 1; if(month == 0) {year-=1; month = 12;}
			}
			else if(ch == 2) { // 달 1증가, 달이 13이 되면 연수 1증가하고 달은 1월이 됨
				month += 1; if(month == 13) {year += 1; month = 1;}
			}
			else if(ch == 3) { // 다시 사용자로부터 검색할 연월을 입력받음
				System.out.print("검색할 연도"); year = sc.nextInt();
				System.out.print("검색할 달"); month = sc.nextInt();
			}
			else if(ch == 4) {
				System.out.println("종료!");
				sc.close();
				break;
			}
		}
	}
}
