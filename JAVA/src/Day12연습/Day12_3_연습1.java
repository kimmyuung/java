package Day12����;

public class Day12_3_����1 {
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
	public static void main(String[] args) {
		String[] booklist = {	
				"�ȴ�! ���̹� ��α�&����Ʈ",
				"������ ��Ʈ ���� Ȱ�� ������",
				"Tucker�� Go ��� ���α׷���",
				"ȥ�� �����ϴ� C ���" 		}; // ��������� �迭�� ����
		try { // ����Ʈ�迭�� ���� ��� �Ϲݿ��ܰ� �߻��ϱ� ������ try catch ���
			while(true) { // ���ѷ��� �������� : ����
				System.out.println("1. ���� �˻� 2. ���� ����");
				byte[] bytes = new byte[1000]; // �Է��� ���� ����Ʈ�迭 ����
				int count = System.in.read(bytes); // Ű���带 ���� �Է¹��� ����Ʈ�� ������ ����
				String ch = new String(bytes, 0, count-2); // ���� �޸𸮸� �Ҵ��Ͽ� Ű���带 ���� �Է¹��� ����Ʈ�� ó������ ������ �о� ���ڿ��� ����
				// -2�� �� ���� : ���� ��� �Է¿��� ���� ����� ����(���๮��(1����Ʈ, \n) + ���� �տ� Ŀ���� �ű�� ����(1����Ʈ, \r)�� ���ԵǾ� �־� 2����Ʈ ����)
				if(ch.equals("1")) { // ����ڷκ��� �Է¹��� ����Ʈ�� ���ڿ��� ��ȯ�� ����� 1�� ���
					System.out.println("�˻��� ���� �̸��� �Է����ּ���"); 
					int findbook = System.in.read(bytes); // �˻��� ������ ����Ʈ�� �о����
					String ch1 = new String(bytes, 0, count-2); // ����Ʈ�� �о�鿩 ���ڿ��� ��ȯ
					for(String temp : booklist) { // ������Ͽ����� ���� ã�� ���� �ݺ��� ����
						if(temp.indexOf(ch1) != -1) { // �ش� ���ڿ��� �ε����� ã�� ����� -1�̸� ����� �ִٴ� ��
							// indexOf�� -1�̸� ������ ���ڿ��� ���ٴ� ���̱� ������ -1�� �ƴ� ���� ����
							System.out.println(temp); // ã�� ������ ���
						}
						else if(temp.contains(ch1)) { // ������Ͽ��� �ش� ���ڿ��� �����ϰ� �ִ� ���
							System.out.println(temp); // ã�� ���ڿ��� �����ϰ� �ִ� ������ ���
						}
					}
				}
				else if(ch.equals("2")) {
					System.out.println("������ �������� �Է����ּ���");
					int rewrite = System.in.read(bytes); // Ű���带 ����(����Ʈ) �������� �Է¹���
					String ch2 = new String(bytes, 0, rewrite-2); // �Է¹��� �������� �о���̰� ���ڿ��� ��ȯ
					int i = 0; // ��������� �ε���
					for(String temp : booklist) {
						if(temp.indexOf(ch2) != -1) { // indexOf�� ����� -1�̸� ���� ���ڿ��� ���ٴ� ��
							String ch3 = temp.replace(temp, ch2); // ���ο� ���ڿ��� �����Ͽ� ������ ���ڿ��� ���ο� ���ڿ��� ��ü�Ͽ� ����
							System.out.println(ch3); // ���� ����� ����ڰ� �� �� �ְ� ���
						}
					i++;}
					System.out.println("������ȣ ���� : "); // ���� ��ȣ(��������� �ε���)�� ����
					int count1 = System.in.read(bytes); // ����Ʈ�� �Է¹���
					String ch3 = new String(bytes, 0, count1-2); // �о���� �� ���ڿ��� ����
					int index = Integer.parseInt(ch3); // ���ڿ��� �ٽ� ���������� ��ȯ��Ŵ -> ��������� �ε����� ���
					System.out.println("���� ���� : "); // ������ ������ ���ڸ� �Է� 
					int old = System.in.read(bytes);  // Ű���带 ���� �Է¹���
					String oldStr = new String(bytes, 0, old-2); // ������ �������� ���ڿ��� ����
					System.out.println("���ο� ���� : "); // ���ο� ������ �̸��� �Է�
					int new1 = System.in.read(bytes); // Ű���带 ���� �Է¹���
					String newStr = new String(bytes, 0, new1-2); // ���ο� �������� ���ڿ��� ����
					booklist[index] = booklist[index].replace(oldStr, newStr); // �Է¹��� ������ȣ�� �ε����� �ϴ� ��������� ������ ������ ���ڿ��� ���ο� ���ڿ��� ��ü
					
				}
				else System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���");
			}
		}catch(Exception e) {System.out.println(e);}
		
	}
}
