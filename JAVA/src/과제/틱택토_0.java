package ����;

import java.util.Random;
import java.util.Scanner;

public class ƽ����_0 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); // �Է°�ü ����
	String[] gameboard = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", 
			"[ ]", "[ ]", "[ ]" ,"[ ]"}; // �������� �迭�� ����
	
	String victory = ""; // �¸��� 
	int count = 0; //  ���� �δ� Ƚ��
	
	while(true) { // ���ѷ��� �������� : ���� ����
		
		for(int i = 0; i<gameboard.length; i++) { // 
			System.out.print(gameboard[i]);
			
			if(i%3 == 2) System.out.println();
		}
	while(true) {
		System.out.println("Location : "); 
		int location = sc.nextInt();
		if(gameboard[location].equals("[ ]")) 
		{
			gameboard[location] = "[O]"; count++;
			break;
		} else {
			System.out.println("Already here..");
			}
	}	
	while(true) { // w3s
		Random random = new Random();
		int location = random.nextInt(9);
		if(gameboard[location].equals("[ ]")) {
			gameboard[location] = "[X]"; count++; break;
			}
		} // w3 e
	for(int i = 0; i<6; i+=3) {
		if(gameboard[i].equals(gameboard[i+1]) && gameboard[i+1].equals(gameboard[i+2]))
		{
			victory = gameboard[i];
		}
	}
	
	for(int i =0; i<=2; i++) {
		if(gameboard[i].equals(gameboard[i+3]) && 
			gameboard[i+3].equals(gameboard[i+6])) 
		{
			victory = gameboard[i];
		}
	}
		
	if(gameboard[0].equals(gameboard[4]) && gameboard[4].equals(gameboard[8]))
	{
		victory = gameboard[0];
	}
	if(gameboard[2].equals(gameboard[4]) && gameboard[4].equals(gameboard[6]))
	{
		victory = gameboard[2];
	}	
	
	if(victory.equals("[O]")) {
		System.out.println("Player Win");
		break;
		}
	if(victory.equals("[X]")) {
		System.out.println("Computer Win");
		break; }
		
	if(count == 9) {
		System.out.println("Draw");
		break;
		}	
	
	} // we
	
	for(int i = 0; i<gameboard.length; i++) {
		System.out.print(gameboard[i]);
		if(i % 3 == 2) System.out.println();
	}
	
	} // me
} // ce
