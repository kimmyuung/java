package ���ΰ�������;


import java.util.Random;
import java.util.Scanner;

public class ���ӱ���Ʈ�ѷ� {
// 1. �ʵ�
int score; // ���ӿ��� ����� ���� 
String name; // ���ӱ⸦ ����ϴ� ���� �̸�

static Scanner sc = new Scanner(System.in);
// ���� ����� ���� �迭�̳� ����Ʈ�� �ʿ��ҵ�...

void ƽ����() {
	String[] board = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", 
						"[ ]", "[ ]", "[ ]"};
	String �¸��� = "";
	int cv = 0;		int pv = 0;		int game = 0;
	int count = 0;
	while(true) {
	for(int i = 0; i < board.length; i++) {
		System.out.print(board[i]);
		if(i % 3 == 2) System.out.println();
	}
	System.out.println("���� �� ��ġ�� �Է��ϼ���.");
	int ch = sc.nextInt();
	
	if(board[ch].equals("[ ]")) {
		System.out.println("���� �ξ����ϴ�.");
		board[ch] = "[O]"; count++;
		}
	
	Random random = new Random();
	int com = random.nextInt(9)+1;
	
	if(board[com].equals("[ ]") ) {
		System.out.println("��ǻ�Ͱ� ���� �ξ����ϴ�.");
		board[com] = "[X]";
		count++;
		}
	// �¸�����
	// �й�����
	// ���º�����
	// �¸� ī��Ʈ
	// ���� ����� �÷��̾ �̱���� ƽ���� ������ ��ȯ
	}
	
}
void ���شٿ�() {}
void ���� () {}
void �뷡���߱� () {}
void ���ھ߱� () {}
}
