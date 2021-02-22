package accessModifier;

//7. 총정리 - 기사 돈키호테
public class KnightTest {

	public static void main(String[] args) {
		
		//객체생성
		Knight k = new Knight("돈키호테", 30);
		
		System.out.println("[객체 생성]");
		//증가하기전 체력 출력
		System.out.println(k.toStr());
		
		System.out.println("[체력 증가 +30]");
		
		//체력 증가 메소드
		k.setHp(60); //30->60으로 증가
		
		//증가 한후 체력 출력
		System.out.println(k.toStr());

	}

}

class Knight{
	
	//필드
	private String name;
	private int hp;
	
	//생성자
	public Knight(String name, int hp){
		this.name = name;
		this.hp = hp;
	}

	//메소드
	public String toStr() {
		return String.format("\tKnight { name: %s, hp: %d }", this.name, this.hp);
	}
	
	//세터, 게터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
}