package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	// 1. 캘린더 클래스내 현재 날짜/시간 객체 호출
	
	System.out.println("연도 : "); int year = sc.nextInt();
	System.out.println("월 : "); int month = sc.nextInt();
	달력(year, month);
	}

	public static void 달력(int year, int month) {
		while(true) {
			Calendar calendar = Calendar.getInstance(); // 현재 날짜
			Scanner sc = new Scanner(System.in);
			// 해당 월의 1일의 요일 찾기
				// 1. 사용자 정의 캘린더 설정
					calendar.set(year, month-1, 1); // ex) 작성한월의 1일 날짜 설정
						
					// 2. 3월 1일의 요일 
					int sweek = calendar.get(Calendar.DAY_OF_WEEK);
						
					int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
					// 해당 날짜의 마지막일수를 구함
					
					// 3. 출력
			System.out.println("*****" + year + "년 " + month + "월 *****");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
	
			// 현재 월 1일의 위치 앞에 공백 채우기
			for(int i = 1; i < sweek ; i ++) {
				// 3월1일은 화요일 = 3
				System.out.print("\t");
			}
			
			// 1일부터 마지막날짜 까지 출력
			for(int i = 1; i <= eday ; i ++) {
				// 오늘 체크
				//if(i == day) System.err.print(i + "\t");
				System.out.print(i + "\t"); // i = 일 출력
				// 토요일(토요일은 7)마다 줄바꿈 처리
				if(sweek%7==0) System.out.println(); // 요일단위로해야 함...
				sweek++; // 하루씩 요일 증가
			}
			
			// 버튼[1. 이전달 2. 다음달]
			try {
				System.out.print("\n[메뉴 : 1. 이전달 2. 다음달 3. 다시검색 4. 종료]");
				int ch = sc.nextInt();
				if (ch == 1) {
					month -= 1; if(month == 0) {month = 12; year -= 1;}
				}
				else if (ch == 2) {
					month += 1; if(month == 13) {month = 1; year += 1;}
				}
				else if (ch == 3) {
					System.out.println("연도 : "); year = sc.nextInt();
					System.out.println("월 : "); month = sc.nextInt();
				}
				else if (ch == 4) {
					System.out.println("종료합니다"); break;// 메소드 종료
				}
				else if (ch < 0) {
					System.out.println("음수는 입력하시면 안됩니다. 다시 입력해주세요");
				}
				else System.out.println("등록되지 않은 숫자입니다. 다시 입력해주세요");
			}catch(Exception e) {System.out.println("정상적인 입력을 해주세요");}
		}
		
	}
}
