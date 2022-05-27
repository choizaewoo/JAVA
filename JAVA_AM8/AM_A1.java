package JAVA_AM_20220407;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AM_A1 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		AM_A1 thread = new AM_A1();
		thread.start();
		Date now = CurrentTime();
		printTime(now);
		aftersec(now);
	}

	private static Date CurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();

		return date;
	}

	private static void printTime(Date now) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String time = format.format(now);
		System.out.println(time);

	}

	private static void aftersec(Date now) {
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String t = null;
		int i = sc.nextInt();
		Date later = CurrentTime();
		if (later.getTime() > now.getTime() + i) {
			try {
				Thread.sleep(i * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Time is already over : " + later);
			}
		} else {
			try {
				Thread.sleep(i * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Time is over : " + t);
			}
		}

	}
}
