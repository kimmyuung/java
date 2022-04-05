package 개인과제구상;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;


public class 게임컨트롤러 implements 이젠드래프트_인터페이스{
	static ArrayList<팀원> 팀원리스트 = new ArrayList<팀원>(); // 조원 리스트
	static ArrayList<팀장> 조장리스트 = new ArrayList<팀장>(); // 조장 리스트
	static ArrayList<팀원> 뽑은팀원 = new ArrayList<팀원>(); // 조장이 선택한 팀원
@Override
public void 팀원선택() {
	System.out.println("팀원을 선택하였습니다.");
}
@Override
	public boolean 팀원등록(String 이름, String 특성, String 시너지, int 인덱스) {
	boolean pass = true;
	int i = 0;
	for(팀원 temp : 팀원리스트) {
		if(temp.get이름().equals(이름)) {
			pass = false;
		}
	}
	if(pass)
	{팀원 팀원 = new 팀원 (이름, 특성, 시너지, i);
	팀원리스트.add(팀원); 
	i++;
	save();
	return true;
	}
	else return false;
	}
@Override
	public void 팀장선택() {
		System.out.println("팀장을 선택하셨습니다. 게임을 시작합니다.");
	}
@Override
	public void 팀원호출() {
		
	}

	boolean 팀원편집(String name, String 이름, String 특성, String 시너지, int 인덱스) {
		for(팀원 temp : 팀원리스트) {
			if(temp.get이름().equals(name)) {
				temp.set이름(이름);
				temp.set특성(특성);
				temp.set시너지(시너지);
				save();
				return true;
			}
			else return false;
		}
		 return false;
	}
	boolean 팀원삭제(String name) {
		for(팀원 temp : 팀원리스트) {
			if(temp.get이름().equals(name)) {
				팀원리스트.remove(temp);
				save();
				return true;
			}
			else return false;
		}
		 return false;
	}
	void save() {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/드래프트팀원.txt");
			for(팀원 temp : 팀원리스트) {
			String 저장 = temp.get이름() + "," + temp.get특성() + "," + temp.get시너지() +"," +temp.인덱스 + "\n" ;
			fileOutputStream.write(저장.getBytes());  fileOutputStream.close();}
			}catch(Exception e) {}
	}
	void load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/자바/드래프트팀원.txt");
			byte[] 바이트배열 = new byte[1000];
			fileInputStream.read(바이트배열);
			String 전체내용 = 바이트배열.toString();
			String[] 내용 = 전체내용.split("\n");
			for(String temp : 내용) {
			String[] field = temp.split(",");
			팀원 팀원 = new 팀원(field[0], field[1], field[2], Integer.parseInt(field[3]));
			팀원리스트.add(팀원); 
			fileInputStream.close();
			}
			}catch(Exception e) {System.out.println(e);}
		
	
	}
	void 특성판단() {}
	void 시너지판단() {}
	void 승리판단() {}
	String 조원뽑기() {
		Random random = new Random();
		int index = random.nextInt(팀원리스트.size());
		for(팀원 temp : 팀원리스트) {
			if(temp.인덱스 == index)
			temp.get이름();
			return temp.get이름();	
		}
		return null;
	}
	
}



