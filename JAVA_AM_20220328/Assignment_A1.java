package JAVA_AM_20220328;

import java.util.Scanner;

public class Assignment_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("2~9 ������ ���ڸ� �Է��ϼ���");
		int i = scanner.nextInt();

		if (i < 10) {
			for (i = 2; i < 10; i++) {
				System.out.println(i);
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}

		} else {
			System.out.println("�߸��� �Է��Դϴ�");
		}

	}
}
