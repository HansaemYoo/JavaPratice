package HelloJava;

public class ComputerExample {
	//매개 변수의 개수를 모를 경우
	int sum(int[] values) { //매개변수를 배열로 선언
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		ComputerExample myCom = new ComputerExample();
		
		int values1[] = {1, 2, 3};
		int result1 = myCom.sum(values1);
		System.out.println("result1: " + result1);

		int result2 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
	}

}
