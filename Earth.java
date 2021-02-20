package HelloJava;

public class Earth {

	//상수선언
	//상수이름은 모두 대문자, 다른단어가 혼합된 이름이면 _로 연결
	static final double EARTH_RADIUS = 6400; 
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	
	public static void main(String[] args) {
		
		//상수사용
		System.out.println("지구의 반지름: " + EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: " + EARTH_AREA + "km^2");
	}

}
