package HelloJava;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		//값 목록으로 배열 생성
		int scores[] = { 83, 90, 87 }; //타입 변수 [] = { ... }; 이런식으로 간단하게 배열 객체를 생성가능
		System.out.println("scores[0] : " + scores[0]); //scores배열의 0번째 값 출력
		System.out.println("scores[1] : " + scores[1]); //scores배열의 1번째 값 출력
		System.out.println("scores[2] : " + scores[2]); //scores배열의 2번째 값 출력

		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i]; //반복이 끝날때까지 socres배열의 i번쨰 값 더하기
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3; //평균을 소수점까지 구하기 위해 double타입으로 강제 변환
		System.out.println("평균 : " + avg);

		//int[] 배열이 선언된 add() 메소드가 있을경우, 값 목록으로 배열을 생성함과 동시에 add()메소드의 매개값으로 사용하고자 할 떄는 반드시 new 연산자를 사용해야 한다.
		int sum2 = add( new int[] { 80, 90, 100} ); 
		System.out.println("총합 : " + sum2);
		System.out.println();
		}
	
		public static int add(int[] scores) { //총합을 계산해서 리턴하는 메소드
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum += scores[i];
			}
			return sum;
		}
}
