package Day10_7_연습;


import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class 롯데리아 extends 점포{
String 상품목록;
ArrayList<상품> 상품리스트 = new ArrayList<상품>();
public 롯데리아(String 상품목록, ArrayList<상품> 상품리스트) {
	super();
	this.상품목록 = 상품목록;
	this.상품리스트 = 상품리스트;
}
public 롯데리아() {}

@Override
	public void 상품추가() {
	Scanner sc = new Scanner(System.in);
		System.out.println("롯데리아 상품추가");		
		System.out.println("상품 종류 : ");			String name = sc.next();
		System.out.println("상품 가격 : ");			int price = sc.nextInt();
		System.out.println("상품 재고 : ");	        int save = sc.nextInt();
		상품 상품 = new 상품(name, price, save);
		상품리스트.add(상품);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/롯데리아재고.txt", true);
			String 내보내기 = name + "," + price + "," + save + "\n";
			fileOutputStream.write(내보내기.getBytes());
			
		}catch(Exception e) {}
		System.out.println("상품 저장 완료!");
	}

@Override
	public void 제품목록() {
		System.out.println("제품 목록");
		for(상품 temp : 상품리스트) {
			System.out.println(temp.get상품명() + " " + temp.get가격() + " " + temp.get재고());
		}
	}
}
