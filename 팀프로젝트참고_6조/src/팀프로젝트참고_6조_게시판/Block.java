package 팀프로젝트참고_6조_게시판;

public class Block {
	
	
	//1.필드
	private String index; //연동되는 유저 아이디 인덱스
	private String target; //차단대상
	
	
	//2.생성자
	public Block() {
		super();
	}


	public Block(String index, String target) {
		super();
		this.index = index;
		this.target = target;
	}
	
	
	
	//3.메소드

	public String getIndex() {
		return index;
	}


	public void setIndex(String index) {
		this.index = index;
	}


	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}
	
	
	
	
}
