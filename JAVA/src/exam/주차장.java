package exam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class 주차장 {
	// 주차 현황 표 설계
			// 1. 파일 구분 -> M(모델 : 데이터, 정보) : V(뷰어 : 입력, 출력) : C(컨트롤 : 이벤트작동)
			// 2. 모델 선택 
				// [ 식별 ] : 1. Car 클래스 (필드, 생성자(기본 하나, 모든 필드 가진 생성자 1개), 메소드(set, get) )
				// 필드 : 차량번호, 입차시간 , 출차시간
				// 계산용 : 날짜, 금액
				// 자료형 : Localdate, Localtime, String, String(or int)
			// 3. 이벤트 처리
				// 입차 : 차량 번호 입력해서 주차성공하면 성공 주차실패하면 실패
				// 출차 : 차량번호를 넣어서 출차성공하면 금액 계산 실패하면 실패
		// * 메소드 만들기 : static 사용하지말지 2. 인수, 반환 파악
			// 4. 모델 <---> 뷰 연결 : 컨트롤러
				// 1. 화면구현
					// 2. 버튼구현
	// 집가서 해야할것 : 시간 형식바꾸기
	// 정산 중 출력
	// 시간계산
	public static void main(String[] args) {
		컨트롤러 con = new 컨트롤러();
		Date Date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String strNowDate = simpleDateFormat.format(Date);
		try {
			while(true) {
				System.out.println("주차장");
				System.out.println("\t\t\t" + strNowDate + "\t\t\t");
				System.out.println("날짜 \t\t 차량번호 \t 입차시간 \t 출차시간 \t 금액");
				for(Car temp : 컨트롤러.parklist) {
					if(temp.get금액() == 0 ) {
						DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						String 입차날짜 = temp.get날짜().format(format);
						DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm");
						String 입차시간 = temp.get입차시간().format(format2);
						System.out.printf("%s \t %s \t\t %s \t\t 주차 중 \t\t 정산 중 \n" ,
						입차날짜, temp.get차량번호(), 입차시간);
					}else {
						DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm");
						String 입차시간 = temp.get입차시간().format(format2);
						String 출차시간 = temp.get출차시간().format(format2);
						System.out.printf("%s \t %s \t\t %s \t\t %s \t\t %d \n" ,
								temp.get날짜(), temp.get차량번호(), 입차시간, 출차시간, temp.get금액());
					}
				}
				System.out.println("1. 입차 \t\t 2. 출차");
				int ch = con.sc.nextInt();
				if(ch == 1) {
					System.out.println("차가 주차를 시작합니다");
					System.out.println("차량번호를 입력해주세요");
					String number = con.sc.next();
					boolean result = con.입차(number);
					if(result) System.out.println("주차 성공!!");
					else System.out.println("주차 실패!!");
				}
				else if(ch==2) {
					System.out.println("차가 주차장을 나갑니다");
					System.out.println("나가는 차량번호를 입력해주세요");
					String number1 = con.sc.next();
					boolean result1 = con.출차(number1);
					if(result1) {
						System.out.println("계산을 시작합니다.");
						for(Car temp : 컨트롤러.parklist) {
							if(temp != null) {
								System.out.println("계산 금액 : " + temp.get금액() );
								System.out.println("금액을 입력하세요");
								int sum = 컨트롤러.sc.nextInt();
								if(sum >= temp.get금액()) {
									System.out.println("결제되었습니다 " + (sum - temp.get금액()) +"원을 받으세요");
								}
								else {System.out.println("금액이 부족합니다 " + (sum - temp.get금액()) +"원 더 투입해주세요");}
							}
						}
						
					}
					else {System.out.println("차 나가기 실패!!");}
				}
				else if(ch < 0) {
					System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
				}
				else {System.out.println("등록되지 않은 숫자입니다. 다시 입력해주세요");}
			}
		}catch(Exception e) {System.out.println("문자열을 입력하셨습니다. 다시 입력해주세요");}
		
		
		
	}
}
