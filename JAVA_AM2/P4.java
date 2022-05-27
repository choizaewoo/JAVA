package JAVA_AM_20220330;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Select menu");
			System.out.println("1. Encryption\n" + "2. Decryption");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			sc.nextLine();
			
			if (select == 1) {
				System.out.println("Input the word");
				String str = sc.nextLine();
				str = str.toLowerCase();
				for (int i = 0; i < str.length(); i++) {
					System.out.print((char) (219 - str.charAt(i)));
				}
			}

			if (select == 2) {
				System.out.println("Input the word");
				String str1 = sc.nextLine();
				str1 = str1.toLowerCase();
				for (int i = 0; i < str1.length(); i++) {
					System.out.print((char) (219 - str1.charAt(i)));
				}
			}

			System.out.println();
			System.out.println();
		}
	}
}
