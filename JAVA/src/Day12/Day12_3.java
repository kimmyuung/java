package Day12;

public class Day12_3
{
public static void main(String[] args)
{
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
	String[] booklist = {	
						"된다! 네이버 블로그&포스트",
						"스프링 부트 실전 활용 마스터",
						"Tucker의 Go 언어 프로그래밍",
						"혼자 공부하는 C 언어" 		};
	try {
	while(true) {
	System.out.println("1. 도서 검색 2. 도서 수정");	
	 // 키보드로부터 [스트림] 바이트를 읽어옴.
	// 일반예외 발생 -> 떠넘기기
	byte[] bytes = new byte[100];
	int count = System.in.read(bytes); 
	// 읽어온 바이트개수
	// 항상 \n + \r 포함되어있음
	String ch = new String(bytes , 0 , count-2);
	// 키보드로부터 바이트 읽은 뒤 바이트 배열 -> 문자열 변환(-2 차감)
	if( ch.equals("1") ) {
		System.out.println("검색할 도서를 입력해주세요");
		int findbook = System.in.read(bytes);
		String ch1 = new String(bytes , 0 , findbook-2);
		System.out.println(" *** 검색 결과 *** ");
		for(String temp : booklist) { // 모든 배열내 문자열을 하나씩 꺼내오기
			if(temp.indexOf(ch1) != -1) { // 해당 문자열내 찾을 문자의 인덱스가 존재하면
				// indexOf 메소드 -1으로 반환되는 경우는 동일한 단어가 없을 경우
				System.out.println(temp); // 해당 문자열내 찾을 문자가 존재하면 출력
				}
			if(temp.contains(ch1)) { // 문자열.contains("찾을문자") : 문자열내 찾을 문자가 있다 / 없다 
				System.out.println(temp);
				}
			}
		
	}
	else if(ch.equals("2")) {
		System.out.println("수정할 도서명을 입력해주세요");
		int rewrite = System.in.read(bytes); // 키보드로부터 바이트를 읽어와서 배열에 저장
		String ch2 = new String(bytes , 0 , rewrite-2); // 0번인덱스 바이트부터 -2제외한 인덱스까지
		int i = 0;
		for(String temp : booklist) {
			if(temp.indexOf(ch2) != -1) { 
				String ch3 = temp.replace(temp, ch2);
				System.out.println(ch3);
			}
		i++;}
		
		System.out.println("도서번호 선택 : ");
		int count1 = System.in.read(bytes);
		String ch3 = new String(bytes, 0, count1-2);
		// ch3 문자열로 입력받음 ---> 인덱스[숫자]로 변환
		int index = Integer.parseInt(ch3);
		System.out.println("기존 문자 : ");
			int old = System.in.read(bytes);
			String oldStr = new String(bytes, 0, old-2);
		System.out.println("새로운 문자 : ");
			int new1 = System.in.read(bytes);
			String newStr = new String(bytes, 0, new1-2);
			booklist[index] = booklist[index].replace(oldStr, newStr);
	}		// 배열내 도서명 = 수정된 도서명
	else System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
	}}catch(Exception e) {System.out.println("숫자를 입력해주세요");}
	
}
}
