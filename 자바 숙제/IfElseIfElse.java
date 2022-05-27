package AssignmentA1;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		if (n==1) {
			System.out.println("One");
		}else if(n==2) {
			System.out.println("Two");
		}else if(n==3) {
			System.out.println("Three");
		}else {
			System.out.println("Except 1,2,3");
		}
	}
}
