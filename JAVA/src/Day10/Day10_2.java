package Day10;

public class Day10_2
{
	// 인터페이스[=추상메소드] : 객체의 사용방법을 정의한 타입
	// 목적 : 동일 목적 하에 동일 기능 수행하게끔 강제 -> 개발코드 수정 줄이고, 유지보수성 높이기 위해 사용
	// (= 서로 다른 클래슬간의 객체들을 동일한 목적으로 조작)
	// ex) 인터페이스 : 방향키, A버튼, B버튼
	// -> 철권 클래스 : A버튼 공격, B버튼 방어 // 축구게임 클래스 : A버튼 슈팅, B버튼 패스
	// 추상 : 선언은 하지만(동일 목적 : 게임 플레이를 위해) 사용(=구현)은 하지 않음(버튼의 기능은 각 클래스마다 다르기때문)
	// -> 인터페이스에서 선언하고 각 클래스들이 구현[다형성]
	// 자바는 클래스를 이용한 다중상속이 불가능하기때문에 다중상속을 하기 위해서 인터페이스를 사용
	public static void main(String[] args)
	{
		// 1. 인터페이스 객체 선언
		RemoteControl rc;
		// 인터페이스명 객체명;

		// 2. 인터페이스에 텔레비전 메모리 할당
		rc = new Television();

		// 3. 인터페이스 실행
		rc.turnOn(); // tv 실행 메소드
		rc.turnOff(); // tv 종료 메소드
		rc.setVolume(10); // 볼륨 설정 메소드

		System.out.println("리모컨 연결 : TV---> Audio 교체");
		// 4. 인터페이스내 클래스메모리 교체
		rc = new Audio();

		rc.turnOn(); // 오디오 실행 메소드
		rc.turnOff(); // 오디오 종료 메소드
		rc.setVolume(10); // 오디오 볼륨 설정 메소드

		// 클래스 없이 추상메소드를 정의 -> 익명구현객체
		RemoteControl rc2 = new RemoteControl()
		// 인터페이스명 객체명 = new 인터페이스명
		{

			@Override
			public void turnOn()
			{
				System.out.println("리모콘 켭니다.");
			}

			@Override
			public void turnOff()
			{
				System.out.println("리모콘 끕니다.");
			}

			@Override
			public void setVolume(int volume)
			{
				System.out.println("현재 소음 : " + volume);
			}
		};
		rc2.turnOn(); 
		rc2.turnOff();
		rc2.setVolume(10);

		rc2.setMute(true); // 디폴트 메소드 호출
		// 인터페이스에서 이미 구현된 메소드
		
		// 정적 메소드 호출(객체 없음)
		RemoteControl.changeBattery();// 객체없이
		
		// 메모리 할당 이유 
		// 외부 클래스/인터페이스내 필드(저장 기능), 메소드(저장 기능) 사용시 필요
			// 1. new 연산자
			// 2. static 연산자 
	}

}
