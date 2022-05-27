package JAVA_20220329;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		char[] chars = line.toCharArray();

		for (int i = 0; i < chars.length; ++i) {
			if (97 <= chars[i] && chars[i] <= 122) {
				chars[i] = (char) (chars[i] - 32); //각 문자마다 -32
			}
		}
		System.out.println(chars);

	}

}

//소문자와 대문자의 아스키 코드 차이는 32
// ex) A에서 a로 만드려면 32를 더하고 / a에서 A를 만들기위해서는 32를 뺀다
// 알파벳은 총 26개 문자
// A 65 Z 90 a 97 z 122
// 65<= char <=90 이면 대문자.
// 97<= char <=122 이면 소문자 
// 'A'<=char <='Z' , 'a'<= char <= 'z'