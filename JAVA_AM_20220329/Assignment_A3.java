package JAVA_AM_20220329;

public class Assignment_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I go to school";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'C') {
				count++;
			} else if (str.charAt(i) == 'G') {
				count++;
			} else if (str.charAt(i) == 'H') {
				count++;
			} else if (str.charAt(i) == 'I') {
				count++;
			} else if (str.charAt(i) == 'L') {
				count++;
			} else if (str.charAt(i) == 'O') {
				count++;
			} else if (str.charAt(i) == 'S') {
				count++;
			} else if (str.charAt(i) == 'T') {
				count++;
			}
		}
		System.out.println("Character  C -" + count);
		System.out.println("Character  G -" + count);
		System.out.println("Character  H -" + count);
		System.out.println("Character  I -" + count);
		System.out.println("Character  L -" + count);
		System.out.println("Character  O -" + count);
		System.out.println("Character  S -" + count);
		System.out.println("Character  T -" + count);
		

	}

}