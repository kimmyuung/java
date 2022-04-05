package Day11_4����;

import java.util.Scanner;

public class Day11_4����_1 {
	// �Խ��� + ��� ���α׷� [ ����ó��, ����ó��, ����Ʈ ]
		// �Խù� Ŭ����
		// ����, ����, ��й�ȣ, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
		// ��۸���Ʈ
		// ��� Ŭ����
		// ����, �н�����, �ۼ���, �ۼ���
		// ��Ʈ�ѷ� Ŭ����
		// 1. ��� 2. ���� 3. ���� 4. ���� 5. ���� 6. ��۾���
		// 7. �Խù� ���� 8. �Խù� �ҷ����� 9. ��� ���� 10. ��ۺҷ�����
		// Day11_4_BoardApp Ŭ���� : ��Ʈ�ѷ� �޼ҵ� ȣ��, ����� [�Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ����]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		��Ʈ�ѷ�_1 con = new ��Ʈ�ѷ�_1();
		con.boardload(); // ���� �ҷ�����
		
		while(true) {
			try {
				// ��� �Խù� ���
				System.out.printf("%s\t%10s\t%10s\t%10s\t%10s \n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				int i = 0; // ����Ʈ�� �ε���
				for(Day11.Board temp : con.boardlist) {
					System.out.printf("%d\t%10s\t%10s\t%10s\t%10s \n", i, temp.getTitle(),temp.getWriter(),temp.getDate(),temp.getViewcount());
					i++;
				}
				
				
				
				System.out.println("1.���� 2.���� ���� : ");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("*** �Խù� ��� ***");
					scanner.nextLine(); 
					// nextLine : ���� ���� �Է� ����
					// [ ����! : nextLine �տ� �Ϲ� next �ϳ��� ���] -> �߰��� �Ϲ� next�� nextLine ���̿� nextLine �߰� 
					System.out.println(" ���� : "); String title = scanner.nextLine();
					System.out.println(" ���� : "); String content = scanner.nextLine();
					System.out.println(" �ۼ��� : "); String writer = scanner.next();
					System.out.println(" ��й�ȣ[����/������] : "); String pw = scanner.next();
					
					con.write(title, content, writer, pw); // �μ� ����
					
				} // if end
				else if(ch==2) {
					// �ش� �Խù� ��ȣ[�ε���]�� �Է¹޾� �Խù����� ��� ���
					System.out.println("�۹�ȣ �Է� : "); int ch3 = scanner.nextInt();
					Day11.Board temp = con.boardlist.get(ch3);
					System.out.printf("%s\t%10s\t%10s\t%10s\t%10s \n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
					System.out.printf("%d\t%10s\t%10s\t%10s\t%10s \n",
							ch3, temp.getTitle() ,temp.getWriter(),temp.getDate(),temp.getViewcount());
					System.out.println("���� : "+temp.getContent());
					 // ������ [����]
					System.out.println("-----------------------------���â--------------------------------");
					con.replyload();
					int j=0;
					for(��� temp2 : con.replist) {
						if(con.replist.get(j).equals(temp2) ) {
							System.out.println("��ȣ : "+j+"\t�ۼ��� : "+temp2.getRwriter()+"\t���� : "+temp2.getReply()+"\t�ۼ��� : "+temp2.getRdate());
						}
						j++;
						
					}
					
					System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾��� 5.��ۼ��� 6.��ۻ���");
					int ch2 = scanner.nextInt();
					
					if(ch2==1) {}
					else if(ch2==2) { // ������ �ε��� ��ȣ, �н�����, ������ ����, ������ ����
						System.out.println("��й�ȣ �Է� : "); String pw = scanner.next();
						scanner.nextLine();
						System.out.println("������ ���� �Է� : "); String title = scanner.nextLine();
						System.out.println("������ ���� �Է� : "); String content = scanner.nextLine();
						boolean result = con.update(ch3,pw,title,content);
						if(result) {
							System.out.println("�˸�)) �ش� �Խñ��� �����Ǿ����ϴ�.");
						}
						else System.out.println("�˸�)) ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						
					}
					else if(ch2==3) { // ������ �ε��� ��ȣ, �н�����
						System.out.println("��й�ȣ �Է� : "); String pw = scanner.next();
						boolean result = con.delete(ch3,pw);
						if(result) {
							System.out.println("�˸�)) �ش� �Խñ��� �����Ǿ����ϴ�.");
						}
						else System.out.println("�˸�)) ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
					else if(ch2==4) { // �ε��� ��ȣ, ��� ����, ��� �н�����, ����ۼ��� 
						scanner.nextLine();
						System.out.println("��� ���� : "); String content = scanner.nextLine();
						System.out.println("�ۼ��� : "); String writer = scanner.nextLine();
						System.out.println("��й�ȣ : "); String pw = scanner.next();
						con.replywrite(ch3,content,writer,pw);
						System.out.println("�˸�)) ��� �ۼ��� �Ϸ�Ǿ����ϴ�.");
						
					}
					else if(ch2==5) {
						System.out.println("��۹�ȣ �Է� : "); int ch4 = scanner.nextInt();
						System.out.println("��й�ȣ �Է� : "); String pw = scanner.next();
						scanner.nextLine();
						System.out.println("������ ���� �Է� : "); String content = scanner.nextLine();
						boolean result = con.replyupdate(ch4,pw,content);
						if(result) {
							System.out.println("�˸�)) �ش� �Խñ��� �����Ǿ����ϴ�.");
						}
						else System.out.println("�˸�)) ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
					else if(ch2==6) {
						System.out.println("��۹�ȣ �Է� : "); int ch4 = scanner.nextInt();
						System.out.println("��й�ȣ �Է� : "); String pw = scanner.next();
						boolean result = con.replydelete(ch4,pw);
						if(result) {
							System.out.println("�˸�)) �ش� ����� �����Ǿ����ϴ�.");
						}
						else System.out.println("�˸�)) ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
					else System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�.");
					
				} // else if end �Խù� ����
				else System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�.");
			}catch(Exception e) {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
			
		} // while end
	}
}
