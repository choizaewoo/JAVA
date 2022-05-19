package JAVA_AM_20220401;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Practice {

	public static void main(String[] args) throws ParseException {

		// Dates to be parsed
		Scanner sc = new Scanner(System.in);
		System.out.println("�ð� �� �� ���̿� ':' �� �־��ּ���");
		String time1 = sc.nextLine();
		String time2 = sc.nextLine();
		System.out.println(time1);
		System.out.println(time2);


		// HH:mm:ss �������� SimpleDateFormat ��ü ����
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

		// time1 time2 ��Ʈ���� �Ľ��ϱ� //
		Date date1 = simpleDateFormat.parse(time1);
		Date date2 = simpleDateFormat.parse(time2);

		// �и��� ���� ��� //abs() - ����� ������ �ٲ��� (���밪) //abs()�޼ҵ带 ����ϴ��� int�� long�� �ּڰ��� ������� ����.
		long differenceInMilliSeconds = Math.abs(date2.getTime() - date1.getTime()); 

		// �� ���� ���
		long differenceInHours = (differenceInMilliSeconds / (60 * 60 * 1000)) % 24;

		// �� ���� ���
		long differenceInMinutes = (differenceInMilliSeconds / (60 * 1000)) % 60;

		// �� ���� ���
		long differenceInSeconds = (differenceInMilliSeconds / 1000) % 60;

		System.out.println("�ð� ���� : " + differenceInHours + "h:" + differenceInMinutes + "m:" + differenceInSeconds + "s");
	}
}
//		int hour, min, sec, sec2;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" ù��° �ʸ� �Է�");
//		sec = sc.nextInt();
//		
//		min = sec / 60;
//		hour = min / 60;
//		sec = sec % 60;
//		min = min % 60;
//	
//		System.out.println(hour + "��" + min +"��"+ sec +"��");
//	}
//}
