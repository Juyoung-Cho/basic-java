package day0225.date.sample;

import java.util.Calendar;

//add roll
public class CalendarEx2 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2023, 7, 31); // 2023/8/31
		printDate(cal);
		
		System.out.println("1일후");
		cal.add(Calendar.DATE, 1); //date에서 1일후
		printDate(cal);
		
		System.out.println("6개월 전");
		cal.add(Calendar.MONTH, -6);
		printDate(cal);
		
		System.out.println("31일후");
		cal.roll(Calendar.DATE, 31);
		printDate(cal); //roll은 다른 field 값을 변경하지 않는다. 그래서 month는 안바뀐 것.

	}
	
	public static void printDate(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //month+1로 꺼내온다.
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d년 %d월 %d일\n\n",year,month,date);
	}

}
