package exam;

import java.util.Scanner;

public class exam_2
{
//	1. 성적표는 항상 출력이 되어 있도록 합니다. [ 10점 ]
//	2. 메뉴에서 1번 선택시 학생점수를 추가 합니다. [ 5점 ]
//	3. 메뉴에서 2번 선택시 학생점수를 삭제 합니다. [ 5점 ]
//	4. 데이터는 키보드로 입력받아 배열에 저장합니다. [ 5점 ]
//	5. 성적 입력은 5명으로 하되, 최대 100명 이 가능하도록 작성합니다. [ 5점 ]
//	6. 번호 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다. [ 5점 ]
//	7. 평균은 소숫점 이하 2자리까지로 합니다. [ 5점 ]
//	8. 총점을 이용하여 석차를 구합니다. [ 5점 ]
//	9. 입력 오류에 대하여 예외발생 상황에 대한 처리를 합니다. [ 5점 ]

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] members = new String[100];
		int[][] scores = new int[100][3];
		int[] total = new int[100];
		int[] ranks = new int[100]; // 석차 배열
		
		while(true) {
		try {	
		System.out.println("[[1. 학생 등록 2. 학생 삭제]]");
		System.out.println("번호" + "\t" + "이름" + "\t" + "국어"+ "\t"+ "영어"+ "\t"+ "수학" +"\t"+ "총점" +"\t"+ "평균"+ "\t"+ "석차");
		int temp = 0;
		for(int i = 0; i<members.length; i++) {
			if(members[i] != null ) {
				double avg = (scores[i][0]+scores[i][1] + scores[i][2]) / 3.0;
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",i+1, members[i], scores[i][0], 
						scores[i][1], scores[i][2], total[i], avg, ranks[i]+1 );
				}
		}
		int ch = sc.nextInt();
		
		if(ch == 1) { // if 1 s
			System.out.println("학생 이름을 입력하세요"); String name = sc.next();
			System.out.println("국어 성적을 입력하세요"); int kor = sc.nextInt();
			System.out.println("수학 성적을 입력하세요"); int math = sc.nextInt();
			System.out.println("영어 성적을 입력하세요"); int eng = sc.nextInt();
			for(int i = 0; i<members.length; i++) {
				if(members[i] == null && scores[i][0] == 0) {
				members[i] = name; 
				scores[i][0] = kor;
				scores[i][1] = math;
				scores[i][2] = eng;
				total[i] = kor + math + eng; // 총점
				ranks[i] = 1; // 등록할 때 1등으로 해줌.
				break;}
			}
			for(int i=0; i<ranks.length; i++) { // 오름차순 정렬
				for(int j=0; j<ranks.length; j++) {
					if(total[i] > total[j]) {
						temp = ranks[i]; ranks[i] = ranks[j]; ranks[j] = temp; 
					}
				}
			}
		} // if1 e
		else if(ch == 2) {
			System.out.println("학생 번호을 입력하세요"); int snum = sc.nextInt();
			for(int i = 0; i<members.length; i++) {
				if(members[i] != null && ranks[i] == snum) {
					System.out.println("학생 삭제 성공");
					members[i] = null; 
					scores[i][0] = 0;
					scores[i][1] = 0;
					scores[i][2] = 0;
					total[i] = 0;
					ranks[i] = 0;
					
				} 
			
				if(i == members.length-1) {
					members[members.length-1] = null; 	
					scores[members.length-1][0] = 0;
					scores[members.length-1][1] = 0;
					scores[members.length-1][2] = 0;
					total[members.length-1] = 0;
					ranks[members.length-1] = 0;
					break;
				} // if 1 e
				else {
					members[i] = members[i+1]; 	
					scores[i][0] = scores[i+1][0];
					scores[i][1] = scores[i+1][1];
					scores[i][2] = scores[i+1][2];
					total[i] = total[i+1];
					ranks[i] = ranks[i+1];
					break;
				}
					} // for e
		}
		else {System.out.println("잘못된 숫자를 입력하셨습니다.");}
		} catch(Exception e) {System.out.println("숫자를 입력해주세요");}
		}
} // me
} // ce
