package 과제;

import java.util.Random;
import java.util.Scanner;

public class 로또_4 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int[] user = new int[6];
	int[] com = new int[6];
	
	for(int i = 0; i<6; i++) {
		System.out.println("Insert the number(1-45)");
		int select = scanner.nextInt();
		boolean pass = true;
		if(select > 45 || select < 0) {
			System.out.println("Error! try again");
			i--;
			pass = false;
		}
		for(int j = 0; j < 6; j++) { //?
			if(select == user[j] )
			{	System.out.println("You have same number. Try again please");
				i--;
				pass = false;	}
		}
		if (pass == true) {user[i] = select;}
	}
	System.out.println("User choice : ");
	
	for(int i = 0; i < 6; i++) {
		Random random = new Random();
		int select1 = random.nextInt(45)+1;
		boolean pass = true;
		if(select1 > 45 || select1 < 0) {
			i--;
			pass = false;
		}
		for(int j = 0; j < 6; j++) {
			if(select1 == com[j]){	//?
				i--;
				pass = false;}
			}
		if (pass == true) {select1= com[i];}
	}
	System.out.print("Computer Choice : ");
	
	int same = 0;
	for(int same1 : user) {
		for(int same2 : com) {
			if(same1 == same2) {System.out.print("Good!"); same++;}
		}			
	}
	System.out.println("Rotto Succes number's :" + same);
	
	}
}
