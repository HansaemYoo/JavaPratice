package HelloJava;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		//논리부정 연산자
		boolean play = true;
		System.out.println(play); //true이기 때문에 true 출력
		
		play= !play;
		System.out.println(play); //논리부정연산자인 !가 있으므로 false출력
		
		play = !play;
		System.out.println(play); //부정 + 부정 이므로 true 출력
	}

}
