package Day12연습;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_연습1 {
	// 차량번호 분배 프로그램
		// 조건 
			// 1. 난수 0000~9999[4자리 문자] 사이의 난수 10개 생성해서 배열에 저장 
			// 2. 모든 차량 번호를 배열에 저장 
			// 3. 끝자리 번호로 홀/짝 구분
			// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장  
			// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장 
			// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] oddlist = new String[10];
		String[] evenlist = new String[10];
		
		while(true) {
			System.out.println("주차장 관리 프로그램");
			System.out.println("1. 차량 입차");
			int ch = sc.nextInt();
			for( String temp : carlist  ) {
				if( temp != null ) {
					if( Integer.parseInt(temp) % 2 == 0 ) { // 수%2==0 나머지가 0이면 짝수 
						System.out.print( temp+"[짝]  " );
					}else {			// 수%2 == 1 나머지가 1이면 홀수 
						System.out.print( temp+"[홀]  " );
					}
				}
			}
			if(ch == 1) {
				Random random = new Random();
				int carnum = random.nextInt(10000);
				String park = String.format("%04d", carnum);
				boolean save = false;
				
				for(int i = 0 ; i<carlist.length ; i++) {
					if(carlist[i] == null) {
						carlist[i] = park;
						save = true;
						break;
					}
				}
				if(save == true) {
					if(Integer.parseInt(park) % 2 == 0) { // 질문! carnum을 쓰면 왜 안되나요?? 4자리가 아닌 수가 랜덤으로 될 수 있기 때문
						for( int i = 0 ; i<evenlist.length ; i++) {
							if( evenlist[i] == null ) { evenlist[i] = park; break; }
						}
					}else {		// 수%2 == 1 나머지가 1이면 홀수 
							for( int i = 0 ; i<oddlist.length ; i++) {
								if( oddlist[i] == null ) { oddlist[i] = park; break; }
							}
						}
					}
				if( save == false )System.err.println(" 만차 [ 주차 불가 ] ");
				}
				
			}
		}
	}

