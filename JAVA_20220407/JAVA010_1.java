package JAVA_20220407;

import java.util.Arrays;
import java.util.Scanner;

public class JAVA010_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String line = "abc";
//		try {
//		System.out.println(line.charAt(3)); //�����ߴ��� ������ ���� catch�� �� 
//		} catch (Exception e) {
//			e.printStackTrace(); //������ ������ ������ ��
//		} finally { //������ �׻� ����� 
//			System.out.println("finally");
//		}
//		
//		System.out.println("Hello world");

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("�Է��� ������ ������ �Է�");
			int count = sc.nextInt();
			int[] Arr = new int[count]; //ī��Ʈ���� �迭����
			for (int i = 0; i < count + 1; i++) { //count�� �ϳ��� �߰��ؼ� ������ ������ �� 
				Arr[i] = sc.nextInt(); //�迭 ���
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
			e.printStackTrace();
		} catch (Exception e) { //���� 
			e.printStackTrace();
			System.out.println("error");
		} finally {
			System.out.println("�Է��� ������ ������ �Է�");
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
