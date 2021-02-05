package HelloJava;

import java.util.Calendar; //Calendar 쿨랴수눈 java.util 패키지에 있으므로 import가 필요

public class EnumWeekExample {

	public enum Week{ //열거타입 Week 선언
		MONDAY, //열거타입 상수
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	public static void main(String[] args) {
		//열거 타입과 열거 상수
		Week today = null; //열거타입 변수 선언
		
		Calendar cal = Calendar.getInstance(); //Calendar 객체 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK); //get()메소드를 통해 일(1)~토(7)까지의 숫자를 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break; //열거상수 대입
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;	
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 운동을 쉽니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}

}
