package HelloJava;

public class OperationExample {

	public static void main(String[] args) {
		//정수타입의 연산
		System.out.println("정수타입의 연산");
		byte result1 = 10 + 20; //정수 리터럴 10과 20을 더한 값을 바이트변수 result1에 저장
		System.out.println(result1);
		
		byte x = 10; //변수 x에 10 저장
		byte y = 20; //변수 y에 20저장
		int result2 = x + y; //변수 x와 y를 더한 값을 result2 변수에 저장
		System.out.println(result2); //result2 츌력
		
		byte value1 = 10; //10을 바이트변수 value1에 저장
		int value2 = 100; //100을 인트변수 value2에 저장
		long value3 = 1000L; //1000L을 롱변수 value3에 저장
		long result = value1 + value2 + value3; //전부 더한 값을 롱변수 result에 저장
		System.out.println(result); //결과값 출력
		
		//연산식에서 자동 타입 변환
		System.out.println("\n연산식에서 자동 타입 변환");
		char charvalue1 = 'A'; //char타입 'A' 저장
		char charvalue2 = 1; 
		int intvalue2 = charvalue1 + charvalue2; //'A'는 유니코드로 65이므로 1을 더하면 66이된다.
		System.out.println("유니코드= " + intvalue2); //65 + 1 = 66
		System.out.println("출력문자= " + (char)intvalue2); //66을 유니코드로 나타내면 'B'이다.
		
		int intvalue3 = 10; //10 저장
		int intvalue4 = intvalue3 / 4; // 10 / 4 = 2.5 지만 정수이므로 2만 출력 
		System.out.println(intvalue4);
		
		int intvalue5 = 10; //10저장
		double doublevalue = intvalue5 / 4.0; //double타입이므로 2.5
		System.out.println(doublevalue);
		
		int a = 1;
		int b = 2;
		double result3 = (double)a / b; //(double)로 캐스팅을 해주었기때문에 0.5
		System.out.println(result3);
	}

}
