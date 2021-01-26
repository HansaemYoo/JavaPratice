package HelloJava;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		//산술 연산자
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2; 
		System.out.println("result1= " + result1); //5 + 2 = 7
		
		int result2 = v1 - v2;
		System.out.println("result2= " + result2); //5 - 2 = 3
		
		int result3 = v1 * v2;
		System.out.println("result3= " + result3); //5 * 2 = 10
		
		int result4 = v1 / v2;
		System.out.println("result4= " + result4); //5 / 2 = 2 (2.5가아닌 2가 나온이유는 정수타입이므로 소수점 자리는 표시안함)
		
		int result5 = v1 % v2;
		System.out.println("result5= " + result5); //5 / 2 의 나머지인 1이 나온다.
		
		double result6 = (double) v1 / v2;
		System.out.println("result6= " + result6); //double타입으로 강제변환 해주었기 때문에 2.5가 나온다
	}

}
