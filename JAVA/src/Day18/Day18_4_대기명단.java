package Day18;

import java.util.ArrayList;
import java.util.Scanner;

public class Day18_4_대기명단 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int 대기번호 = 0;
	ArrayList<대기> 대기자들 = new ArrayList<대기>();
	// 대기명단 프로그램
		// 메뉴 : 1. 대기 추가 2. 대기 취소 3. [관리자] 3. 대기자입장
			// 대기추가 : 인원수 입력받아 대기번호(인덱스) 반환
			// 대기취소 : 대기번호 입력받아 명단에서 취소
			// 대기자입장 : 가장 첫번째 대기중인 대기번호 호출
	try {
	while(true) {
		System.out.println(" 대기번호 \t 인원수 \t 대기예약시간");
	for(대기 temp : 대기자들) {
		if(대기자들.indexOf(temp) == 0) {System.out.println("입장!");}
		System.out.println(temp.대기번호 +"\t" +temp.인원수 + "\t"+대기자들.indexOf(temp));
	}
	System.out.println("대기명단 프로그램");
	System.out.println("1. 대기추가 2. 대기 취소 [관리자] 3. 대기자입장");
	int ch = sc.nextInt();
	if(ch == 1) {
		System.out.println("대기자 명단에 추가합니다.");
		System.out.println("전화번호를 입력해주세요"); 	String number = sc.next();
		System.out.println("인원수를 입력해주세요");
		int members = sc.nextInt();
		// 2. 3개 변수를 1개의 객체화
		대기 temp = new 대기(대기번호, number, members);
		// 3. 대기 인원들을 리스트에 저장
		대기자들.add(temp);
		대기번호++;
	}
	else if(ch == 2) {
		System.out.println("대기번호를 입력해주세요");
		int i = sc.nextInt();
		for(대기 temp : 대기자들) {
		if(temp.대기번호 == i) {
			System.out.println("대기가 취소되었습니다.");
			대기자들.remove(i);
			break; // break가 없으면 리스트 내 모든 데이터 삭제(반복문이기 때문)
		}
		}
	}
	else if(ch == 3) {
		System.out.println("가장 앞에 있는 대기명단을 입장 시킵니다."); 
		대기자들.remove(0); // 0번째 인덱스 삭제
	}
	else {}
	}
	}catch(Exception e) {}
}
}
