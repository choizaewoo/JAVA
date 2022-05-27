package review;

import java.util.Scanner;

public class review_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String num = "100";
		
		int intNum =  Integer.parseInt(num);
				
		String a = sc.nextLine(); // 88
		String b = sc.nextLine(); // 93

		int intA =  Integer.parseInt(a);
		int intB =  Integer.parseInt(b);
		
		int ab = intA * intB;  // 8184		
		
		System.out.println(ab);
		
		int a2 = num - a; //12
		int b2 = num - b; //7
		
		int intA2 = Integer.parseInt(a2);
		
		
		int a2Pb2 = a2 + b2; //19
		int a2Mb2 = a2 * b2; //84
		
		int ftd = num - a2Pb2;
		int ltd = a2Mb2;
		
		System.out.println("First two digits :" + ftd);

		System.out.println("Last two digits :" + ltd);
		
		System.out.println("result :" + ftd + ltd);
		
	}

}
