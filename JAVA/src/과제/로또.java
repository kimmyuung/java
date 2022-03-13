package 과제;

import java.util.Random;
import java.util.Scanner;

public class 로또 {
public static void main(String[] args) {
	
	// 준비
			int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호 목록 
			int[] 추첨번호 = new int[6];	// 컴퓨터가 난수 번호 목록
			Scanner scanner = new Scanner(System.in);
			
			// 1. 사용자에게 입력받기 
			for( int i = 0 ; i<6 ; i++ ) {
				// i는 0부터 5까지 1씩증가반복 => 6회반복
				System.out.print(" 1~45 사이 입력 : "); 
				int 번호 = scanner.nextInt(); // 사용자로부터 로또 번호를 입력받음
				
				boolean 통과 = true; // 저장 되는 조건 변수
				
				// 조건1 : 유효성검사 
				if( 번호 < 1 || 번호 > 45 ) { // 1보다 작거나 45보다 크면 선택할수 없는 번호입력시 재입력 
					System.out.println(" 알림)) 선택할수 없는 번호 입니다.[재입력] ");
					i--; // 현재 i는 정상입력x
					통과 = false; // 저장 x 
				}// if end 
				
				// 조건2 : 중복체크 
				for( int j = 0 ; j<6 ; j++ ) {
					if( 번호 == 사용자번호[j] ) {
						// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
						System.out.println(" 알림)) 이미 선택한 번호 입니다.[재입력]");
						i--; // 현재 i는 정상입력x
						통과 = false; // 저장x
					} // if end 
				} // for2 end 
				// 정상입력[통과가 true] 이면 배열에 저장하기 
				if( 통과 == true) 사용자번호[i] = 번호;
				
			} // for end 
			
			System.out.print("\n사용자가 선택한 번호 : ");
			// * 사용자 배열내 모든 인덱스 출력 
			for( int temp : 사용자번호 ) {
				System.out.print( temp +"\t");
			}
			
			// 2. 컴퓨터가 난수생성 
			for( int i =0 ; i<6 ; i++) {
				Random random = new Random(); // 1. 난수객체
				int 추첨 = random.nextInt(45)+1; // 2. 난수를 int형으로 1~45 사이 난수 가져오기
				// 조건1 : 중복체크
				boolean 통과 = true;
				for( int temp : 추첨번호 ) {
					if( 추첨 == temp ) {
						i--; // 중복이 있을경우 현재 i 예외
						통과 = false; // 저장 x 
					}
				}
				if( 통과 ) 추첨번호[i] = 추첨;
			}
			System.out.print("\n \t추첨번호\t: ");
			// * 배열내 모든 인덱스 출력 
			for( int temp : 추첨번호 ) {
				System.out.print( temp +"\t");
			}
			
			int 동일한수 =0;

			
			// 방법2 
			for( int 비교기준 : 사용자번호 ) {
				// 사용자번호 배열내 하나씩 비교기준 대입 
				for( int 비교대상 : 추첨번호 ) {
					// 추첨번호 배열내 하나씩 비교대상 대입
					if( 비교기준 == 비교대상) 동일한수++;
					// 만약에 비교기준과 비교대상이 동일하면 동일한수 1증가
				}
			}
			
			System.out.println(" \n동일한 수 : " + 동일한수 );
		}	
	}


