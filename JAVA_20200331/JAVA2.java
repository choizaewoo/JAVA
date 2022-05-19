package JAVA_20200331;

public class JAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("abc",5);
		print("kim",6);
		
	}
	public static void print(String text, int a) { //파라미터(인자)
		System.out.println(text+a);
	}

	
	public static void print(String text, String text2) {
		System.out.println(text + text2); //인자가 같은 함수를 분리 
    }
}