package JAVA_20220404;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] name = {"kim", "park", "choi"};
		
//		name = {"kim" , "park", "choi"}
//		
//		name[0] = "kim";
//		name[1] = "park";
//		name[2] = "choi";
//		

		int[] numbers = new int[3];
		String[] name = { "kim", "lee", "park", "choi" };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
