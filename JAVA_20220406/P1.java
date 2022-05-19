package JAVA_20220406;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		}
		System.out.println();
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
