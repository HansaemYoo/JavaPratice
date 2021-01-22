package HelloJava;

public class StringExample {

	public static void main(String[] args) {
		String name = "유한샘";
		String job = "프로그래머";
		String str = "저는 \"자바\"를 \n좋아합니다."; /*문자열 내부에 역슬래시가 붙은 문자를 사용할 수 있는데, 이것을 이스케이프 문자 라고 한다.
													데이터로써 큰따옴표를 사용하고싶을때는 이스케이프문자 \"를 사용한다 */
		
		System.out.println("이름: " + name);
		System.out.println("직업: " + job);
		System.out.println(str);
	}

}
