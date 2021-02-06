package HelloJava;

public class ClassField {
	//클래스 필드 선언 / 필드는 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; //필드값을 선언안하면 해당 타입의 기본값이 자동으로 저장된다.

	public static void main(String[] args) {
		//객체생성
		ClassField myCar = new ClassField(); //myCar변수가 ClassField객체를 참조하게 되면 도트 연산자를 통해 필드에 접근할수 있다.
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}