package exam2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;




public class 프로그래밍언어응용_김명호 {

	public static void main(String[] args) {
		 컨트롤러 con = new 컨트롤러();
		try {
		while(true) {
			Date date = new Date(); // 날짜 객체 생성
			String 현재시간 = 컨트롤러.sdf.format(date); // 현재 시간을 년월일 + 시간을 출력하게 변경하여 출력
			System.out.println(" ---------------- 주차 현황 표 ----------------- ");
			System.out.println("현재 시간 : \t\t" + 현재시간);
			System.out.println("날짜 \t\t 차량번호 \t\t 입차시간 \t\t 출차시간 \t\t 금액");
			for(Car temp : 컨트롤러.parklist) { // 반복문을 사용하여 주차리스트 출력
				if(temp.get출차시간() == null ) { // 출차가 null일 경우 -> 출차가 되지 않았을 경우
					DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 날짜 출력 형식 변경
					String 입차날짜 = temp.get주차날짜().format(format);
					DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm");
					String 입차시간 = temp.get입차시간().format(format2);
					System.out.printf("%s \t %s \t\t %s \t\t 주차 중 \t\t 정산중 \n" ,// 배열 내 데이터 출력
					입차날짜, temp.get차량번호(), 입차시간);
				}
				else {
					DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm"); // 날짜 출력 형식 변경
					String 입차시간 = temp.get입차시간().format(format2);
					String 출차시간 = temp.get출차시간().format(format2);
					System.out.printf("%s \t %s \t\t %s \t\t %s \t\t %d \n" ,
							temp.get주차날짜(), temp.get차량번호(), 입차시간, 출차시간, temp.get금액());
				} // 배열 내 데이터 출력
			}
			System.out.println("1. 입차 2. 출차"); // 사용자로부터 실행할 기능을 입력받음
			int ch = 컨트롤러.sc.nextInt();
			if(ch == 1) { // 주차
				System.out.println("차량번호를 입력해주세요"); // 사용자가 차량번호를 입력
				String number = con.sc.next(); 
				boolean result = con.입차(number); // 컨트롤러의 입차 메소드를 실행(인수는 차량번호)
				if(result) System.out.println("주차 성공!!"); // 메소드 실행 결과 참이라면 주차가 성공
				else System.out.println("주차 실패!!"); // 메소드 실행 결과 거짓이라면 주차가 실패
			}
			if(ch == 2) { // 출차
				System.out.println("차량번호를 입력해주세요"); // 사용자가 차를 뺄 차량번호를 입력
				String number = con.sc.next(); 
				boolean result = con.출차(number); // 컨트롤러의 출차 메소드를 실행(인수는 차량번호)
				if(result) { // 출차 메소드의 실행결과가 참이라면
					System.out.println("계산을 해주세요"); // 주차요금 계산 시작
					for(Car temp : 컨트롤러.parklist) {
						System.out.println(temp.get금액() + "원을 투입해주세요"); // 내야하는 돈을 출력하고 사용자에게 돈을 입력받음
						int ch1 = con.sc.nextInt();
						if(temp.get금액() > ch1) { // 낸돈이 정산금액보다 작다면
							System.out.println("돈이 부족합니다." + (temp.get금액()-ch1) + "원 더 투입해주세요");
							}
						else System.out.println("결제되었습니다. 잔돈 : " + (temp.get금액()-ch1) + "원"); break;
						}
					}
					
				else {System.out.println("출차에 실패하였습니다. 다시 시도해주세요.");}
			}
			
		}
		}catch(Exception e) {System.out.println("문자열을 입력하셨습니다. 다시 입력해주세요");} // 입차,출차를 누르지않고 문자열을 입력했을 경우
	}
}
