package 과제;

import java.util.Scanner;

public class 개인과제_엘리베이터_보완 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("몇층 짜리 건물입니까");
	int floor = sc.nextInt();
	
	
	
	if(floor < 0) {System.out.println("엘레베이터는 2층이상 운행합니다. 다시 입력해주세요");}
	else if(floor > 0 ) {
		System.out.println("엘레베이터가 다니는 층수가 설정되었습니다.");
		System.out.println("엘레베이터의 용량은 몇 kg입니까");
		int kg = sc.nextInt();
		if(kg < 0) {System.out.println("무게는 음수일수 없습니다! 다시 입력해주세요");}
		else {	
		System.out.println("엘레베이터의 용적 설정이 완료되었습니다."); }
		
		
		System.out.println("엘레베이터를 지금부터 이용가능합니다."); // 맨 처음엔 1층 그 이후는 이용이 마지막으로 된 층에 위치
		while(true) {
		System.out.println("[[1. 엘레베이터 호출 2. 종료");
		int select = sc.nextInt();
		if(select == 1) {
			int last = 1;
			System.out.println("엘레베이터를 호출합니다.");
			System.out.println("가고 싶은 층을 입력해주세요");
			int select1 = sc.nextInt();
			if(select1 < floor) System.out.println("설계된 층이상의 층을 갈수는 없습니다.");
			else if(select1 > 0) {
				for(int i = 1 ; i <= floor; i++) {
				System.out.printf("%d층", i); }
				System.out.println("도착했습니다.");
				last += floor;
			}
			
		}
		else if(select == 2) {System.out.println("엘레베이터를 종료합니다."); break;}
		}
		
		
		
		
		
	}
	
	
	}
}
