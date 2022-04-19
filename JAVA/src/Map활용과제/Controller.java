package MapȰ�����;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Controller {
	
	static ArrayList<Member> memberlist = new ArrayList<>();
	static TreeMap<String, String> treeMap = new TreeMap<>();
	boolean signup(Member member) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(member.getId())) {
				return false;
			}
		}
		memberlist.add(member);
		save();
		return true;
	}
	boolean login(String id, String pw) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
	void save() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/�ڹ�/ȸ��.txt");
			for(Member temp : memberlist) {
				String save = temp.getId() + "," + temp.getPw() + "," + temp.getName() + "\n";
				outputStream.write(save.getBytes());
			}
			outputStream.close();
		} 
		catch (Exception e) {
			System.out.println("���� ���� ���� " + e);
		}
		
	}
	void load() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/�ڹ�/ȸ��.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] field = temp.split(",");
				Member temp2 = new Member(field[0],field[1], field[2]);
				memberlist.add(temp2);
				i++;
				inputStream.close();
			}
			
		}
		catch (Exception e) {
			System.out.println("���� �ҷ����� ���� " + e);
		}
		
	}
	Map<String, String> write(String title, String context) {
		treeMap.put(title, context);
		return treeMap;
	}
}
