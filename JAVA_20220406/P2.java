package JAVA_20220406;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> num = new LinkedList<Integer>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 숫자의 갯수를 입력하세요");
		int count = sc.nextInt();
		int[] Arr = new int[count];
		String input = sc.nextLine();
		String[] str = input.split(" ");
		int cnt = 0;
		System.out.println("갯수만큼 숫자를 입력하세요");
		for (int i = 0; i < count; i++) {
			Arr[i] = sc.nextInt();
		}
		
		System.out.println("숫자 중 출력할 숫자를 입력하세요.");
		if (input.contains(String.valueOf(count)))
		for (int i = 0; i < num.size(); i ++) {
			if (num.poll().equals(count)) {
				System.out.println( i + 1);
				cnt ++;
				break;
			}
			
		}

		
	if ( cnt == 0) {
		System.out.println("wrong number");
	}
}
}
