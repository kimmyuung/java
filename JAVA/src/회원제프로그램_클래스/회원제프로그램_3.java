package 회원제프로그램_클래스;

import java.util.Scanner;

public class 회원제프로그램_3 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Member[] memberlist = new Member[100];
	
	while(true) {
	System.out.println("회원제프로그램");
	System.out.println("1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기");
	System.out.println("선택 :    "); int ch = sc.nextInt();
	
	if(ch==1) {
		System.out.println("회원가입 페이지");
		System.out.println(" id : ");	String id = sc.next();
		System.out.println(" pw : "); 	String pw = sc.next();
		System.out.println(" name : "); String name = sc.next();
		System.out.println("phone : "); String number = sc.next();
		boolean pass = false;
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				System.out.println("아이디가 중복됩니다.");
				pass = true;
				break;
			}
		}
		if(pass = false) {
		for(Member temp : memberlist) {
			if(temp == null) {
			Member member = new Member(id, pw, name, number);
			memberlist[i] = member;
			System.out.println("회원가입 완료");
			break;
			}
		i++;}
		}
	}
	else if(ch==2) {
		System.out.println("로그인 페이지");
		System.out.println(" id : ");	String id = sc.next();
		System.out.println(" pw : "); 	String pw = sc.next();
		boolean logincheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				System.out.println("로그인 성공!!");
				logincheck = true; break;
			}
		}
		
	}
	else if(ch==3) {
		System.out.println("아이디 찾기 페이지 ");
		System.out.println(" name : ");	String name = sc.next();
		System.out.println(" phonenumber : "); 	String phone = sc.next();
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				System.out.println("아이디 찾기 성공!!");
				System.out.println("아이디 : " + temp.getId()); break;
			}
		}
	}
	else if(ch==4) {
		System.out.println("비밀번호 찾기 페이지 ");
		System.out.println(" name : ");	String name = sc.next();
		System.out.println(" phonenumber : "); 	String phone = sc.next();
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				System.out.println("비밀번호 찾기 성공!!");
				System.out.println("비밀번호 : " + temp.getPw()); break;
			}
		}
	}
	else {System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");}
	
	}
}
}
