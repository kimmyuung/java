package Day10_7_연습2;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class 롯데리아 extends 점포{
String 점주;
ArrayList<상품> 상품리스트 = new ArrayList<상품>();

@Override
	public void 상품등록() {
	Scanner sc = new Scanner(System.in);
	boolean pass = true;
		System.out.println("롯데리아의 상품을 등록합니다.");
		System.out.println("등록할 상품의 이름을 입력하세요"); String name = sc.next();
		System.out.println("등록할 상품의 가격을 입력하세요"); int price = sc.nextInt();
		System.out.println("등록할 상품의 재고를 입력하세요"); int save = sc.nextInt();
		for(상품 temp : 상품리스트) {
			if(temp.get상품종류().equals(name)) {
				System.out.println("상품명이 중복됩니다. 다시 입력해주세요");
				pass = false;
			}
		}
		if(pass) {상품 상품 = new 상품(name, price, save);
		상품리스트.add(상품);}
		else System.out.println("상품 등록 실패!");
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/롯데리아재고1.txt");
		String 내보내기 = name + "," + price + "," + save + "\n";
		fileOutputStream.write(내보내기.getBytes());
		sc.close();
		fileOutputStream.close();
		}catch(Exception e) {}
	}
@Override
	public void 제품목록() {
		System.out.println("롯데리아의 제품목록을 출력합니다.");
		for(상품 temp : 상품리스트) {
			System.out.println(temp.get상품종류() + " " + temp.get상품가격() + " " + temp.get상품재고());
		}
	}
}
