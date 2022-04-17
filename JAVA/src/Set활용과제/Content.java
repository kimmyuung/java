package Set활용과제;

public class Content {

String title;
String content;
String writer;
String date;
public Content() {}
public Content(String title, String content, String writer, String date) {
	super();
	
	this.title = title;
	this.content = content;
	this.writer = writer;
	this.date = date;
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
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

}
