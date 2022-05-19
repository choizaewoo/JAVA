package JAVA_20220329;

import java.util.Calendar;
import java.util.Date;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Operation oper = new Operation(); //객체 생성
//		Price pri = new Price(); 
		Date date = new Date(); //java.util //현재 날짜를 알려줌  //data함수
		System.out.println(date.toString());
		System.out.println(date.getMonth());
		System.out.println(date.getHours());
		System.out.println(date.getDay());
		System.out.println(date.getTime());
		System.out.println(date.getTimezoneOffset());
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MILLISECOND));
		
	
		
	}

}
