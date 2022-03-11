package 과제;

import java.util.Scanner;

public class 키오스크 {
	// 자판기
	 // 1. 메뉴판 [ 1. 콜라(300) 2. 환타(200) 3. 사이다(100)]
	 // 2. 메뉴판에서 제품선택하면 장바구니에 넣음
	//  + 재고 부족시 알림(재고 부족)
	//  3. 초기 재고 : 제품 당 10개
	//  4. 결제시 금액입력받아 결제액 만큼 차감후 잔돈 출력
		// 4-1 투입한 금액보다 구매액이 더 크면 결제 취소 [금액 부족]
		// 5. 투입한 금액보다 구매액이 더 작을때 잔돈 반환
	public static void main(String[] args) { // 메인함수 시작
		
		Scanner scanner = new Scanner(System.in); // scanner 객체 선언
		int 콜라재고 = 10; int 사이다재고 = 10; int 환타재고 = 10; // 각 음료수들의 재고 변수로 설정
		int 콜라구매수 = 0;	int 사이다구매수 = 0; int 환타구매수 = 0; // 각 음료수들의 구매 횟수를 설정
		while(true) { // 무한루프 실행, 종료 조건 : 구매 및 결제가 완료되었을 때
		System.out.println("메뉴판 [ 1. 콜라(300) 2. 환타(200) 3. 사이다(100) 4. 결제 5. 종료");
		System.out.println("메뉴 구매를 원하시면 숫자를 누르세요"); int select = scanner.nextInt();
		// 메뉴판에서 구매를 원하는 음료수를 입력받음
		if(select == 1) { // 콜라를 구매할 때
			System.out.println("콜라를 구매합니다.");
			콜라재고--;  // 콜라의 재고는 1감소
			콜라구매수++; // 콜라의 구매수는 1증가
			if(콜라재고 == 0) {System.out.println("콜라 재고가 소진되었습니다. 기다려주세요");} // 콜라의 재고가 0이 되면 출력
		}   
		else if(select == 2) {// 환타를 구매할때
			System.out.println("환타를 구매합니다.");
			환타재고--; // 환타의 재고는 1감소
			환타구매수++; // 환타의 구매수는 1증가
		}
		else if(select == 3) { // 사이다를 구매할때
			System.out.println("사이다를 구매합니다.");
			사이다재고--; // 사이다의 재고는 1감소
			사이다구매수++; // 사이다의 구매수는 1증가
		}
		else if(select == 4) { // 결제를 할 때
			System.out.println("결제를 시작합니다.");
			int 총결제액 = (콜라구매수 * 300) + (환타구매수 * 200) + (사이다구매수 * 100);
			// 총 결제액을 변수로서 설정
			System.out.println("총 결제액은 " + 총결제액 + "입니다."); // 총 결제액 출력
			System.out.println("결제를 원하시면 금액을 투입해주세요."); // 결제 원하면 금액 투입
			int 결제액 = scanner.nextInt(); // 결제액을 입력받음
			System.out.println("1. 결재 2. 취소"); int 선택2 = scanner.nextInt();
			if(선택2 == 1) { // 결제를 진행
				// 1. 금액 입력받는다.
				// 2. 금액이 결제액보다 적으면 결제불가 -> 금액 재 입력
				// 3. 금액이 결제액보다 많으면 결제성공 -> 장바구니 초기화 -> 잔돈 출력
				while(true) { // w  s 무한루프 -> 결제액보다 금액이 크면 종료
				System.err.println("알림)) 금액 : "); int 금액 = scanner.nextInt();
				if(금액 < 총결제액) { // 결제불가 -> 재입력
					System.out.println("알림)) 금액이 부족합니다. 다시 금액을 투여해주세요");
					}
				else { //
					System.err.println("알림)) 구매완료 주문번호 : 000번");
					콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0; // 구매수 초기화
					System.out.println("알림)) 잔돈 출력 : " + (금액 - 총결제액) + "원");
					break; // while2 탈출
					}
				} // w  e
			}
			else if(선택2 == 2) { // 결제를 취소
				System.out.println("알림)) 구매목록 초기화 ");
				콜라재고 += 콜라구매수; 환타재고 += 환타구매수; 사이다재고 += 사이다구매수;
				콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0; // 구매수 초기화
//				for(int i = 1; i<=콜라구매수; i++) // 58 줄과 같은 결과 출력
//				for(int i = 1; i<=환타구매수; i++)
//				for(int i = 1; i<=사이다구매수; i++)
//				콜라구매수 = 0; 환타구매수 = 0; 사이다구매수 = 0; // 구매수 초기화
			}
			if (결제액 < 총결제액) { // 결제액이 총결제액보다 부족하면
				System.out.println("금액이 부족합니다");
			}
			else if(결제액 > 총결제액) { // 결제액이 총결제액보다 크면
				System.out.println("결제가 완료되었습니다");
				System.out.println("잔돈을 반환합니다."); // 잔돈 반환
				System.out.println("잔돈 : " + (결제액 - 총결제액));
			}
			else if(결제액 == 총결제액) { // 결제액과 총결제액이 같으면
				System.out.println("결제가 완료되었습니다.");
			}
			
			else System.out.println("금액이 인식되지않습니다 " + 총결제액 + "원을 다시투입해주세요");
		}
		else if(select == 5) {break;}
		else {System.out.println("알 수 없는 번호 입니다.");}
		
		
		}
		
		
	}

}
