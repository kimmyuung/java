package Day03;

import java.util.Scanner;

public class Day03_3 { // c  s
	public static void main(String[] args) { // m  s
		
		Scanner scanner = new Scanner(System.in);
		
		// 문제6 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합
		System.out.println("점수를 입력하세요");
		int 문제6 = scanner.nextInt(); 	String 문제6_1;
		if(문제6>=90) {문제6_1 = "합격";}
		else {문제6_1 = "불합격";}
		System.out.println("당신의 시험 결과는 : " + 문제6_1);
		
		// 문제7 점수를 입력받아 점수 90점 이상이면 A등급 80점 이상시 B등급 70점 이상시 C등급 그 외 재시험
		System.out.println("점수를 입력하세요");
		int 문제7 = scanner.nextInt(); 	String 문제7_1;
		if(문제7>=90) {문제7_1 = "A등급";}
		else if(문제7>=80) {문제7_1 = "B등급";}
		else if(문제7>=70) {문제7_1 = "C등급";}
		else {문제7_1 = "재시험";}
		
		System.out.println("당신의 시험 결과는 :" + 문제7_1);
		
		
 		// 문제8 로그인페이지
		// [입력조건 : 아이디, 비밀번호] : 아이디(admin)비밀번호(1234) 성공 그 외 실패
		System.out.println("아이디를 입력하세요");		String id = scanner.next();
		// char  자료형 [문자 1개 저장], 자료형으로 문자열 저장 불가능 -> String 클래스 사용, char 배열/리스트 사용
		System.out.println("비밀번호를 입력하세요");		int pw = scanner.nextInt();
		boolean login = false; // 1비트 true or false 판별
		if(id.equals("admin")) 
			// 입력한 아이디가  admin 이면
			// 클래스 사용하는 객체는 연산자 사용 불가 -> 메소드
			// 문자열1.equals(문자열2)
			{
				if(pw == 1234) { 
					System.out.println("로그인 성공"); 
					login = true; // 아이디, 패스워드가 모두 동일하면 변수값 변경
					}
			
		else 	{
			System.out.println("아이디가 틀렸습니다");	}} // 입력한 아이디가 admin이 아니면
		else 	{ // 입력한 비밀번호가 1234가 아니면
			System.out.println("비밀번호가 틀렸습니다");	}
		if(login == false) System.out.println("로그인 실패"); // 로그인 성공 변수가 false면 출력
		// System.out.println("로그인 실패"); -> 작성시 오류 발생 (비밀번호만 맞아도 로그인 성공현상 발생)
		// 객체는 연산(>=, <=, ==..)이 불가능 
		//-> 기본자료형은 연산이 가능하지만 객체로 취급되는 문자열은 연산이 불가능하기 때문에 객체 비굣시 .equals사용
		
		
		// 문제9 입력(영어,국어,수학, 입력받기) 
		//-> 평균이 90점 이상이면서 국영수 중 하나라도 100점시 과목별우수 출력
		//-> 평균이 80점 이상이면서 국영수 중 하나라도 90점 이상시 과목별 장려 출력
		// + 그 외 재시험
		System.out.println("국어점수를 입력하세요");		int lan = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");		int math = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");		int eng = scanner.nextInt();
		int avg = (lan + math + eng) / 3; // 데이터들을 입력받고 점수들의 평균을 저장
		
		if(avg >= 90) { 
			if(lan==100) System.out.println("국어 우수"); // 평균이 90 이상이면서 과목별 점수가 100점일시 과목우수 출력
			if(math==100) System.out.println("수학 우수");
			if(eng==100) System.out.println("영어 우수");
		}
		else if(avg >= 80) {
			if(lan >= 90) System.out.println("국어 장려"); // 평균이 80 이상이면서 과목별 점수가 90점 이상일시 과목장려 출력
			if(math >= 90) System.out.println("수학 장려");
			if(eng >= 90) System.out.println("영어 장려");
		}
		else System.out.println("재시험"); // 그외 재시험 출력
	} // m  e
} // c  e
