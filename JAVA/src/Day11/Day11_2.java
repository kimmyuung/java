package Day11;

public class Day11_2
{
 // p. 422
		// 컴퓨터의 하드웨어 문제를 에러 [ 실행불가능 ]
		// 사용자의 잘못된 조작 or 개발자의 잘못된 코딩의 에러의 예외
		// 종류 : 1. 일반예외 2. 실행예외
			// 일반예외 : 컴파일[실행]전에 예외 검사 [ 개발자에게 강제 예외처리 = 외부통신 IO]
			// 실행예외 : 컴파일[실행]후에 예외 검사 [ 개발자의 경험으로 잘 판단해서 예외처리 ]
		// 예외처리 목적 : 오류가 발생하면 프로그램은 종료 -> 안전성 문제 
			// 만약에 에라가 발생하면 대체 코드가 실행[프로그램이 종료되지 않게]
	/* 
	 * 	try {
	 * 	
	 *   // 예외가 발생할것 같은 코드
	 * 	
	 * } catch(예외클래스 객체명) {
	 * 		예외 발생하면 실행되는 코드
	 * 		}
	 * */
public static void main(String[] args)
{
	try {
	String data = null;
	System.out.println(data.toString() ); // object클래스 메소드 : tostring() : 객체정보출력
	// 에러가 발생하는 이유 : null은 메모리가 없기 때문에 객체정보출력 불가능
		} catch(NullPointerException 객체명) {
			System.out.println("예외발생 : " + 객체명);
		}
	try { // 예외가 발생할 것 같은 코드
	String[] 배열 = new String[2]; // String 2개를 저장할 수 있는 배열
	배열[0] = "a"; 배열[1] = "b"; 배열[2] = "c";
	}catch(ArrayIndexOutOfBoundsException e) 
		// 예외발생한 예외클래스 객체명 = 객체에 예외 이유가 저장됨
	{System.out.println("예외 발생 : " + e); } // 예외가 발생하면 실행되는코드 
	
	try {
	String data1 = "100";
	String data2 = "a100";
	int value = Integer.parseInt(data1); // 100 -> 100
	int value1 = Integer.parseInt(data2); // a100 -> a100 불가능 a는 정수로 표현이 불가능
				// Integer.parseInt(문자열) ; 문자열 -> 정수
					// 단 : "100" -> "100"(가능) // "a100" -> "a100" 불가능
	// 오류 발생 : 문자열내 숫자형식은 변환이 가능하나 문자열내 문자형식 변환이 불가
	int result = value1 + value; // 예외발생시 이후 실행 안됨, 오류가 발생하면 바로 catch로 이동
	System.out.println(data1 + "+" + data2 + "=" + result);
	} catch (Exception e) {System.out.println("오류 발생 : " + e);}
	
	try {
	String 문자열 = "유재석";	// 자바 클래스중 하나[ 무조건 Object 상속 ]
	Object 슈퍼객체;			// 자바 클래스내 최상위 클래스
	슈퍼객체 = 문자열; 			// 실행 문제 없음(자식 ---> 부모 가능)
	문자열 = (String)슈퍼객체;	// 실행 문제 발생(부모 ---> 자식 불가)
		//강제형변환 : 
	} catch(Exception e) {
		System.out.println("예외 발생 : " + e);
	}
	// 입출력 관련된 코드는 왠만하면 예외처리 해야 함
	
} // me
} // ce
