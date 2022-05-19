package JAVA_AM_20220401;

import java.util.Scanner;

public class AM_A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str; 
		str = sc.nextLine();
		char[] arr = str.toCharArray(); //문자열(string)을 char로 변환
		char[] reversedArr = new char[arr.length]; // 
		for (int i = 0; i < arr.length; i++) {
			reversedArr[arr.length - 1 - i] = arr[i];
		}
		String reversedStr = new String(reversedArr);
		System.out.println(reversedStr);
		
	}
}
