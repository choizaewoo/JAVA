package JAVA_AM_20220404;

import java.util.Scanner;

public class AM {

		public static void main(String[] args) {
			String abc = "abcdefghijklmnopqrstuwvxyz";
			
			Scanner sc= new Scanner(System.in);
			
			
			System.out.println("순서를 찾을 알파벳을 입력하십시오");
			String scinput= sc.nextLine();

			char c = scinput.charAt(0);
			if (c >= 0x61 && c <= 0x7A || c >=0x41 && c <= 0x5) {
			
				int idx1 = abc.indexOf(scinput);
				
				int idx2 = idx1+1; // 인간 순서변환 
				System.out.println("입력하신 알파벳은 "+idx2+"번째 입니다.");
				
			}else {
				System.out.println("입력하신 값이 알파벳이 아닙니다");
			}

		}

	}

