package Day12;

public class Day12_2
{
	public static void main(String[] args)
	{
		// p. 499 String 메소드
		// charAt() : 문자열에서 특정문자 추출 
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		
		switch(sex) { // switch 제어문 [ switch(검사대상) {case}
		case 1 : 
		case 3 : System.out.println("남자"); break;
		case 2 :
		case 4 : System.out.println("여자"); break;
		}
		// 자바 메모리[JVM]
			// 스택 메모리 : 지역변수
			// 힙 메모리 :  객체
			// 메소드 메모리 : 
		// p. 501 equals() : 문자열 비교
			// 기본자료형 사용하는 변수는 연산자 사용가능 [ == ]
			// 문자형 사용하는 변수는 연산자 사용불가능 [ equals ]
		String strVar1 = new String("신민철");
		String strVar2 = "신문철"; // 객체는 new 연산자가 필수이지만 String 클래스만 자동객체 생성
		
		// 문자열 비교
		if(strVar1 == strVar2) { // 문자열은 == 불가, ==은 대개 메모리주소를 비교하는 방식으로 처리되므로 문자열은 처리가 안됨
			System.out.println("같은 String 객체를 참조");
		} else System.out.println("다른 String 객체를 참조");
		if(strVar1.equals(strVar2)) System.out.println("같은 문자열을 가짐");
		else System.out.println("다른 문자열을 가짐");
		
		// getBytes() : 문자열 -> 바이트열 변환
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes(); // 문자열 -> 바이트열 변환
		System.out.println("영문은 1바이트 한글2바이트 : " + bytes1.length); // 배열명.length : 배열길이 필드
		String str1 = new String(bytes1); // 바이트열 -> 문자열 변환
		System.out.println("바이트열 -> 문자열 : " + str1);
		try { // 인코딩타입[인코딩/디코딩 : 변환방식]
		// 1. EUC-KR [한글/영문 : 한글 2바이트]
		byte[] bytes2 = str.getBytes("EUC-KR"); // 일반 예외 발생, 아스키코드에 한글 추가
		System.out.println("EUC-KR 길이 : " + bytes2.length);
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("바이트열 -> 문자열 : " + str2);
		
		// 2. UTF-8 : 전세계 공용어 사용 가능(한글 3바이트)
		byte[] bytes3 = str.getBytes("UTF-8"); // 유니코드
		System.out.println("UTF-8 길이 : " + bytes3.length);
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("바이트열 -> 문자열 : " + str3);
		
		}catch(Exception e) {}
		
		// indexof : 문자열내 특정 문자열 위치[인덱스] 찾기
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍"); 
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) { // 인덱스가 0번에서 시작 : -1 인덱스가 없다
			System.out.println("자바와 관련 책");
		} else System.out.println("자바와 관련없는 책");
		
		String ssn2 = "7306241230123";
		int length = ssn2.length();// 문자열내 문자 개수(=길이 구하기)
		if(length == 13) { // 유효성검사 시 사용
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else System.out.println("주민번호 자릿수가 틀립니다.");
		
		System.out.println("------------------------------");
		// p. 506 replace("기존문자", "새로운문자"); : 문자열 대치
		String oldStr = "자바는 개체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바","JAVA");
		System.out.println("기존문자열 : " + oldStr);
		System.out.println("새로운문자열 : " + newStr);
		
		// substring() vs split(): 문자열 자르기
		String ssn3 = "880815-1234567";
		String firstNum = ssn3.substring(0,6); // 시작인덱스(0) - 마지막인덱스(6)
		System.out.println("확인 : " + firstNum);
		
		String secondNum = ssn3.substring(7); // 마지막인덱스부터 (7)
		System.out.println("확인 : " + secondNum);
		System.out.println("------------------------------");
		// substring() : 인덱스 기준, split() : 문자 기준
		// "880815-1234567"를 -을 기준으로 split으로 자를 시 2부분으로 나뉨 -> 배열로 반환 
		// -을 기준으로 split으로 자를 시 2부분으로 나뉨 -> "-"출력 X
		System.out.println("앞부분 확인 : " + ssn3.split("-")[0]);
		System.out.println("뒷부분 확인 : " + ssn3.split("-")[1]);
		// 영문문자열.toLowerCase -> 영문을 소문자 
		// 영문문자열.toUpperCase -> 영문을 대문자
		// 문자열.trim() : 앞과 뒤의 공백 제거[중간에 띄어쓰기는 제거하지 않음] -> 외부로부터 문자 자료 삽입시 예상치 못한 공백 있을 시 사용
		
		// valueOf() : 기본타입[int, double 등] -> 문자열 변환
		String str2 = String.valueOf(10); // int형 10을 -> String 10으로 변환
		String str3 = String.valueOf(10.5); // double형 10.5를 -> 문자열 10.5로 변환
		String str4 = String.valueOf(true); // boolean형 true -> 문자열 true
		String str5 = 10+""; // int형을 String변수에 저장[불가능] -> +연산자를 통해 공백 삽입하면 문자열로 저장 가능

		System.out.println(str2 + 10);  // 문자 + 문자 : 연결 -> 1010 출력
		System.out.println(str3 + 10);
		// if(str4) 오류 : str5에는 boolean 형이 아닌 문자형 true 저장
 	
	
	}

}
