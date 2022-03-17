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
	}

}
