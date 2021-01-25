package HelloJava;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value); //상품의 가격: 123원
		System.out.printf("상품의 가격: %6d원\n", value); //상품의 가격:    123원 (6자리 정수, 왼쪽 빈자리 공백)
		System.out.printf("상품의 가격: %-6d원\n", value); //상품의 가격: 123   원 (6자리 정수, 오른쪽 빈자리 공백)
		System.out.printf("상품의 가격: %06d원\n", value); //상품의 가격: 000123원 (6자리 정수, 왼쪽 빈자리 0으로 채우기)
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); //소수점이상 7자리, 소수점이하 둘째자리, 왼쪽 빈 자리 공백)
	}

}
