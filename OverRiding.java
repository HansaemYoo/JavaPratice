package inheritance;

//4. 메소드 오버라이딩 - 부모클래스의 메소드를 자식클래스에서 재정의 하는것
public class OverRiding {

	public static void main(String[] args) {
		//객체 생성
		Square s = new Square(); //정사각형
		s.name = "정사각형";
		s.length = 5;
		
		Triangle t = new Triangle(); //삼각형
		t.name = "삼각형";
		t.base = 4;
		t.height = 3;

		Circle c = new Circle(); //원
		c.name = "원";
		c.radius = 4;
		
		//업캐스팅
		Shape[] shapes = { s, t, c };
		
		//모든 도형의 넓이 계산 및 출력
		for(int i = 0; i < shapes.length; i++) {
			Shape tmp = shapes[i];
			System.out.printf("%s의 넓이 -> %.2f\n", tmp.name, tmp.area());
		}
	}

}
class Shape { //도형 클래스
	//필드
	String name;
	
	//메소드
	public double area() { //도형 넓이 반환
		return 0;
	}
	
}

class Square extends Shape { //정사각형 클래스
	int length; //한변의 길이
	
	public double area() { //정사각형 넓이 구하기 - 밑변 x 높이
		return length * length;
	}
	
}

class Triangle extends Shape { //삼각형 클래스
	int base; //밑변
	int height; //높이
	
	public double area() { //삼각형 넓이 구하기 - 밑변 X 높이 / 2
		return base * height / 2;
	}
	
}

class Circle extends Shape { //원 클래스
	int radius;
	
	public double area() { //원넓이 구하기 - 파이 X 반지름^2
		return Math.PI * radius * radius;
	}
	
}