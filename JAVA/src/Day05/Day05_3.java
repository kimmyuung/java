package Day05;

import java.util.Scanner;

public class Day05_3 { // c  s
public static void main(String[] args) { // m  s
	
	// p. 181
	// 배열 = {1행}, {2행}, {3행} => 3 // { 78 83 93 87 88} => 5
	// 7.
	int max = 0;
	int[] array = {1, 5, 3, 8, 2}; // 배열의 선언과 초기화
	
	for(int i = 0; i<array.length; i++) {
		if(max <array[i] ) 
			max = array[i]; // max보다 i번째 인덱스의 값이 더 크면 max에 i번째 값 대입
		
		}
	System.out.println("max : " + max);
	
	// 8.
	int [][] array1 = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
	int sum = 0;
	double avg = 0.0;
	int count = 0; // 점수의 개수 [칸 개수]
	
	// 풀이 (2차원 배열내 모든 데이터 호출)
	for(int i = 0; i < array1.length; i++) { 
		// 행은 0부터 행길이[3]미만까지 1씩증가
		for(int j = 0; j<array1[i].length; j++) 
			{ // 열은 0부터 배열의 열길이 [2, 3, 5] 미만까지 1씩증가
			sum += array1[i][j]; // 합 저장
			}
		count += array1[i].length; // 열길이의 누적합계
		}
	avg = (double)sum / count;
	
	System.out.println(" sum : " + sum);
	System.out.println(" avg : " + avg);
	
	// 9.
	boolean run = true;
	int studentnum = 0; // 학생 수 변수
	int[] scores = null; // 점수 배열 선언 -> 메모리 할당 X
	Scanner scanner = new Scanner(System.in);
		while(run) { // w1  s
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수\t 2. 점수입력 \t 3. 점수리스트 \t 4. 분석\t 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.println(">>>>>>> 선택 : "); int select1 = scanner.nextInt();
			
			if(select1 == 1) { // 학생 수 입력
			System.out.println("학생 수를 입력해주세요");
			studentnum = scanner.nextInt(); 
			// 입력받은 수 만큼 학생 수의 배열을 선언해야 함 = 입력받은 학생수 만큼 배열길이를 변경해야 함
			scores = new int[studentnum];
			System.out.println("학생 수 : " + studentnum);
			}
			else if(select1 == 2) { // 점수 입력
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : ", i);
					scores[i] = scanner.nextInt(); // 입력받아 i번째 인덱스에 저장
				}	
			}
			else if(select1 == 3) { // 점수 출력
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]); // i번째 인덱스 출력
				}
			}	
			else if(select1 == 4) { // 점수 분석
				int highscore = 0;
				int sum1 = 0;
				double avg1 = 0.0;
				for(int i = 0; i<scores.length; i++) {
					// 최고점수 구하기
					if(max < scores[i]) max = scores[i]; // i번째 인덱스에 데이터 대입
					// 평균점수 구하기
					sum1 += scores[i];	
				}
				avg = sum1 / scores.length;
				System.out.println("최고 점수 : " + highscore);
				System.out.println("평균 점수 : " + avg1);
				
			}
			else if(select1 == 5) {
				run = false; // = break;
			}
			else System.out.println("알림)) 알 수 없는 번호입니다. 재입력을 해주세요");
		} // w1 e
	
	} // m  e 
} // c  e
