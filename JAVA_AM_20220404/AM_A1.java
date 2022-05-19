package JAVA_AM_20220404;

import java.util.Scanner;

public class AM_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("문장을 입력하세요.");
			String str = sc.nextLine();

			System.out.println("순서를 찾고 싶은 알파벳을 입력하세요");
			String sstr = sc.nextLine();
			char c = sstr.charAt(0);// sstr이 가리키고 있는 문자열에서 0번째 문자부터 char타입으로 변형.
			if (c >= 0x61 && c <= 0x7A || c >= 0x41 && c <= 0x5A) {

				int idx1 = str.indexOf(sstr);
				int idx2 = idx1 + 1;
				System.out.println("입력하신 알파벳은 " + idx2 + "번째 입니다.");

			} else {
				System.out.println("알파벳이 아닙니다");
			}
		}

	}

}