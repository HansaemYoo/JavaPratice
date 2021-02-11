package HelloJava;

public class ReturnEaxample {
	//return문: 메소드 선언에 리턴 타입이 있는 메소드는 반드시 리턴문을 사용해서 리턴값을 지정해야 한다.
		//필드
		int gas;
		
		//생성자
		
		//메소드
		void setGas(int gas) { //리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
			this.gas= gas;
		}
		
		boolean isLeftGas() { //return값이 boolean인 메소드로 gas필드값이 0이면 false를 아니면 true를 리턴
			if(gas == 0) {
				System.out.println("gas가 없습니다.");
				return false;
			}
			System.out.println("gas가 있습니다.");
			return true;
		}
		
		void run() { //리턴값이 없는 메소드로 gas필드값이 0이면 리턴문으로 메소드를 강제 종료
			while(true) {
				if(gas > 0) {
					System.out.println("달립니다.(gas잔량: " + gas + ")");
					gas -= 1;
				} else {
					System.out.println("멈춥니다.(gas잔량: " + gas + ")");
					return; //메소드 실행 종료
				}
			}
		}
		
	public static void main(String[] args) {
		ReturnEaxample myCar = new ReturnEaxample();
		
		myCar.setGas(5); //Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); //Car의 isLeftGas()메소드 호출
		if(gasState) {
			System.out.println("출발");
			myCar.run(); //Car의 run()메소드 호출
		}
		
		if(myCar.isLeftGas()) { //Car의 isLeftGas()메소드 호출
			System.out.println("gas충전 필요 없음");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}
