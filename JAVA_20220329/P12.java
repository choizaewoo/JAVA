package JAVA_20220329;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit temperature");
		a = sc.nextDouble();
		System.out.println("Celsius temperature is = " + celsius(a));
	}
		static double celsius(double f) {
			return (f-32)*5/9;
		}
}

// ¼·¾¾ c = 5/9*(f - 32)
// È­¾¾ f = (c*9/5) + 32 
