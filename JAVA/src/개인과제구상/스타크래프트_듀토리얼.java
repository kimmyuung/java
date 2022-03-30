package 개인과제구상;


import java.util.Scanner;

public class 스타크래프트_듀토리얼 {
public static void main(String[] args) {
//서플라이 디포 3개 건설, 리파이너리 건설, 100 베스핀 가스 채집
Scanner sc = new Scanner(System.in);

	while(true) {
		System.out.println("스타크래프트 !!");
		System.out.println("1. 캠페인 시작 2. 종료");
		System.out.println(">>>> 메뉴 선택 ");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("캠페인을 시작합니다.");
			System.out.println("어느 종족의 캠페인을 시작하겠습니까?");
			System.out.println("1. 테란 2. 저그 3. 프로토스");
			int ch1 = sc.nextInt();
			if(ch == 1) {
				System.out.println("테란의 캠페인을 시작합니다.");
				System.out.println("1. 신병 훈련소");
			}
			else if(ch == 2) {
			
			}
			else if(ch == 3) {
				
			}
		}
		else if(ch == 2) {
			System.out.println("스타크래프트를 종료합니다.");
			break;
		}
		else System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
	}
}
}
