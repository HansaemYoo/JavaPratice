package HelloJava;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		int i1 = 0b1011; //2진수
		int i2 = 0206; //8진수
		int i3 = 365; //10진수
		int i4 = 0xB3; //16진수
		System.out.println("i1 : " + i1); //11출력
		System.out.println("i2 : " + i2); //134
		System.out.println("i3 : " + i3); //365
		System.out.println("i4 : " + i4); //179
		
		//byte타입 : -128~-127
		byte b1 = -128;
		byte b2 = 127;
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		
		//char타입 : 0 ~ 65535(유니코드)
		System.out.println("char : 유니코드");
		
		// long타입
		long l1 = 9300;
		System.out.println("l1 : " + l1);
		
	}

}
