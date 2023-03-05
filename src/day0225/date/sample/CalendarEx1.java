package day0225.date.sample;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();//GregorianCalendar로 객체 생성
		
//		TimeZone timezone = TimeZone.getTimeZone("Asia/Seoul");
//		Calendar cal = Calendar.getInstance(timezone);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //month+1로 꺼내온다.
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d년 %d월 %d일\n",year,month,date);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d시 %d분 %d초\n",hour,minute,second);
		
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == Calendar.AM) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		int week = cal.get(Calendar.DAY_OF_WEEK);
		if(week == Calendar.SUNDAY) {
			System.out.println("일요일");
		}else if(week == Calendar.MONDAY) {
			System.out.println("월요일");
		}else if(week == Calendar.TUESDAY) {
			System.out.println("화요일");
		}else if(week == Calendar.WEDNESDAY) {
			System.out.println("수요일");
		}else if(week == Calendar.THURSDAY) {
			System.out.println("목요일");
		}else if(week == Calendar.FRIDAY) {
			System.out.println("금요일");
		}else if(week == Calendar.SATURDAY) {
			System.out.println("토요일");
		}

	}

}
