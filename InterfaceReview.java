package interFace;

import java.util.ArrayList;
//7. 리뷰-인터페이스
public class InterfaceReview {

	public static void main(String[] args) {
		//인터페이스 타입으로 업캐스팅
		Sounding seil = new Seil("PSI");
		Sounding dongju = new Dongju("PDJ");
		Sounding hyobin = new Hyobin("SHB");
		
		//ArrayList
		ArrayList<Sounding> list = new ArrayList<Sounding>();
		
		//ArrayList에 객체 추가
		list.add(seil);
		list.add(dongju);
		list.add(hyobin);
		
		//반복문을 통한 출력
		for(int i = 0; i < list.size(); i++) {
			list.get(i).sound();
		}
	}
}

interface Sounding { //인터페이스-특정 메소드에 대한 대략적인 틀 정의
	public void sound(); //프로토타입 메소드-추상메소드라고도 하며 내용이없음
}

class Seil implements Sounding { //implements-특정 인터페이스 구현
	//필드
	private String name; //이름
	
	//생성자
	Seil(String name){
		this.name = name;
	}
	
	//프로토타입 메소드 오버라이딩
	public void sound() {
		System.out.printf("%s: 니코니코\n", this.name);
	}
}

class Dongju implements Sounding {
	private String name; //이름
	
	Dongju(String name){
		this.name = name;
	}
	
	public void sound() {
		System.out.printf("%s: 3ex\n", this.name);
	}
}

class Hyobin implements Sounding {
	private String name; //이름
	
	Hyobin(String name){
		this.name = name;
	}
	
	public void sound() {
		System.out.printf("%s: 응애\n", this.name);
	}
}