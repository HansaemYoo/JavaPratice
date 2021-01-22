package HelloJava;

public class LongCharExample {

	public static void main(String[] args) {
		//Long타입
		System.out.println("Long타입");
		long l1 = 10;
		long l2 = 20;
		//long l3 = 1000000000000; 허용 범위를 초과할 땐 L을 붙여준다.
		long l4 = 1000000000000L;
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l4);
		
		//char타입
		System.out.println("char타입");
		char c1 = 'A'; //문자를 직접 저장, 유니코드 65
		char c2 = 65; //10진수로 저장
		char c3 = '가'; //유니코드 44032
		char c4 = 44032; //10진수로 저장
		int c5 = 'A'; //작은따옴표 (')로 감싼 문자 리터럴은 유니코드로 변환되기 때문에 int타입 변수에도 저장할 수 있다.
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}

}
