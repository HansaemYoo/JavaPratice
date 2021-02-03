package HelloJava;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		//객체를 참조하는 배열
		
		String strA[] = new String [3]; //String타입의 strA라는 세칸짜리 배열생성
		strA[0] = "Java";
		strA[1] = "Java";
		strA[2] = new String("Java"); //String객체를 new연산자로 생성하면 무조건 새로운 String객체가 된다.
		
		System.out.println( strA[0] == strA[1] ); //==는 객체의 번지를 비교 (true)
		System.out.println( strA[0] == strA[2] ); //==는 객체의 번지를 비교 (false)
		System.out.println( strA[0].equals(strA[2]) ); //String배열도 결국 String 변수와 동일하게 취급되므로 String항목간에 문자열을 비교하기 위해서는 equal()메소드를 사용 (true)
	}

}
