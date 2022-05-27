package JAVA_AM_20220404;

import java.util.Scanner;

public class AM_A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };
			int count = 0, num, oneNum, numLength;
			System.out.println("input number 0 ot 9");
			int digit = sc.nextInt();

			for (int i = 0; i < numbers.length; i++) {
				num = numbers[i];
				numLength = (int) (Math.log10(numbers[i]) + 1);
				for (int j = 0; j < numLength; j++) {
					oneNum = num % 10;
					num /= 10;
					if (oneNum == digit) {
						System.out.print(numbers[i] + " ");
					}
				}
			}
			System.out.println();

		}
	}
}