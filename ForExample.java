package HelloJava;

public class ForExample {

	public static void main(String[] args) {
		//1부터 100까지의 합 구하기
		System.out.println("1. 1부터 100까지의 합 구하기");
		int sum = 0;
		for(int i=1; i<=100; i++) { //for(i는 1부터 100까지 1씩증가한다.)
			sum += i; //변수 sum에 반복문이 끝날때까지 i의 값을 계속 반복해서 더함
		}
		System.out.println("1~100까지의 합: " + sum);
		
		//2. 중첩 for문
		System.out.println("\n2. 구구단 출력하기");
		for (int m=2; m<=9; m++) {
			System.out.println(m + "단");
			for (int n=1; n<=9; n++) { 
				System.out.println(m + "X" + n + "=" + (m * n));
			}
		}
	}

}
