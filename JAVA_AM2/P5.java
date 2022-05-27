package JAVA_AM_20220330;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] upper = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int pass = 0;
		System.out.println("e.g");
		System.out.println("#1 : 9 digits or less");
		System.out.println("#2 : contain \"1\"");
		System.out.println("#3 : contain one uppercase");
		System.out.println("#4 : don\'t contain \"i\"");
		System.out.println("#5 : contain \"!\"");
		System.out.println("-> ");
		String passwd = sc.next();

		String[] passwdArr = passwd.split("");

		if (passwd.length() <= 9 && passwd.contains("1") && !passwd.contains("i") && passwd.contains("!")) {
			for (int j = 0; j < passwd.length(); j++) {
				for (int i = 0; i < upper.length; i++) {
					if (passwdArr[j].contains(upper[i])) {
						pass++;
					}
				}
			}

			if (pass == 1) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}

		} else {
			System.out.println("FAIL");
		}

	}

}
