package JAVA_AM_20220406;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class AM_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strArr = new ArrayList<String>();
		List<String> strArr2 = new ArrayList<String>();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two words");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println("size of the first word :" + str1.length());
		System.out.println("size of the second word :" + str2.length());
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			strArr.add(String.valueOf(str1.charAt(i)));
		}
		for (int i = 0; i < str2.length(); i++) {
			strArr2.add(String.valueOf(str2.charAt(i)));
		}
		
		Set<String> strSet  = new HashSet<String>(strArr);
		Set<String> strSet2  = new HashSet<String>(strArr2);
		for (int i = 0; i < strSet.size(); i++) {
			for (int j = 0; j < strSet2.size(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count ++;
				}
			}
		}
		System.out.println("same word number : " + count);
	}
}
//int count = str.length() - str2.replaceAll("g","").length()