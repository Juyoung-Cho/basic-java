package day0225.date.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarEx3 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("날짜를 입력하세요 yyyy/MM/dd");
		
		String input = scan.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date i_date = sdf.parse(input); 
		
		Calendar c = Calendar.getInstance();
		c.setTime(i_date); 
		
		int week = c.get(Calendar.DAY_OF_WEEK);
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
