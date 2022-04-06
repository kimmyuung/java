package Day12연습;

import java.io.IOException;

public class Day12_3_연습3 {
	// 도서 검색 프로그램
			// [조건]
			// 1. 입력받기 [ System.in.read() ]
			// 2. String 배열내 여러 도서가 저장 
				//		String[] 도서목록 = {	
				//			"된다! 네이버 블로그&포스트",
				//			"스프링 부트 실전 활용 마스터",
				//			"Tucker의 Go 언어 프로그래밍",
				//			"혼자 공부하는 C 언어"
				//};
			// 3. 검색기능 , 수정기능 
				// 검색기능 : 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력 
					// '언어' 검색 ->  "Tucker의 Go 언어 프로그래밍" / "혼자 공부하는 C 언어"
				// 수정기능 : 수정할 도서명의 일부를 입력받아 출력된 도서명중 번호를 선택 
				// '수정' 수정 -> 선택된 도서명의 수정할 문자와 새로운 문자 입력받아 ->  수정 완료
	public static void main(String[] args) throws Exception {
		String[] booklist = {"된다! 네이버 블로그& 포스트", "스프링 부트 실전 활용 마스터", "Tucker의 Go 언어 프로그래밍"
				, "혼자 공부하는 C 언어"};
		byte[] bytes = new byte[1000];
		while(true) {
		System.out.println("1. 도서 검색 2. 도서 수정");
		int count = System.in.read(bytes);
		String ch = new String(bytes, 0, count-2);
		if(ch.equals("1")) {
			System.out.println("입력할 도서 이름을 입력해주세요");
			int bookfind = System.in.read(bytes);
			String ch1 = new String(bytes, 0, bookfind-2);
			for(String temp : booklist) {
				if(temp.equals(ch1)) {
					System.out.println(temp);
					
				}
				else if(temp.contains(ch1)) {
					System.out.println(temp);
				}
			}
		}
		else if(ch.equals("2")) {
			System.out.println("수정할 도서를 입력해주세요");
			int bookup = System.in.read(bytes);
			String ch2 = new String(bytes, 0, bookup-2);
			int i = 0;
			for(String temp : booklist) {
				if(temp.indexOf(ch2) != -1) {
					String ch3 = temp.replace(temp, ch2);
					System.out.println(ch3);
					
				}
			i++;}
			System.out.println("수정할 도서번호를 입력해주세요");
			int count1 = System.in.read(bytes);
			String ch3 = new String(bytes, 0, count1-2);
			int index = Integer.parseInt(ch3);
			System.out.println("기존 문자 : ");
			int old = System.in.read(bytes);
			String oldStr = new String(bytes, 0, old-2);
			System.out.println("새로운 문자 : ");
			int new1 = System.in.read(bytes);
			String newStr = new String(bytes, 0, new1-2);
			booklist[index] = booklist[index].replace(oldStr, newStr);
			
		}
		else System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요");
		}
	}
}
