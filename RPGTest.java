package inheritance;

//상속을 통한 클래스 확장
class RPGTest {

	public static void main(String[] args) {
		//객체생성
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;
		
		Wizard wizard = new Wizard();
		wizard.name = "해리포터";
		wizard.hp = 120;
		wizard.mp = 100;
		
		novice.punch();
		wizard.punch();
		
		wizard.fireball();
	}

}

class Novice{
	//필드
	String name;
	int hp;

	//메소드
	public void punch() {
		System.out.printf("[%s]의 펀치\n", this.name);
	}
	
}

class Wizard extends Novice { //extends = Wizard클래스는 Novice클래스를 상속 한다.
	//필드
	int mp;
	
	//메소드
	public void fireball() {
		System.out.printf("[%s]의 파이어볼@@\n", this.name);
	}
}