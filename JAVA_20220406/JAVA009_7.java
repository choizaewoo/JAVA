package JAVA_20220406;

import java.util.HashSet;
import java.util.Scanner;

public class JAVA009_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> name = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요.");
		String str = sc.next();
		int count = 0;
		String[] wrd = new String[count];
		
		for (int i = 0; i < wrd.length; i++ ) {
			wrd[i] = sc.nextLine();
		}
		
		System.out.println(wrd);
	}
}
