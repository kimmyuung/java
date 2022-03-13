package 과제;

import java.util.Random;
import java.util.Scanner;

public class 로또_5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] 사용자번호 = new int[6];
	int[] 추첨번호 = new int[6];
	
	for(int i = 0; i<6; i++) {
	System.out.println("1-45중 번호를 입력해주세요.");
	int select = scanner.nextInt();
	boolean pass = true;
	if(select > 45 || select < 0) {
		System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요");
		i--;
		pass = false;
		}
	for(int j = 0; j < 6; j++) {
		if(select == 사용자번호[j]) {
			System.out.println("숫자가 중복됩니다. 다시 입력해주세요"); i--; pass = false;
				}
			}
	if(pass == true) {사용자번호[i] = select;}	
		}
	
	for(int i = 0; i<6; i++) {
		Random random = new Random();
		int select = random.nextInt(45)+1;
		boolean pass = true;
		if(select > 45 || select < 0) {
			i--;
			pass = false;
			}
		for(int j = 0; j < 6; j++) {
			if(select == 추첨번호[j]) {
			i--; pass = false;
					}
				}
		if(pass == true) {추첨번호[i] = select;}	
			}
	System.out.println("사용자가 입력한 번호 : ");
	for(int temp : 사용자번호) {
		System.out.print(temp +"\t");
	}
	System.out.println("\n컴퓨터가 추첨한 번호 : ");
	for(int temp : 추첨번호) {
		System.out.print(temp + "\t");
	}
	int same = 0;
	for(int same1 : 사용자번호) {
		for(int same2 : 추첨번호) {
			if(same1 == same2) {same++;}
		}
	}
	System.out.println("당첨된 번호의 갯수는 " + same + "개입니다.");
	
	
	
	}
}
