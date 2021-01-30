package HelloJava;

public class BreakExample {

	public static void main(String[] args) {
		//1. break문으로 while문 종료
		/*while(true) { //while(true)가 되면 무한반복이다.
			integer point = (integer) (Math.random() * 6) + 1;
			System.out.println(point);
			if(point==6) { 
				break; //6이 나올때까지 무한반복 및 6이나오면 반복 종료
			}
		}
		System.out.println("프로그램 종료");*/
		
		//2. 바깥쪽 반복문 종료
		Outter: for(char upper='A'; upper<='Z'; upper++) { //'A'부터 'Z'까지 하나씩증가(바깥쪽 반복문)
			/*반복문이 중첩되어 있는 경우 break문은 가장 가까운 반복문만 종료하므로 바깥쪽반복문까지 종료시키려면 바깥쪽 반복문에 이름(Outter)을
			붙이고 'break 이름;'을 사용한다.*/
			for(char lower='a'; lower<='z'; lower++) { //'a'부터 'z'까지 하나씩증가(안쪽 반복문)
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
