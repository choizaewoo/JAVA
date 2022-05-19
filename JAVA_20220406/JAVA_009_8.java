package JAVA_20220406;

import java.util.Arrays;
import java.util.Collections;

public class JAVA_009_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] temp = { "lee", "kim", "john", "bill", "mike" };
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

		System.out.println("=======================");
		Arrays.sort(temp, Collections.reverseOrder());
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
