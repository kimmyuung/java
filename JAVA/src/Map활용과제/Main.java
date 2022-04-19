package Map활용과제;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Controller con = new Controller();
	
	while(true) {
		System.out.println("회원제 커뮤니티 사이트");
		System.out.println("1. 회원 가입 2. 로그인 3. 종료");
		int ch = sc.nextInt();
		if(ch ==1) {
			System.out.println("Id : "); String id = sc.next();
			System.out.println("Pw : "); String pw = sc.next();
			System.out.println("Name : "); String name = sc.next();
			Member member = new Member(id, pw, name);
			boolean result = con.signup(member);
			if(result) System.out.println("가입 성공");
			else System.out.println("가입 실패");
		}
		else if(ch==2) {
			System.out.println("Id : "); String id = sc.next();
			System.out.println("Pw : "); String pw = sc.next();
			boolean result = con.login(id, pw);
			if(result) {
				System.out.println("로그인 성공!");
				while(true) {
					System.out.println("1. 글쓰기 2. 글보기 3. 로그아웃");
					int ch1 = sc.nextInt();
					if(ch1==1) {
						System.out.println("1. 글 제목 : "); String title = sc.next();
						System.out.println("2. 글 내용 : "); String context = sc.next();
						con.write(title, context);
					}
					else if(ch1==2) {
						for(String temp : con.treeMap.keySet()) {
							System.out.println(temp + " : " + con.treeMap.get(temp));
						}
						
					}
					else if(ch1==3) {System.out.println("로그아웃!"); break;}
					else {System.out.println("숫자를 잘못 입력하셨습니다.");}
				}
				
			}
			else System.out.println("로그인 실패!");
		}
		else if(ch==3) {
			System.out.println("프로그램 종료!!");
			break;
		}
	}
}
}
