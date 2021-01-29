package HelloJava;

public class IfRandomNumberExample {

	public static void main(String[] args) {
		//1~9까지 무작위 수
		int num = (int) (Math.random() * 9) + 1; //1~9 무작위수 하나 뽑기
		/*Math.random()메소드는 0.0이상 1.0미만에 해당하는 double타입의 난수 하나를 리턴
		 만약 Math.random()메소드에서 0.1이 나왔다면 9가곱해져 0.9가되고, 거기에 1을더해 1.9가 되는데, 정수타입으로 강제변환을 해주어서 1이된다.*/
		
		if(num==1) {
			System.out.println("1이 나왔습니다.");
		} else if(num==2) {
			System.out.println("2가 나왔습니다.");
		} else if(num==3) {
			System.out.println("3이 나왔습니다.");
		} else if(num==4) {
			System.out.println("4가 나왔습니다.");
		} else if(num==5) {
			System.out.println("5가 나왔습니다.");
		} else if(num==6) {
			System.out.println("6이 나왔습니다.");
		} else if(num==7) {
			System.out.println("7이 나왔습니다.");
		} else if(num==8) {
			System.out.println("8이 나왔습니다.");
		} else {
			System.out.println("9가 나왔습니다.");
		}
	}

}
