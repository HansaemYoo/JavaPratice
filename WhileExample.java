package HelloJava;

public class WhileExample {

	public static void main(String[] args) {
		// 1부터100까지 합을 출력(while)
		int sum = 0; //1~100까지의 합을 저장할 변수
		int i = 1; //루프 카운터 변수
		while(i<=100) { //while(조건) -> false가 될때까지 무한반복
			sum += i; //sum = sum + i;
			i++; //i = i + 1;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);

	}

}
