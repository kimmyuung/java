package Day10_7_연습;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_연습1 {
	// 클래스 : 롯데리아, 버거킹
		// 상속 : 점포
		// 인터페이스 : 키오스크 인터페이스
		// 파일처리 : 제품제고 관리
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<상품> 상품리스트 = new ArrayList<상품>();
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/자바/롯데리아재고.txt");
			byte[] 바이트배열 = new byte[1000];
			fileInputStream.read(바이트배열);
			String 파일내용 = new String(바이트배열);
			String[] 상품내용 = 파일내용.split("\n");
			for(String temp : 상품내용) {
				String[] field = temp.split(",");
				상품 상품 = new 상품(field[0], Integer.parseInt(field[1]), Integer.parseInt(field[2]));
				상품리스트.add(상품);
			}
		} catch(Exception e) {}
		키오스크인터페이스 롯데리아 = new 롯데리아("유재석", 상품리스트);
		while(true) {
			롯데리아.제품목록();
			int ch = sc.nextInt();
			if(ch==-1) 롯데리아.상품추가();
			else if (ch == 0) 롯데리아.결제();
			else 롯데리아.장바구니();
		}
	}
}
