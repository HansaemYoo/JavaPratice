package HelloJava;

public class Car2Example {
	//클래스 외부에서 메소드 호출
	
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}

	void keyturnOn() {
		System.out.println("키를 돌립니다.");
	}

	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속" + speed + "km/h)");
		}
	}

	public static void main(String[] args) {
		Car2Example myCar = new Car2Example();
		myCar.keyturnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도:" + speed + "km/h)");
	}

}
