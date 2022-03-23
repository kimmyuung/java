package 상속과제;

public class 롯데마트 extends Market{

	
	
	
	롯데마트 (String 멤버십아이디, String 멤버십비밀번호, String 핸드폰번호) {
		super(멤버십아이디, 멤버십비밀번호, 핸드폰번호);
	}
	
@Override
boolean 회원가입(String id, String pw, String number) {
	// TODO Auto-generated method stub
	마켓플레이스.memberlist.add(emarket);
	return true;
}
}
