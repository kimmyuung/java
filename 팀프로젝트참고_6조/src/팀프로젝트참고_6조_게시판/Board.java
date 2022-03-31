package ��������Ʈ����_6��_�Խ���;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Board {

	// �ʵ�
	private String title; // �Խù� ����
	private String content; // �Խù� ����
	private String writer; // �ۼ���
	private LocalDateTime date; // ��¥
	private int view; // ��ȸ��
	private String category; // ī�װ�
	private int good; // ��õ��
	private int bad; // ����õ��
	private ArrayList<Reply> replylist = new ArrayList<Reply>(); // ���Ŭ����
	private int report;  // �Ű���Ƚ��
	private int index; // ��ȣ
	private ArrayList<String> p = new ArrayList<>();//���̵� ����
	
	
	// ������
	public Board() {}//���������
	
	public Board(String title, String content, String writer, LocalDateTime date, int view, String category, int good
			, int bad, int report, int index) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.view = view;
		this.category = category;
		this.good = good;
		this.bad = bad;
		this.report = report;
		this.index = index; 
	}//������ܻ�����
	public Board(String title, String content, String writer, LocalDateTime date, int view, String category, int good,
			int bad, ArrayList<Reply> replylist, int report, int index) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.view = view;
		this.category = category;
		this.good = good;
		this.bad = bad;
		this.replylist = replylist;
		this.report = report;
		this.index = index;
	}//�˲˻�����

	// �޼ҵ�
		//getter,setter�޼ҵ�
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public ArrayList<Reply> getReplylist() {
		return replylist;
	}

	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
	
	public ArrayList<String> getP() {
		return p;
	}

	public void setP(ArrayList<String> p) {
		this.p = p;
	}
	
	
	
	
	
}
