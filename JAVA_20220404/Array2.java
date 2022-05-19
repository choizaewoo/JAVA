package JAVA_20220404;

public class Array2 {

	public static void main(String[] args) {
		int[][] numbers = new int[3][5];
		int cnt;
		cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				numbers[i][j] = cnt;
				cnt++;
			}
		}
	}
}
