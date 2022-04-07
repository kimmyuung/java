package Day13_3연습;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_연습1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("연도 : "); int year = sc.nextInt();
System.out.println("월 : "); int month = sc.nextInt();
달력(year, month);
}

public static void 달력(int year, int month) {
while(true) {
	Calendar calendar = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);
	calendar.set(year, month-1, 1);
	
	int sweek = calendar.get(Calendar.DAY_OF_WEEK);
	int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	System.out.println("*****" + year + "년 " + month + "월" + " *****");
	System.out.println("일\t월\t화\t수\t목\t금\t토");
	
	for(int i = 1; i < sweek; i++) {
		System.out.print("\t");
	}
	
	for(int i = 1; i < eday; i++) {
		System.out.print(i + "\t");
		if(sweek%7==0) System.out.println();
		sweek++;
	}
	try {
	System.out.println("\n 1. 이전달 2. 다음달 3. 다시검색 4. 종료");
	int ch = sc.nextInt();
	if(ch == 1) {
		month -= 1; if(month == 0) {year -= 1; month = 12;}
	}
	else if(ch == 2) {
		month += 1; if(month == 13) {year += 1; month = 1;}
	}
	else if(ch == 3) {
		System.out.println("연도 : "); year = sc.nextInt();
		System.out.println("월 : "); month = sc.nextInt();
	}
	else if(ch == 4) {
		System.out.println("종료!");
		sc.close();
		break;
	}
	}catch(Exception e) {}
}	
}
}
