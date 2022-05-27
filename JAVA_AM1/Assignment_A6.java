package JAVA_AM_20220328;

import java.util.Scanner;

public class Assignment_A6 { // Find the Factors of N

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Inputing scanner class, sc is opjector
		System.out.println("Factors of :");
		int num = 0; // Setting the Variable 'num', making 0(reset)
		num = sc.nextInt(); // Data Type Method

		for (int i = 1; i <= num; i++) // Loop runs from 1 of i to any number
		{
			if (num % i == 0) // If num is divided by i, i is the factor
			{
				System.out.println(i);
			}
		}

	}

}
