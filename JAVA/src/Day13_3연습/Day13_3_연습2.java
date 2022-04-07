package Day13_3연습;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_연습2 {
// 달력프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 : "); int year = sc.nextInt();
		System.out.println("월 : "); int month = sc.nextInt();
		달력(year, month);
		sc.close();
		
	}
	
	public static void 달력(int year, int month) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(year, month-1, 1);
		
		int sweek = calendar.get(Calendar.DAY_OF_WEEK);
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int i = 1; i < sweek; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i < eday; i++) {
			System.out.print(i + "\t");
			if(sweek % 7 == 0) System.out.println();
			sweek++;
		}
		System.out.println("메뉴[[1. 이전달 2. 다음달 3. 다시 검색 4. 종료]]");
		int ch = sc.nextInt();
		if(ch == 1) {
			month -= 1; if(month == 0) {year -= 1; month = 12;}
		}
		else if(ch == 2) {
			month += 1; if(month == 13) {year += 1; month = 1;}
		}
		else if(ch == 3) {
			System.out.println("검색할 연도를 입력해주세요"); year = sc.nextInt();
			System.out.println("검색할 날짜를 입력해주세요"); month = sc.nextInt();
		}
		else if(ch == 4) {
			System.out.println("프로그램 종료!");  sc.close();
			break;
		}
		}
		}
	}

