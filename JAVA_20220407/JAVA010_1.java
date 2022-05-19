package JAVA_20220407;

import java.util.Arrays;
import java.util.Scanner;

public class JAVA010_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String line = "abc";
//		try {
//		System.out.println(line.charAt(3)); //실행했더니 에러가 나서 catch로 감 
//		} catch (Exception e) {
//			e.printStackTrace(); //에러는 뜨지만 실행은 됨
//		} finally { //무조건 항상 실행됨 
//			System.out.println("finally");
//		}
//		
//		System.out.println("Hello world");

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("입력할 숫자의 갯수를 입력");
			int count = sc.nextInt();
			int[] Arr = new int[count]; //카운트까지 배열만듬
			for (int i = 0; i < count + 1; i++) { //count에 하나를 추가해서 에러를 나오게 함 
				Arr[i] = sc.nextInt(); //배열 출력
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
			e.printStackTrace();
		} catch (Exception e) { //제널 
			e.printStackTrace();
			System.out.println("error");
		} finally {
			System.out.println("입력할 숫자의 갯수를 입력");
			int count = sc.nextInt();
			int[] Arr = new int[count];
			for (int i = 0; i < count; i++) {
				Arr[i] = sc.nextInt();
			}
			
			Arrays.sort(Arr);
			for (int i = 0; i < Arr.length; i++) {
				System.out.println(Arr[i]);
			}
		}
	}
}
