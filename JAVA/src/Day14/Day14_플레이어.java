package Day14;

import java.util.Scanner;

public class Day14_�÷��̾� {
	// ���� 1. �Ҹ���� 2. �������
	public static void main(String[] args) {
		// ���� 1. �Ҹ���� 2. �������
		// ���� : �Ҹ� or ��������ÿ� �� ����� ����
		Scanner sc = new Scanner(System.in); // �Է°�ü
		boolean soundsw = true;
		boolean moviesw = true;
		while(true) {
		
			System.out.println("1. �Ҹ� ��� 2. ���� ���");
			// �Ҹ���� / ����, ���� ��� / ����
			int ch = sc.nextInt();
			
			if(soundsw) {
				Sound sound = new Sound();
				if(Sound.stop) {
				sound.Soundstop(true);
				sound.start();
				soundsw = false;
				//sound.stop= false;
				}
				else {
					sound.Soundstop(false);
					soundsw = true;
				}
			}
			else if (ch == 2) {
				Video video = new Video();
				if(moviesw) {
					video.Moviestop(true);
					video.start();
					moviesw = false;
				}
				else {video.Moviestop(false); moviesw = true;}
			}
			
		}
	}
}
