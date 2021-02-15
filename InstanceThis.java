package JavaPractice;

public class InstanceThis {
	//필드
	String model;
	int speed;
	
	//생성자
	InstanceThis(String model){
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<-50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
	
	public static void main(String[] args) {
		// 인스턴스 멤버와 this
		InstanceThis myCar = new InstanceThis("포르쉐");
		InstanceThis yourCar = new InstanceThis("벤츠");

		myCar.run();
		yourCar.run();
	}

}
