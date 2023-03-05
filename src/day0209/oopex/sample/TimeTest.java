package day0209.oopex.sample;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(100); //안됨.
		t.setMinute(40);
		t.setSecond(50);
		t.setHour(20);
		
		System.out.println(t.getHour()+"h"+t.getMinute()+"m"+t.getSecond()+"s");

	}

}
