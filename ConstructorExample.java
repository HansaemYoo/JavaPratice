package HelloJava;

public class ConstructorExample {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자
	public ConstructorExample(String n, String s) {
		name = n;
		ssn = s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample k1 = new ConstructorExample("유한샘", "980416-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		ConstructorExample k2 = new ConstructorExample("유자바", "980000-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}