package HelloJava;

public class AdvancedForExample {

	public static void main(String[] args) {
		//향상된 for문
		int scores[] = { 95, 71, 84, 93, 87 }; //정수타입 scores 배열 생성
		
		int sum = 0;
		for(int score : scores) { //향상된 for문에서는 for(타입 항목을 저장할 변수선언 : 배열)
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length; //평균구하기
		System.out.println("점수평균 = " + avg);
	}

}
