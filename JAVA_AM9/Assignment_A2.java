package JAVA_AM_20220329;

import java.util.Scanner;

public class Assignment_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int numP = 0;
		int numN = 0;
		int numO = 0;
		int numE = 0;

		while (true) {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("0");
				continue;
			} else if (num > 0) {
				numP++;
				if (num % 2 == 0) {
					numE++;

				} else if (num % 2 == 1) {
					numO++;
				}				
			}else {
				numN++;
				num = Math.abs(num);
				if (num % 2 == 0) {
					numE++;
				}else if(num % 2 ==1) {
					numO++;
				}
			}
			System.out.println("P -" + numP + ", N -" + numN + ", O -" + numO + ", E -" + numE);
			System.out.println();
		}

	}
}
