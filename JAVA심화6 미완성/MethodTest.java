package JAVA6;

public class MethodTest {

	public static void iamMethod() {
		System.out.printf("메소드라 불러줘요\n");
	}
	
	public static void main(String[] args) {
		MethodTest.iamMethod();
		iamMethod();
	}

}
