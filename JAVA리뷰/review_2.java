package review;

import java.util.Scanner;
//문자열은 숫자로 비교를 해라. 
public class review_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert any words !");
		String a = sc.nextLine(); //문자열 변수 받기
		String b = sc.nextLine(); //문자열 변수 받기

		char chars[] = a.toCharArray(); // 문자열을 tochararray로 하나씩 쪼개서 chars[] 배열에 넣어준다.

		int o = 0; //후... 변수 하나를 만들어주고 0으로 초기화시켜준다.
		for (int i = 0; i < chars.length; i++) { //i를 쪼개준 문자열길이까지 돌려준다.
			if (b.contains(String.valueOf(chars[i]))) { // 비교하려는 문자열 b가 배열의 값을 문자열로 바꿔준 내용을 포함한다면 
				o++; //하나씩 증가시켜준다. (문자열길이만큼)
			} else if (b.contains(String.valueOf(chars[i])) != true) { //반대

			}
		} //for문 닫기

		if (o == chars.length) { // o가 chars의 길이만큼과 같다면(문자가 같다면)
			System.out.println("yes"); //yes를 출력.
		} else { // 아니라면~
			System.out.println("No"); //no
		}
	}
}

//		if (chars.contains(chars2)) {
//			
//			System.out.println("yes");
//			
//			}
//		}
//	}


