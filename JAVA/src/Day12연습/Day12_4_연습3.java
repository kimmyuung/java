package Day12연습;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_연습3 {
	// 차량번호 분배 프로그램
	// 조건
	// 1. 난수 0000~9999[4자리 문자] 사이의 난수 10개 생성해서 배열에 저장
	// 2. 모든 차량 번호를 배열에 저장
	// 3. 끝자리 번호로 홀/짝 구분
	// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장
	// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장
	// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 객체 선언
		String[] carlist = new String[10]; // 주차장이 10칸인 배열 선언
		String[] oddlist = new String[10]; // 홀수차
		String[] evenlist = new String[10]; // 짝수차
		while(true) { // 무한루프, 종료조건 : 프로그램종료를 눌렀을때
			System.out.println("주차 관리 프로그램");
			System.out.println("1. 입차 2. 프로그램 종료");
			for(String temp : carlist) { // 주차장에 있는 모든 차를 출력
				if(temp != null) { // 배열이 비어있지 않을 경우
					if(Integer.parseInt(temp) % 2 == 0) {System.out.println( temp + "짝수 \t");}
					else System.out.print(temp + "홀수 \t"); // 홀짝여부 판단 위해 정수로 변환하여 2로 나누고 나머지가 0이면 짝수
				}
			}
			int ch = sc.nextInt();
			if(ch == 1) { // 주차장에 차 입차
				Random random = new Random(); // 랜덤 객체 선언
				int carnum = random.nextInt(10000); // 0-9999까지의 난수중 차번호 선정
				String strnum = String.format("%04d", carnum); // 형식 변경 -> 차번호는 무조건 4자리인데 난수로 설정시 3자리수가 나올수도 있기 때문
				boolean pass = false; // 논리변수 설정
				for(int i = 0; i < carlist.length; i++) {
					if(carlist[i] == null) {  // 배열안이 비어 있으면
						carlist[i] = strnum; // 주차 성공
						pass = true; // 데이터 저장 위해 트루로 설정
						break; // 저장했으면 반복문 탈출!
					}
				}
				if(pass == true) { // 주차장에 입차가 성공했을시 홀짝여부 판단위해 조건문 설정
					if(Integer.parseInt(strnum) % 2 == 0) { // 홀짝여부 판단위해 차번호를 정수형으로 변환하여 판단
						for(int i = 0; i < evenlist.length; i++) { // 나머지가 0이면 짝수이므로 짝수열 주차장에 입차시킴
							if(evenlist[i] == null) {
								evenlist[i] = strnum;
								break;
							}
						}}
						else for(int i = 0; i < oddlist.length; i++) { // 나머지가 1이면 홀수이므로 홀수열 주차장에 입차
							if(oddlist[i] == null) {
								oddlist[i] = strnum;
								break;
							}
						}	
					
				}
				if(pass == false) {System.out.println("만차입니다.");} // 차가 총 10대 이상이되면 만차 
			}
			else if(ch == 2) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}
			else {System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");}
		}
	}
}