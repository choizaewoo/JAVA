package JAVA_20200331;

public class multipleparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			addOperation(5,12);
			xOperation(5,18);
			nOperation(6,2);
			mOperation(100,1);
	}
	
	public static void addOperation(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public static void xOperation(int a, int b) {
		int sum = a * b;
		System.out.println(sum);
	}
	public static void nOperation(int a, int b) {
		if(b ==0) {
			System.out.println("다른 숫자 넣으세요");
		}else {
			float sum  = a / b;
			System.out.println(sum);
		}
		
		int sum = a / b;
		System.out.println(sum);
	}
	public static void mOperation(int a, int b) {
		int sum = a - b;
		System.out.println(sum);
	}
}
