package Day14;

import java.util.Scanner;

public class Day14_플레이어 {
	// 예제 1. 소리재생 2. 영상재생
	public static void main(String[] args) {
		// 예제 1. 소리재생 2. 영상재생
		// 조건 : 소리 or 영상재생시에 재 재생시 중지
		Scanner sc = new Scanner(System.in); // 입력객체
		boolean soundsw = true;
		boolean moviesw = true;
		while(true) {
		
			System.out.println("1. 소리 재생 2. 영상 재생");
			// 소리재생 / 중지, 영상 재생 / 중지
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
