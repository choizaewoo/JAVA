package JAVA_20220408;

import java.util.Scanner;

public class JAVA011_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		int Bigger = Num1;
		
		if(Num1 < Num2) {
			Bigger = Num2; 
		}
			System.out.println(Bigger);
		
	}

}
