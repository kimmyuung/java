package 스레드활용과제;

import java.util.Scanner;

public class Controller {
static Scanner scanner = new Scanner(System.in);
	
	static boolean context1 = true;
	static boolean context2 = true;
	
	
	public static void 개미와배짱이() {
		
		while(true) {
			System.out.println("개미와배짱이 동화");
			System.out.println("1)재생 / 일시정지 2)돌아가기");
			String work = scanner.next();
			개미와배짱이 story = new 개미와배짱이();
			if (work.equals("1")) {
				
				if(context1) {
					story.개미와배짱이_stop(true);
					story.start();
					context1 = false;
				}
				else {
					story.개미와배짱이_stop(false);
					context1 = true;
				}
			}
			else if (work.equals("2")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				story.개미와배짱이_stop(false);
				break;
			}
		}
	}
	
	public static void 미녀와야수() {

		while(true) {
			System.out.println("미녀와 야수 동화");
			System.out.println("1)재생 / 일시정지 2)돌아가기");
			String work = scanner.next();
			미녀와야수 story2 = new 미녀와야수();
			if (work.equals("1")) {
				
				if(context2) {
					story2.미녀와야수_stop(true);
					story2.start();
					context2 = false;
				}
				else {
					story2.미녀와야수_stop(false);
					context2 = true;
				}
			
			}
			else if (work.equals("2")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				story2.미녀와야수_stop(false);
				break;
			}
		}
	}
	
	
}

