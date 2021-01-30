package HelloJava;

public class ContinueExample {

	public static void main(String[] args) {
		//continue문: for문, while문, do-while문에서만 사용하며 break문과 반대개념이다.
		//continue문을 사용한 for문
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //i를 2로 나눈 나머지가 0이 아닐경우, 즉 홀수인 경우
				continue; //특정 조건을 만족하는 경우 continue문을 실행하여 다음 반복으로 넘아감
			}
			System.out.println(i); //홀수를 제외한 짝수만 나타난다.
		}
	}

}
