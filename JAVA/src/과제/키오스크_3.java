package 과제;

import java.util.Scanner;

public class 키오스크_3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int 콜라구매수 = 0; int 환타구매수= 0; int 사이다구매수 = 0;
	int 콜라재고수 = 10; int 환타재고수= 10; int 사이다재고수 = 10;
	while(true) {
	System.out.println("메뉴판 [1. 콜라(300) 2. 환타(200) 3. 사이다(100) 4. 결제 5. 로그아웃");
	System.out.println("구매를 원하시는 메뉴를 입력해주세요.");
	int select = scanner.nextInt();
	if(select == 1) {
		System.out.println("콜라를 구매하셨습니다.");
		콜라구매수++;
		콜라재고수--;
		if(콜라재고수 == 0) {System.out.println("콜라 재고가 소진되었습니다. 재입고를 기다려주세요");}
	}
	else if(select == 2) {
		System.out.println("환타를 구매하셨습니다.");
		환타구매수++;
		환타재고수--;
		if(환타재고수 == 0) {System.out.println("환타 재고가 소진되었습니다. 재입고를 기다려주세요");}
	}
	else if(select == 3) {
		System.out.println("사이다를 구매하셨습니다.");
		사이다구매수++;
		사이다재고수--;
		if(사이다재고수 == 0) {System.out.println("사이다 재고가 소진되었습니다. 재입고를 기다려주세요");}
	}
	else if(select == 4) {
		System.out.println("결제를 시작합니다.");
		int sum = (콜라구매수 * 300) + (환타구매수 * 200) + (사이다구매수 * 100);
		System.out.println("총 결제액 : " + sum);
		System.out.println("1. 결제 \t 2. 결제취소"); int select1 = scanner.nextInt();
		if(select1 == 1) {
			System.out.println("결제액을 입력해주세요"); int 결제액 = scanner.nextInt();
			if(결제액 >= sum) {
				System.out.println("결제가 완료되었습니다. 주문번호 : 000");
				System.out.println("잔돈을 반환합니다" + (결제액-sum) + "원을 받아주세요");
			}
			else {System.out.println("금액을 " + (sum-결제액) + "원 더 투입해주세요");}
		}
		else if(select1 == 2) {
			System.out.println("결제를 취소합니다");
			sum = 0;
			콜라구매수 = 0; 환타구매수= 0; 사이다구매수 = 0;
			콜라재고수 = 10;  환타재고수= 10; 사이다재고수 = 10;
		}
		else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");}
		
	}
	else if(select == 5) {break;}
	else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");}
		}
	}
}
