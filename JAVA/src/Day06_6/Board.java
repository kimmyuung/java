package Day06_6;

public class Board {
	
	String 작성자;
	String 비밀번호;
	String 내용;
	String 제목;
	public Board(String 작성자, String 비밀번호, String 내용, String 제목) {
		
		this.작성자 = 작성자;
		this.비밀번호 = 비밀번호;
		this.내용 = 내용;
		this.제목 = 제목;
	}
	
	public Board() {}
	
}
