package 백준코딩문제;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준코딩_4_1 {
	
	
	 
		public static void main(String[] args) throws IOException {
	    
			Scanner in = new Scanner(System.in);
	        
			int N = in.nextInt();
			int[] arr = new int[N];
	        
			for (int i = 0; i < N; i++) {
				arr[i] = in.nextInt();
			}
	        
			in.close();
			Arrays.sort(arr); // 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드
			System.out.print(arr[0] + " " + arr[N - 1]);
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			int X = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int index = 0;
			int[] arr1 = new int[X];
			while(st.hasMoreTokens()) {
				arr1[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			Arrays.sort(arr);
			System.out.print(arr[0] + " " + arr[X - 1]);
			
			
		}
}
