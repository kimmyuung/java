package Day01;

	

	import java.util.Scanner;
	// 회원가입표를 만들어보자!
	// 입력변수 : 아이디, 비밀번호, 성명, 이메일
	// 출력 예 : >>>>>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 <<<<<<<<<<<<<
	public class Day01_5 {// c  s

		public static void main(String[] args) { // m  s
		Scanner scanner = new Scanner(System.in); // 1. 입력객체 선언
		
		System.out.println("이름 : "); // 2. 입력 받을 데이터 안내(이름, 아이디, 비밀번호, 이메일)
		String 이름 = scanner.next(); // 입력 받은 데이터(이름)을 다른 곳에 저장
		
		System.out.println("아이디 : ");     	String id = scanner.next();
		System.out.println("비밀번호 : ");		String pw = scanner.next();
		System.out.println("이메일 : ");		String em = scanner.next();
		// 3. 데이터를 입력 받음
		
		// 4. 데이터를 출력
		System.out.println(">>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 <<<<<<<<");
		System.out.println("이름\t아이디\t비밀번호\t이메일\t비고");
		System.out.printf("%s\t%s\t%s\t%s\n", 이름,id, pw, em);
		System.out.println(이름 + "\t" + id + "\t" + pw + "\t" + em);
		
		

		
		
		
		
		
			
		} // m  e
		
	}// c  e

