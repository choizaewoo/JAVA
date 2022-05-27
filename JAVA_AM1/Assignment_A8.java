package JAVA_AM_20220328;

import java.util.Scanner; // Find GCD (Greatest Common Divisor)

public class Assignment_A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int gcd = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		for(int i=1; i<=num1 && i<=num2; i++) //check if i divides both num1 and num2
		{
			if(num1 % i == 0 && num2 % i ==0)
			{
				gcd = i;
			}
			System.out.println("GCD of" + num1 + "and" + num2 + "is" + gcd);
		}
	}

}
