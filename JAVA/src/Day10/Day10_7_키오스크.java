package Day10;

import java.util.Scanner;

public class Day10_7_키오스크
{
	// 클래스 : 롯데리아, 버거킹
	// 상속 : 점포
	// 인터페이스 : 키오스크 인터페이스
	// 파일처리 : 제품제고 관리
	
	public static void main(String[] args)
	{
		키오스크_인터페이스 롯데리아 = new 롯데리아(); 
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			롯데리아.제품목록();
		    int ch = sc.nextInt();
		    if(ch == -1) {
		    	롯데리아.상품추가();
		    }
		    if(ch == 2) {
		    	
		    }
		    if(ch == 3) {
		    	
		    }
		}
	}
}
