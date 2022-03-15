package Day10;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_키오스크
{
	// 클래스 : 롯데리아, 버거킹
	// 상속 : 점포
	// 인터페이스 : 키오스크 인터페이스
	// 파일처리 : 제품제고 관리

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in); // 입력객체
		ArrayList<상품> 상품리스트 = new ArrayList<>();
		// * 파일 입력
		// 1. 파일 입력객체
		try
		{ // try {}안에 예외[오류] 발생할 것 같은 코드 넣기(예상)
			FileInputStream inputStream = new FileInputStream("D:/자바/롯데리아재고.txt");
			// 2. 파일 읽어오기 [ 파일 ---> 스트림(바이트열) ---> ]
			// 1. 바이트배열 선언
			byte[] bytes = new byte[1024];
			// 2. 읽어와서 배열 저장
			inputStream.read(bytes);
			// 3. 분해 [, : 필드 구분 \n : 객체(상품) 구분 ]
			String 파일내용 = new String(bytes);
			// String 분해 메소드 -> split("기준");
			String[] 상품목록 = 파일내용.split("\n");

			for (String temp : 상품목록)
			{
				String[] 필드 = temp.split(",");
				상품 상품 = new 상품(필드[0], Integer.parseInt(필드[1]), Integer.parseInt(필드[2]));
				상품리스트.add(상품);
			}
			// 문자열 ---> 정수형 변환 [Integer.parseInt("문자열")]
		} catch (Exception e)
		{
		}
		키오스크_인터페이스 롯데리아 = new 롯데리아("유재석", 상품리스트); // 롯데리아 키오스크 생성
		// 점주가 유재석인 롯데리아 키오스크 객체 생성
		// catch : 예외 잡기 -> Exception 클래스의 객체에 저장

		while (true)
		{
			롯데리아.제품목록();
			int ch = sc.nextInt();
			if (ch == -1)
			{
				롯데리아.상품추가();
			} else if(ch == 0) {롯데리아.결제(); } 
			else
			{
				//롯데리아.장바구니(ch);
			}
		}
	}
}
