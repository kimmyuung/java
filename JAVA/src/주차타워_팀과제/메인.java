package 주차타워_팀과제;

import java.util.Scanner;

public class 메인 {
	public static void main(String[] args) {
		컨트롤러 con = new 컨트롤러();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n주차타워 프로그램(관리자)");
			System.out.println("1. 주차타워 짓기 2. 입차 3. 출차 4. 매출확인 5. 프로그램 종료");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("주차타워를 건설합니다.");
				System.out.println("주차장 크기를 입력해주세요");
				System.out.println("1층에 주차장은 5개까지 건설이 가능합니다.");
				int park = sc.nextInt();
				con.주차타워건설(park);
				for (int i = 0; i < con.parktower.length; i++) {
					System.out.print(con.parktower[i] + "\t");
					if (i % 5 == 4) {
						System.out.println();
					}
				}
			} else if (ch == 2) {

				System.out.println("입차를 시작합니다.");
				System.out.print("차량번호를 입력해주세요 : "); String Carnum = sc.next();
				for (int i = 1; i <= con.parktower.length; i++) {
					System.out.print("[" + i + "]" + "\t");
					if (i % 5 == 0) {
						System.out.println();
					}
				}
				System.out.println("\n주차할 위치를 선택해주세요");
				int location = sc.nextInt();
				boolean result = con.입차(Carnum, location - 1);
				if (result) {
					for (int i = 0; i < con.parktower.length; i++) {
						System.out.print(con.parktower[i] + "\t");
						if (i % 5 == 4) {
							System.out.println();
						}
					}
					System.out.println("주차 완료!");
				}
				else System.out.println("[[주차 실패 : 주차 자리에 차가 있거나 차량번호가 중복됩니다]]");
			} else if (ch == 3) {
				System.out.println("출차할 차량 번호를 입력하세요"); String carNum = sc.next();
				boolean result = con.출차(carNum);
				if(result) {
					System.out.println("출차에 성공하였습니다.");
					System.out.println("주차요금 : ");
				}
				else System.out.println("[[출차 실패 : 해당 차량 번호가 주차장 내에 존재하지 않습니다]]");
			} else if (ch == 4) {
				
			} else if (ch == 5) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
		}
	}
}
