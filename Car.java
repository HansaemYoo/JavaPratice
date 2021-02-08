package HelloJava;

public class Car {
	//다른 생성자 호출해서 중복 코드 줄이기 - 로버로딩에서 생기는 중복 줄이기
	//필드선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자선언
	Car(){
	}
	Car(String model){ //호출
		this(model, "은색", 250);
	}
	Car(String model, String color){ //호출
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed){ //공통 실행 코드
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		//객체 생성시 생성자 선택
		Car car1 = new Car();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.amxSpeed: " + car4.maxSpeed);
		System.out.println();
	}

}
