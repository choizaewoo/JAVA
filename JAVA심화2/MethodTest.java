package JAVA2;

public class MethodTest {

	public static void iamMethod() {
		System.out.println("메소드라 불러줘요~\n"); //메소드 함수를 만들어준다
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest.iamMethod(); //클래스 안에 함수를 정의하면 함수이름만으로 불러 올 수 있다.
		
		iamMethod();
	}

}
