package 과제;

import java.util.Scanner;

public class 개인과제_달팽이는올라가고싶다 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	System.out.println("땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.\r\n"
			+ "\r\n"
			+ "달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.");
	
	
	
	System.out.println("달팽이는 몇 미터를 올라갈 수 있나요");
	int up = sc.nextInt();
	
	System.out.println("달팽이는 몇 미터를 미끄러지나요");
	int down = sc.nextInt();
	System.out.println("나무의 총 높이를 입력하세요.");
	int high = sc.nextInt();
	
	System.out.println("총 높이  :" + high );
	System.out.println("달팽이가 올라갈 수 있는 높이 : " + up);
	System.out.println("달팽이가 미끄러지는 높이 : " + down);
	
	int sum = up - down; // 달팽이가 하루에 올라간 거리
	int total = high / sum; // 달팽이가 올라가는데 걸리는 요일
	
	System.out.println("달팽이가 올라가는데 걸리는 시간" + total + " 일");
	
}
}
