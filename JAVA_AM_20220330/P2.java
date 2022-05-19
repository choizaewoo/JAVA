package JAVA_AM_20220330;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int money = 0;

		while (true) {
			System.out.println("menu");
			System.out.println("1. Deposit\n" + "2. Withdrawal");
			System.out.println("Select");
			int select = sc.nextInt();
			System.out.println("Balance : " + money);
			System.out.println("Input");
			int input = sc.nextInt();

			if (select == 1) {
				money += input;
			} else if (select == 2) {
				money -= input;
			} else {
				System.out.println("get out");
			}
			
		}
	}

}
