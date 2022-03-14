package Day09;

import java.util.Scanner;

public class Day09_1 {
// this.필드명 // this.메소드명 // this() : 빈생성자 호출 // this(데이터, 데이터) : 생성자
// Override : 오버라이드(동일한 메소드를 재정의 가능)
// static : 정적 멤버(생성자와 관련 X) , 객체 없이 클래스 통해 접근 가능 <------> new 객체로 접근
// final : 상수[수정불가]
// 패키지 : 클래스들을 그룹화, 이름이 같은 클래스들을 식별, 패키지 선언 해야 함
// dafault : 해당 패키지 / private : 해당 클래스
	// {} 있으면 생성자 혹은 메소드
	// 클래스명과 이름 동일 시 생성자
	// 클래스명과 이름 다를 시 메소드
// 생성자 선언시 : 클래스 이름 동일 
	//	ex) Member(String name, String id) {this. name = name; this. id = id;}
// 메소드 선언시 : 클래스 이름과 다름[반환타입, 메소드명(인수1, 인수2) {실행문} ] 
	// ex) void logout (String id) {System.out.print("logout"); return id;} // 
	// boolean login(String id, Sting pw) {
	// if(id.equals("홍") && pw.equals("12345") {return true;}
	// else return false;}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 객체를 통한 메소드 호출
	// 메소드 오버라이딩 : 동일한 이름으로 메소드를 선언가능(단, 서로 다른 인수[매개변수] 사용)
//	void printIn /*직접 만든 것*/(int x) { // 외부로부터 int형 변수를 인수로 받아 출력
//		System.out.println(x); // 기존에 있는 것
//		}
//	void printIn /*직접 만든 것*/(boolean x) { // 외부로부터 int형 변수를 인수로 받아 출력
//		System.out.println(x); // 기존에 있는 것
//		}
//	void printIn /*직접 만든 것*/(double x) { // 외부로부터 int형 변수를 인수로 받아 출력
//		System.out.println(x); // 기존에 있는 것
//		}
//	void printIn /*직접 만든 것*/(String x) { // 외부로부터 int형 변수를 인수로 받아 출력
//		System.out.println(x); // 기존에 있는 것
//		}
	// 객체를 만들지 않고 메소드 호출(static를 통한 호출 , but 메모리를 많이 사용)
//	static printIn /*직접 만든 것*/(int x) { // 외부로부터 int형 변수를 인수로 받아 출력
//	System.out.println(x); // 기존에 있는 것
//	}
//  static printIn /*직접 만든 것*/(boolean x) { // 외부로부터 int형 변수를 인수로 받아 출력
//	System.out.println(x); // 기존에 있는 것
//	}
//  static printIn /*직접 만든 것*/(double x) { // 외부로부터 int형 변수를 인수로 받아 출력
//	System.out.println(x); // 기존에 있는 것
//	}
//  static printIn /*직접 만든 것*/(String x) { // 외부로부터 int형 변수를 인수로 받아 출력
//	System.out.println(x); // 기존에 있는 것
//	}	
	}	
}
