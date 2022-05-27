package JAVA_AM_20220328;

public class Assignment_A3 { // Draw a Right Triangle

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) // Making vertical lines 5
		{
			for (int j = 1; j <= i; j++) // Making star by each horizontal line. ex) Line1 1ea, Line2 2ea..
			{ // Triangle needs star as piece as each line needs star
				System.out.print("*");
			}
			System.out.println(); // Newline
		}
	}
}
