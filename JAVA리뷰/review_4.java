package review;

import java.util.Scanner;

public class review_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 0 또는 1을 반복하여서 4자리를 입력하세요.");

		String[] s = new String[3];
		
		int vPass = 0;
	
		s[0] = sc.nextLine();
		s[1] = sc.nextLine();
		s[2] = sc.nextLine();

		//horizon condition
		for (int j = 0; j < 3; j++) { //String[3] 의 s에 대한 반복문
			int zeroCount = 0;	//문자열이 가진 0의 수를 세는 변수
			for (int i = 0; i < 4; i++) { //s[i]의 문자열 반복문
				if (s[j].charAt(i) == '0') { //문자열에서 0을 갖고 있으면
					zeroCount++; //변수값을 1 상승
				}
			}
			if (zeroCount == 4) { //한 문자열의 0의 수가 네개가 되면 == 한문자열이 전부 0이면
				vPass++; //이 변수의 값을 1 상승
			}
		}
		
		//vertical condition
		for (int i = 0; i < 4; i++) { //문자열 배열을 하나씩 가져와서 charAt으로 하나씩 쪼개어 0일때를 비교한다.
			if (s[0].charAt(i) == '0' && s[1].charAt(i) == '0' && s[2].charAt(i) == '0') {
				vPass++; //1씩 상승
			}
		}
		
		//print part
		if (vPass != 0) { //앞에서 상승된 vPass가 1이 아니면 pass
			System.out.println("pass");
		} else { //0이면 fail.
			System.out.println("Fail");
		}
	}
}
