package Day14_����;

import java.util.Scanner;

import Day14.Sound;
import Day14.Video;

public class Day14_����1 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		boolean soundsw = true; // ���� �Ҹ� ��� ���� 
		boolean moviesw = true; // ���� ���� ��� ����
		while(true) {
			System.out.print("1.�Ҹ���� 2.������� : ");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) { // 1
				
				Sound sound = new Sound(); // ��ü ����
				
				if( soundsw ) { // �Ҹ� ��� 
					sound.soundstop( true ); // �Ҹ� ���� 
					sound.start(); // ������ ���� 
					// sound.stop = false; // �Ҹ�����
						// stop �ʵ忡 ���� ����� -> �ٷ� ����
					soundsw = false; // ������ ���� ��� 
				}
				else {
					sound.soundstop( false ); // �Ҹ� ����
					// sound.stop = true; // �Ҹ���� 
					soundsw = true; // �������� ���� ���
				}
			}
			else if( ch == 2 ) {
				Video movie = new Video();
				if( moviesw ) {
					movie.moviestop(true); // ���� ���� 
					movie.start(); // ������ ���� 
					moviesw = false; // ���� ���� 
				}
				else {
					movie.moviestop(false); // ���� ����
					moviesw = true; // ���� ���� 
				}
			}
		}
	}
}
