package 과제;

import java.util.Random;
import java.util.Scanner;

public class 로또_3 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int[] 사용자번호 = new int [6];
	int[] 추첨번호 = new int [6];
	
	for(int i = 0; i<6; i++) {
		System.out.println("1-45 까지의 숫자 중 원하는 숫자를 입력하세요");
		int select = scanner.nextInt();
		boolean pass = true;
		if(select < 0 || select > 45) { // 유효성 검사
			System.out.println("숫자의 범위를 초과하였습니다. 다시 입력해주세요");
			i--; 
			pass = false;
		}
		for(int j = 0; j<6 ; j++) { // 중복 검사
			if(select == 사용자번호[j])
			{System.out.println("번호가 중복됩니다."); i--; pass = false;}
		}
		if(pass == true) {사용자번호[i] = select;} }
		for(int temp : 사용자번호)
			{
		System.out.println("사용자가 추첨한 번호 : " + temp);
			}
			
		
		Random random = new Random();
		for(int i = 0; i<6; i++) { // 컴퓨터 난수 발생
			int com = random.nextInt(45)+1;
			boolean pass = true;
			if(com < 0 || com > 45) { // 유효성 검사
				i--; 
				pass = false;
			}
			for(int j = 0; j<6 ; j++) { // 중복 검사
				if(com == 추첨번호[j])
				{System.out.println("번호가 중복됩니다."); i--; pass = false;}
				}	
			if(pass == true) {추첨번호[i] = com;}
			}
		for(int temp : 추첨번호)
		{
			System.out.println("컴퓨터가 추첨한 번호 : " + temp);
		}
		int 동일수 = 0;
		for (int 비교기준 : 사용자번호) {
			for(int 비교대상 : 추첨번호)
				if(비교기준 == 비교대상) {
					System.out.println("당첨되었습니다.");
					동일수++;
					}
		}
	System.out.println("당첨 번호가 맞은 횟수는 " + 동일수);
	}
}
