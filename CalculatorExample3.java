package JavaPractice;

public class CalculatorExample3 {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	public static void main(String[] args) {
		//정적 멤버 사용
		double result1 = 10 * 10 * CalculatorExample3.pi;
		int result2 = CalculatorExample3.plus(10, 5);
		int result3 = CalculatorExample3.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
