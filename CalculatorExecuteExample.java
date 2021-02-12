package HelloJava;

public class CalculatorExecuteExample {
		//클래스 내부에서 메소드 호출
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		
		double avg(int x, int y) {
			double sum = plus(x,y); //5번줄 호출
			double result = sum / 2;
			return result;
		}
		
		void execute() {
			double result = avg(7,10); //10번줄 호출
			println("실행결과: " + result); //21번줄 호출
		}
		
		void println(String message) {
			System.out.println(message);
		}
		
	public static void main(String[] args) {
		//CalculatorExecute() 호출
		CalculatorExecuteExample myCal = new CalculatorExecuteExample();
		myCal.execute();
	}

}
