package Day08;

import java.util.Scanner;

public class Day08_5 {

	//모바일 뱅크 프로그램
		// 요구사항
		//회원주요기능: 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		//계좌주요기능:  1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록
		// 설계: 통장, 대출상품, 회원
			//필드 
			//메소드
	
	static Scanner scanner = new Scanner(System.in);
	static Member [] members = new Member[1000];
	static Money [] account = new Money[1000];
	
	public static void main(String[] args) {
			Day08_5 application = new Day08_5();
			application.menu();
	}
		void menu() {
			while(true) {
				System.out.println("-------모바일 뱅킹 서비스-----");
				System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
				int 선택 = scanner.nextInt();
				
				Member member = new Member();
				Money money = new Money();
				if(선택==1) {
					boolean result = member.회원가입();
					if(result) {
						System.err.println("회원가입 성공");
					}
					else System.err.println("회원가입 실패");
				}
				else if(선택==2) {
					String result = member.로그인();
					// 계좌메뉴
					System.out.println("1.계좌생성 2.입금 3.출금 4.대출");
					int 선택1 = scanner.nextInt();
					if (선택1 == 1) {
						money.계좌생성 ();
						
						}
					if (선택 == 2) {
						money.입금();
					}
					if(result==null) {
						System.out.println("동일한 회원이 있습니다.");
					}
					else {
						System.err.println("로그인 완료");
					}
				}
				else if(선택==3) {
					member.아이디찾기();
				}
				else if(선택==4) {
					member.비밀번호찾기();
				}
				else System.out.println("알수없는 번호입니다.");
				
				
			}
		}
		
	
	
	
}
