package Day11_4연습;

public class 댓글 {
	// 댓글 클래스
			// 내용, 패스워드, 작성자, 작성일
	private String reply;
	private String pw;
	private String rwriter;
	private String rdate;
	public 댓글() {}
	public 댓글(String reply, String pw, String rwriter, String rdate) {
		super();
		this.reply = reply;
		this.pw = pw;
		this.rwriter = rwriter;
		this.rdate = rdate;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getRwriter() {
		return rwriter;
	}
	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
}
