package Day13;

import java.util.Random;

public class Day13_1
{
public static void main(String[] args)
	{
	// p. 534 : math 클래스 [ 수학 관련 메소드 제공 ] 객체없이 사용가능
	// 1. 절대값 : Math.abs
	System.out.println("절대값 : " + Math.abs(-5));
	System.out.println("절대값 : " + Math.abs(-3.14));
	// 2. 올림 : Math.ceil
	System.out.println("올림값 : " + Math.ceil(5.3)); // 소수점 첫째자리에서 올림
	System.out.println("올림값 : " + Math.ceil(-5.3)); // 올림이니까 더 큰숫자로 올려야 함
	// 3. 내림 : Math.floor
	System.out.println("버림값 : " + Math.floor(5.3)); // 소수점 첫째자리에서 내림
	System.out.println("버림값 : " + Math.floor(-5.3)); // 버림이니까 더 작은숫자로 가야 함
	// 4. 최댓값 : Math.max(숫자1, 숫자2)
	System.out.println("최댓값 : " + Math.max(5, 9)); // 9
	System.out.println("최댓값 : " + Math.max(5.3, 2.5)); // 5.3
	// 5. 최솟값 : Math.min(숫자1, 숫자2)
	System.out.println("최댓값 : " + Math.min(5, 9)); // 5
	System.out.println("최댓값 : " + Math.min(5.3, 2.5)); // 2.5
	// 6. 난수 : 0 ~ 1 사이의 난수 발생 (소수로 난수 발생)
	System.out.println("난수 : " + Math.random() ); // 0 ~ 1 사이의 난수 발생 (소수로 난수 발생)
	// vs
	Random random = new Random(); 	random.nextInt();
	// 입력
	// 1. System. in . read() : 바이트열[배열] -> 형변환을 직접해야 함 
	// 2. Scanner 클래스 : 바이트열[객체] -> next, nextInt..
	// Math.random() : 0~1 형변환을 직접해야 함
	// Random 클래스 : 형변환 직접 안해도 됨
	
	// 7. 가까운 정수의 실수값 : Math.rint(숫자) == 반올림
	System.out.println("가까운 정수의 실수값 : " + Math.rint(5.3)); // 5.0 --> Math.rint : 반올림
	System.out.println("가까운 정수의 실수값 : " + Math.rint(5.7)); // 6.0
	
	// 8. 가까운 정수의 정수값 : Math.rint(숫자) == 반올림
	System.out.println("가까운 정수의 정수값 : " + Math.round(5.3)); // 5 ---> 정수로 출력
	System.out.println("가까운 정수의 정수값 : " + Math.rint(5.7)); // 6
	// 9. 특정 소수점 위치에서 반올림[ round[] : 소수점 첫째자리에서 반올림 ] 
	double value = 12.3456; // 소수 셋째자리에서 반올림
	double temp1 = value * 100; // 12.3456 -> 1234.56으로 옮겨 반올림 실행
	long temp2 = Math.round(temp1);
	double value16 = temp2 / 100.0; // temp2 / 100 으로 입력하는 경우 1ong / int가 됨
				// temp2 / 100.0 => long / double -> 기본실수형 : double이 됨
	System.out.println("value 16 : " + value16);
	System.out.println("0-1 사이의 실수형 : " + Math.random()); 	// 0 ~ 1 
	System.out.println(Math.random() * 6 );						// 0 ~ 6
	System.out.println(Math.random() * 6 +1);					// 1 ~ 7
	int num = (int)(Math.random() * 6 )+ 1;						// (0 < num < 6(안나옴) = 0 ~ 5) +1 => 1 ~ 6(나옴) 
			// double -> int형 변환시 소수점 다 짤리게 됨
	System.out.println(num);
	
	}
}
