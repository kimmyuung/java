package ���ΰ�������;

import java.util.ArrayList;

public class ���� extends ������Ʈ�ѷ�{
private String �̸�;
private String ��Ÿ��;
private ArrayList<����> ���ø���Ʈ = new ArrayList<����>();
private int ����Ʈ;


public ����(String �̸�, String ��Ÿ��, ArrayList<����> ���ø���Ʈ, int ����Ʈ) {
	super();
	this.�̸� = �̸�;
	this.��Ÿ�� = ��Ÿ��;
	this.���ø���Ʈ = ���ø���Ʈ;
	this.����Ʈ = ����Ʈ;
}
���� () {}
public String get�̸�() {
	return �̸�;
}
public void set�̸�(String �̸�) {
	this.�̸� = �̸�;
}
public String get��Ÿ��() {
	return ��Ÿ��;
}
public void set��Ÿ��(String ��Ÿ��) {
	this.��Ÿ�� = ��Ÿ��;
}
public int get����Ʈ() {
	return ����Ʈ;
}
public void set����Ʈ(int ����Ʈ) {
	this.����Ʈ = ����Ʈ;
}
public ArrayList<����> get���ø���Ʈ() {
	return ���ø���Ʈ;
}
public void set���ø���Ʈ(ArrayList<����> ���ø���Ʈ) {
	this.���ø���Ʈ = ���ø���Ʈ;
}

}
