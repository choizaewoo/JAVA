package JAVA_AM_20220331;

import java.util.Scanner;

public class AM_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the value of n");
		int n = sc.nextInt();
		System.out.println("Input the value of r");
		int r = sc.nextInt();
		int comb;
		int r2 = n-r;
	
		comb = factorial(n) / (factorial(r) * factorial(n - r));


		System.out.print(
				"C(" + n + "," + r + ")" + "=" + n + "!" + "/" + "(" + n + "-" + r + ")" + "!" + "=" );
	
		System.out.print("(");
		
		for (int i = n - 1 ; i >= 1; i--) {
			System.out.print(n-- + "X" );
		}
		System.out.print("1)");
		
		System.out.print("/");
		
	
		System.out.print("(");
		for (int k = r2 -1; k >= 1; k--) {
	
			System.out.print(r2-- + "X" );
		}
		
		System.out.print("1)" + "=" + "Combination: " + comb);
		
		
	}
	

	private static int factorial(int n) {
		int fact = 1;
		int i = 1;

		while (i <= n) {
			fact *= i;
			i++;
		}
		return fact;

	}

}
