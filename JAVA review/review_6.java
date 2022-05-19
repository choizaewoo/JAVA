package review; //vedic Mathematics 1

import java.util.Scanner;

public class review_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 100;
		
		
		int a = sc.nextInt(); // 88
		int b = sc.nextInt(); // 93

		int ab = a * b;  // 8184
		
		System.out.println(ab);
		
		int a2 = num - a; //12
		int b2 = num - b; //7
		
		int a2Pb2 = a2 + b2; //19
		int a2Mb2 = a2 * b2; //84
		
		int ftd = num - a2Pb2;
		int ltd = a2Mb2;
		
		System.out.println("First two digits :" + ftd);

		System.out.println("Last two digits :" + ltd);
		
		System.out.println("result :" + ftd + ltd);
	}

}
