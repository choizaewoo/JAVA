package JAVA_AM_20220328;

import java.util.Scanner;

public class Assignment_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int j = 0;
		i = scanner.nextInt();

		switch (i) { // variable i
		case 2:
			while (i == 2) { // when 'i' has 2
				while (j < 10) { // j is lower than 10
					System.out.println(i + "*" + j + "=" + (i * j));
					j++; // when i==2 and j<10 was calculated, j is getting plus 1 directly until j==9
				}
			}
			break; // get right anwser, get exit / if there is no break, condition will be
					// implemented repeatedly
		case 3:
			while (i == 3) { // when 'i' has 3
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}

			break; // get right anwser, get exit

		case 4:
			while (i == 4) { // when 'i' has 4
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}

			break; // get right anwser, get exit

		case 5:
			while (i == 5) { // when 'i' has 5
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}

			break;

		case 6:
			while (i == 6) { // when 'i' has 6
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}

			break; // get right anwser, get exit

		case 7:
			while (i == 7) { // when 'i' has 7
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}
			break; // get right anwser, get exit

		case 8:
			while (i == 8) { // when 'i' has 8
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}
			break; // get right anwser, get exit

		case 9:
			while (i == 9) { // when 'i' has 9
				while (j < 10) {
					System.out.println(i + "*" + j + "=" + (i * j));
					j++;
				}
			}
			break; // get right anwser, get exit

		default: // if variable has not all of case
			System.out.println("잘못된 숫자입니다");
			break; // get right anwser, get exit

		}

	}
}
