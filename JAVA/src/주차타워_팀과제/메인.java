package 주차타워_팀과제;

import java.util.ArrayList;
import java.util.Scanner;

public class 메인 {
	public static void main(String[] args) {
		컨트롤러 con = new 컨트롤러();
		Scanner sc = new Scanner(System.in);
		con.매출파일로딩();
		while (true) {
			System.out.println("\n주차타워 프로그램(관리자)");
			System.out.println("1. 주차타워 짓기 2. 입차 3. 출차 4. 매출확인 5. 프로그램 종료");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("주차타워를 건설합니다.");
				System.out.println("주차장 크기를 입력해주세요");
				System.out.println("1층에 주차장은 5개까지 건설이 가능합니다.");
				int park = sc.nextInt();
				con.주차타워건설(park);
				for (int i = 0; i < con.parktower.length; i++) {
					System.out.print(con.parktower[i] + "\t");
					if (i % 5 == 4) {
						System.out.println();
					}
				}
			} else if (ch == 2) {

				System.out.println("입차를 시작합니다.");
				System.out.print("차량번호를 입력해주세요 : "); String Carnum = sc.next();
				for (int i = 1; i <= con.parktower.length; i++) {
					System.out.print("[" + i + "]" + "\t");
					if (i % 5 == 0) {
						System.out.println();
					}
				}
				System.out.println("\n주차할 위치를 선택해주세요");
				int location = sc.nextInt();
				boolean result = con.입차(Carnum, location - 1);
				if (result) {
					for (int i = 0; i < con.parktower.length; i++) {
						System.out.print(con.parktower[i] + "\t");
						if (i % 5 == 4) {
							System.out.println();
						}
					}
					System.out.println("주차 완료!");
				}
				else System.out.println("[[주차 실패 : 주차 자리에 차가 있거나 차량번호가 중복됩니다]]");
			} else if (ch == 3) {
				System.out.println("출차할 차량 번호를 입력하세요"); String carNum = sc.next();
				boolean result = con.출차(carNum);
				if(result) {
					System.out.println("출차에 성공하였습니다.");
					int 주차요금 = con.계산();
					System.out.println("계산금액 : " + 주차요금);
					System.out.print("\n금액을 결제해주세요 : ");
					int 결제금액 = sc.nextInt();
					if(주차요금 > 결제금액) {
						System.out.println("돈이 부족합니다. " + (주차요금-결제금액) + "원을 더 투입해주세요");
						int 부족금액 = sc.nextInt();
						if(결제금액 + 부족금액 < 결제금액) {System.out.println("돈을 더 넣어주세요");}
						else System.out.println("결제 되었습니다.");
					}
					else if(주차요금 < 결제금액) {System.out.println("결제 되었습니다. " + (결제금액-주차요금) + "원을 반환합니다.");}
					else if(주차요금 == 결제금액) {System.out.println("결제 되었습니다.");}
					con.정산금누적(주차요금);
					
				}
				else System.out.println("[[출차 실패 : 해당 차량 번호가 주차장 내에 존재하지 않습니다]]");
			} else if (ch == 4) {
				
				
				boolean isInputRight = true;	// 사용자가 예상한대로 값을 입력했는지 기록하는 플래그. true : 정상실행
				System.out.printf("검색할 연도를 정수로 입력하세요.\n입력예시) 2022년 : 22\n입력가능연도 : 20~22\n입력 >");
				int year = sc.nextInt();
				System.out.printf("%2d년에서 검색할 달을 정수로 입력하세요.\n입력예시)03월 : 3\n입력 >",year);
				int month = sc.nextInt();
				System.out.print("정렬기준을 고르시오\n1. 일자 | 2. 금액\n선택 >");
				int sortBy = sc.nextInt();
				System.out.println("=====================================");
				
				if(sortBy<1 || sortBy>2 ) {	// 만약 정렬기준을 1번이나 2번이 아닌걸 고르면
					System.out.println("제발 보기 안에 있는걸 골라주세요...");
					isInputRight=false;
				}else if(month<1 || month>12) {	// 검색 달을 1~12월 밖으로 입력하면
					System.out.println("제발 1월에서 12월까지만 넣어주세요...");
					isInputRight=false;
				}else if(year<20 || year>22) {
					System.out.println("입력년도를 확인하세요.\n입력가능연도 : 20~22년");
					isInputRight=false;
				}
				
				if(isInputRight==true) {	
					ArrayList<매출> 검색결과출력용리스트 =  new ArrayList<>(con.매출출력(year, month, sortBy));
					if(검색결과출력용리스트.size()==0)	// 만약 리턴받은 리스트에 암것도 ㅇ벗으면
						System.out.println("입력한 기간에는 매출이 없습니다.");
					int sum=0;
					for(매출 tmp : 검색결과출력용리스트) {
							System.out.printf("%d년 %2d월 %3s 매출 : %s원\n", year, month, tmp.get날짜(), tmp.get매출금액());
							sum += tmp.get매출금액();
					}
					System.out.printf("\n%d년 %2d월의 매출액 합계는 %5d원 입니다.\n",year,month,sum);
					System.out.println("=====================================");
				}
				
			} else if (ch == 5) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
		}
	}
}
