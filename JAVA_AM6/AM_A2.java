package JAVA_AM_20220405;

import java.util.Scanner;

public class AM_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("단어를 입력하세요.");
			String str = sc.next();
			int length = str.length();
			int middle = length / 2;
			
			if ( length % 2 == 0) {
				System.out.print(str.charAt(middle-1));
				System.out.println(str.charAt(middle));
			}else { 
			System.out.println(str.charAt(middle));

			}
		}
	}
}
