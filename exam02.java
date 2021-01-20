package HelloJava3;

public class exam02 {

	public static void main(String[] args) {
		//변수 hour과 minute 선언 및 초기화
		int hour = 4;
		int minute = 25;
		//"4시간 25분" 출력
		System.out.println(hour + "시간 " + minute + "분");
		
		//총 몇분인지 저장할 변수인 totalMinute 선언 및 초기화
		int totalMinute = (hour * 60) + minute;
		//"4시간 25분은 총 265분" 출력
		System.out.println("4시간 25분은 총 " + totalMinute + "분");
	}

}
