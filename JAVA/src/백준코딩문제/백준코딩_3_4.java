package 백준코딩문제;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준코딩_3_4 {
public static void main(String[] args) throws Exception, IOException {// 버퍼 라이터를 쓰면 일반 예외 발생!
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	int t = Integer.parseInt(bufferedReader.readLine());
	for(int i = 0; i < t; i ++) {
		st = new StringTokenizer(bufferedReader.readLine());
		bufferedWriter.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ) + "\n");
	}
	bufferedReader.close();
	bufferedWriter.flush();
	bufferedWriter.close();
	// Buffer : 버퍼가 가득 차거나, 개행 문자 출현시 버퍼 내용 한 번에 전송
	// Scanner : 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송
	// 버퍼 : 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 데이터를 보관하는 임시 메모리
	// 버퍼 플러시(buffer flash) : 버퍼에 남아 있는 데이터를 출력(= 버퍼 비움)
	// Scanner : 띄어쓰기(스페이스)와 엔터(개행문자)를 경계로 입력 값 인식 -> 가공 필요 없음
	// 버퍼 : 엔터만 경계로 인식하고 받은 데이터가 String으로 고정
	// 버퍼 리더 사용법 : readLine() 데이터를 라인 단위로 읽음
	// 공백 단위를 데이터를 알려면 StringTokenizer의 nextToken 함수 이용 or String의 spilt 이용
	// 버퍼 라이터 : System.out.print("");와 동일
		// -> 문자열출력과 개행 동시에 하지 않기 때문에 개행 원하면 \n or newLine 함수 사용
//	StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
	// StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개는 클래스 
	// 그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 부릅니다.
//	int a = Integer.parseInt(st.nextToken()); //첫번째 호출
//	int b = Integer.parseInt(st.nextToken()); //두번째 호출
//
//	String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
}
}
