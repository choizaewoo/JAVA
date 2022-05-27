package JAVA_20200331;

import java.util.Scanner;

public class P1 {

	public static final String fatherName = "koko";
	public static final String motherNmae = "momo";
	public static final String sonName = "nono";
	public static final String daughterName = "lolo";
	public static final int fatherNum =1, motherNum = 2, sonNum = 3, daughterNum =4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б");
		print(1, "father");
		print(2, "Mother ");
		print(3, "Son ");
		print(4, "Daughter  ");
		int chooseNum = sc.nextInt();
		printName(chooseNum);
		
	}

	public static void print(int a, String text) {
		System.out.println(a + "." + text);
	}

	
	public static void print(int chooseNum) {
		if (chooseNum == fatherNum) {
			print("koko");
		} else if (chooseNum == motherNum) {
			print("momo");
		} else if (chooseNum == sonNum) {
			print("nono");
		} else if (chooseNum == daughterNum) {
			print("lolo");
		} else {
			print("error");
		}
	}
}
