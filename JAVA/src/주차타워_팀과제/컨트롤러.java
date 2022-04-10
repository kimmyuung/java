package 주차타워_팀과제;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
// 주차요금 : 10분당 1000원 => 1분당 100원
// 처음 30분은 무료, 24시간 이상 주차시 5만원
public class 컨트롤러 {

static ArrayList<Car> carlist = new ArrayList<>();
static String[] parktower;
public static ArrayList<매출> 총매출저장리스트 = new ArrayList<>();
String[] 주차타워건설 (int park) {
	parktower = new String[park];
	for(int i = 0; i < park; i++) {
		if(parktower[i] == null) {
		parktower[i] = "[ ]";
		}
	}
	return parktower;
}
boolean 입차 (String Carnum, int location) {
	LocalDateTime sdt = LocalDateTime.now();
	for(int i = 0; i < parktower.length; i++) {
		if(parktower[location].equals("[o]")) {
		return false;
		}
	}
	
	for(int i = 0; i < parktower.length; i++) {
		if(parktower[i] != null && parktower[location].equals("[ ]")) {
		parktower[location] = "[o]";
		}
	}
	for(Car temp : carlist) {
		if(temp.get차번호().equals(Carnum)) {
			return false;
		}
	}
	Car myCar = new Car(Carnum, sdt, null);
	carlist.add(myCar);
	
	return true;
}
boolean 출차 (String carNum) {
	for(Car temp : carlist) { // 유효성 검사
		if(!temp.get차번호().equals(carNum)) {
			return false;
		}
	}
	for(int i = 0; i < parktower.length; i++) { // 주차 가능 상태로 바꾸기
		if(parktower[i].equals("[o]")) {
		parktower[i] = "[ ]";
		}
	}
	return true;
}
int 계산 () {
	LocalDateTime edt = LocalDateTime.now();
	for(Car temp : carlist) {
	long 주차시간 = ChronoUnit.MINUTES.between(temp.get입차시간(), edt);
	String 주차 = String.valueOf(주차시간);
	int 주차분 = Integer.parseInt(주차);
	if(주차분 < 30) {int 주차금액 = 0; return 주차금액;}
	else if(주차분 > 30) {주차분 -= 30; int 주차금액 = 주차분 * 100; return 주차금액;}
	if(주차분 > 1440) {int 주차금액 = 50000; return 주차금액;}
	}
	return 0;
}
//연월일을 자체적으로 찍은 뒤 인수로 받은 정산금과 같이 리스트에 저장하는 메서드
		public void 정산금누적(int 정산금) {
			int 매출금액 = 정산금;
			Date date = new Date();
			SimpleDateFormat dateformat = new SimpleDateFormat("yy년");
			String 연도 = dateformat.format(date);
			dateformat = new SimpleDateFormat("M월");	// 03월 : 3월, 12월 : 12월
			String 월 = dateformat.format(date);
			dateformat = new SimpleDateFormat("d일");
			String 날짜 = dateformat.format(date);
			매출 정산금누적 = new 매출(매출금액, 날짜, 월, 연도);
			총매출저장리스트.add(정산금누적);
			매출파일저장();
		}
		
