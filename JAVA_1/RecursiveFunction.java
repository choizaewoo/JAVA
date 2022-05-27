package JAVA_20200331;

public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <=10; i++) {
			System.out.println(sumTo0ne(i));
		}
		
	}
	public static int sumTo0ne(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number + sumTo0ne(--number);
		}
	}

}
