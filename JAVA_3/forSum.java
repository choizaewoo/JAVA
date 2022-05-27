package JAVA_20220329;

import java.util.Scanner;

public class forSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б");
	
		int n = 0;
		int sum = 0;
		n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			sum += i;	
		}
		System.out.println(sum);
	}
}
