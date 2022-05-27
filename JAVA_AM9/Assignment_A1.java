package JAVA_AM_20220329;

import java.util.ArrayList;import java.util.Collections;
import java.util.Scanner;

public class Assignment_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int mean = 0;
		int max = 0;
		int min = 0;
		int end = 1;
		
		list.add(mean);
		list.add(max);
		list.add(min);
		list.add(end);
		
		while(true) {
			System.out.println("Enter number");
			int num = 0;
			num = sc.nextInt();
			
			mean += num;	
			if(end==1) {
				max = num;
				min = num;
			}else {
				if(num > max) {
					max = num;
				}
				if(min > num) {
					min = num;
				}
			}
		
			System.out.println("Result: " + end + " - " + "mean" + mean/end + ", max" + max + ", min" + min);
			System.out.println();
			end++;
  }
 }
}