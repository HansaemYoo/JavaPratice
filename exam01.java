package HelloJava2;

// 클래스 : 프로그램의 최소 단위
public class exam01 {
	// 메인 메소드 : 프로그램 실행의 시작점9
	public static void main(String[] args) {
		// 실행될 코드
		// 변수 선언
		int a; // 변수a 선언(정수)
		double b; // 변수b 선언(실수)
		String c; // 변수c 선언(문자)
		// 변수 정의
		a = 3; // 변수 a에 3을 저장
		b = 3.14; // 변수 b에 3.14를 저장
		c = "치킨"; // 변수 c에 "치킨"을 저장
		// 변수 선언 + 정의
		String food = "피자"; // 변수 food를 선언후 "피자"저장
		
		// "변수a:3, 변수b:3.14, 변수c:치킨" 출력
		System.out.printf("변수a:%d, 변수b:%.2f, 변수c:%s", a, b, c);
		
	}

}
