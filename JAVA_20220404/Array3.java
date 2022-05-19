package JAVA_20220404;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kopoNum = new int[5];
		for ( int i = 0; i < kopoNum.length; i++) {
			kopoNum[i] = i * 10;
		}
		
		for ( int i = 0; i < kopoNum.length; i++) {
			System.out.println(kopoNum[i]);
		}
		
	}

}
