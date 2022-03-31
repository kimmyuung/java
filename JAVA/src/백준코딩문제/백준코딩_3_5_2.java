package 백준코딩문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준코딩_3_5_2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	int j = Integer.parseInt(bufferedReader.readLine());
	bufferedReader.close();
	
	int x = 1;
	while(x <= j) {
		System.out.println(x);
		x++;
	}
}
}
