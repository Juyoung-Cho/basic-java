package day0209.oopex.sample;

public class Time {
//캡슐화	
	private int hour;
	private int minute;
	private int second;
	
	//setter
	public void setHour(int hour) {
		if(hour < 1 || hour > 24) {
			System.out.println("1~24사이의 값을 넣으시오.");
		}else {
			System.out.println("시간값이 저장되었습니다.");
			this.hour = hour;
		}
	}
	public void setMinute(int minute) {
		if(minute < 1 || minute > 59) {
			System.out.println("1~59사이의 값을 넣으시오.");
		}else {
			System.out.println("분값이 저장되었습니다.");
			this.minute = minute;
		}
	}
	public void setSecond(int second) {
		if(second < 1 || second > 59) {
			System.out.println("1~59사이의 값을 넣으시오.");
		}else {
			System.out.println("초값이 저장되었습니다.");
			this.second = second;
		}
	}
	//getter
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	

}
