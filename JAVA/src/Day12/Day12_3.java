package Day12;

public class Day12_3
{
public static void main(String[] args)
{
	// ���� �˻� ���α׷�
	// [����]
	// 1. �Է¹ޱ� [ System.in.read() ]
	// 2. String �迭�� ���� ������ ���� 
		//		String[] ������� = {	
		//			"�ȴ�! ���̹� ��α�&����Ʈ",
		//			"������ ��Ʈ ���� Ȱ�� ������",
		//			"Tucker�� Go ��� ���α׷���",
		//			"ȥ�� �����ϴ� C ���"
		//};
	// 3. �˻���� , ������� 
		// �˻���� : Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ��� 
			// '���' �˻� ->  "Tucker�� Go ��� ���α׷���" / "ȥ�� �����ϴ� C ���"
		// ������� : ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� 
		// '����' ���� -> ���õ� �������� ������ ���ڿ� ���ο� ���� �Է¹޾� ->  ���� �Ϸ�
	String[] booklist = {	
						"�ȴ�! ���̹� ��α�&����Ʈ",
						"������ ��Ʈ ���� Ȱ�� ������",
						"Tucker�� Go ��� ���α׷���",
						"ȥ�� �����ϴ� C ���" 		};
	try {
	while(true) {
	System.out.println("1. ���� �˻� 2. ���� ����");	
	 // Ű����κ��� [��Ʈ��] ����Ʈ�� �о��.
	// �Ϲݿ��� �߻� -> ���ѱ��
	byte[] bytes = new byte[100];
	int count = System.in.read(bytes); 
	// �о�� ����Ʈ����
	// �׻� \n + \r ���ԵǾ�����
	String ch = new String(bytes , 0 , count-2);
	// Ű����κ��� ����Ʈ ���� �� ����Ʈ �迭 -> ���ڿ� ��ȯ(-2 ����)
	if( ch.equals("1") ) {
		System.out.println("�˻��� ������ �Է����ּ���");
		int findbook = System.in.read(bytes);
		String ch1 = new String(bytes , 0 , findbook-2);
		System.out.println(" *** �˻� ��� *** ");
		for(String temp : booklist) { // ��� �迭�� ���ڿ��� �ϳ��� ��������
			if(temp.indexOf(ch1) != -1) { // �ش� ���ڿ��� ã�� ������ �ε����� �����ϸ�
				// indexOf �޼ҵ� -1���� ��ȯ�Ǵ� ���� ������ �ܾ ���� ���
				System.out.println(temp); // �ش� ���ڿ��� ã�� ���ڰ� �����ϸ� ���
				}
			if(temp.contains(ch1)) { // ���ڿ�.contains("ã������") : ���ڿ��� ã�� ���ڰ� �ִ� / ���� 
				System.out.println(temp);
				}
			}
		
	}
	else if(ch.equals("2")) {
		System.out.println("������ �������� �Է����ּ���");
		int rewrite = System.in.read(bytes); // Ű����κ��� ����Ʈ�� �о�ͼ� �迭�� ����
		String ch2 = new String(bytes , 0 , rewrite-2); // 0���ε��� ����Ʈ���� -2������ �ε�������
		int i = 0;
		for(String temp : booklist) {
			if(temp.indexOf(ch2) != -1) { 
				String ch3 = temp.replace(temp, ch2);
				System.out.println(ch3);
			}
		i++;}
		
		System.out.println("������ȣ ���� : ");
		int count1 = System.in.read(bytes);
		String ch3 = new String(bytes, 0, count1-2);
		// ch3 ���ڿ��� �Է¹��� ---> �ε���[����]�� ��ȯ
		int index = Integer.parseInt(ch3);
		System.out.println("���� ���� : ");
			int old = System.in.read(bytes);
			String oldStr = new String(bytes, 0, old-2);
		System.out.println("���ο� ���� : ");
			int new1 = System.in.read(bytes);
			String newStr = new String(bytes, 0, new1-2);
			booklist[index] = booklist[index].replace(oldStr, newStr);
	}		// �迭�� ������ = ������ ������
	else System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
	}}catch(Exception e) {System.out.println("���ڸ� �Է����ּ���");}
	
}
}
