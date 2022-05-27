package JAVA_AM_20220329;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number ");
		int number1 = 0;
		number1 = sc.nextInt();

		int number2 = 0;
		number2 = sc.nextInt();

		int number3 = 0;
		number3 = sc.nextInt();

		if (number1 % number2 == 0 && number1 % number3 == 0) {
			System.out.println(number1 + " is Divisible by " + number2 + " and " + number3);
		} else {
			System.out.println(number1 + " Not divisible by " + number2 + " and " + number3);
		}

	}

}

