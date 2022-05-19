package JAVA_AM_20220328;

import java.util.Scanner;

public class Assignment_A7 { //Find the LCM ( Least Common Multiple)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int LCM = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	
		
		if(num1 > num2) {
			num2 = num1;
		}
		
		
		while(true) {
			if(LCM % num1 == 0 && LCM % num2 == 0) 
			{
				System.out.println();
				break;
			}
			++LCM;
		}
	}

}
