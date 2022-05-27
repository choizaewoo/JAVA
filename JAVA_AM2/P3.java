package JAVA_AM_20220330;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input number1");
		int n1 = sc.nextInt();
		System.out.println("input number2");
		int n2 = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= n1; i++) {
			if (i % n2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("SUM :" + sum);
		for (int i = 1; i <= n1; i++) {
			if (i % n2 == 0) {
				System.out.print(i+" ");
				
			}
		}

	}

}
