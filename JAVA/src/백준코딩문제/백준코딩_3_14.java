package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_14 {
	
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	 
			int x = in.nextInt();
			in.close();
	        
			int cnt = 0;
			int copy = x;
	        
			while (true) {
				x = ((x % 10) * 10) + (((x / 10) + (x % 10)) % 10);
				cnt++;
	 
				if (copy == x) {
					break;
				}
			}
			System.out.println(cnt);
		
	}
	
}
