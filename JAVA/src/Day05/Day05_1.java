package Day05;

public class Day05_1 { // c  s
 public static void main(String[] args) { // m  s
	 // 변수 : 하나의 데이터 저장
	 // 배열 : 동일한 자료형 데이터 특정기준[인덱스]
	 // 1차원 배열 : 길이
	 	// 형태 : 자료형[] 배열명 = new 자료형[길이];
	 	// ex) : int [] arr1 = new int[3]; -> int int int -> int 형 변수 3개 저장 가능
	 // 2차원 배열 : 가로길이 세로길이 => 좀 더 효율적으로 자료 저장이 가능
	 	// 형태 : 자료형 [] [] 배열명 = new 자료형[가로=행][세로=열];
	 	// ex) : int [][] arr2 = new int[3][3]; 
	 	// int int int
	 	// int int int
	 	// int int int  => 총 9개
	 
	 
	 // 3차원 배열 : 가로길이 세로길이 높이길이
	 	// 형태 : 자료형 [][][] 배열명 = new 자료형 [가로=행][세로=열][높이]
	
	 // 예제1) 1차원 
	 int[] 배열 = new int[3]; // int : 4바이트 -> 12바이트 배열
	 배열[0] = 80; 	배열[1] = 90;		배열[2] = 100;
	 // 0번 인덱스에 80데이터 대입
	 int [] [] 배열2 = new int[2][3]; // 가로 = 행, 세로 = 열 -> 4바이트 *2 *3 = 24바이트 배열
	 배열2[0][0] = 80; // [0,0] [0,1] [0,2] => 0, 0인덱스에 대입
	 배열2[0][1] = 90; // [1,0] [1,1] [1,2]
	 배열2[0][2] = 100;	배열2[1][0] = 40;		배열2[1][1] = 50;		배열2[1][2] = 60;
	 
	
	 System.out.println(" 1차원 배열 : " + 배열);
	 System.out.println(" 2차원 배열 : " + 배열2);
	// 인덱스 없이 배열명만 호출시 [메모리] 주소값 출력
	 System.out.println("1차원 배열 길이 : " + 배열.length); // 배열의 길이
	 System.out.println("2차원 배열 길이 : " + 배열2.length); // 2차원배열의 행 길이
	 System.out.println("2차원 배열 열 길이 : " + 배열2[0].length); // 2차원배열의 열 길이
	 
	 // 예2 반복문을 이용한 0-49까지 첫번째 행에 저장 // 50-99까지 두번째 행에 저장하는 2차원 배열 선언
	 
	 int 배열3 [] [] = new int [2][50]; // int = 4바이트 * 2 * 50 = 400바이트 
	 for(int i = 0; i<100; i++) {
	// i는 0부터 100미만까지 1씩증가 실행 반복처리 => 100회	 
		 
		if( i < 50 ) 배열3 [0][i] = i; 
			// [0] : 첫번째 행번호, [i] + i번째 열번호
			// 인덱스가 50인데 저장이 많아져 오류 발생  -> if 사용
		else 배열3[1][i-50] = i; 
			// i가 100바퀴 돌기때문에 배열은 50으로 제한을 둬서 51을 저장하지 못함
			// [1] : 두번째 행번호, [i] = i번째 열번호
	 }
	 // 출력 반복문
	 for(int i = 0 ; i<100 ; i++) {
		 if(i<50) System.out.printf("%3d", 배열3[0][i]); 
		 // %d : 정수, %f : 실수, %.2f : 소수점 둘째자리, %2d : 양수의 자리수 -> 단, 데이터 없으면 공백
		 // %3d = 3자릿수로 표현 => 1 -> 001으로 표현
		 // %3.2f : 3자릿수로 표현 + 소수점 2자리까지 표현 ex) 3.052 -> 003.05
		 else System.out.printf("%3d",배열3[1][i-50]); // 2번째 행 출력
		 
		 // 행 구분
		 if(i == 49) System.out.println(); // i가 행의 끝에 도달하면 줄바꿈 출력
	 }
	 
	 
	 
	
 } // m  e
} // c  e
