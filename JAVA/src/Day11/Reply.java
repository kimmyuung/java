package Day11;

public class Reply
{
	// 1. field
	private String content;
	private String pw;
	private String writer;
	private String date;
	// 2. constructor
		// 1. �������
	Reply() {}
		// 2. �Խù���� �� ���Ǵ� ������
	public Reply(String content, String pw, String writer, String date)
	{
		this.content = content;
		this.pw = pw;
		this.writer = writer;
		this.date = date;
	}	
	// 3. method
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public String getPw()
	{
		return pw;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	public String getWriter()
	{
		return writer;
	}
	public void setWriter(String writer)
	{
		this.writer = writer;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
}
