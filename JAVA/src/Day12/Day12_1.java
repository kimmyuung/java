package Day12;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_1
{
public static void main(String[] args) throws IOException
	{
	// String 클래스	
		// String 문자열 클래스
			// 1. java.lang 패키지 [import] 소속
			// 2. 객체인데 자동 리터럴 [ 객체가 자동 생성]
			// 3. 13개의 생성자[ 문자열, 바이트열 ] 
			// 4. 외부[파일, 네트워크 등]로 받은 데이터는 보통 바이트열
	String 성명1 = new String("유재석");
	String 성명2 = "유재석"; 
	// 성명1과 성명2의 값은 같다
	
	// 바이트 -> 문자 변환 가능 이유
		// 1.  바이트 -> +- 127 표현 가능
		// 2. 아스키코드 -> 0 or 1 조합된 7자리 => 2의 7제곱
		// 3. 바이트 -> 아스키코드 변환
	//p497
	// 1. 여러개 바이트를 저장할 수 있는 바이트배열 선언
	byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; 
	// 2. 바이트 배열 -> 문자열 변환
	String str1 = new String(bytes); // 바이트코드를 문자열로 변환
	// 3. 확인
	System.out.println("바이트 배열 -> 문자열 변환 : " + str1);
	
	String str2 = new String(bytes, 6, 4); // new string(배열명, 시작, 끝)
	System.out.println("바이트 배열 내 6번인덱스부터 4개 변환 : " + str2);
	
	// p.498
	
	System.out.println(); // 시스템클래스내 출력필드
	byte[] bytes2 = new byte[100];
	
	System.out.println("입력 : ");
	int readByteNo = System.in.read( bytes2 );
	// 외부 통신 : 자바프로그램의 키보드, 파일, 네트워크 등 입출력 일반예외
	
	// 키보드 입력 --- 스트림[통신:바이트] -----> 컴퓨터
	// a -> 97 //	a 엔터 -> 97, 13[\n: 줄바꿈] , 10[\r: 커서를 앞으로]
	
	System.out.println("입력받은 바이트 -> 문자열 변환 : " + Arrays.toString(bytes2));
	// 메소드 호출방법 : 객체 생성 후, 연산자 이용한 메소드 호출
	// static 필드/메소드는 객체없이 클래스명.필드/메소드
	String str = new String(bytes,0,readByteNo-2);
									// 읽은바이트수 -2
	// Scanner 클래스 System.in 으로부터 입력받은 바이트를 객체에 저장
	Scanner sc1 = new Scanner(System.in);
	sc1.next(); // 바이트 -> 문자열 변환
	sc1.nextInt(); // 바이트 -> 정수열 반환
	sc1.nextDouble(); // 바이트 -> 실수열 반환
	}
}
