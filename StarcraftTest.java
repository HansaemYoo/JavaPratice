package constructor;

//6. 총정리 마린과 메딕
public class StarcraftTest {

	public static void main(String[] args) {

		Marine ma = new Marine("레이너", 80);
		Medic me = new Medic("모랄레스", 60, 60);

		//마린의 스팀팩
		ma.stimpack();
		//메딕의 힐
		me.heal(ma);
	}

}

class Marine{ //마린클래스
	
	//필드
	String name;
	int hp;
	
	//생성자
	Marine(String n, int h){
		name = n;
		hp = h;
	}
	
	//메소드
	void stimpack() { 
		System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
		hp -= 10;
		System.out.printf("%d\n", hp);
	}
}

class Medic{ //메딕 클래스
	
	String name;
	int hp;
	int mp;
	
	Medic(String n, int h, int m){
		name = n;
		hp = h;
		mp = m;
	}
	
	void heal(Marine target) {
		System.out.printf("[%s]의 치유! => [%s]의 HP: %d -> ", name, target.name, target.hp);
		target.hp += 10;
		System.out.printf("%d", target.hp);
	}
	
}
	
