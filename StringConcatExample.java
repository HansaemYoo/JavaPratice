package HelloJava;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자연산
		int value = 10 + 2 + 8; //정수끼리 더한 결과 20이 출력된다.
		System.out.println("value: " + value);
		//문자열 결합 연산
		String str1 = 10 + 2 + "8"; //12 + "8" 인 128이 출력된다.
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8; //10 + "2" + 8 인 1028이 출력된다.
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8; //"10" + 2 + 8 인 1028이 출력된다.
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8); //"10" + 10 인 1010이 출력된다.
		System.out.println("str4: " + str4);
	}

}
