package HelloJava;

public class MethodOverLoadingEx {
	//정사각형의 넓이 구하기
	double areaRectangle(double width) {
		return width * width;
	}

	//직사각형의 넓이
	double areaRectangle(double width, double hight) {
		return width * hight;
	}

	public static void main(String[] args) {
		MethodOverLoadingEx myCal = new MethodOverLoadingEx();
		
		//정사각형의 넓이 구하기
		double result1 = myCal.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCal.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이= " + result1);
		System.out.println("직사각형의 넓이= " + result2);
	}

}
