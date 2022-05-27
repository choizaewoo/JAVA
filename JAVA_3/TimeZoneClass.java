package JAVA_20220329;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone time;
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		
		time = TimeZone.getTimeZone("Asia/Tokyo");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + ":" + dateFormat.format(date));
		
		time = TimeZone.getTimeZone("Europe/Berlin");
		dateFormat.setTimeZone(time);
		System.out.println(time.getDisplayName() + ":" + dateFormat.format(date));
		
	}

}
