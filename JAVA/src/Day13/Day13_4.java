package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4
{
public static void main(String[] args) throws InterruptedException
{
	// p.544 DecimalFormat 클래스 : 숫자 데이터를 원하는 형식으로 표현
		// 패턴 종류
			// 0 : 자리수 [빈자리면 0으로 제출]
			// # : 자리수 [빈자리면 채우기]
	double num = 1234567.89;
	DecimalFormat df = new DecimalFormat("0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("0000000000.00000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.#");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("##########.#####");
	System.out.println(df.format(num));

	df = new DecimalFormat("#.0"); // 무조건 소수점 한자리 표시
	System.out.println(df.format(num));
	
	df = new DecimalFormat("+#.0");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("-#.0");
	System.out.println(df.format(num));
	
	// ************ 천 단위 구분 쉼표 ******************
	df = new DecimalFormat("#,##0"); // 써도 됨 !!
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#.###"); 
	System.out.println(df.format(num));	
	
	df = new DecimalFormat("0.000");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("#,##0");
	System.out.println(df.format(0));
	
	df = new DecimalFormat("#.###");
	System.out.println(df.format(0));	
	
	df = new DecimalFormat("0.000");
	System.out.println(df.format(0));
	
	df = new DecimalFormat("0.0E0"); // E : 지수문자
	System.out.println(df.format(num));
	
	df = new DecimalFormat("[양]+#,### ;[음]-#.###"); // 양수 ; 음수
	System.out.println(df.format(123));
	System.out.println(df.format(-123));
	
	// 컴퓨터는 백분율을 모름 [ 계산시 1 = 100%, 0.5 = 50%, 0.05 = 5% ]
	df = new DecimalFormat("#.#%");
	System.out.println(df.format(num));
	
	df = new DecimalFormat("\u00A4 #,###"); // 원화기호가 없음
			System.out.println(df.format(num));
	// DecimalFormat 클래스 : 숫자 형식 변환
	// p.545 SimpleDatrFormat 클래스 : 달력형식을 꾸밀때 씀		
	// p.547 MessageFormat 클래스 : 메세지형식을 꾸밀때 씀
			
		String id = "자바";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID : {0} \n 회원 이름 : {1} \n 회원 전화 : {2}"; //{ } : 변수가 들어가는 위치
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);				// {0}, {1}, {2}
		
		
		// DB에서 사용 예정
		String sql = "inser into member valuse({0},{1},{2})";
									  // 배열인덱스: 0 , 1 , 2
		Object[] array = {id, name, tel};
		String result2 = MessageFormat.format(sql, array);
		System.out.println(result2);
		
		
		// LocalDate : 현재날짜 // LocalTime : 현재시간
		LocalDate currdate = LocalDate.now();
		System.out.println("현재 날짜 " + currdate);
		
		LocalTime currtime = LocalTime.now();
		System.out.println("현재 시간 " + currtime);
			
		// Date 현재 날짜/시간 [조작이 안되거나 비교기능 불충분]
		
		LocalDateTime currdatime = LocalDateTime.now();
		System.out.println("현재날짜/시간 : " + currdatime);
		
		// 시간 계산
		Instant istant1 = Instant.now();
		Thread.sleep(1000); // 1초 대기[코드가 1초간 멈춤] // 일반 예외 // 단위 : 밀리초
		Instant istant2 = Instant.now();
		
		if(istant1.isBefore(istant2)) {
			System.out.println("istant1이 더 빠름");
		}
		else if(istant1.isAfter(istant2)) {System.out.println("istank2가 더 늦습니다");}
		else System.out.println("동일한 시간입니다.");
		
		System.out.println("시간 차 : " + istant1.until(istant2, ChronoUnit.NANOS));
						// 밀리초 = 1/1000초 		마이크로초 = 1/1000000		나노초 = 1/1000000000
}	
}
