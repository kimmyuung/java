package 자판기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Controller extends Thread{
	
	// 모든 스레드에서 사용하기 위해 변수를 static으로 선언
	static int 자금 = 10000 ;
	static int 콜라 = 0 ;
	static int 사이다 = 0 ;
	static int 환타 = 0 ;
	static int 레드불 = 0 ;
	static long 시작시간 ; // 게임시작시 시작시간을 저장
	static int 시간차이 = 1 ; // 시간차이체크 메소드를 이용하여 게임 경과시간을 수치로 나타냄 (5초당 1씩증가)
	static int 경고횟수 = 0 ; // 게임종료조건을 만들기 위함
	static ArrayList<String> 메시지 = new ArrayList<>(); // 반복출력으로 인해 메시지 사라짐을 방지하기위해 리스트화 하여 리스트자리를 지정해놓고 출력
	static ArrayList<Rank> 랭킹 = new ArrayList<>(); // 랭킹저장 리스트
	
	public static void 메시지랭킹리셋메소드() {
		for(int i = 1 ; i <= 5 ; i++) { // 이작업을 수행하지 않을경우 게임시작시 0,1,2,3,4 인덱스에 null상태라 .get 접근연산자 사용불가
			메시지.add(0," "); 
		}
		for(int i = 1 ; i <= 10 ; i++) { // 이작업을 수행하지 않을경우 게임시작시 0,1,2,3,4 인덱스에 null상태라 .get 접근연산자 사용불가
			Rank rank = new Rank(" ", 0, " ");
			랭킹.add(rank);
		}
	}
	
	public static void 게임리셋메소드() { // 게임 종료 후 재시작전 게임설정 초기화
		자금 = 10000 ;
		콜라 = 0 ;
		사이다 = 0 ;
		환타 = 0 ;
		레드불 = 0 ;
		시간차이 = 1 ;
		경고횟수 = 0 ;
	}
	 
	 public static int 랭크판정(long 게임시간) { // 랭크판정메소드
		 for(int i = 0 ; i < 10 ; i++) {
			 if(랭킹.get(i).getPlaytime() < 게임시간) { // 랭크 리스트 0~9인덱스 값과 게임시간 비교, 5위안에 들었을 시 인덱스 반환
				 return i ;
			 }
		 }
		 return 100; // 0~4인덱스 값과 비교했을때 게임시간이 작을때 100 반환(10위 안에 못들었을 시)(꼭 100이 아니어도 됨 그냥 큰숫자넣었음) 
	 }
	 
	 public static void 랭크등록(int result, long 게임시간, String 이름, String 코멘트) { // 10위안에 들었을시 매개변수 이름과 코멘트를 받아 랭크 리스트에 저장
		 Rank rank = new Rank(이름, 게임시간, 코멘트);
		 랭킹.add(result,rank); // 랭크판정메소드로부터 얻어낸 인덱스 값에 저장
	 }
		 	 	 	 
	 public static void save() { // 랭킹 파일처리 메소드
		 try {
				FileOutputStream fileOutputStream = new FileOutputStream("D:/java/자판기.txt");
				for(int i = 0 ; i < 10 ; i++) {
					String 내보내기 = 랭킹.get(i).getName()+","+랭킹.get(i).getPlaytime()+","+랭킹.get(i).getContent()+"\n";
					fileOutputStream.write(내보내기.getBytes()); // 문자열 -> 바이트열
				}
			}
			catch(Exception e) { // 예외[오류] 처리[잡기] : Exception 클래스
			}
	 }
	 
	public static void load() { // 랭킹파일 불러오기 메소드
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/자판기.txt");
			byte[] bytes = new byte[1024]; // bit -> byte -> kb -> mb -> gb
			fileInputStream.read(bytes);
			String 파일내용 = new String(bytes); // 바이트열 -> 문자열
			String[] file = 파일내용.split("\n");		
			int i = 0 ;
			for(String temp : file) {
				if(i+1 == file.length){
					break;
				}
				String[] 필드목록 = temp.split(",");
				Rank rank = new Rank(필드목록[0], Long.parseLong(필드목록[1]), 필드목록[2]);
				랭킹.remove(i);
				랭킹.add(i,rank);
				i++;
			}				
		}
		catch(Exception e){ // catch : 예외 잡기 -> Exception 클래스의 객체에 저장
		}
	}
 
}