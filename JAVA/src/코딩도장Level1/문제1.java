package 코딩도장Level1;

public class 문제1 { // c  s
public static void main(String[] args) { // m  s

// 문제1. 10미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9이다.
	// 이들의 총합은 23이다.
	// 1000미만의 자연수에서 3,5 배수의 총합을 구하라
	int sum = 0; // 합을 지정
for(int i = 1; i <1000; i++) 
		{ // for1 s
	if(i % 3 == 0 || i % 5 ==0) {
		sum += i;
			}

		} // for1 e
System.out.println("1000미만의 자연수에서 3, 5 배수의 합은 : " + sum);	
	} // m  e
} // c  e
