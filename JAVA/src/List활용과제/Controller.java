package List활용과제;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<Member> memberlist = new ArrayList<>();
	
	
	boolean Signup(String id, String pw, String name, String address, String email, String phone) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) || temp.getEmail().equals(email) || temp.getPhone().equals(phone) ||
			temp.getPhone().length() != 11 || !(temp.getAddress().contains("시동구"))	|| !(temp.getEmail().contains("@"))	
				) {
				return false;
			}
		}
		Member member = new Member(id, pw, name, address, email, phone);
		memberlist.add(member);
		return true;
	}
	
	boolean Login(String id, String pw) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		Controller.sc = sc;
	}
	
}
