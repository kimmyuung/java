package 개인과제구상;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class 이젠드래프트_컨트롤러 {

	public static ArrayList<팀원> 팀원리스트 = new ArrayList<>();
	public static ArrayList<팀원> 팀원선택리스트 = new ArrayList<>();
	public static String[] 팀원시너지 = { "야자조", "구1조", "구2조", "구3조", "구4조", "구5조", "구6조", "혼자가편해요" };
	public static String[] 팀원특성 = { "냉정", "열정", "소통", "커피애호가", "만능", "애연가", "노력가", "부관", "이타적", "독보적" };
	public static ArrayList<점수> 점수리스트 = new ArrayList<>();
	

	String 팀원뽑기() {
		Random random = new Random();
		int index = random.nextInt(팀원리스트.size());
		for (팀원 temp : 팀원리스트) {
			String 뽑힌팀원 = 팀원리스트.get(index).get팀원이름();
			return 뽑힌팀원;
		}
		return null;
	}

	boolean 팀원등록(String name, String skill, String combie) {
		for (팀원 temp : 팀원리스트) { // 이름 중복시 등록 X
			if (temp.get팀원이름().equals(name)) {
				return false;
			}
		}
		for (팀원 temp : 팀원리스트) { // 시너지를 너무 많이 가질시(한개 이상의 시너지 가질시 등록 X)
			if(temp.get팀원시너지().length() > 7) {
				return false;
			}
		}
		for (팀원 temp : 팀원리스트) {
			if(temp.get팀원특성().length() > 5) { // 특성을 너무 많이 가질시(3개 이상의 특성 가질시 등록 X)
				return false;
			}
		}
		팀원 팀원 = new 팀원(name, skill, combie, 0);
		팀원리스트.add(팀원);
		return true;
	}

	void 팀원저장() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/팀원리스트.txt");
			for (팀원 temp : 팀원리스트) {
				String 총내용 = temp.get팀원번호() + "," + temp.get팀원이름() + "," + temp.get팀원특성() + "," + temp.get팀원시너지()
						+ "\n";
				fileOutputStream.write(총내용.getBytes());
				fileOutputStream.close();
			}
		} catch (Exception e) {
			System.out.println("팀원 저장 오류 발생!" + e);
		}
	}

	void 팀원로드() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/자바/팀원리스트.txt");
			byte[] bytes = new byte[1000];
			fileInputStream.read(bytes);
			String 열 = new String(bytes);
			fileInputStream.close();
			String[] 줄나누기 = 열.split("\n");
			for (String temp : 줄나누기) {
				String[] field = temp.split(",");
				팀원 팀원 = new 팀원(field[0], field[1], field[2], Integer.parseInt(field[3]));
				팀원리스트.add(팀원);
				
				return;
			}
		} catch (Exception e) {
			System.out.println("팀원 불러오기 오류 발생!" + e);
		}
	}

	int 효과판단() { 
		int score = 0;
		
		for(int i = 0; i< 4; i++) { // 냉정 효과 판단
			for(int j =0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int l = 0; l <4; l++) {
						if(팀원선택리스트.get(i).get팀원특성().equals("냉정") &&
								팀원선택리스트.get(j).get팀원특성().equals("냉정") &&
								팀원선택리스트.get(k).get팀원특성().equals("냉정") && 
								팀원선택리스트.get(l).get팀원특성().equals("냉정") 
								) { score += 2; }
					}
				}
			}
		}
		// 열정 효과 판단
		// 소통 효과 판단
		for(팀원 temp : 팀원선택리스트) {
			if(!temp.get팀원특성().equals("소통")) {
				score -= 3;
			}
		}
		// 커피애호가 효과 판단
		// 만능 효과 판단
		for(팀원 temp : 팀원선택리스트) {
			if(temp.get팀원특성().equals("만능")) {
				score += 1;
			}
		}
		// 애연가 효과 판단
		for(팀원 temp : 팀원선택리스트) {
			if(!temp.get팀원특성().equals("애연가")) {
				score -= 2;
			}
		}
		// 노력가 효과 판단
		// 부관 효과 판단
		// 이타적 효과 판단
		// 독보적 효과 판단
		for(팀원 temp : 팀원선택리스트) {
			if(temp.get팀원특성().equals("독보적")) {
				score += 2;
			}
		}
		return score;
	}

	int 시너지판단() {
		int score = 0;
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		for(팀원 temp : 팀원선택리스트) { // 야자조 시너지 판단
			for(팀원 temp2 : 팀원선택리스트) {
				for(팀원 temp3 : 팀원선택리스트) {
					if(		팀원선택리스트.get(index1).get팀원이름().equals("김명호") ||
							팀원선택리스트.get(index1).get팀원이름().equals("한준석") ||
							팀원선택리스트.get(index1).get팀원이름().equals("한요한")
							&& 
							팀원선택리스트.get(index2).get팀원이름().equals("김명호") ||
							팀원선택리스트.get(index2).get팀원이름().equals("한요한") ||
							팀원선택리스트.get(index2).get팀원이름().equals("한준석") 
							&&
							팀원선택리스트.get(index3).get팀원이름().equals("김명호") ||
							팀원선택리스트.get(index3).get팀원이름().equals("한준석") ||
							팀원선택리스트.get(index3).get팀원이름().equals("한요한"	) ) {
						score = 3; 
					}
						
				}
			}
		}
		for(int i = 0; i<4; i++) { // 1조 시너지판단
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(팀원선택리스트.get(i).get팀원이름().equals("김명호") ||
								팀원선택리스트.get(i).get팀원이름().equals("조한준") ||	
								팀원선택리스트.get(i).get팀원이름().equals("한준석") ||
								팀원선택리스트.get(i).get팀원이름().equals("홍성빈") &&
								팀원선택리스트.get(j).get팀원이름().equals("김명호") ||
								팀원선택리스트.get(j).get팀원이름().equals("조한준") ||
								팀원선택리스트.get(j).get팀원이름().equals("한준석") ||
								팀원선택리스트.get(j).get팀원이름().equals("홍성빈") &&
								팀원선택리스트.get(k).get팀원이름().equals("김명호") ||
								팀원선택리스트.get(k).get팀원이름().equals("조한준") ||
								팀원선택리스트.get(k).get팀원이름().equals("한준석") ||
								팀원선택리스트.get(k).get팀원이름().equals("홍성빈") &&
								팀원선택리스트.get(x).get팀원이름().equals("김명호") ||
								팀원선택리스트.get(x).get팀원이름().equals("한준석") ||
								팀원선택리스트.get(x).get팀원이름().equals("조한준") ||
								팀원선택리스트.get(x).get팀원이름().equals("홍성빈") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 2조 시너지판단
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(팀원선택리스트.get(i).get팀원이름().equals("김진혁") ||
								팀원선택리스트.get(i).get팀원이름().equals("윤선기") ||	
								팀원선택리스트.get(i).get팀원이름().equals("최으뜸") ||
								팀원선택리스트.get(i).get팀원이름().equals("윤지윤") &&
								팀원선택리스트.get(j).get팀원이름().equals("김진혁") ||
								팀원선택리스트.get(j).get팀원이름().equals("윤선기") ||
								팀원선택리스트.get(j).get팀원이름().equals("최으뜸") ||
								팀원선택리스트.get(j).get팀원이름().equals("윤지윤") &&
								팀원선택리스트.get(k).get팀원이름().equals("김진혁") ||
								팀원선택리스트.get(k).get팀원이름().equals("윤선기") ||
								팀원선택리스트.get(k).get팀원이름().equals("최으뜸") ||
								팀원선택리스트.get(k).get팀원이름().equals("윤지윤") &&
								팀원선택리스트.get(x).get팀원이름().equals("김진혁") ||
								팀원선택리스트.get(x).get팀원이름().equals("윤선기") ||
								팀원선택리스트.get(x).get팀원이름().equals("최으뜸") ||
								팀원선택리스트.get(x).get팀원이름().equals("윤지윤") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 3조 시너지판단
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(팀원선택리스트.get(i).get팀원이름().equals("김규석") ||
								팀원선택리스트.get(i).get팀원이름().equals("신덕용") ||	
								팀원선택리스트.get(i).get팀원이름().equals("박준희") ||
								팀원선택리스트.get(i).get팀원이름().equals("유희진") &&
								팀원선택리스트.get(j).get팀원이름().equals("김규석") ||
								팀원선택리스트.get(j).get팀원이름().equals("신덕용") ||
								팀원선택리스트.get(j).get팀원이름().equals("박준희") ||
								팀원선택리스트.get(j).get팀원이름().equals("유희진") &&
								팀원선택리스트.get(k).get팀원이름().equals("김규석") ||
								팀원선택리스트.get(k).get팀원이름().equals("신덕용") ||
								팀원선택리스트.get(k).get팀원이름().equals("박준희") ||
								팀원선택리스트.get(k).get팀원이름().equals("유희진") &&
								팀원선택리스트.get(x).get팀원이름().equals("김규석") ||
								팀원선택리스트.get(x).get팀원이름().equals("신덕용") ||
								팀원선택리스트.get(x).get팀원이름().equals("박준희") ||
								팀원선택리스트.get(x).get팀원이름().equals("유희진") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 4조 시너지판단
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(팀원선택리스트.get(i).get팀원이름().equals("김선제") ||
								팀원선택리스트.get(i).get팀원이름().equals("장승빈") ||	
								팀원선택리스트.get(i).get팀원이름().equals("정준영") ||
								팀원선택리스트.get(i).get팀원이름().equals("정희승") &&
								팀원선택리스트.get(j).get팀원이름().equals("김선제") ||
								팀원선택리스트.get(j).get팀원이름().equals("장승빈") ||
								팀원선택리스트.get(j).get팀원이름().equals("정준영") ||
								팀원선택리스트.get(j).get팀원이름().equals("정희승") &&
								팀원선택리스트.get(k).get팀원이름().equals("김선제") ||
								팀원선택리스트.get(k).get팀원이름().equals("장승빈") ||
								팀원선택리스트.get(k).get팀원이름().equals("정준영") ||
								팀원선택리스트.get(k).get팀원이름().equals("정희승") &&
								팀원선택리스트.get(x).get팀원이름().equals("김선제") ||
								팀원선택리스트.get(x).get팀원이름().equals("장승빈") ||
								팀원선택리스트.get(x).get팀원이름().equals("정준영") ||
								팀원선택리스트.get(x).get팀원이름().equals("정희승") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 5조 시너지판단
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(팀원선택리스트.get(i).get팀원이름().equals("박민욱") ||
								팀원선택리스트.get(i).get팀원이름().equals("박영근") ||	
								팀원선택리스트.get(i).get팀원이름().equals("채우석") &&
								팀원선택리스트.get(j).get팀원이름().equals("박민욱") ||
								팀원선택리스트.get(j).get팀원이름().equals("박영근") ||
								팀원선택리스트.get(j).get팀원이름().equals("채우석") &&
								팀원선택리스트.get(k).get팀원이름().equals("박민욱") ||
								팀원선택리스트.get(k).get팀원이름().equals("박영근") ||
								팀원선택리스트.get(k).get팀원이름().equals("채우석") &&
								팀원선택리스트.get(x).get팀원이름().equals("박민욱") ||
								팀원선택리스트.get(x).get팀원이름().equals("박영근") ||
								팀원선택리스트.get(x).get팀원이름().equals("채우석") 
								 ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 6조 시너지판단
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(팀원선택리스트.get(i).get팀원이름().equals("김지웅") ||
								팀원선택리스트.get(i).get팀원이름().equals("박래찬") ||	
								팀원선택리스트.get(i).get팀원이름().equals("한요한") 
								&&
								팀원선택리스트.get(j).get팀원이름().equals("김지웅") ||
								팀원선택리스트.get(j).get팀원이름().equals("박래찬") ||
								팀원선택리스트.get(j).get팀원이름().equals("한요한") 
								&&
								팀원선택리스트.get(k).get팀원이름().equals("김지웅") ||
								팀원선택리스트.get(k).get팀원이름().equals("박래찬") ||
								팀원선택리스트.get(k).get팀원이름().equals("한요한") 
								&&
								팀원선택리스트.get(x).get팀원이름().equals("김지웅") ||
								팀원선택리스트.get(x).get팀원이름().equals("박래찬") ||
								팀원선택리스트.get(x).get팀원이름().equals("한요한") 
								) {
							score = 5; 
						} 
					}
				}
			}
		}
		return score;
	}

	void 게임점수save(int Score, String name) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/드래프트게임점수.txt");
			for (점수 temp : 점수리스트) {
				String 점수 = name + ","+ Integer.toString(Score)+ "\n";
				 // 게임점수 저장하면 될듯
				fileOutputStream.write(점수.getBytes());
				fileOutputStream.close();
			}
		} catch (Exception e) {
			System.out.println("점수 저장 오류 발생!" + e);
		}
	}

	void 게임점수load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/자바/드래프트게임점수.txt");
			byte[] bytes = new byte[1000];
			fileInputStream.read(bytes);
			String 열 = new String(bytes);
			String[] 줄나누기 = 열.split("\n");
			fileInputStream.close();
			for (String temp : 줄나누기) {
				String[] field = temp.split(",");
				점수 점수 = new 점수(field[0], Integer.parseInt(field[1]) );
				점수리스트.add(점수);
				return;
			}
		} catch (Exception e) {
			System.out.println("팀원 불러오기 오류 발생!" + e);
		}
	}

	boolean 팀원편집(String name, String skill, String combie) {
		for (팀원 temp : 팀원리스트) {
			if (!(temp.get팀원이름().equals(name))) {
				return false;
			} else {
				temp.set팀원이름(name);
				temp.set팀원시너지(combie);
				temp.set팀원특성(skill);
				팀원저장();
				return true;
			}
		}
		return false;
	}

	boolean 팀원삭제(String name) {
		for (팀원 temp : 팀원리스트) {
			if (!(temp.get팀원이름().equals(name))) {
				return false;
			} else {
				temp = null;
				팀원저장();
				return true;
			}
		}
		return false;
	}
	boolean 팀원선택(String name, String skill, String combie) {
		for (팀원 temp : 팀원리스트) {
			if (temp.get팀원이름().equals(name)) {
				return false;
			}
		}
		팀원 팀원 = new 팀원(name, skill, combie);
		팀원선택리스트.add(팀원);
		return true;
	}
}
