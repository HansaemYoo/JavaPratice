package HelloJava;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		//대입 연산자: 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장
		int result = 0;
		result += 10; //0이 저장되어있는 result에 10을 더함
		System.out.println("result= " + result);
		result -= 5; //10인 result에 5를 뺌
		System.out.println("result= " + result);
		result *= 3; //5가된 result에 3을 곱합
		System.out.println("result= " + result);
		result /= 5; //15가된 result에 5를나눔
		System.out.println("result= " + result);
		result %= 3; //3이된 result에 3을 나눈 나머지값을 구함
		System.out.println("result= " + result);
	}

}
