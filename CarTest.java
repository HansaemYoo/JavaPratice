package getterSetter;

public class CarTest {

	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		
		//속도 변경
		car.setSpeed(-50);
		//출력
		System.out.println("현재속도: " + car.getSpeed());
		
		//멈춤
		if(car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도: " + car.getSpeed());
	}

}

class Car{
	//필드
	private int speed;
	private boolean stop;
	
	//메소드
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}