package HelloJava;

public class IfExample {

	public static void main(String[] args) {
		//1. if문
		System.out.println("-=-=-=-=-=1. if문=-=-=-=-=-");
		int score = 93;
		if(score>=90) { //score가 90보다 크거나 같을때 실행
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score<90) {//score가 90보다 작을때 실행, 만약 조건식이 true일때 실행 될 문장이 하나라면 중괄호 생략가능 
			System.out.println("점수가 90미만입니다.");
		}
			System.out.println("등급은 B입니다.");
			
		//2. if-else문
			System.out.println("-=-=-=-=-=2. if-esle문=-=-=-=-=-");
		if(score>=90) { //조건식이 true일때 실행
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		} else { //조건식이 false일때 실행
			System.out.println("점수가 90미만입니다.");
			System.out.println("등급은 B입니다.");
		}
		//3. if-else if-else문
		System.out.println("-=-=-=-=-=3. if-else if-else문=-=-=-=-=-");
		int point = 75;
		if(point>=90) { //point가 90이상일때
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		} else if(point>=80) { //point가 80이상일때
			System.out.println("점수가 80~90입니다.");
			System.out.println("등급은 B입니다.");
		} else { //point가 80미만일때
			System.out.println("점수가 80미만입니다.");
			System.out.println("등급은 C입니다.");
		}
	}
}
