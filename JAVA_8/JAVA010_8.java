package JAVA_20220407;

public class JAVA010_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 12};
		
		try {
			System.out.println(numbers[3]);
		}catch (NullPointerException e) { 
			e.printStackTrace();
			System.out.println("NullPointer Exceptio");
		}catch (ArrayIndexOutOfBoundsException e) { // general exception을 안 탄다.
			System.out.println(numbers.length);
//			e.printStackTrace(); 주석처리하면 에러가 안남 
			System.out.println("--ArrayIndexOutOfBounds Exception");
		
		}catch (Exception e) { // 모든 예외를 잡으려면 그냥 익셉션 넣는다
			System.out.println("exception");
			e.printStackTrace();
			System.out.println("General Exception");
			
		}finally {
			System.out.println("finally");
		}
	}

}
