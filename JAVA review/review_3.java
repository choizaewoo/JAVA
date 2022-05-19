package review;

import java.util.Scanner;

public class review_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kmh = 0;
		double ms;
		double mms = 0;
		

		ms = kmh * 1000 * 3600;
		mms = ms * 1000;

		System.out.println("m/s를 입력해주세요");
		ms = Double.parseDouble(sc.nextLine());
		System.out.println("km/h를 입력해주세요");
		kmh = Double.parseDouble(sc.nextLine());
		System.out.println("m/ms를 입력해주세요");
		mms = Double.parseDouble(sc.nextLine());

		if (ms > kmh && ms > mms) {
			System.out.println((int)ms + "m/s" + "\n" + "ms is the quickest one");
		} else if (kmh > ms && kmh > mms) {
			System.out.println((int)kmh + "km/h" +"\n" + "kmh is the quickest one");
		} else {
			System.out.println((int)mms + "m/ms" + "\n" + "mms is the quickest one");
		}
	}

}
