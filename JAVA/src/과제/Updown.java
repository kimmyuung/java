package 과제;

import java.util.Scanner;

public class Updown { // c s
	public static void main(String[] args) { // m s

	// 엘리베이터
	// 동작 : 사용자로부터 층을 입력받아서 엘레베이터 이동 
	// 위로 이동 
	// 아래로 이동  
	Scanner scanner = new Scanner(System.in); // 입력객체 선언
	while(true) { // 무한루프 종료조건 : X /// w s
	System.out.println("------- 엘리베이터 --------"); // 엘레베이터 출력
	System.out.println("1층   2층   3층   4층   5층");
	System.out.println("------------------------");
	System.out.println(">> 현재 사용자가 있는 층 선택 : ");
	int select = scanner.nextInt(); // 현재 사용자가 있는 층을 입력받음
	
	if(select == 1) { // 1층 s
		System.out.printf("현재 %d층에 있습니다.\n", select);
		System.out.println("몇층으로 가기를 원하십니까");
		int select2 = scanner.nextInt();
		if(select2 == 1) { System.out.println("알림)) 1층은 현재 층입니다."); }
		// 1층은 현재층
		else if(select2 == 2) { // 1층에서 2층으로 가는 경우
			System.out.println("2층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2층에 도착했습니다.");
		} // 1층에서 2층으로 가는 경우 e
		
		else if(select2 == 3) { // 1층에서 3층으로 가는 경우
			System.out.println("3층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3층에 도착했습니다.");
		}
		
		else if(select2 == 4) { // 1층에서 4층으로 가는 경우
			System.out.println("4층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4층에 도착했습니다.");
		}
		
		else if(select2 == 5) { // 1층에서 5층으로 가는 경우
			System.out.println("5층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5층에 도착했습니다.");
		}
	} // 1층 e
	else if(select == 2) { // 2층 s
		System.out.printf("현재 %d층에 있습니다.\n", select);
		System.out.println("몇층으로 가기를 원하십니까");
		int select2 = scanner.nextInt();
		if(select2 == 1) { // 2층에서 1층으로 가는 경우
			System.out.println("1층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1층에 도착했습니다.");
		} // 2층에서 1층으로 가는 경우 e
		
		else if(select2 == 2) { System.out.println("알림)) 2층은 현재 층입니다."); }
		// 2층은 현재층
		else if(select2 == 3) { // 2층에서 3층으로 가는 경우
			System.out.println("3층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3층에 도착했습니다.");
		}
		
		else if(select2 == 4) { // 2층에서 4층으로 가는 경우
			System.out.println("4층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4층에 도착했습니다.");
		}
		
		else if(select2 == 5) { // 2층에서 5층으로 가는 경우
			System.out.println("5층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5층에 도착했습니다.");
		}
	} // 2층 e
	
	else if(select == 3) { // 3층
		System.out.printf("현재 %d층에 있습니다.\n", select);
		System.out.println("몇층으로 가기를 원하십니까");
		int select2 = scanner.nextInt();
		if (select2 ==1 ) { // 3층에서 1층으로 가는 경우
			System.out.println("1층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1층에 도착했습니다.");
		}
		else if(select2 == 2) { // 3층에서 2층으로 가는 경우
			System.out.println("2층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2층에 도착했습니다.");
		}
		else if(select2 == 3) {System.out.println("알림)) 3층은 현재 층입니다.");}
		else if(select2 == 4) { // 3층에서 4층으로 가는 경우
			System.out.println("4층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4층에 도착했습니다.");
		}
		else if(select2 == 5) { // 3층에서 5층으로 가는 경우
			System.out.println("5층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5층에 도착했습니다.");
		}
	}
	else if(select == 4) {
		System.out.printf("현재 %d층에 있습니다.\n", select);
		System.out.println("몇층으로 가기를 원하십니까");
		int select2 = scanner.nextInt();
		if(select2 == 1) {
			System.out.println("1층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1층에 도착했습니다.");
		}
		else if(select2 == 2) {
			System.out.println("2층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2층에 도착했습니다.");
		}
		else if(select2 == 3) {
			System.out.println("3층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3층에 도착했습니다.");
		}
		else if(select2 == 4) {System.out.println("알림)) 4층은 현재 층입니다.");}	
		else if(select2 == 5) {
			System.out.println("5층으로 이동합니다");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5층에 도착했습니다.");
		}
		
	}
	else if(select == 5) {
		System.out.printf("현재 %d층에 있습니다.\n", select);
		System.out.println("몇층으로 가기를 원하십니까");
		int select2 = scanner.nextInt();
		if(select2 == 1) {
			System.out.println("1층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1층에 도착했습니다.");
		}
		else if(select2 == 2) {
			System.out.println("2층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2층에 도착했습니다.");
		}
		else if(select == 3) {
			System.out.println("3층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3층에 도착했습니다.");
		}
		else if(select == 4) {
			System.out.println("4층으로 이동합니다");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4층에 도착했습니다.");
		}
		else if(select2 ==5) {System.out.println("알림)) 5층은 현재 층입니다.");}
	}
	else System.out.println("잘못된 층을 입력하셨습니다. [재입력]");	
		} // w e
	} // m e
} // c e
