package ���ΰ�������;

import java.util.ArrayList;

public class ���� {
private String �����̸�;
private String ����Ư��;
private String �����ó���;
private int ������ȣ;

public ����() {}

public ����(String �����̸�, String ����Ư��, String �����ó���, int ������ȣ) {
	super();
	this.�����̸� = �����̸�;
	this.����Ư�� = ����Ư��;
	this.�����ó��� = �����ó���;
	this.������ȣ = ������ȣ;
}

public ����(String �����̸�, String ����Ư��, String �����ó���) {
	super();
	this.�����̸� = �����̸�;
	this.����Ư�� = ����Ư��;
	this.�����ó��� = �����ó���;
}

public String get�����̸�() {
	return �����̸�;
}

public void set�����̸�(String �����̸�) {
	this.�����̸� = �����̸�;
}

public String get����Ư��() {
	return ����Ư��;
}

public void set����Ư��(String ����Ư��) {
	this.����Ư�� = ����Ư��;
}

public String get�����ó���() {
	return �����ó���;
}

public void set�����ó���(String �����ó���) {
	this.�����ó��� = �����ó���;
}

public int get������ȣ() {
	return ������ȣ;
}

public void set������ȣ(int ������ȣ) {
	this.������ȣ = ������ȣ;
}


}
