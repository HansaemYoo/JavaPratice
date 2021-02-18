package JavaPractice;

public class Singleton {
	//정적 필드
	private static Singleton singleton = new Singleton(); //외부에서 생성자 호출을 막기위해 private 붙여줌
	
	//생성자
	private Singleton() {}
	
	//정적메소드
	static Singleton getINstance() {
		return singleton;
	}
	
	public static void main(String[] args) {
		// 싱글톤 객체
		Singleton obj1 = Singleton.getINstance();
		Singleton obj2 = Singleton.getINstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 SIngleton 객체입니다.");
		} else {
			System.out.println("다른 SIngleton 객체입니다.");
		}
	}

}
