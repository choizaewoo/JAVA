package JAVA_20220407;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class P6 {

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = new Date();
//		
//		LocalTime now = LocalTime.now();
//		System.out.println(now);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH��mm��ss��");
//		String formatedNow = now.format(formatter);
//		System.out.println(formatedNow);
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		
//		
//		cal.add(Calendar.SECOND, 30);
//		date = formatter.format(cal.getTime());
//		
		String today = null;
		 
		 
		Date date = new Date();
		 
		System.out.println(date); //Thu May 13 13:25:57 KST 2021
		 
		// ���˺��� ( ����� �ú���)
		SimpleDateFormat sdformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss"); 
		 
		// Java �ð� ���ϱ�
		 
		Calendar cal = Calendar.getInstance();
		 
		cal.setTime(date);
		 
		today = sdformat.format(cal.getTime());  
		System.out.println("����ð� : " + today); 
		
		cal.add(Calendar.SECOND, 30);
		today = sdformat.format(cal.getTime());
		System.out.println("30�� ���� �ð� : " + today);
		
		
	}
}