package JAVA_20220405;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		int count = getNum();
		String[] numberArr = getNums();
		showResult(numberArr, count);
	}
	public static void showResult(String[] numberArr, int count) {
		int countInt = count;
		float average = 0;
		int minimum = 0, maximum = 0, summation = 0;
		for (int i = 0; i < countInt; i++) {
			int numberInt = Integer.parseInt(numberArr[i]);
			if (i == 0) {
				maximum = numberInt;
				minimum = numberInt;
			} else if (numberInt > maximum) {
				maximum = numberInt;
			} else if (numberInt < minimum) {
				minimum = numberInt;
			}
			summation += numberInt;
		}
		System.out.print("Average : ");
		System.out.println((float) summation / countInt);
		System.out.print("Minimum : ");
		System.out.println(minimum);
		System.out.print("Maximum : ");
		System.out.println(maximum);
		System.out.print("Summation : ");
		System.out.println(summation);
	}

	public static String[] getNums() {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		String[] numberArr = number.split(" ");
		return numberArr;
	}
	public static int getNum() {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		return count;
	}
}