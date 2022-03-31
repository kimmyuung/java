package ��������Ʈ����_6��_�Խ���;

import java.time.LocalDateTime;

public class Reply {

	// �ʵ�
	private String content; // ��۳���
	private String writer; // ��� �ۼ���
	private LocalDateTime date; // ��¥
	private int good; // ��õ��
	private int bad; // ����õ��
	private int report; // �Ű���Ƚ��
	private int index; // �� ��ȣ���� �ε���
	
	// ������
	public Reply() {}

	public Reply(String content, String writer, LocalDateTime date, int good, int bad, int report, int index) {
		super();
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.good = good;
		this.bad = bad;
		this.report = report;
		this.index = index;
	}

	// �޼ҵ�
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	public int getReport() {
		return report;
	}

	public void setReport(int report) {
		this.report = report;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
	
	
	
	
}