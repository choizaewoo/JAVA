package JAVA_AM_20220404;

import java.util.Scanner;

public class AM_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������ �Է��ϼ���.");
			String str = sc.nextLine();

			System.out.println("������ ã�� ���� ���ĺ��� �Է��ϼ���");
			String sstr = sc.nextLine();
			char c = sstr.charAt(0);// sstr�� ����Ű�� �ִ� ���ڿ����� 0��° ���ں��� charŸ������ ����.
			if (c >= 0x61 && c <= 0x7A || c >= 0x41 && c <= 0x5A) {

				int idx1 = str.indexOf(sstr);
				int idx2 = idx1 + 1;
				System.out.println("�Է��Ͻ� ���ĺ��� " + idx2 + "��° �Դϴ�.");

			} else {
				System.out.println("���ĺ��� �ƴմϴ�");
			}
		}

	}

}