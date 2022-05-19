package JAVA_AM_20220328;

public class Assignment_A4 { // Draw a Equliateral Triangle

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int line = 4; // Total line

		for (int i = 0; i <= line; i++) // i start to line4 -> making line five piece
		{
			for (int j = line - i; j > 0; j--) {
				System.out.print("");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


