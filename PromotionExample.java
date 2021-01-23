package HelloJava;

public class PromotionExample {

	public static void main(String[] args) {
		//자동변환: 허용범위가 작은 타입이 허용범위가 큰 타입으로 저장될 때 발생
		System.out.println("자동변환: 허용범위가 작은타입에서 큰 타입으로");
		//byte -> int
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue: " + intvalue);
		
		char charvalue = '가';
		intvalue = charvalue;
		System.out.println("charvalue: " + charvalue);
		
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue: " + longvalue);

		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("floatvalue: " + floatvalue);
		
		floatvalue = 100.5F;
		double doublevalue = floatvalue;
		System.out.println("doublevalue: " + doublevalue);
	}
}
