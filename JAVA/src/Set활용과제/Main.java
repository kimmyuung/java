package SetȰ�����;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
	Controller con = new Controller();
	con.load();
	while(true) {
		System.out.println("��ȸ���� �湮�� ���α׷�");
		System.out.println("1. �湮�� ���� 2. �湮�� 3. ����");
		int ch = con.sc.nextInt();
		if(ch == 1) {
			LocalDate localDate = LocalDate.now();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(localDate);
			System.out.println("�湮�� ���� : "); String title = con.sc.next();
			System.out.println("�湮�� ���� : "); String context = con.sc.next();
			System.out.println("�湮�� �Խ��� : "); String writer = con.sc.next();
			boolean result = con.add(title, context, writer, date);
			
		}
		else if(ch == 2) {
			for(Content temp : con.blist) {
				System.out.println(temp);
			}
		}
		else if(ch == 3) {
			System.out.println("���α׷� ����!"); Controller.sc.close();  break;
		}
	}
}
}