		// 콘솔에서 입력받은 연도와 월을 바탕으로 일일 매출내역을 ArrayList로 리턴
		public ArrayList<매출> 매출출력(int 연도, int 월, int 정렬기준) {
			
			ArrayList<매출> 일일매출 = new ArrayList<>();
			
			String 찾을연도 = 연도+"년";	
			String 찾을달 = 월+"월";	
			
			// 1. 모든 날짜의 매출금액이 있는 총매출저장리스트에서 입력받은 연, 월의 매출만 쭉 빼와서 일일매출 리스트에 금액과 날짜 저장 
			for(매출 tmp : 총매출저장리스트) {	
				if(tmp.get연도().contains(찾을연도) && tmp.get월().contains(찾을달)) {	
					매출 임시객체 = new 매출(tmp.get매출금액(), tmp.get날짜());
					일일매출.add(임시객체);
				}
			}
			
			// 2. 윗쪽 반복문에서 만든 일일매출 리스트에서 같은 날짜는 한곳에 더한뒤, 나머지는 0원 처리함.
			for(int i=0; i<일일매출.size(); i++) {
				String tmp;
				int 임시매출누적=0;
				tmp = 일일매출.get(i).get날짜();
				for(int j=i; j<일일매출.size(); j++) {
					if(tmp.equals(일일매출.get(j).get날짜())) {
						임시매출누적 += 일일매출.get(j).get매출금액();
						일일매출.get(j).set매출금액(0);
					}
				}
				일일매출.get(i).set매출금액(임시매출누적);
			}
			
			// 3. 0원 처리된 인덱스들 삭제하는 반복문
			for(int i=0; i<일일매출.size(); i++){	
				if(일일매출.get(i).get매출금액()==0) {	// 일일매출의 가장 끝 인덱스부터 0원인지 확인
					일일매출.remove(i);
					i-=1;	// 현재 인덱스 뒤의 값이 자동으로 �保仄 때문에 �保 값이 0인지 다시한번 확인해야함. 같은인덱스 다시한번 검사하기 위해 i= -1
				}
			}
			// 4-1 사용자가 일자 기준으로 정렬 선택시 일자 오름차순 정렬
			if(정렬기준==1) {	
				매출 순서변경용임시배열 = new 매출();
				int indexCount1=0;
				for(매출 tmp : 일일매출) {
					int indexCount2=0;
					for (매출 tmp2 : 일일매출) {
						if(Integer.parseInt(tmp.get날짜().replace("일", "")) < Integer.parseInt(tmp2.get날짜().replace("일", ""))) {
							순서변경용임시배열 = 일일매출.get(indexCount1);
							일일매출.set(indexCount1, 일일매출.get(indexCount2));
							일일매출.set(indexCount2, 순서변경용임시배열);
						}
						indexCount2++;
					}
					indexCount1++;
				}
			}
			else {
				매출 순서변경용임시배열 = new 매출();
				int indexCount1=0;
				for(매출 tmp : 일일매출) {
					int indexCount2=0;
					for (매출 tmp2 : 일일매출) {
						if(tmp.get매출금액()<tmp2.get매출금액()) {
							순서변경용임시배열 = 일일매출.get(indexCount1);
							일일매출.set(indexCount1, 일일매출.get(indexCount2));
							일일매출.set(indexCount2, 순서변경용임시배열);
						}
						indexCount2++;
					}
					indexCount1++;
				}
			}
			return 일일매출;
		}	// 매출출력 END
		
		// txt파일에서 java로 읽어들이는 메서드
		public void 매출파일로딩() {
			try {	// FileInputStream 때문에 일반예외 발생
				FileInputStream fileInputStream = new FileInputStream("D:/java/주차장매출.txt");
				byte[] 임시바이트배열 = new byte[65536];	// 넉넉하게 32KB짜리 임시저장용 바이트형 배열 선언
				fileInputStream.read(임시바이트배열);	// 주차장매출.txt 파일 읽어들인 다음 바이트형 배열에 저장
				String 파일내용 = new String(임시바이트배열);	// 바이트배열-> 문자열로 이동
				
				String[] 파일내용배열 = 파일내용.split("\n");	
				
				for(String tmp : 파일내용배열) {
					String[] 임시배열 = tmp.split(",");
						매출 매출 = new 매출(Integer.parseInt(임시배열[0]), 임시배열[1], 임시배열[2], 임시배열[3]);
						총매출저장리스트.add(매출);	// 총매출저장리스트 리스트에 저장.
				}
			} catch (Exception e) { }
		}	// 매출파일로딩 메서드 END
		
		// java에서 txt파일로 내보내는 메서드
		public void 매출파일저장() {
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("D:/java/주차장매출.txt");	// 1. 파일 출력 객체 생성
				for(매출 tmp : 총매출저장리스트) {
					String 저장파일에들어갈문자열 = tmp.get매출금액() + "," + tmp.get날짜() + "," + tmp.get월() + "," + tmp.get연도() + "\n";
					fileOutputStream.write(저장파일에들어갈문자열.getBytes());
				}
			}catch(Exception e) { }
			
		}	// 매출파일저장 END
}
