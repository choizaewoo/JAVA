package JAVA_AM_20220331;

import java.util.Scanner;

public class AM2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int sum = 0;
		for(int i= n-1; i >= 0; i--) {
			sum += i;
			System.out.println(n--);
		}
		int m = sc.nextInt();
			
	}
}