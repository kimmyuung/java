package Day11_4¿¬½À;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Board {
	private String title;
	private String content;
	private String password;
	private String writer;
	private int viewcount;
	private String date;
	private ArrayList<´ñ±Û> replylist 
					= new ArrayList<>();
	Board() {}
	
	public Board(String title, String content, String password, String writer, int viewcount, String date,
			ArrayList<´ñ±Û> replylist) {
		super();
		this.title = title;
		this.content = content;
		this.password = password;
		this.writer = writer;
		this.viewcount = viewcount;
		LocalDate date1 = LocalDate.now();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		this.date = sdf.format(date1);
		this.replylist = replylist;
	}
	
	public Board(String title, String content, String writer, String password) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<´ñ±Û> getReplylist() {
		return replylist;
	}
	public void setReplylist(ArrayList<´ñ±Û> replylist) {
		this.replylist = replylist;
	}
	
}
