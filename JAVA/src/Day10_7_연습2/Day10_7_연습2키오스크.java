package Day10_7_연습2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

//public class Day10_7_연습2키오스크 {
//public static void main(String[] args) {
//	
////Scanner sc = new Scanner(System.in);
//ArrayList<상품> 상품리스트 = new ArrayList<상품>();
//FileInputStream fileInputStream = new FileInputStream("D:/자바/롯데리아재고1.txt");
//byte[] bytes = new byte[1000];
//fileInputStream.read(bytes);
//String 내용 = new String(bytes);
//String[] 내용나눔 = 내용.split("\n");
//int i = 0;
//for(String temp : 내용나눔) {
//	if(i-1 == temp.length()) break;
//	String[] field = temp.split(",");
//	상품 상품 = new 상품(field[0], Integer.parseInt(field[1]), Integer.parseInt(field[2]));
//	상품리스트.add(상품);
//}
////키오스크인터페이스2 롯데리아 = new 롯데리아("유재석", 상품리스트);
//System.out.println("점포 통합 관리 시스템");
//System.out.println("1. 롯데리아 2. 버거킹");
//int ch = sc.nextInt();
//if(ch ==1) {
//	try {
//	System.out.println("롯데리아를 관리");
//	System.out.println("1. 상품 등록 2. 상품 목록 3. 결제 4. 로그아웃");
//	int ch1 = sc.nextInt();
//	if(ch1 == 1) {
//		
//	}
//	else if(ch1 == 2) {}
//	else if(ch1 == 3) {}
//	else if(ch1 == 4) {System.out.println("로그아웃! "); }
//	}catch(Exception e) {}
//	}
//else if(ch == 2) {
//	
//}
//else System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
//
//}
//}
