package Day06;

public class Board { // cs
String writer;
String pw;
String title;
String context;

	Board(){}
	Board(String title) {
		this.title = title;
	}
	Board(String title, String context){
		this.title = title;
		this.context = context;
	}
	Board(String title, String writer, String pw)
	{
		this.pw = pw;
		this.title = title;
		this.writer = writer;
	}
	Board(String writer, String pw, String title, String context) 
	{
	this.writer = writer;
	this.pw = pw;
	this.title = title;
	this.context = context;
	}
} // ce
