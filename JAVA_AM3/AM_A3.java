package JAVA_AM_20220331;

import java.util.Scanner;

public class AM_A3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number");
		int num = sc.nextInt();
		guGudan(num,1);
	}
	public static void guGudan(int num, int i) {
		
		if(i>9) {
			return ;
		}else {
			System.out.println( num + "*" + i + "=" + num * i);
			guGudan(num,i+1);
		}
		
	}
}
