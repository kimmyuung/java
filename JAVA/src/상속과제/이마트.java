package ��Ӱ���;

public class �̸�Ʈ extends Market
{

	 �̸�Ʈ (String ����ʾ��̵�, String ����ʺ�й�ȣ, String �ڵ�����ȣ){
		 	super(����ʾ��̵�, ����ʺ�й�ȣ, �ڵ�����ȣ);
		}
	@Override
	boolean ȸ������(String id, String pw, String number) {
		�����÷��̽�.memberlist.add(emarket);
		return true;
	}
}
