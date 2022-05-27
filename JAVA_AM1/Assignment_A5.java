package JAVA_AM_20220328;

public class Assignment_A5 { // Draw an inverted Equliateral Triangle

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) { // Making line 5
			for (int j = 1; j <= i; j++) { // Except because of being from i = 0, j = 1
				System.out.print(" ");
			}
			for (int k = 9; k >= i * 2 + 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//직사각형
//i = 1, j = 1 -> 1
//i = 2, j = 2 -> 1,2
//i = 3, j = 3 -> 1,2,3
//i = 4, j = 4 -> 1,2,3,4

//역삼각형
//0*2+1 1 = 987654321
//1*2+1 3 =  9876543
//2*2+1 5 =   98765
//3*2+1 7 =    987
//4*2+1 9 =     9
