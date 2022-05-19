package JAVA_20220329;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int won;
		int usd;
		int select;
		double rateUsd = 1220.80;// 원 대비 달러환율

		Scanner sc = new Scanner(System.in);

		for (;;) {

			System.out.println("SELECT WHAT DO YOU CHANGE\n" + "1. South Korean Won -> United States Dollar\n"
					+ "2. United States Dollar -> South Korean Won");
			select = sc.nextInt();

			if (select == 1) {
				System.out.println("YOU SELECT WON TO DOLLAR!\n" + "How much do you want to change?");
				won = sc.nextInt();
				System.out.println("Currency Change : " + (double) won / rateUsd);
			} else if (select == 2) {
				System.out.println("YOU SELECT DOLLAR TO WON!\n" + "How much do you want to change?");
				usd = sc.nextInt();
				System.out.println("Currency Change : " + (double) rateUsd * usd);
			}
			System.out.println();
		}
	}

}
