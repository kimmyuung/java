package 과제;

import java.util.Scanner;

public class 키오스크_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int 콜라재고수 = 10; int 사이다재고수 = 10; int 환타재고수 = 10;
	int 콜라구매수 = 0; int 사이다구매수 = 0; int 환타구매수 = 0;
	
	while(true) {
	System.out.println("메뉴판 [1. 콜라(300) 2. 사이다(200) 3. 환타(100) 4. 결제 5. 종료");
	System.out.println("주문하실 메뉴를 입력하세요."); int select = scanner.nextInt();
	
	if(select == 1) {
		System.out.println("콜라를 주문하였습니다.");
		콜라재고수--;
		콜라구매수++;
		if(콜라재고수 == 0) {System.out.println("콜라재고가 소진되었습니다. 준비중...");}
	}
	else if(select == 2) {
		System.out.println("환타를 주문하였습니다.");
		환타재고수--;
		환타구매수++;
		if(환타재고수 == 0) {System.out.println("환타재고가 소진되었습니다. 준비중...");}
	}
	else if(select == 3) {
		System.out.println("사이다를 주문하였습니다.");
		사이다재고수--;
		사이다구매수++;
		if(사이다재고수 == 0) {System.out.println("콜라재고가 소진되었습니다. 준비중...");}
	}
	else if(select == 4) {
		System.out.println("결제를 시작합니다.");
		int 총결제액 = (콜라구매수 * 300) + (환타구매수 * 200) + (사이다구매수 * 100);
		System.out.println("총 결제액은 : " + 총결제액 + "입니다.");
		System.out.println("1. 결제 \t 2. 결제취소"); int select2 = scanner.nextInt();
		if(select2 == 1) {
			System.out.println("금액을 투입하여 주세요");
			int 결제액 = scanner.nextInt();
			if(총결제액 < 결제액) {
				System.out.println("금액이 부족합니다 " + (총결제액-결제액) + "원을 더 투입해주세요.");
			}
			else if(총결제액 >= 결제액) {
				System.out.println("결제가 완료되었습니다. 주문번호 : 000");
				System.out.println("잔돈을 반환합니다." + (총결제액-결제액) + "원");
			}
			else {System.out.println("금액이 부족합니다." + (총결제액-결제액) + "원을 더 투입해주세요.");}
		}
		else if(select2 == 2) {
			System.out.println("결제가 취소되었습니다.");
			콜라구매수 = 0; 콜라재고수 = 10;
			사이다구매수 = 0; 사이다재고수 = 10;
			환타구매수 = 0; 환타재고수 = 10;
		}
		else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
	}
	else if(select == 5) {
		break;
	}
	else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
	
	
	
		}
	}
}
