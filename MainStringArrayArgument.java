package HelloJava;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		//메인메소드의 매개변수
		if(args.length != 2) { //입력된 데이터의 개수가 2개가 아닌경우
			System.out.println("값의 수가 부족합니다.");
			System.exit(0); //프로그램 강제종료
		}
		String str1 = args[0]; //첫번째 데이터 얻기
		String str2 = args[1]; //두번째 데이터 얻기
		
		int num1 = Integer.parseInt(str1); //문자열을 정수로 변환
		int num2 = Integer.parseInt(str2); //문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result); //따로 입력한 값이 없기때문에 "값의 수가 부족합니다."라고 출력된다.
	}

}
