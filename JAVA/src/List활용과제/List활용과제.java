package List활용과제;

public class List활용과제 {
public static void main(String[] args) {
	
	Controller con = new Controller();
	while(true) {
	System.out.println("회원제 게시판 프로그램");
	System.out.println("1. 가입 2. 로그인 3. 종료");
	int ch = Controller.getSc().nextInt();
	if(ch == 1) {
		System.out.println(" --- 회원가입 페이지 --- ");
		System.out.println("Id : "); String id = Controller.getSc().next();
		System.out.println("Pw : "); String pw = Controller.getSc().next();
		System.out.println("Name : "); String name = Controller.getSc().next();
		System.out.println("Address : "); String address = Controller.getSc().next();
		System.out.println("Email : "); String email = Controller.getSc().next();
		System.out.println("PhoneNumber : "); String number = Controller.getSc().next();
		boolean result = con.Signup(id, pw, name, address, email, number);
		if(result) System.out.println("회원가입이 완료되었습니다.");
		else System.out.println("회원가입이 실패하였습니다. 아이디가 중복됩니다.");
	}
	else if(ch == 2) {
		System.out.println(" --- 로그인 페이지 --- ");
		System.out.println("Id : "); String id = Controller.getSc().next();
		System.out.println("Pw : "); String pw = Controller.getSc().next();
		boolean result = con.Login(id, pw);
		if(result) System.out.println("로그인 성공!");
		else System.out.println("로그인 실패!");
	}
	else if(ch == 3) {
		System.out.println("프로그램을 종료합니다.");
		Controller.getSc().close();
		break;
	}
	}
}
}
