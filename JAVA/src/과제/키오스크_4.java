package 과제;

import java.util.Scanner;

public class 키오스크_4 {
public static void main(String[] args) {
	int 콜라구매수 = 0; int 환타구매수 = 0; int 사이다구매수 = 0;
	int 콜라재고수 = 10; int 환타재고수 = 10; int 사이다재고수 = 10;
	Scanner scanner = new Scanner(System.in);
	while(true) {
	System.out.println("메뉴판 1. 콜라(300) 2. 환타(200) 3. 사이다(100) 4. 결제 5. 종료");
	System.out.println("구매를 원하시는 음료수의 번호를 입력해주세요");
	int select = scanner.nextInt();
	if(select == 1) {
		System.out.println("콜라를 구매합니다.");
		콜라구매수++;
		콜라재고수--;
		if(콜라재고수 == 0) {System.out.println("콜라재고가 소진되었습니다. 재입고를 기다려주세요");}
	}
	else if(select == 2) {
		System.out.println("환타를 구매합니다.");
		환타구매수++;
		환타재고수--;
		if(환타재고수 == 0) {System.out.println("콜라재고가 소진되었습니다. 재입고를 기다려주세요");}
	}
	else if(select == 3) {
		System.out.println("사이다를 구매합니다.");
		사이다구매수++;
		사이다재고수--;
		if(사이다재고수 == 0) {System.out.println("콜라재고가 소진되었습니다. 재입고를 기다려주세요");}
	}
	else if(select == 4) {
		System.out.println("결제를 시작합니다.");
		int 총결제액 = (콜라구매수 * 300) + (환타구매수 * 200) + (사이다구매수 * 100);
		System.out.println("총 결제액은 " + 총결제액 + "원 입니다.");
		System.out.println("1. 결제 \t 2. 결제 취소");
		int select1 = scanner.nextInt();
		if(select1 == 1) {
			System.out.println("결제액을 투입해주세요");
			int 결제액 = scanner.nextInt();
			if(결제액 >= 총결제액) {
				System.out.println("결제가 완료되었습니다.");
				System.out.println("잔돈을 반환합니다." + (결제액-총결제액) + " 원");
			}
			else {System.out.println("결제액이 부족합니다 " + (총결제액-결제액) + "원 더 투입해주세요.");}
		}
		else if(select == 2) {
			System.out.println("결제가 취소되었습니다.");
			콜라구매수 = 0; 사이다구매수 = 0; 환타구매수 = 0;
			콜라재고수 = 10; 사이다재고수 = 10; 환타재고수 = 10;
		}
		else {System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");}	
	}
	else if(select == 5) {break;}
	else {System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");}
		}
	}
}
