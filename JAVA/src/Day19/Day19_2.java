package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
public static void main(String[] args) {
	
	// set 중복 불가능
		// 객체내 모든 필드가 동일하면 중복불가능
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> set = new HashSet<>();
	int count = 0;
	while(true) { // 무한루프 [ 종료조건 : set 객체내 객체수가 6이면 break ]
		System.out.println("1-45 숫자 선택(중복 불가) : ");
		int num = sc.nextInt(); // Insert the number
		
		if(num < 1 || num > 45) { // 1 > num && 45 < num -> not save 
			System.out.println("선택불가능한 번호");
		} else { // Number Scope : 1 ~ 45 -> save
			set.add(num);
			System.out.println("확인 : " + set);
			count++;
			
		}
		if(count == 6) break; // count == 6 -> finsh
	}
}
}
