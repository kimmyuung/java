package Set활용과제;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
	Controller con = new Controller();
	con.load();
	while(true) {
		System.out.println("비회원제 방문록 프로그램");
		System.out.println("1. 방문록 쓰기 2. 방문록 3. 종료");
		int ch = con.sc.nextInt();
		if(ch == 1) {
			LocalDate localDate = LocalDate.now();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(localDate);
			System.out.println("방문록 제목 : "); String title = con.sc.next();
			System.out.println("방문록 내용 : "); String context = con.sc.next();
			System.out.println("방문록 게시자 : "); String writer = con.sc.next();
			boolean result = con.add(title, context, writer, date);
			
		}
		else if(ch == 2) {
			for(Content temp : con.blist) {
				System.out.println(temp);
			}
		}
		else if(ch == 3) {
			System.out.println("프로그램 종료!"); Controller.sc.close();  break;
		}
	}
}
}
