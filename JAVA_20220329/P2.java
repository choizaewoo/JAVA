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
				chars[i] = (char) (chars[i] - 32); //�� ���ڸ��� -32
			}
		}
		System.out.println(chars);

	}

}

//�ҹ��ڿ� �빮���� �ƽ�Ű �ڵ� ���̴� 32
// ex) A���� a�� ������� 32�� ���ϰ� / a���� A�� ��������ؼ��� 32�� ����
// ���ĺ��� �� 26�� ����
// A 65 Z 90 a 97 z 122
// 65<= char <=90 �̸� �빮��.
// 97<= char <=122 �̸� �ҹ��� 
// 'A'<=char <='Z' , 'a'<= char <= 'z'