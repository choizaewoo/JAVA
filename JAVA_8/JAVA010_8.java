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
		}catch (ArrayIndexOutOfBoundsException e) { // general exception�� �� ź��.
			System.out.println(numbers.length);
//			e.printStackTrace(); �ּ�ó���ϸ� ������ �ȳ� 
			System.out.println("--ArrayIndexOutOfBounds Exception");
		
		}catch (Exception e) { // ��� ���ܸ� �������� �׳� �ͼ��� �ִ´�
			System.out.println("exception");
			e.printStackTrace();
			System.out.println("General Exception");
			
		}finally {
			System.out.println("finally");
		}
	}

}
