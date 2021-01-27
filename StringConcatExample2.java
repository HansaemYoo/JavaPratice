package HelloJava;

public class StringConcatExample2 {

	public static void main(String[] args) {
		//문자열 결합 연산자
		String str1 = "JDK" + 6.0; //JDK6.0
		String str2 = str1 + "특징"; //JDK6.0특징
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //문자열과 숫자가 혼합된 연산식은 왼쪽에서부터 연산이 진행되므로 JDK3이먼저 연산되어 JDK3이되고 이것을 다시 3.0과 연산하여 JDK33.0이 된다.
		String str4 = 3 + 3.0 + "JDK"; //3+3.0이 먼저 연산되어 6.0이되고 JDK와 연산되어 6.0JDK가 된다. 
		System.out.println(str3);
		System.out.println(str4);
	}

}
