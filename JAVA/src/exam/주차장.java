package exam;

public class 주차장 {
	// 주차 현황 표 설계
			// 1. 파일 구분 -> M(모델 : 데이터, 정보) : V(뷰어 : 입력, 출력) : C(컨트롤 : 이벤트작동)
			// 2. 모델 선택 
				// [ 식별 ] : 1. Car 클래스 (필드, 생성자(기본 하나, 모든 필드 가진 생성자 1개), 메소드(set, get) )
				// 필드 : 차량번호, 입차시간 , 출차시간
				// 계산용 : 날짜, 금액
				// 자료형 : Localdate, Localtime, String, String(or int)
			// 3. 이벤트 처리
				// 입차 : 차량 번호 입력해서 주차성공하면 성공 주차실패하면 실패
				// 출차 : 차량번호를 넣어서 출차성공하면 금액 계산 실패하면 실패
		// * 메소드 만들기 : static 사용하지말지 2. 인수, 반환 파악
			// 4. 모델 <---> 뷰 연결 : 컨트롤러
				// 1. 화면구현
					// 2. 버튼구현
	public static void main(String[] args) {
		
		try {
			while(true) {
				System.out.println();
			}
		}catch(Exception e) {}
		
		
		
	}
}
