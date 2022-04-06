package Day12연습;

public class Day12_3_연습1 {
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
	public static void main(String[] args) {
		String[] booklist = {	
				"된다! 네이버 블로그&포스트",
				"스프링 부트 실전 활용 마스터",
				"Tucker의 Go 언어 프로그래밍",
				"혼자 공부하는 C 언어" 		}; // 도서목록을 배열로 설정
		try { // 바이트배열을 읽을 경우 일반예외가 발생하기 때문에 try catch 사용
			while(true) { // 무한루프 종료조건 : 없음
				System.out.println("1. 도서 검색 2. 도서 수정");
				byte[] bytes = new byte[1000]; // 입력을 받을 바이트배열 선언
				int count = System.in.read(bytes); // 키보드를 통해 입력받은 바이트를 정수로 저장
				String ch = new String(bytes, 0, count-2); // 새로 메모리를 할당하여 키보드를 통해 입력받은 바이트를 처음부터 끝까지 읽어 문자열로 설정
				// -2를 한 이유 : 원래 모든 입력에는 엔터 기능이 포함(개행문자(1바이트, \n) + 가장 앞에 커서를 옮기는 문자(1바이트, \r)가 포함되어 있어 2바이트 차감)
				if(ch.equals("1")) { // 사용자로부터 입력받은 바이트를 문자열로 변환한 결과가 1일 경우
					System.out.println("검색할 도서 이름을 입력해주세요"); 
					int findbook = System.in.read(bytes); // 검색할 도서를 바이트로 읽어들임
					String ch1 = new String(bytes, 0, count-2); // 바이트를 읽어들여 문자열로 변환
					for(String temp : booklist) { // 도서목록에서의 값을 찾기 위해 반복문 실행
						if(temp.indexOf(ch1) != -1) { // 해당 문자열의 인덱스를 찾은 결과가 -1이면 결과가 있다는 뜻
							// indexOf가 -1이면 동일한 문자열이 없다는 뜻이기 때문에 -1이 아닐 경우로 설정
							System.out.println(temp); // 찾은 도서를 출력
						}
						else if(temp.contains(ch1)) { // 도서목록에서 해당 문자열을 포함하고 있는 경우
							System.out.println(temp); // 찾은 문자열을 포함하고 있는 도서를 출력
						}
					}
				}
				else if(ch.equals("2")) {
					System.out.println("수정할 도서명을 입력해주세요");
					int rewrite = System.in.read(bytes); // 키보드를 통해(바이트) 도서명을 입력받음
					String ch2 = new String(bytes, 0, rewrite-2); // 입력받은 도서명을 읽어들이고 문자열로 변환
					int i = 0; // 도서목록의 인덱스
					for(String temp : booklist) {
						if(temp.indexOf(ch2) != -1) { // indexOf의 결과가 -1이면 동일 문자열이 없다는 뜻
							String ch3 = temp.replace(temp, ch2); // 새로운 문자열을 설정하여 기존의 문자열을 새로운 문자열로 교체하여 저장
							System.out.println(ch3); // 수정 결과를 사용자가 알 수 있게 출력
						}
					i++;}
					System.out.println("도서번호 선택 : "); // 도서 번호(도서목록의 인덱스)를 수정
					int count1 = System.in.read(bytes); // 바이트로 입력받음
					String ch3 = new String(bytes, 0, count1-2); // 읽어들인 후 문자열로 저장
					int index = Integer.parseInt(ch3); // 문자열을 다시 정수형으로 변환시킴 -> 도서목록의 인덱스로 사용
					System.out.println("기존 문자 : "); // 기존의 도서의 문자를 입력 
					int old = System.in.read(bytes);  // 키보드를 통해 입력받음
					String oldStr = new String(bytes, 0, old-2); // 기존의 도서명을 문자열로 저장
					System.out.println("새로운 문자 : "); // 새로운 도서의 이름을 입력
					int new1 = System.in.read(bytes); // 키보드를 통해 입력받음
					String newStr = new String(bytes, 0, new1-2); // 새로운 도서명을 문자열로 저장
					booklist[index] = booklist[index].replace(oldStr, newStr); // 입력받은 도서번호를 인덱스로 하는 도서목록의 도서를 기존의 문자에서 새로운 문자열로 교체
					
				}
				else System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
		}catch(Exception e) {System.out.println(e);}
		
	}
}
