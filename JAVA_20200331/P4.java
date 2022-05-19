package JAVA_20200331;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("first number : ");
		num1 = sc.nextDouble();
		System.out.println("second number : ");
		num2 = sc.nextDouble();

		System.out.println("Enter an operator (+, -, *, /) :");
		char operator = sc.next().charAt(0);
		
		double output;
		
		switch(operator)
		{
			case '+' :
				output = num1 + num2;
				break;
				
			case '-' :
				output = num1 - num2;
				break;
				
			case '*' :
				output = num1 * num2;
				
			case '/' :
				output = num1 / num2;
				break;
		    default :
		    	System.out.println("wrong operator");
		    	return;
		}
		System.out.println(num1 + " "+operator+" "+num2+" = : " +output  );
	}
	
	

	public static void addition(double num1, double num2) {
			System.out.println("1. "+num1+" + "+num2+" + =" +(num1+num2));
	}
	
	public static void subtraction(double num1, double num2) {
		
	}
	public static void multiplication(double num1, double num2) {
		
	}
	public static void division(double num1, double num2) {

	}
}
