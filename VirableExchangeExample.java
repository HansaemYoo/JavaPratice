package HelloJava;

public class VirableExchangeExample {

	public static void main(String[] args) {
		//변수선언, 초기화, 출력
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + ", y :" + y);
		
		//두 변수의 값을 교환하기
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + ", y :" + y);
	}

}
