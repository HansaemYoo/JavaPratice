package HelloJava;

public class ConstructorOverLoading {
	//오버로딩 : 매개 변수를 달리하는 생성자를 여러개 선언하는 것
	//필드선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자선언
	ConstructorOverLoading(){
	}
	ConstructorOverLoading(String model){
		this.model = model; //this는 참조변수로 필드를 사용하는 것과 동일하다.
	}
	ConstructorOverLoading(String model, String color){
		this.model = model;
		this.color = color;
	}
	ConstructorOverLoading(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		//객체 생성 시 생성자 선택
		ConstructorOverLoading car1 = new ConstructorOverLoading();
		System.out.println("car1.company: " + car1.company);
		System.out.println();
		
		ConstructorOverLoading car2 = new ConstructorOverLoading("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		ConstructorOverLoading car3 = new ConstructorOverLoading("자가용", "빨강");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car2.model: " + car3.model);
		System.out.println("car2.color: " + car3.color);
		System.out.println();
		
		ConstructorOverLoading car4 = new ConstructorOverLoading("택시", "검정", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car2.model: " + car4.model);
		System.out.println("car2.color: " + car4.color);
		System.out.println("car2.maxSpeed: " + car4.maxSpeed);
		System.out.println();
	}

}
