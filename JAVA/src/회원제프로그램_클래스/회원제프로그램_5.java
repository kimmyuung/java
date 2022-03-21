package 회원제프로그램_클래스;

import java.util.Scanner;

public class 회원제프로그램_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Member[] memberlist = new Member[100];
	
	while(true) {
	System.out.println("회원제프로그램");
	System.out.println("[[1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호찾기]]");
	System.out.println("입력 : >>>>>"); int select = sc.nextInt();
	
	if(select == 1) {
		System.out.println("회원가입 페이지");
		System.out.println("Id : "); String id = sc.next();
		System.out.println("pw : "); String pw = sc.next();
		System.out.println("name : "); String name = sc.next();
		System.out.println("phone number : "); String phone = sc.next();
		boolean pass = false;
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				System.out.println("아이디가 중복됩니다.");
				pass = true;
				break;
			}
		}
 		if(pass == false) {
		for(Member temp : memberlist) {
			if(temp == null) {
				System.out.println("회원가입이 완료되었습니다.");
				Member member = new Member(id, pw, name, phone);
				pass = true;
				memberlist[i] = member;
				break;
			}
		i++;	
		} }
	}
	else if (select == 2) {
		System.out.println("로그인 페이지");
		System.out.println(" Id : "); String id = sc.next();
		System.out.println(" pw : "); String pw = sc.next();
		boolean logincheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				System.out.println("로그인되었습니다.");
				logincheck = true;
				break;
			}
		}
		if(logincheck == false) {System.out.println("회원정보를 잘못입력하셨니다. 다시 입력해주세요");}
	}
	else if (select == 3) {
		System.out.println("아이디 찾기 페이지");
		System.out.println(" name : ");			String name = sc.next();
		System.out.println(" phone number : "); String number = sc.next();
		boolean idcheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(number)) {
				System.out.println("아이디를 찾았습니다.");
				System.out.println("아이디 : " + temp.getId());
				idcheck = true;
				break;
			}
		}
		if(idcheck == false) {System.out.println("찾으신 회원정보를 가진 회원이 없습니다.");}
	}
	else if (select == 4) {
		System.out.println("비밀번호 찾기 페이지");
		System.out.println(" name : ");			String name = sc.next();
		System.out.println(" id : "); 			String id = sc.next();
		System.out.println(" phone : ");	    String phone = sc.next();
		boolean passcheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getId().equals(id) && temp.getPhone().equals(phone)) {
				System.out.println("비밀번호를 찾았습니다.");
				System.out.println("비밀번호 : " + temp.getPw());
				passcheck = true;
				break;
			}
		}
		if(passcheck == false) {System.out.println("찾으신 회원정보를 가진 회원이 없습니다.");}
	}
	else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
	
	}
}
}
