package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
public static void main(String[] args) {
	
	// set �ߺ� �Ұ���
		// ��ü�� ��� �ʵ尡 �����ϸ� �ߺ��Ұ���
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> set = new HashSet<>();
	int count = 0;
	while(true) { // ���ѷ��� [ �������� : set ��ü�� ��ü���� 6�̸� break ]
		System.out.println("1-45 ���� ����(�ߺ� �Ұ�) : ");
		int num = sc.nextInt(); // Insert the number
		
		if(num < 1 || num > 45) { // 1 > num && 45 < num -> not save 
			System.out.println("���úҰ����� ��ȣ");
		} else { // Number Scope : 1 ~ 45 -> save
			set.add(num);
			System.out.println("Ȯ�� : " + set);
			count++;
			
		}
		if(count == 6) break; // count == 6 -> finsh
	}
}
}
