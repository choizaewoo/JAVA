package JAVA_AM_20220404;

import java.util.Scanner;

public class AM {

		public static void main(String[] args) {
			String abc = "abcdefghijklmnopqrstuwvxyz";
			
			Scanner sc= new Scanner(System.in);
			
			
			System.out.println("������ ã�� ���ĺ��� �Է��Ͻʽÿ�");
			String scinput= sc.nextLine();

			char c = scinput.charAt(0);
			if (c >= 0x61 && c <= 0x7A || c >=0x41 && c <= 0x5) {
			
				int idx1 = abc.indexOf(scinput);
				
				int idx2 = idx1+1; // �ΰ� ������ȯ 
				System.out.println("�Է��Ͻ� ���ĺ��� "+idx2+"��° �Դϴ�.");
				
			}else {
				System.out.println("�Է��Ͻ� ���� ���ĺ��� �ƴմϴ�");
			}

		}

	}

