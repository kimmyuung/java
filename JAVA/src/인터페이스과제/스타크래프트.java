package 인터페이스과제;

import java.util.ArrayList;
import java.util.Scanner;

public class 스타크래프트 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	인터페이스_스타 저그 = new 저그();
	인터페이스_스타 테란 = new 테란();
	인터페이스_스타 프로토스 = new 프로토스();
	int sum = 0;
	int sum1 = 0;
	while(true) {
		System.out.println("스타크래프트!!!!!");
		System.out.println("1. ai 대전 2. 종료");
		int ch = sc.nextInt();
		if(ch ==1) {
			System.out.println("종족을 선택해주세요");
			System.out.println("1. 프로토스 2. 저그 3. 테란");
			int ch1 = sc.nextInt();
			if(ch1 == 1) {
				프로토스.종족선택();
				System.out.println("게임이 시작되었습니다.");
				
				while(true) {
				System.out.println("1. 자원채취 2. 유닛생산 3. 게임종료");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					int 미네랄합 = 프로토스.자원채집(sum);
					int 가스합 = 프로토스.가스채집(sum1);
					sum += 미네랄합;
					sum1 += 가스합;		
					System.out.println("미네랄 : " + 미네랄합);
					System.out.println("가스 : " + 가스합);
				}
				else if(ch2 == 2) {
					System.out.println("유닛을 생산합니다.");
					System.out.println("유닛 생산");
					System.out.println("1. 질럿");
					boolean result = 프로토스.유닛생산(sum, sum1);
					if(result) {System.out.println("질럿 1기가 생산!");
					sum -= sum - 200; sum1 -= sum1-200;}
					else System.out.println("자원이 부족합니다.");
				}
				else if(ch2 == 3) {
					System.out.println("게임을 종료합니다.");
					break;
				}
				else {
					System.out.println("잘못된 명령입니다. 다시 실행해주세요");
				}
				}
			}
			else if(ch1 == 2) {
				저그.종족선택();
				System.out.println("게임이 시작되었습니다.");
				while(true) {
					
					System.out.println("1. 자원채취 2. 유닛생산 3. 게임종료");
					int ch2 = sc.nextInt();
					if(ch2 == 1) {
						int 미네랄합 = 저그.자원채집(sum);
						int 가스합 = 저그.가스채집(sum1);
						sum += 미네랄합;
						sum1 += 가스합;		
						System.out.println("미네랄 : " + 미네랄합);
						System.out.println("가스 : " + 가스합);
					}
					else if(ch2 == 2) {
						System.out.println("유닛을 생산합니다.");
						System.out.println("유닛 생산");
						System.out.println("1. 저글링");
						boolean result = 저그.유닛생산(sum, sum1);
						if(result) {System.out.println("저글링 2기가 생산!");
						sum -= sum - 100; sum1 -= sum1-100;}
						else System.out.println("자원이 부족합니다.");
					}
					else if(ch2 == 3) {
						System.out.println("게임을 종료합니다.");
						break;
					}
					else {
						System.out.println("잘못된 명령입니다. 다시 실행해주세요");
					}
					}
			}
			else if(ch1 == 3) {
				테란.종족선택();
				System.out.println("게임이 시작되었습니다.");
				while(true) {
					
					System.out.println("1. 자원채취 2. 유닛생산 3. 게임종료");
					int ch2 = sc.nextInt();
					if(ch2 == 1) {
						int 미네랄합 = 테란.자원채집(sum);
						int 가스합 = 테란.가스채집(sum1);
						sum += 미네랄합;
						sum1 += 가스합;		
						System.out.println("미네랄 : " + 미네랄합);
						System.out.println("가스 : " + 가스합);
					}
					else if(ch2 == 2) {
						System.out.println("유닛을 생산합니다.");
						System.out.println("유닛 생산");
						System.out.println("1. 마린");
						boolean result = 테란.유닛생산(sum, sum1);
						if(result) {System.out.println("마린 1기가 생산!"); 
						sum -= sum - 150; sum1 -= sum1-150;}
						else System.out.println("자원이 부족합니다.");
					}
					else if(ch2 == 3) {
						System.out.println("게임을 종료합니다.");
						break;
					}
					else {
						System.out.println("잘못된 명령입니다. 다시 실행해주세요");
					}
					}
			}
			else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
		}
		else if(ch == 2) {
			System.out.println("게임을 종료합니다.");
			break;
		}
		
	}
}
}
