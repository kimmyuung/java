package Day06;

public class Day06_5 { // cs
public static void main(String[] args) { // ms
	
	Korean k1 = new Korean();
	k1.name = "유재석";
	k1.ssn = "123456-123456";
	System.out.println("k1 국적 : " + k1.nation);
	System.out.println("k1 이름 : " + k1.name);
	System.out.println("k1 주민번호 : " + k1.ssn);
	// 2. 필드 2개를 갖는 생성자로 객체 생성
	Korean k2 = new Korean("박자바","123566-878965");
	System.out.println("k2 국적 : " + k2.nation);
	System.out.println("k2 이름 : " + k2.name);
	System.out.println("k2 주민번호 : " + k2.ssn);
	
	Korean 한국인1 = new Korean();
	// 한국인1 : 국적 대한민국 // 이름과 주민번호가 없음
	Korean 한국인2 = new Korean("유재석");
	// 한국인2 : 국적, 이름 출력 // 주민번호 미출력
	Korean 한국인3 = new Korean("강호동", "123456-123456");
	// 한국인3 : 국적, 이름, 주민번호 출력
	Korean 한국인4 = new Korean("일본", "신동엽", "123465-123456");
	// 한국인4 : 국적(일본), 이름, 주민번호 출력
	} // me  
} // ce
