package HelloJava;

public class CastingExample {

	public static void main(String[] args) {
		//강제변환: 허용범위가 큰 것에서 작은것으로
		System.out.println("강제변환: 허용범위가 큰 타입에서 작은 타입으로(캐스팅)");
		int intvalue = 44032;
		char charvalue = (char)intvalue;
		System.out.println(charvalue); //"가"가 출력
		
		long longvalue = 500;
		intvalue = (int)longvalue;
		System.out.println(intvalue);
		
		double doublevalue = 3.14;
		intvalue = (int)doublevalue;
		System.out.println(intvalue); //정수 부분인 3만 저장
	}

}
