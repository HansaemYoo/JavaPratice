package HelloJava;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		/*논리연산자 
		&& : AND(피연산자가 모두 true일 경우에만 결과가 true)
		|| : OR(피연산자중 하나라도 true이면 결과도 true) 
		^ : XOR(피연산자중 둘중 하나만 true일때 true) 
		! : NOT(피연산자의 논리값을 반대로 바꿈)  */
		int charCode = 'A'; //char 'A' = 65
		
		if( (charCode>=65) && (charCode<=90) ) { //&&는 AND연산자로 피연산자가 모두 true일 경우에만 결과가 true이다.
			System.out.println("대문자입니다.");
		}
		if( (charCode>=97) && (charCode<=122) ) {
				System.out.println("소문자입니다.");
		}
		int value = 6;
		if( (value%2==0) || (value%3==0) ) { //||는 OR연산자로 피연산자중 하나라도 true이면 결과도 true이다.
			System.out.println("2또는 3의 배수입니다.");
		}
	}

}
