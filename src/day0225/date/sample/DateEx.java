package day0225.date.sample;
//date->text : formatting
//text->date : parsing
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, ''yy" );
		String now = sdf.format(d);
		System.out.println(now);

	}

}
