package HelloJava;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 문자열비교 +String은 클래스이므로 참조타입이다.
		//동일한 문자열 리터럴로 String객체를 생성했을 경우 true가 나온다.
		String str1 = "유한샘"; 
		String str2 = "유한샘";
		if(str1 == str2) { 
			System.out.println("str1과 str2는 참조가 같음");
		} else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		//동일한 String 객체이건 다른 String 객체이건 상관없이 내부 문자열을 비교하고 싶을때는 equal()메소드를 사용해야 한다.
		if(str1.equals(str2)) { 
			System.out.println("str1과 str2는 문자열이 같음");
		}
		String str3 = new String("유한샘");
		String str4 = new String("유한샘");
		if(str3 == str4) {
			System.out.println("str1과 str2는 참조가 같음");
		} else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		if(str3.equals(str4)) {
			System.out.println("str1과 str2는 문자열이 같음");
		}
	}

}
