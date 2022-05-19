package JAVA_20200331;

import java.util.Scanner;

public class P1_2 {

	public static final String fatherName = "koko";
	public static final String motherNmae = "momo";
	public static final String sonName = "nono";
	public static final String daughterName = "lolo";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = sc
		string str = sc.nextint()
		
		printName(fatherName);
		printName(motherNmae);
		printName(sonName);
		printName(daughterName);
	}

	}
	public static void print(String member) {
		if (member == 1) {
			print("koko");
		} else if (member == 2) {
			print("momo");
		} else if (member == 3) {
			print("nono");
		} else if (member == 4) {
			print("lolo");
		} else {
			print("error");
		}
	}
}
