package JAVA_20220406;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> num = new LinkedList<Integer>(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ������ �Է��ϼ���");
		int count = sc.nextInt();
		int[] Arr = new int[count];
		String input = sc.nextLine();
		String[] str = input.split(" ");
		int cnt = 0;
		System.out.println("������ŭ ���ڸ� �Է��ϼ���");
		for (int i = 0; i < count; i++) {
			Arr[i] = sc.nextInt();
		}
		
		System.out.println("���� �� ����� ���ڸ� �Է��ϼ���.");
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
