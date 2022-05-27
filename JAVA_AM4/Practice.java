package JAVA_AM_20220401;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Practice {

	public static void main(String[] args) throws ParseException {

		// Dates to be parsed
		Scanner sc = new Scanner(System.in);
		System.out.println("시간 분 초 사이에 ':' 를 넣어주세요");
		String time1 = sc.nextLine();
		String time2 = sc.nextLine();
		System.out.println(time1);
		System.out.println(time2);


		// HH:mm:ss 형식으로 SimpleDateFormat 객체 생성
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

		// time1 time2 스트링을 파싱하기 //
		Date date1 = simpleDateFormat.parse(time1);
		Date date2 = simpleDateFormat.parse(time2);

		// 밀리초 차이 계산 //abs() - 양수를 음수로 바꿔줌 (절대값) //abs()메소드를 사용하더라도 int와 long의 최솟값은 변경되지 못함.
		long differenceInMilliSeconds = Math.abs(date2.getTime() - date1.getTime()); 

		// 시 차이 계산
		long differenceInHours = (differenceInMilliSeconds / (60 * 60 * 1000)) % 24;

		// 분 차이 계산
		long differenceInMinutes = (differenceInMilliSeconds / (60 * 1000)) % 60;

		// 초 차이 계산
		long differenceInSeconds = (differenceInMilliSeconds / 1000) % 60;

		System.out.println("시간 차이 : " + differenceInHours + "h:" + differenceInMinutes + "m:" + differenceInSeconds + "s");
	}
}
//		int hour, min, sec, sec2;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" 첫번째 초를 입력");
//		sec = sc.nextInt();
//		
//		min = sec / 60;
//		hour = min / 60;
//		sec = sec % 60;
//		min = min % 60;
//	
//		System.out.println(hour + "시" + min +"분"+ sec +"초");
//	}
//}
