package JAVA_20220404;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = {{1, 2, 3}, {4, 5}, {7,8}};
		
		for ( int i = 0; i < numbers.length; i++) {
			for ( int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

}
