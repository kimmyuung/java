package Day12연습;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_연습2 {
	// 차량번호 분배 프로그램
	// 조건
	// 1. 난수 0000~9999[4자리 문자] 사이의 난수 10개 생성해서 배열에 저장
	// 2. 모든 차량 번호를 배열에 저장
	// 3. 끝자리 번호로 홀/짝 구분
	// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장
	// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장
	// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] oddlist = new String[10];
		String[] evenlist = new String[10];
		while (true) {
			System.out.println("차량 주차 프로그램");
			System.out.println("1. 차량 입차 2. 프로그램 종료");
			for (String temp : carlist) {
				if (temp != null) {
					if (Integer.parseInt(temp) % 2 == 0) {
						System.out.println(temp + " 짝수번호 차");
					} else
						System.out.println(temp + "홀수번호 차");
				}
			}
				int ch = sc.nextInt();
				if(ch == 1) {
					Random random = new Random();
					int carnum = random.nextInt(10000);
					String park = String.format("%04d", carnum);
					boolean pass = false;
					for(int i = 0; i < carlist.length; i++) {
						if(carlist[i] == null) {
							carlist[i] = park;
							pass = true;
							break;
						}
					}
					if(pass) {
						if(carnum % 2 == 0) {
							for(int i = 0; i < evenlist.length; i++) {
								if(evenlist[i] == null) {
									evenlist[i] = park;
									break;
								} 
								}
						}
								else {
									for(int i = 0; i < oddlist.length; i++) {
										if(oddlist[i] == null) {
											oddlist[i] = park;
											break;
										}
									}
								}
							
						
					}
					if(pass= false) {System.out.println("만차");}
				}
				else if(ch == 2) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break;
				}
				else System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
		} // we	
	} // me
} // ce
	