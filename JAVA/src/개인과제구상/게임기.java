package 개인과제구상;

public class 게임기 {
public static void main(String[] args) {
	게임기컨트롤러 con = new 게임기컨트롤러();
	try {
	while(true)
	{
		System.out.println("------ 미니 이젠 천국 ------");
		System.out.println("원하는 게임의 숫자를 입력해주세요");
		System.out.println("1. 틱택토 2. 업앤다운 3. 블랙잭 4. 노래맞추기 5. 숫자야구");
		System.out.println("실행할 게임 >>>> ");
		int select = con.sc.nextInt();
		if(select == 1) {
			System.out.println("틱택토 게임에 오신걸 환영합니다.");
			con.틱택토();
		}
		else if(select == 2) {
			con.업앤다운();
		}
		else if(select == 3) {
			con.블랙잭();
		}
		else if(select == 4) {
			con.노래맞추기();
		}
		else if(select == 5) {
			con.숫자야구();
		}
	}
	}catch(Exception e) {System.out.println("문자열을 입력하셨습니다. 다시 시작해주세요");}
	}
}
