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
		for (팀원 temp : 팀원리스트) {
			if (temp.get팀원이름().equals(name)) {
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

	void 효과판단() {

	}

	void 시너지판단() {

	}

	void 게임점수save(int Score, String name) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/드래프트게임점수.txt");
			for (점수 temp : 점수리스트) {
				String 점수 = name + ","+ Integer.toString(Score)+ "\n";
				 // 게임점수 저장하면 될듯
				fileOutputStream.write(점수.getBytes());
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
