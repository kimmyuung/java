package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6
{
	// 주기억장치 		: 	메모리(RAM) : 프로그램 실행시에만 저장 메모리(휘발성)
	// 보조기억장치	: 	C드라이브, D드라이브, Usb, CD..(비휘발성)
	// 파일처리 		: 	console내 메모리 	---> 	보조기억장치로 옮김
	// DB처리 		: 	자바내 메모리를 	---> 	DB 서버[PC]로 옮김
		// 스트림(Stream) : 프로그램과 외부[키보드, 파일, 네트워크 등] 통신
			// 아스키코드(8자리 = 1바이트) -> 통신단위 : byte
		// FileOutputStream	: 	파일출력 클래스
			// 객체명.write(바이트열);
		// FileInputStream 	: 	파일입력 클래스
			// 객체명.read(바이트배열);
		// Strings 클래스
			// 문자열.equals() : 문자열 비교 메소드
			// 문자열.getBytes() : 문자열 -> 바이트열 변환
			// new String(바이트배열) : 바이트배열 -> 문자열 변환
	
	public static void main(String[] args) throws IOException  
	{
	
	// 1. 파일출력 [ 파일 -> 자바 ]
		FileOutputStream stream = new FileOutputStream("D:/자바/java1.txt"); // 오류를 던짐
		String context = "자바에서 입력된 데이터";
		stream.write(context.getBytes() );
		
	// 2. 파일입력 [ 자바 -> 파일 ] 
		// FileInputStream : 파일입출력 클래스
		// FileInputStream(파일경로/파일명.확장자); // txt : 메모장
		// 예외처리(=오류처리) : 	
		FileInputStream stream2 = new FileInputStream("D:/자바/java1.txt"); // 오류를 던짐
		byte[] bytes = new byte[1000]; // 1000바이트를 읽을 수 있는 배열 
		stream2.read(bytes);
		System.out.println("파일내용 : " + new String(bytes));
		
		
	}
}
