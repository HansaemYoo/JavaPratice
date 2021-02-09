package HelloJava;

public class Calculator {
		//메소드 선언
		void powerOn() { //powerOn()메소드는 전원만 켜면 되기 때문에 리턴값이 없다. 리턴값이 없는 메소드는 void로 기술한다.
			System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) { //리턴값이 있는 메소드는 리턴값의 타입을 적는다.
		int result = x + y;
		return result;
	}
	double divide(int x, int y) { //divide 메소드의 결과값이 실수라면 리턴타입도 double로 해야한다.
		double result = (double)x / y;
		return result;
	}
	void powerOff() { //powerOn과 동일
		System.out.println("전원을 종료합니다.");
	}
	
	public static void main(String[] args) {
		//메소드 호출
		Calculator Cal = new Calculator();
		Cal.powerOn();
		
		int result1 = Cal.plus(5, 6);
		System.out.println("result1 = " + result1);
		
		byte x = 10; //매개값의 타입과 매개 변수의 타입이 달라도 byte는 자동으로 정수형으로 자동 변환 되기 때문에 에러가 생기지 않는다.
		byte y = 4;
		double result2 = Cal.divide(x, y);
		System.out.println("result2 = " + result2);
		
		Cal.powerOff();
	}
}
