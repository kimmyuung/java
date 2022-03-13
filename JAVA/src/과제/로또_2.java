package 과제;

import java.util.Random;
import java.util.Scanner;

public class 로또_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int [] 사용자번호 = new int [6];
	int [] 추첨번호 = new int [6];
	
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
		for(int temp : 사용자번호) {System.out.println("사용자가 등록한 번호" + temp);}
		
		Random random = new Random();
		
		for (int i = 0; i < 추첨번호.length; i++) {
			int com = random.nextInt(45)+1;
			boolean 통과 = true;
			for(int j = 0; j<6 ; j++) { // 중복 검사
				if(com == 추첨번호[j])
				{System.out.println("번호가 중복됩니다."); i--; 통과 = false;}
			}
			if(통과 == true) {com = 추첨번호[i];}
			}
		
		for(int temp : 추첨번호) {System.out.println("컴퓨터가 추첨한 번호" + temp);}
		
		int 당첨 = 0;
		for(int i = 0; i< 사용자번호.length; i++) {
			for (int j = 0; j< 추첨번호.length; j++) {
				if(사용자번호[i] == 추첨번호[j]) {System.out.println("당첨!! \t"); 당첨++;}
				}
			}
		System.out.println("당첨된 숫자 : " + 당첨);
		
	}
}
