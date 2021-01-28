package HelloJava;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		//삼항 연산자: 3개의 피연산자를 필요로 하는 연산자로 ?앞의 조건식에 따라 콜론 앞뒤의 피연산자가 선택된다해서 조건 연산식이라고도 부른다.
		int score1 = 85;
		//(조건식) ? 피연산자2 : 피연산자3
		char grade1 = (score1 > 90) ? 'A' : 'B'; //(score1>90)을 연산하여 true가 나오면 'A'가 되고, false면 'B'가 된다.
		System.out.println(score1 + "점은" + grade1 + "등급입니다.");
		//이렇게도 가능하다.
		int score2 = 85;
		char grade2;
		if(score2 > 90) {
			grade2 = 'A'; //조건식이 true면 'A'
		} else {
			grade2 = 'B'; //false면 'B'
		System.out.println(score2 + "점은" + grade2 + "등급입니다.");
	}
	}
}
