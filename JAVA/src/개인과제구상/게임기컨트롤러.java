package 개인과제구상;


import java.util.Random;
import java.util.Scanner;

public class 게임기컨트롤러 {
// 1. 필드
int score; // 게임에서 기록한 점수 
String name; // 게임기를 사용하는 유저 이름

static Scanner sc = new Scanner(System.in);
// 점수 기록을 위한 배열이나 리스트가 필요할듯...

void 틱택토() {
	String[] board = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", 
						"[ ]", "[ ]", "[ ]"};
	String 승리알 = "";
	int cv = 0;		int pv = 0;		int game = 0;
	int count = 0;
	while(true) {
	for(int i = 0; i < board.length; i++) {
		System.out.print(board[i]);
		if(i % 3 == 2) System.out.println();
	}
	System.out.println("돌을 둘 위치를 입력하세요.");
	int ch = sc.nextInt();
	
	if(board[ch].equals("[ ]")) {
		System.out.println("돌을 두었습니다.");
		board[ch] = "[O]"; count++;
		}
	
	Random random = new Random();
	int com = random.nextInt(9)+1;
	
	if(board[com].equals("[ ]") ) {
		System.out.println("컴퓨터가 돌을 두었습니다.");
		board[com] = "[X]";
		count++;
		}
	// 승리조건
	// 패배조건
	// 무승부조건
	// 승리 카운트
	// 게임 종료시 플레이어가 이긴수를 틱택토 점수로 반환
	}
	
}
void 업앤다운() {}
void 블랙잭 () {}
void 노래맞추기 () {}
void 숫자야구 () {}
}
