package JAVA_20220401;

public class JAVA_006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printClass printClass = new printClass(1, 2, 5);
		printClass.printInteger();
		printClass.printAdd();
	}
}

class printClass {
	int a, b, n;

	public printClass(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public void printInteger() {
		System.out.println(this.n);
	}

	public void printAdd() {
		int sum;
		sum = this.a + this.b;
		System.out.println(sum);
	}
}