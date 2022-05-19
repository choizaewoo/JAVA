package review;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class review_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a;		 
		String b;
		int c;
		 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		 Date now = new Date();
		 String nowTime1 = sdf1.format(now);
 
		 a = Integer.parseInt(nowTime1.substring(0, 4));
		 System.out.println("Current Date : " +  nowTime1);
		 
		 System.out.print("Birthday :");
		 b = sc.nextLine(); 
		 
		 c = Integer.parseInt(b.substring(0, 4));

		 int age = a - c + 1;
		 int yearAge = a - c - 1;
		 System.out.println(age + " years old in korean age" );
		 System.out.println(yearAge  + " years old in international age");
		 
		 
	}
}
