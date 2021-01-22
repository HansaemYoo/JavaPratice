package HelloJava;

public class FloatDoubleExample{
	public static void main(String[] args) {
		//실수값 저장
		float f1 = 3.14f;
		double d1 = 3.14;
		//정밀도 테스트
		float f2 = 0.1234567890123456789f;
		double d2 = 0.1234567890123456789;
		//결과 출력
		System.out.println("f1: " + f1);
		System.out.println("d1: " + d1);
		System.out.println("f2: " + f2);
		System.out.println("d2: " + d2);
		//e 사용하기
		double d3 = 3e6; //3.0 * 10^6
		float f3 = 3e6f; //3.0 * 10^6
		double d4 = 2e-3; //2.0 * 10^(-3)
		//출력
		System.out.println("d3: " + d3);
		System.out.println("f3: " + f3);
		System.out.println("d4: " + d4);
	}

}
