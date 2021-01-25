package HelloJava;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		//증감 연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------");
		x++; //다른연산을 수행한 후 피연산자의 값을 1증가 시킴 (10 + 1)
		++x; //다른연산을 수행하기 전 피연산자의 값을 1증가 시킴 (11 + 1)
		System.out.println("x= " + x);
		
		System.out.println("----------------------");
		y--; //다른연산을 수행한 후 피연산자의 값을 1감소 시킴 (10 - 1)
		--y; //다른연산을 수행하기 전 피연산자의 값을 1감소 시킴 (9 - 1)
		System.out.println("y= " + y);
		
		System.out.println("----------------------");
		z = x++; //(12)
		System.out.println("z= " + z);
		System.out.println("x= " + x); //(12 + 1)
		
		System.out.println("----------------------");
		z = ++x; //(13 + 1)
		System.out.println("z= " + z);
		System.out.println("x= " + x); //(13 + 1);
		
		System.out.println("----------------------");
		z = ++x + y++;
		System.out.println("z= " + z); //(15 + 8)
		System.out.println("x= " + x); //(15)
		System.out.println("y= " + y); //(8 + 1)
	}
}
