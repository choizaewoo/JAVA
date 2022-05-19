package review;

import java.util.Scanner;

public class review_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter investment amount:");
		double investAmount = sc.nextDouble();
		System.out.println("Enter interest rate:");
		double rate = sc.nextDouble();
		System.out.println("Enter number of years:");
		int year = sc.nextInt();
		double futureInvestmentValue = 0.0;

		for (int i = 1; i <= year; i++) {
			futureInvestmentValue += investAmount * Math.pow((1 + rate * 0.01), i);
		}
		System.out.printf("%.4f", futureInvestmentValue);

	}
}
